*** Variable ***
${target_dir}       ${CURDIR}/../../../../target
${resources}        ${CURDIR}/../resources
${wiremoc_conf_dir} ${resources}/wiremock-config
${some_dictionary}  KEY_1=VALUE1
...                 KEY_2=VALUE2

*** Settings ***
Library     String
Library     OperatingSystem
Library     Collections
Library     WiremockLibrary     ${woremock_conf_dir}    6124

*** Keywords ***
Clean up
    Delete Directory With Timeout      ${tmp_dir}
    OperatingSystem.Create Directory    ${some_important_dir}

