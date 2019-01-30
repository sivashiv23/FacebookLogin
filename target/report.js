$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Login.feature");
formatter.feature({
  "name": "To Test the FB login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To test the FB login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User should be in facebook home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_should_be_in_facebook_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User gives input for username and password",
  "rows": [
    {
      "cells": [
        "hi",
        "hi"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_gives_input_for_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_Clicks_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees their home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_sees_their_home_page()"
});
formatter.result({
  "status": "passed"
});
});