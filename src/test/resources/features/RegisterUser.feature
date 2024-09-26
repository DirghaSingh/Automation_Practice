Feature: Register

@TestCase1
  Scenario: User opens the homepage
    * User navigates to home page
    * Verify that home page is visible successfully
    * Click on 'Signup / Login' button
    * Verify 'New User Signup!' is visible
    * Enter name and email address
    * Click 'Signup' button
    *  Verify that 'ENTER ACCOUNT INFORMATION' is visible
    * Fill details: Title, Name, Email, Password, Date of birth
    * Select checkbox1 'Sign up for our newsletter!'
    * Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    * Click 'Create Account button'
    * Verify 'ACCOUNT CREATED!' is visible
    * Verify and Click on 'Continue' button
    * Verify that Logged in as username is visible
    * Click Delete Account button
    * Verify that ACCOUNT DELETED! is visible and click Continue button

@TestCase5
  Scenario: Register User with existing email
    * User navigates to home page
    * Verify that home page is visible successfully
    * Click on 'Signup / Login' button
    * Verify 'New User Signup!' is visible
    * Enter name and email address
    * Click 'Signup' button
    *  Verify that 'ENTER ACCOUNT INFORMATION' is visible
    * Fill details: Title, Name, Email, Password, Date of birth
    * Select checkbox1 'Sign up for our newsletter!'
    * Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    * Click 'Create Account button'
    * Verify that ACCOUNT CREATED! is visible
    * Verify and Click on 'Continue' button
    * Click on Logout Button


    * Enter name and already registered email address
    * Click 'Signup' button
    * Verify error Email Address already exist! is visible


