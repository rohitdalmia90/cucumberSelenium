##Google sample UI test for Search

# Serenity BDD with Cuucmber4, Java


//For Better test management we can create profile for regression, smoke or release specific tests 
Eg:
REGRESSION SUITE: "mvn clean verify -P regression -Dwebdriver.diver=chrome"
SMOKE TEST SUITE: "mvn clean verify -P smoketests"
so on....

//** You can pass the URLs and WebDrivers from command prompt itself with -D prefix
//** Data driven is not implemented, so some part of methods are hard coded

