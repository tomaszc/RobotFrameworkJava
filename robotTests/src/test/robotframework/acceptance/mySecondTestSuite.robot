*** Settings ***
Documentation   More advanced test suite
Resource        ../keywords/defaults.robot
Test Setup      Run Keywords    Clean up
...             AND             Run Wire Mock

Test Teardown   Run Keywords    Stop Wire Mock

*** Test Cases ***
Some test case using wiremock
   When application requests some resource by REST
   Then it saves result into a database
