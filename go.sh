#!/bin/sh
if [ "$1" == "--help" ]; then
    echo "Usage: sh go.sh"
    exit 1
fi
./gradlew run

