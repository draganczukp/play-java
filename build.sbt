name := """play-java"""

topLevelDirectory := Some("play-openshift")

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

//resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  //"com.typesafe.play" % "play-server_2.11" % "2.5.1",
  javaJdbc,
  cache,
  javaWs,
  evolutions,
  "mysql" % "mysql-connector-java" % "5.1.18",
  //"org.webjars" %% "webjars-play" % "2.5.0",
  "org.mindrot" % "jbcrypt" % "0.3m"
  //,
  //"com.adrianhurt" %% "play-bootstrap" % "1.0-P25-B3-SNAPSHOT",
 //"org.webjars" % "bootstrap" % "3.3.6"
  
)
libraryDependencies += "org.thymeleaf" % "thymeleaf" % "2.1.4.RELEASE"
libraryDependencies += "org.mariadb.jdbc" % "mariadb-java-client" % "1.4.2"


// Compile the project before generating Eclipse files, so that generated .scala or .class files for views and routes are present
EclipseKeys.preTasks := Seq(compile in Compile)

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java          
// Java project. Don't expect Scala IDE
EclipseKeys.createSrc := EclipseCreateSrc.ValueSet(EclipseCreateSrc.ManagedClasses, EclipseCreateSrc.ManagedResources)  
// Use .class files instead of generated .scala files for views and routes 



fork in run := true