#!/bin/sh

# sleep 5

# selenium-side-runner -s http://chromedriver:4444/wd/hub  --base-url http://frontend:8080 --output-directory /out --output-format=junit /sides/*.side

DIR="/sides"

if [ "$(ls -A $DIR)" ]; then
    echo "Starting selenium-side-runner"
	else
    echo "testplan directory ($DIR) is Empty"
    exit 1
fi

selenium-side-runner -s $URL_GRID --base-url $URL_APP --output-directory /out --output-format=junit $DIR/*.side