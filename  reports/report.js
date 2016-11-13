$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027TestCases\\Home.feature\u0027");
formatter.feature({
  "line": 1,
  "name": "Verify HDFC Home page",
  "description": "",
  "id": "verify-hdfc-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify hdfc home page",
  "description": "",
  "id": "verify-hdfc-home-page;verify-hdfc-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open firefox browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate hdfc url",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on creditcard icon",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click on ApplyNow button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.I_open_firefox_browser()"
});
formatter.result({
  "duration": 154730412,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.I_navigate_hdfc_url()"
});
formatter.result({
  "duration": 536278,
  "error_message": "java.lang.NullPointerException\r\n\tat TestCases.AppBase.navigate(AppBase.java:36)\r\n\tat TestCases.StepDefinitions.I_navigate_hdfc_url(StepDefinitions.java:20)\r\n\tat ✽.When I navigate hdfc url(TestCases\\Home.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.I_click_on_creditcard_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.I_click_on_ApplyNow_button()"
});
formatter.result({
  "status": "skipped"
});
});