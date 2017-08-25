*** Settings ***
#We don't have to provide full class-name org.my.robotLibrary.SimpleLib thanks to having SimpleLib in empty package
Library  SimpleLib

*** Variables ***
${SOME_STRING}  "TestStringFromVariable"

*** Test Cases ***
Default print-line execution
   print to sysout

Overloaded print-line execution by param
   print to sysout  "TestStringFromParam"

Overloaded print-line execution by variable
   print to sysout  ${SOME_STRING}

#This will for sure fail
#   this method wont be available because of no annotation