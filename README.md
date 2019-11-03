<b>Prerequisites to successfully run the tests:</b>
- Chrome browser version 78,
- Selenium WebDriver 3.7.1,
- Java SE Development Kit 8,
- Java integrated development environment (IDE) (Eclipse/Intellij etc),
- All of the tests should be performed on Macbook (otherwise the ChromeWebdriver requires an update in both - code and file).

After downloading the files from this GitHub the IDE needs to be opened with option: Import Project. The inside of NetguruTask2 folder should be set as a path of this import. Once the project has been successfully imported - 3 moduls should be added to it: Selenium, Okio and Okhttp. They can be found in this GitHub as well - outside of the NetguruTask2 folder. To add them in Intellij (as an example) the "File" needs to be chosen in the main Menu, then "Project Structure" and "Modules".
Once it has been done, the tests are ready to be executed. If any issues appear during execution - the ChromeWebDriver should be downloaded and replaced in the Project main path. 
If the OS system is not used to run those tests - the ChromeWebDriver should also be replaced in the main path - with correct version (exe for windows). The line:
</i>System.setProperty("webdriver.chrome.driver", "chromedriver");</i>
should then also be updated and instead of "chromedriver" - there should be a name with proper extenstion in the end.

In the GitHub two test scenarios can be found: <b>RegistrationWithUsedEmail</b> and <b>Positivelogin</b>

<b>RegistrationWithUsedEmail</b>

<b>Test Objective:</b>
The objective of this test case is to verify if it is possible to register using a previously used e-mail address on Trello website.

The test contains a previously used registered e-mail: bilskitomaszz@gmail.com


<b>Positivelogin</b>

<b>Test Objective:</b>
The objective of this test case is to verify the ability to log in using a previously used e-mail and password to the Trello website.

The test contains a previously used registered e-mail: bilskitomaszz@gmail.com 
