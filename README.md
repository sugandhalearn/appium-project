# appium-project
###### **appium-project**

This is a ready to use framework for Android native app Testers.
`**Currently these are the preconditions to setup and run this test framework for any new application:**
Appium server is running
Device is opened in emulator.
apk is in the path "src/main/java/app" and "appPackage" and "appActivity" is updated in src/main/java/cucumberIntegrationTests/CreateAppiumSessionCucumber.java
Apppath is updated in src/main/java/config/config.properties`

`to run tests on android please execute:
mvn test -Dos=android -Dsurefire.suiteXmlFiles=cucumberTestng.xml`

```**Framework Features:**

1. Flexible foe extending framework to include ios device and mobile web device tests in the same framework.
2. Cucumber, TetNG, Appium, and extent reports
3. Modules broken in directories and any extension will follow add locators in path "src/main/java/cucumberIntegrationTests/screens/android",
   Then Add steps in "src/main/java/cucumberIntegrationTests/stepDefinitions/common" and then add featurefile in "src/test/java/tests/cucumberTests/features/CatlistTest.feature"
```

`**You can view below test report for the excuted tests in the location:**
target/surefire-reports/emailable-report.html
![Alt text](images/report.png?raw=true "Title")`
