$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/TvPurchase.feature");
formatter.feature({
  "name": "TvFeature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Tv",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobillePurchaseSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user able to login flipkart with credentials",
  "keyword": "And "
});
formatter.match({
  "location": "MobillePurchaseSteps.user_able_to_login_flipkart_with_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search tv and choose",
  "keyword": "When "
});
formatter.match({
  "location": "TvPurchase.user_search_tv_and_choose()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add tv to add to cart and doing payment",
  "keyword": "And "
});
formatter.match({
  "location": "TvPurchase.user_add_tv_to_add_to_cart_and_doing_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate the confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobillePurchaseSteps.user_validate_the_confirmation_message()"
});
formatter.result({
  "error_message": "org.openqa.selenium.JavascriptException: javascript error: argument is not defined\n  (Session info: MicrosoftEdge\u003d102.0.1245.44)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-ENN4HNJ\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.edge.EdgeDriver\nCapabilities {acceptInsecureCerts: false, browserName: msedge, browserVersion: 102.0.1245.44, javascriptEnabled: true, ms:edgeOptions: {debuggerAddress: localhost:53794}, msedge: {msedgedriverVersion: 102.0.1245.44 (72efbf98e0b4..., userDataDir: C:\\Users\\DURGA\\AppData\\Loca...}, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 47ef1727287fe7df3f1b4c767c7067d9\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:489)\r\n\tat com.flipkart.resources.CommonActions.scrolldown(CommonActions.java:41)\r\n\tat com.flipkart.stepdefintion.MobillePurchaseSteps.user_validate_the_confirmation_message(MobillePurchaseSteps.java:59)\r\n\tat ✽.user validate the confirmation message(src/test/resources/Features/TvPurchase.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});