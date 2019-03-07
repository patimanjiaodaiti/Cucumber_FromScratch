$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/PastPrimitives.feature");
formatter.feature({
  "name": "google search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "should be able to do google search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "go to the \"https://www.google.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PrimitivesTestSteps.go_to_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search when \"MacBook pro\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PrimitivesTestSteps.search_when(String)"
});
formatter.result({
  "status": "passed"
});
});