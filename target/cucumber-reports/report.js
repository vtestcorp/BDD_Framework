$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/search_addtocart.feature");
formatter.feature({
  "name": "Search product",
  "description": "This feature verifies the functionality on Search Product on onlinegrocery Website",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check that main elements on onlinegrocery Homepage are displayed",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdef_googlehomepage.open_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open onlinegrocery  Homepage",
  "keyword": "When "
});
formatter.match({
  "location": "stepdef_googlehomepage.open_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that the page displays search text box",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef_googlehomepage.i_verify_that_the_page_displays_search_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter search keyword",
  "keyword": "When "
});
formatter.match({
  "location": "stepdef_googlehomepage.i_enter_search_keyword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify search results are loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef_googlehomepage.i_verify_search_results_are_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on add to cart button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdef_googlehomepage.I_click_on_add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that Product added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef_googlehomepage.I_verify_that_Product_added_to_cart()"
});
formatter.result({
  "status": "passed"
});
});