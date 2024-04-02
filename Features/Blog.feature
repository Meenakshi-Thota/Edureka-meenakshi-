Feature: Blog page on Edureka application
#@SanityTest
Scenario: Select a learning
Given user is on Edureka Home page
When user click on Blog 
And user click on BI and Visualization
And user click on Pentaho BI
When user click on Become a certified professional
Then user click on Enroll now

@SanityTest
Scenario Outline: Download eBook
Given user is on Edureka Home page
When user click on Blog 
And user click on Ebook
And user click on Free Cybersecurity eBook
And user enters the name as <name>
And user enters the email as <email>
And user enters the phone number as <PhoneNumber>
And user select the experience as <experience>
Then user click on Dowload Ebook
   Examples:
      |      name       |        email          |  PhoneNumber |   experience  |
      |"Meenakshi Thota"| "meenakshi@gmail.com" | "9876543210" |  "0-2 Years"  |
      |   "Pavani"      |   "pavani@gmail.com"  | "9398345678" |  "2-5 Years"  |

Scenario: Selenium Tutorial
Given user is on Edureka Home page
When user click on Blog 
And user scrolls up
And user click on vedios
And user clicks on Selenium tutorial 
Then user get serise of vedios

Scenario: Interview questions
Given user is on Edureka Home page
When user click on Blog 
And user scrolls down
And user click on interview question
And user click on oracle interview questions
Then user will get interview questions

#@SanityTest
Scenario: Subscribe failure
Given user is on Edureka Home page
When user click on Blog
And user click on subscribe button
And user enters the username as "Meenakshi Thota"
Then user click on sign up
