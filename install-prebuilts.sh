#!/bin/bash

PREBUILTS_DIR=prebuilt
VERSION=0.0.0-PREBUILT
for groupId in `basename $PREBUILTS_DIR/*`; do
    echo Installing prebuilts from $groupId...
    for file in $PREBUILTS_DIR/${groupId}/*.jar; do
        artifactId=`basename $file | sed -e 's/-DEV//' -e 's/\\.jar//'`
        cmd="mvn install:install-file -Dfile=$file -DgroupId=$groupId   \
                 -DartifactId=$artifactId -Dversion=$VERSION      \
                 -Dpackaging=jar"
        echo Executing the following command to install $groupId : $artifactId-$VERSION:
        echo $cmd
        $cmd
    done
done
