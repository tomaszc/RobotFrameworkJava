# RobotFrameworkJava

Example of how to setupa a simple RobotFramework tests which use maven and custom java library.

Contains two maven modules:
* robotLibrary - yeah, it's a custom java library, you guessed it
* robotTests - test suite which is executed by maven and uses robotLibrary

Execute 'mvn test' from robotTests and check for test report in 'robotTests/target/robotframewor-reports'