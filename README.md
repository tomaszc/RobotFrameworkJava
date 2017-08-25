# RobotFrameworkJava

## Table of Contents
1. [**Overview**](#Overview)
1. [**Robot Library**](#Robot-Library)
1. [**Robot Tests**](#Robot-Tests)

## Overview <a name="Overview"></a>

This project is example of how to setup Robot Framework in Java+Maven and provide a custom test lib.

Contains two maven modules:
* *robotLibrary* - yeah, it's a custom java library, you guessed it
* *robotTests* - test suite which is executed by maven and uses robotLibrary

Execute ```mvn test``` from robotTests and check for test report in 'robotTests/target/robotframewor-reports'

## Robot Library <a name="Robot-Library"></a>

This module is a simple Java library packaged as a jar by maven.

## Robot Tests <a name="Robot-Tests"></a>

Tests are kept in ```src/test/robotframework``` sub-folders (like 'acceptance'). Folder layer will be used to create layers of test-suites.

Check ```robotTets/pom.xml``` for test-execution plugin configuraiton.