#!/bin/bash -eu

APP_NAME="$1"
PLAY_CARTRIDGE="http://cartreflect-claytondev.rhcloud.com/reflect?github=Skamander/openshift-scaled-play2-cartridge&commit=v1.2"

# --no-git means the git repo is not cloned from openshift to the folder from which this script was run.
#          we don't need it since we will use binary deployment.
rhc app create $APP_NAME $PLAY_CARTRIDGE postgresql-9.2 --scaling --gear-size small --no-git

# --no-auto-deploy deactivates automatic deployments on git push
# --deployment-type binary don't use git for deployment, we deploy a .tgz anyway
rhc configure-app -a $APP_NAME --no-auto-deploy --deployment-type binary

# since scaling only seems to be possible with git based cartridges, we configure openshift to only use a single 
# gear for play and to not scale up
rhc cartridge scale $PLAY_CARTRIDGE -a $APP_NAME --min 1 --max 1
