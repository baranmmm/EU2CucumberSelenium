$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountTypes.feature");
formatter.feature({
  "name": "Account types",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "\u003cuserType\u003e user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@scenario_outline"
    }
  ]
});
formatter.step({
  "name": "the user logged in as \"\u003cuserType\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user navigates to \"\u003cmodule\u003e\" then \"\u003ctype\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the title should be \"\u003ctitle\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userType",
        "module",
        "type",
        "title"
      ]
    },
    {
      "cells": [
        "driver",
        "Activities",
        "Calendar Events",
        "Calendar Events - Activitiess"
      ]
    },
    {
      "cells": [
        "sales manager",
        "Customers",
        "Accounts",
        "All - Accounts - Customers"
      ]
    },
    {
      "cells": [
        "store manager",
        "Customers",
        "Contacts",
        "Contacts - Customers"
      ]
    }
  ]
});
formatter.scenario({
  "name": "driver user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@scenario_outline"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as \"driver\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Activities\" then \"Calendar Events\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.NavigationMenuStepDefs.the_user_navigates_to_then(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title should be \"Calendar Events - Activitiess\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_title_should_be(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c... Events - Activities[s]\u003e but was:\u003c... Events - Activities[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.vytrack.step_definitions.LoginStepDefs.the_title_should_be(LoginStepDefs.java:74)\r\n\tat ✽.the title should be \"Calendar Events - Activitiess\"(file:///C:/Users/BARAN/IdeaProjects/EU2CucumberSelenium/src/test/resources/features/AccountTypes.feature:26)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "sales manager user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@scenario_outline"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as \"sales manager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Customers\" then \"Accounts\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.NavigationMenuStepDefs.the_user_navigates_to_then(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title should be \"All - Accounts - Customers\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "store manager user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@scenario_outline"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as \"store manager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Customers\" then \"Contacts\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.NavigationMenuStepDefs.the_user_navigates_to_then(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title should be \"Contacts - Customers\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});