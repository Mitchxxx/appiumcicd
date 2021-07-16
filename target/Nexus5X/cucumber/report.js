$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Login.feature");
formatter.feature({
  "name": "Login Scenarios",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginPage"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login with Invalid user name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginPage_Test_001"
    }
  ]
});
formatter.step({
  "name": "I enter username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I login",
  "keyword": "And "
});
formatter.step({
  "name": "login should fail with an error \"\u003cerr\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "err"
      ]
    },
    {
      "cells": [
        "invalidUsername",
        "secret_sauce",
        "Username and password do not match any user in this service."
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with Invalid user name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginPage"
    },
    {
      "name": "@LoginPage_Test_001"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"invalidUsername\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepdef.LoginStepDef.iEnterUsernameAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password as \"secret_sauce\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.qa.stepdef.LoginStepDef.iEnterPasswordAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login",
  "keyword": "And "
});
formatter.match({
  "location": "com.qa.stepdef.LoginStepDef.iLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should fail with an error \"Username and password do not match any user in this service.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.LoginStepDef.loginShouldFailWithAnError(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with Invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginPage_Test_002"
    }
  ]
});
formatter.step({
  "name": "I enter username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I login",
  "keyword": "And "
});
formatter.step({
  "name": "login should fail with an error \"\u003cerr\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "err"
      ]
    },
    {
      "cells": [
        "standard_user",
        "invalidPassword",
        "Username and password do not match any user in this service."
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with Invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginPage"
    },
    {
      "name": "@LoginPage_Test_002"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"standard_user\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepdef.LoginStepDef.iEnterUsernameAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password as \"invalidPassword\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.qa.stepdef.LoginStepDef.iEnterPasswordAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login",
  "keyword": "And "
});
formatter.match({
  "location": "com.qa.stepdef.LoginStepDef.iLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should fail with an error \"Username and password do not match any user in this service.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.LoginStepDef.loginShouldFailWithAnError(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with valid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginPage_Test_003"
    }
  ]
});
formatter.step({
  "name": "I enter username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I login",
  "keyword": "And "
});
formatter.step({
  "name": "I should see products page title \"\u003ctitle\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "title"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce",
        "PRODUCTS"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with valid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginPage"
    },
    {
      "name": "@LoginPage_Test_003"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"standard_user\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepdef.LoginStepDef.iEnterUsernameAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password as \"secret_sauce\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.qa.stepdef.LoginStepDef.iEnterPasswordAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login",
  "keyword": "And "
});
formatter.match({
  "location": "com.qa.stepdef.LoginStepDef.iLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see products page title \"PRODUCTS\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.LoginStepDef.iShouldSeeProductsPageTitle(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});