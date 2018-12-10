$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/eclipse/erp/src/test/resources/features/Employee.feature");
formatter.feature({
  "line": 1,
  "name": "To check employee page",
  "description": "",
  "id": "to-check-employee-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12150934451,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "check employeelist employee",
  "description": "",
  "id": "to-check-employee-page;check-employeelist-employee",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@tc-4"
    },
    {
      "line": 10,
      "name": "@CI"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "login with valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "click on employee",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "check employee name is employee list",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://test.hff.erp.ukkoteknik.com/hff/#/common/login",
      "offset": 13
    }
  ],
  "location": "EmployeeStepDefination.navigate_to(String)"
});
formatter.result({
  "duration": 23935155114,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.login_with_valid_credentials()"
});
formatter.result({
  "duration": 1924028077,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.click_on_employee()"
});
formatter.result({
  "duration": 2437921774,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.check_employee_name_is_employee_list()"
});
formatter.result({
  "duration": 2162535593,
  "status": "passed"
});
formatter.after({
  "duration": 2126505260,
  "status": "passed"
});
formatter.before({
  "duration": 6762002512,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "check search functionlality",
  "description": "",
  "id": "to-check-employee-page;check-search-functionlality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@tc-5"
    },
    {
      "line": 17,
      "name": "@CI"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "login with valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click on employee",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "enter the data in search and check whether the data is reflecting or not",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://test.hff.erp.ukkoteknik.com/hff/#/common/login",
      "offset": 13
    }
  ],
  "location": "EmployeeStepDefination.navigate_to(String)"
});
formatter.result({
  "duration": 18942522084,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.login_with_valid_credentials()"
});
formatter.result({
  "duration": 1624585751,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.click_on_employee()"
});
formatter.result({
  "duration": 7779921751,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.enter_the_data_in_search_and_check_whether_the_data_is_reflecting_or_not()"
});
formatter.result({
  "duration": 4758546013,
  "status": "passed"
});
formatter.after({
  "duration": 2156994772,
  "status": "passed"
});
formatter.before({
  "duration": 6712743452,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "check view functionlality",
  "description": "",
  "id": "to-check-employee-page;check-view-functionlality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@tc-6"
    },
    {
      "line": 24,
      "name": "@CI"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "login with valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "click on employee",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "click view then check the details",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://test.hff.erp.ukkoteknik.com/hff/#/common/login",
      "offset": 13
    }
  ],
  "location": "EmployeeStepDefination.navigate_to(String)"
});
formatter.result({
  "duration": 28541555954,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.login_with_valid_credentials()"
});
formatter.result({
  "duration": 3531982683,
  "error_message": "java.lang.NullPointerException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:50)\r\n\tat com.sun.proxy.$Proxy16.clear(Unknown Source)\r\n\tat com.erp.main.pagesImpl.LoginPageImpl.fillUserId(LoginPageImpl.java:47)\r\n\tat com.erp.main.pagesImpl.LoginPageImpl.login(LoginPageImpl.java:66)\r\n\tat employeestepdef.EmployeeStepDefination.login_with_valid_credentials(EmployeeStepDefination.java:54)\r\n\tat ✽.Then login with valid credentials(E:/eclipse/erp/src/test/resources/features/Employee.feature:27)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "EmployeeStepDefination.click_on_employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EmployeeStepDefination.click_view_then_check_the_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("The scenario failed.");
formatter.after({
  "duration": 1671783385,
  "status": "passed"
});
formatter.uri("E:/eclipse/erp/src/test/resources/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "login and logout",
  "description": "",
  "id": "login-and-logout",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6007595140,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Open login page and do logout",
  "description": "",
  "id": "login-and-logout;open-login-page-and-do-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tc-1"
    },
    {
      "line": 3,
      "name": "@CI"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter userid with \"accounts\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter password with \"8f5@INV\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on profile",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on logout",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://test.hff.erp.ukkoteknik.com/hff/#/common/login",
      "offset": 13
    }
  ],
  "location": "EmployeeStepDefination.navigate_to(String)"
});
formatter.result({
  "duration": 16742692540,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "accounts",
      "offset": 19
    }
  ],
  "location": "LoginFeatureStepDefination.enterUserId(String)"
});
formatter.result({
  "duration": 773909590,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8f5@INV",
      "offset": 21
    }
  ],
  "location": "LoginFeatureStepDefination.enterpwd(String)"
});
formatter.result({
  "duration": 700876639,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureStepDefination.clickLogin()"
});
formatter.result({
  "duration": 578204870,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureStepDefination.clickOk()"
});
formatter.result({
  "duration": 2071680906,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureStepDefination.clicklogout()"
});
formatter.result({
  "duration": 1518817905,
  "status": "passed"
});
formatter.after({
  "duration": 2014762756,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "validate login fields",
  "description": "",
  "id": "login-and-logout;validate-login-fields",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@tc-2"
    },
    {
      "line": 12,
      "name": "@CI"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "enter userid with \"\u003cx\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "enter password with \"\u003cy\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "validate userid and password fields with \"\u003cz\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "login-and-logout;validate-login-fields;",
  "rows": [
    {
      "cells": [
        "x",
        "y",
        "z"
      ],
      "line": 21,
      "id": "login-and-logout;validate-login-fields;;1"
    },
    {
      "cells": [
        "",
        "",
        "blank"
      ],
      "line": 22,
      "id": "login-and-logout;validate-login-fields;;2"
    },
    {
      "cells": [
        "accounts",
        "",
        "blankpwd"
      ],
      "line": 23,
      "id": "login-and-logout;validate-login-fields;;3"
    },
    {
      "cells": [
        "",
        "8f5@INV",
        "blankuserid"
      ],
      "line": 24,
      "id": "login-and-logout;validate-login-fields;;4"
    },
    {
      "cells": [
        "accounts",
        "8f5@INW",
        "invalidpwd"
      ],
      "line": 25,
      "id": "login-and-logout;validate-login-fields;;5"
    },
    {
      "cells": [
        "account",
        "8f5@INV",
        "invaliduserid"
      ],
      "line": 26,
      "id": "login-and-logout;validate-login-fields;;6"
    },
    {
      "cells": [
        "accounts",
        "8f5@INV",
        "valid"
      ],
      "line": 27,
      "id": "login-and-logout;validate-login-fields;;7"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6578040651,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "validate login fields",
  "description": "",
  "id": "login-and-logout;validate-login-fields;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@CI"
    },
    {
      "line": 12,
      "name": "@tc-2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "enter userid with \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "enter password with \"\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "validate userid and password fields with \"blank\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://test.hff.erp.ukkoteknik.com/hff/#/common/login",
      "offset": 13
    }
  ],
  "location": "EmployeeStepDefination.navigate_to(String)"
});
formatter.result({
  "duration": 17756326289,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 19
    }
  ],
  "location": "LoginFeatureStepDefination.enterUserId(String)"
});
formatter.result({
  "duration": 478889341,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 21
    }
  ],
  "location": "LoginFeatureStepDefination.enterpwd(String)"
});
formatter.result({
  "duration": 365792818,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureStepDefination.clickLogin()"
});
formatter.result({
  "duration": 1472393602,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "blank",
      "offset": 42
    }
  ],
  "location": "LoginFeatureStepDefination.validateUserPwdFields(String)"
});
formatter.result({
  "duration": 1359940,
  "status": "passed"
});
formatter.after({
  "duration": 1873728041,
  "status": "passed"
});
formatter.before({
  "duration": 7408932343,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "validate login fields",
  "description": "",
  "id": "login-and-logout;validate-login-fields;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@CI"
    },
    {
      "line": 12,
      "name": "@tc-2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "enter userid with \"accounts\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "enter password with \"\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "validate userid and password fields with \"blankpwd\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://test.hff.erp.ukkoteknik.com/hff/#/common/login",
      "offset": 13
    }
  ],
  "location": "EmployeeStepDefination.navigate_to(String)"
});
formatter.result({
  "duration": 60063468365,
  "error_message": "org.openqa.selenium.TimeoutException: timeout\n  (Session info: chrome\u003d70.0.3538.110)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 60.01 seconds\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Lenovo-PC\u0027, ip: \u0027192.168.22.30\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:49817}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a), userDataDir\u003dC:\\Users\\Lenovo\\AppData\\Local\\Temp\\scoped_dir9588_27402}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d70.0.3538.110, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 69143eebb11e20443af4f86510144178\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:304)\r\n\tat employeestepdef.EmployeeStepDefination.navigate_to(EmployeeStepDefination.java:33)\r\n\tat ✽.Given navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"(E:/eclipse/erp/src/test/resources/features/login.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "accounts",
      "offset": 19
    }
  ],
  "location": "LoginFeatureStepDefination.enterUserId(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 21
    }
  ],
  "location": "LoginFeatureStepDefination.enterpwd(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginFeatureStepDefination.clickLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "blankpwd",
      "offset": 42
    }
  ],
  "location": "LoginFeatureStepDefination.validateUserPwdFields(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.write("The scenario failed.");
formatter.after({
  "duration": 9856089474,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getCurrentUrl(RemoteWebDriver.java:319)\r\n\tat Hooks.embedScreenshot(Hooks.java:47)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:55)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:47)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 5919273614,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "validate login fields",
  "description": "",
  "id": "login-and-logout;validate-login-fields;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@CI"
    },
    {
      "line": 12,
      "name": "@tc-2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "enter userid with \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "enter password with \"8f5@INV\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "validate userid and password fields with \"blankuserid\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://test.hff.erp.ukkoteknik.com/hff/#/common/login",
      "offset": 13
    }
  ],
  "location": "EmployeeStepDefination.navigate_to(String)"
});
formatter.result({
  "duration": 60026798921,
  "error_message": "org.openqa.selenium.TimeoutException: timeout\n  (Session info: chrome\u003d70.0.3538.110)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 60.01 seconds\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Lenovo-PC\u0027, ip: \u0027192.168.22.30\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:49972}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a), userDataDir\u003dC:\\Users\\Lenovo\\AppData\\Local\\Temp\\scoped_dir8392_4021}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d70.0.3538.110, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 176dd605b3b15bf621e80102f78a04bc\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:304)\r\n\tat employeestepdef.EmployeeStepDefination.navigate_to(EmployeeStepDefination.java:33)\r\n\tat ✽.Given navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"(E:/eclipse/erp/src/test/resources/features/login.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 19
    }
  ],
  "location": "LoginFeatureStepDefination.enterUserId(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "8f5@INV",
      "offset": 21
    }
  ],
  "location": "LoginFeatureStepDefination.enterpwd(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginFeatureStepDefination.clickLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "blankuserid",
      "offset": 42
    }
  ],
  "location": "LoginFeatureStepDefination.validateUserPwdFields(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.write("The scenario failed.");
formatter.after({
  "duration": 4260563027,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getCurrentUrl(RemoteWebDriver.java:319)\r\n\tat Hooks.embedScreenshot(Hooks.java:47)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:55)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:47)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
