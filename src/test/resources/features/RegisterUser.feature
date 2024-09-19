Feature: Register

@runs
  Scenario: User opens the homepage
    * User navigates to home page
    * Verify that home page is visible successfully
    * Click on 'Signup / Login' button
    * Verify 'New User Signup!' is visible
    * Enter name and email address
    * Click 'Signup' button
    *  Verify that 'ENTER ACCOUNT INFORMATION' is visible
    * Fill details: Title, Name, Email, Password, Date of birth


