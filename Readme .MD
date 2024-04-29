**Project Name: Identify Courses**


# Overview
Our project is to automate the Identify Courses webpage in the Coursera website. We used selenium java for the automation purposes, we wrote script in java and integrated with tools like Cucumber, Apache POI, Extend Reports, Maven and Jenkins.

## Contributors
- **Gokul Rajan S 2318705**
- **Jayagovindhan Gopu 2318706**
- **Sharan V 2318694**
- **Aswin S 2318691**
- **Syed Mateen 2318702**

## Libraries and Dependencies
- **Maven Repository:** Maven 3.12.1
- **Apache POI:** 5.2.5
- **Cucumber:** 7.9.0
- **Extent Report:** 5.1.1
- **Selenium WebDriver:** 4.15.0
- **Selenium Grid:** 4.19.1
- **Loggers:** 2.22.0

## Automation Flow
1. Search for web development courses for Beginners level & English Language and extract the course names, total learning hours & rating for first 2 courses.​
2. Look for Language Learning; Extract all the languages and different levels with its total count & display them.​
3. In Home page, go to "For Enterprise"; Look into Courses for Campus under Product; Fill the  "Ready to transform" form with any one input invalid (example: email); Capture the error message & display​
(Suggested Site: coursera.org however  you are free to choose any other legitimate  site)

## Libraries Explanation
- **Maven Repository:** Used for project management and dependency resolution.
- **Apache POI:** Handles Excel operations for data-driven testing.
- **Cucumber:** Tool for software tesing based on behavior-driven development.
- **TestNG Report:** Generates comprehensive test reports.
- **Selenium WebDriver:** Automates browser interactions.
- **Loggers:** Facilitates logging for better debugging.

## Screenshots
Screenshots are captured at relevant steps for documentation and analysis.

## How to Run
1. **Open Eclipse IDE:**
   - Launch Eclipse IDE on your machine.

2. **Import Project:**
   - Select `File` -> `Import` from the menu.
   - Choose `Existing Maven Projects` and click `Next`.
   - Browse to the directory where you cloned the repository and select the project.

3. **Update Maven Project:**
   - Right-click on the project in the Project Explorer.
   - Choose `Maven` -> `Update Project`.
   - Click `OK` to update dependencies.

4. **Set Up Configuration:**
   - Open the `src/test/resources/config.properties` file.
   - Update any configuration parameters like browser type, URLs, etc., as needed.

5. **Run TestRunner:**
   - Locate the testRunner class file
   - Right-click on the file and choose `Run As` -> `JUnit Test`.

6. **View Reports:**
   - After execution, open the `Reports` folder.

## Reporting
1. **Locate Test Reports:**
   - After the execution, navigate to the `test-output` folder in the project directory.

2. **Open Extent Report:**
   - Inside the `test-output` folder, find the Extent Report HTML file named `index.html`.

3. **View Test Reports:**
   - Open the `index.html` file using any web browser.
   - This report provides a detailed overview of test executions, including passed and failed tests, test duration, and any exceptions encountered.

4. **Screenshots and Logs:**
   - screenshots captured during test execution and relevant logs for test cases.

5. **Analyze Results:**
   - Utilize the visual representation in the TestNG Report to quickly identify test status and any issues encountered during the test run.


## Known Issues
- **Issue 1: Not able to automate using jenkins**
  - Description: DOM changes when the page is automated using jenkins.
  - Workaround: Single scenario will be executed using jenkins instead of all scenarios.


## Future Enhancements
- **Enhancement 1: Multi Machine remote testing**
  - Description: Execute the automation through multimachine remote conception by selenium grid.

- **Enhancement 2: Jenkins head run**
  - Description: Automate the testcases in head mode which includes the browser presence.

