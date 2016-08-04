$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bmicalculate/test/bmicalculate.feature");
formatter.feature({
  "line": 1,
  "name": "Customer check BMI value and category",
  "description": "As a customer,\nI want to check my BMI value and category using my weight and height",
  "id": "customer-check-bmi-value-and-category",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5071365871,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Underweight",
  "description": "",
  "id": "customer-check-bmi-value-and-category;underweight",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the user is on the BMI Calculate page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he enters \"160\" as height",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "he enters \"45\" as weight",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "he clicks the Calculate button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "ensure the BMI category is \"Underweight\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BmiCalculatestepDefs.theUserIsBmiPage()"
});
formatter.result({
  "duration": 1107420566,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "160",
      "offset": 11
    }
  ],
  "location": "BmiCalculatestepDefs.heEntersHeight(String)"
});
formatter.result({
  "duration": 27222260,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"name\",\"selector\":\"heightCMS\"}\nCommand duration or timeout: 17 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027Ilknurs-MacBook-Air.local\u0027, ip: \u0027192.168.1.53\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.4\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d46.0.1, platform\u003dMAC, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 68bc69d3-d0fc-6c4b-8299-e80336de0f52\n*** Element info: {Using\u003dname, value\u003dheightCMS}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:461)\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\n\tat bmicalculate.test.BmiPage.setHeight(BmiPage.java:36)\n\tat bmicalculate.test.BmiCalculatestepDefs.heEntersHeight(BmiCalculatestepDefs.java:37)\n\tat ✽.When he enters \"160\" as height(bmicalculate/test/bmicalculate.feature:7)\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"name\",\"selector\":\"heightCMS\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027Ilknurs-MacBook-Air.local\u0027, ip: \u0027192.168.1.53\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.4\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: driver.version: unknown\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///var/folders/sm/4r1p61js3ws1w4yw_csxb3qm0000gn/T/anonymous4152015588364105349webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///var/folders/sm/4r1p61js3ws1w4yw_csxb3qm0000gn/T/anonymous4152015588364105349webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10779)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///var/folders/sm/4r1p61js3ws1w4yw_csxb3qm0000gn/T/anonymous4152015588364105349webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///var/folders/sm/4r1p61js3ws1w4yw_csxb3qm0000gn/T/anonymous4152015588364105349webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///var/folders/sm/4r1p61js3ws1w4yw_csxb3qm0000gn/T/anonymous4152015588364105349webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "45",
      "offset": 11
    }
  ],
  "location": "BmiCalculatestepDefs.heEntersWeight(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BmiCalculatestepDefs.heClicksCalculateButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Underweight",
      "offset": 28
    }
  ],
  "location": "BmiCalculatestepDefs.ensureTheBmiCategory(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 95865912,
  "status": "passed"
});
formatter.before({
  "duration": 2640231923,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Normal",
  "description": "",
  "id": "customer-check-bmi-value-and-category;normal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "the user is on the BMI Calculate page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "he enters \"168\" as height",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "he enters \"70\" as weight",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "he clicks the Calculate button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "ensure the BMI category is \"Normal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BmiCalculatestepDefs.theUserIsBmiPage()"
});
formatter.result({
  "duration": 2382590137,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "168",
      "offset": 11
    }
  ],
  "location": "BmiCalculatestepDefs.heEntersHeight(String)"
});
formatter.result({
  "duration": 13950507,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"name\",\"selector\":\"heightCMS\"}\nCommand duration or timeout: 13 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027Ilknurs-MacBook-Air.local\u0027, ip: \u0027192.168.1.53\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.4\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d46.0.1, platform\u003dMAC, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 79dc6ed4-a074-f943-90e6-e55b9dfb4eff\n*** Element info: {Using\u003dname, value\u003dheightCMS}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:461)\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\n\tat bmicalculate.test.BmiPage.setHeight(BmiPage.java:36)\n\tat bmicalculate.test.BmiCalculatestepDefs.heEntersHeight(BmiCalculatestepDefs.java:37)\n\tat ✽.When he enters \"168\" as height(bmicalculate/test/bmicalculate.feature:14)\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"name\",\"selector\":\"heightCMS\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027Ilknurs-MacBook-Air.local\u0027, ip: \u0027192.168.1.53\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.4\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: driver.version: unknown\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///var/folders/sm/4r1p61js3ws1w4yw_csxb3qm0000gn/T/anonymous3095827150699699521webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///var/folders/sm/4r1p61js3ws1w4yw_csxb3qm0000gn/T/anonymous3095827150699699521webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10779)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///var/folders/sm/4r1p61js3ws1w4yw_csxb3qm0000gn/T/anonymous3095827150699699521webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///var/folders/sm/4r1p61js3ws1w4yw_csxb3qm0000gn/T/anonymous3095827150699699521webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///var/folders/sm/4r1p61js3ws1w4yw_csxb3qm0000gn/T/anonymous3095827150699699521webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "70",
      "offset": 11
    }
  ],
  "location": "BmiCalculatestepDefs.heEntersWeight(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BmiCalculatestepDefs.heClicksCalculateButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Normal",
      "offset": 28
    }
  ],
  "location": "BmiCalculatestepDefs.ensureTheBmiCategory(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 77202354,
  "status": "passed"
});
});