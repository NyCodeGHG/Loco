#!/usr/bin/env bash

MINECRAFT_VERSION="1.16.5"

function installPaper() {
  git config --global user.name "GitHub Runner"
  git config --global user.email "noreply@github.com"
  git clone https://github.com/PaperMC/Paper.git ~/Paper
  ~/Paper/paper install
}

if [ ! -f ~/.m2/repository/com/destroystokyo/paper/paper/$MINECRAFT_VERSION-R0.1-SNAPSHOT/paper-$MINECRAFT_VERSION-R0.1-SNAPSHOT.jar ]; then
  echo "Cannot find paper in local m2!"
  installPaper
else
  paperTimestamp=$(stat -c %Y ~/.m2/repository/com/destroystokyo/paper/paper/1.16.5-R0.1-SNAPSHOT/paper-1.16.5-R0.1-SNAPSHOT.jar)
  current=$(date +%s)
  if ((paperTimestamp + 604800 < current)); then
    echo "Current Paper is older than one week!"
    installPaper
  fi
fi
