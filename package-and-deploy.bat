@ECHO off

REM Uncomment (remove 'REM') and change this variables value to your Openshift app name without any quotation marks..
REM SET appname=yourAppName

echo This sript assumes that it is run from the root of your Play application, you have installed 7zip and you have already run 'rhc setup'.
echo if that is not the case, the program will most likely crash.

echo Checking for 7zip
7z.exe  >nul 2>&1 && (
    goto found
) || (
    goto fail
)

:found
echo Found 7z!
IF [%appname%]==[] goto appname
goto pack

:appname
SET /P appname="Type in what your Openshift application is called: "
echo If you don't want to type it in everytime, just open this script in any text editor and look at line 3.
goto pack

:pack
echo clearing old archives
cd target/universal/
del /Q /S *
cd ../..

echo Packaging your app to .zip archive...
REM This uses activator's built-in commands that packages to .zip file.
call activator "dist"
cd target/universal/
REM This is needed because 7zip doesn't have any way to convert from .zip to .tgz.
echo Unzipping the .zip file to temporary directory...
7z x play-openshift.zip

REM Again, needed. This time it is a fault in .tgz standard, rather than 7zip.
REM Basically .tgz can contain only one file, in this case it is play-openshift.tar
echo Packaging to .tar...
7z a play-openshift.tar play-openshift/*

REM Finally, it can all be packaged to .tgz archive.
echo Packaging to .tgz..
7z a play-openshift.tgz play-openshift.tar

echo Deploying to Openshift...
rhc deploy -a %appname% play-openshift.tgz
cd ..
cd ..
goto :EOF

:fail
echo Could not find 7zip!
echo Please install 7zip in order to continue.
start "" "http://www.7zip.org"
goto :EOF
