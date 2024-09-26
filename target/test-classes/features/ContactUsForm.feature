Feature: Contact Us Form

@TestCase6
Scenario: Fill Contact Us Form
    * User navigates to home page
    * Verify that home page is visible successfully
    * Click on Contact Us button
    * Verify GET IN TOUCH is visible
    *  Enter name, email, subject and message 
    * Click Submit button
    *  Click OK button
    * Verify success message Success! Your details have been submitted successfully. is visible
    * Click Home button and verify that landed to home page successfully