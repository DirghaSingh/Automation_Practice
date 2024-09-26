Feature: Login User

@TestCase2
Scenario: Login User with correct mail id and Password
    * User navigates to home page
    * Verify that home page is visible successfully
    * Click on 'Signup / Login' button

    * Enter name and email address
    * Click 'Signup' button
    * Verify that 'ENTER ACCOUNT INFORMATION' is visible
    * Fill details: Title, Name, Email, Password, Date of birth

    * Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    * Click 'Create Account button'
    * Verify and Click on 'Continue' button
    * Click on Logout Button
    
    * Verify Login to your account is visible
    * Enter correct email address and password
    * Click login button
    * Verify that Logged in as username is visible
    * Click Delete Account button
    * Verify that ACCOUNT DELETED! is visible and click Continue button

@TestCase3
Scenario: Login User with incorrect mail id and password
    * User navigates to home page
    * Verify that home page is visible successfully
    * Click on 'Signup / Login' button
    * Verify Login to your account is visible
    * Enter incorrect email address and password
    * Click login button
    * Verify error 'Your email or password is incorrect!' is visible

@TestCase4
Scenario: Logout User
    * User navigates to home page
    * Verify that home page is visible successfully
    * Click on 'Signup / Login' button
    * Enter name and email address
    * Click 'Signup' button

    * Fill details: Title, Name, Email, Password, Date of birth
    * Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    * Click 'Create Account button'
    * Verify and Click on 'Continue' button
    * Click on Logout Button

    * Enter correct email address and password
    * Click login button
    * Verify that Logged in as username is visible
    * Click on Logout Button
    * Verify that user is navigated to login page
