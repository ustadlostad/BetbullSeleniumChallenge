# Project Title

Betbull Selenium Challenge

## Before Starting

* Cucumber and Junit are used for this project.

* Test is running on Chrome web browser by default.

## Test Covarage

1) Navigate to AutomationPractice.com website

2) Sign in with no credentials. Ensure the correct error message is displayed.
 
3) Sign in with email and empty password. Ensure the correct error message is displayed.
   
4) Sign in with password and empty email. Ensure the correct error message is displayed.
   
5) Sign in with incorrect credentials. Ensure the correct error message is displayed.

6) Successful registration
   
      ● POST on https://reqres.in/api/register
   
      ● Payload: email and password
   
      ● Response: 200 along with a token

7) Unsuccessful registration
   
   ● POST on https://reqres.in/api/register
   
   ● Payload: email
   
   ● Response: 400 along with an error
   
8) List users
   
   ● GET on https://reqres.in/api/users
   
   ● No payload
   
   ● Response: 200 with list of users

## How to Run Tests and Get Report

After cloning the project "mvn clean verify" command can be used via using command line.

Example : <projectFolderLocation> mvn clean verify

Report Location :
projectFolderLocation\subscriptionTest\target\cucumber-report-html\cucumber-html-reports\file-src-test-resources-features-test-feature.html

Report file need to be opened with a browser.

## How To Run Only Test

After cloning the project you need to run TestRunner class or "mvn clean test" command can be used via using command
line.

Example : projectFolderLocation mvn clean test

## How to Get Report

After test run "mvn verify -DskipTest" line need to be executed via using command line.

Report Location :
projectFolderLocation\subscriptionTest\target\cucumber-report-html\cucumber-html-reports\file-src-test-resources-features-test-feature.html

Report file need to be opened with a browser.

## Structure

MAVEN - Project Structure.

## Project Owner

Batur Türkmen [ustadlostad](https://github.com/ustadlostad)
