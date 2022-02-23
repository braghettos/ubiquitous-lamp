#!/bin/bash

# Firefox
selenium-side-runner --config-file /selenium/grid/config.firefox.yml /selenium/testplan/*.side
# Chrome
selenium-side-runner --config-file /selenium/grid/config.chrome.yml /selenium/testplan/*.side