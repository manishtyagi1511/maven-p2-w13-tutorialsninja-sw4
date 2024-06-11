package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountsPage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends TestBase {

    MyAccountsPage myAccountsPage = new MyAccountsPage();


    /*
    1.1 create method with name "selectMyAccountOptions" it has one parameter name
"option" of type string
1.2 This method should click on the options whatever name is passed as parameter.
(Hint: Handle List of Element and Select options)
Write the following test
1. Test name verifyUserShouldNavigateToRegisterPageSuccessfully()
1.1 Clickr on My Account Link.
1.2 Call the method “selectMyAccountOptions” method and pass the parameter
“Register”
1.3 Verify the text “Register Account”
     */

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //Clickr on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        //Call the method “selectMyAccountOptions” method and pass the parameter Register
        myAccountsPage.selectMyAccountOption("Register");
        //Verify the text “Register Account”.
        String expextedText = "Register Account";
        String actualText = myAccountsPage.verifyTheTextRegisterAccount();
        Assert.assertEquals(actualText, expextedText);
    }


    /*
    2. Test name verifyUserShouldNavigateToLoginPageSuccessfully()
2.1 Clickr on My Account Link.
2.2 Call the method “selectMyAccountOptions” method and pass the parameter
“Login”
2.3 Verify the text “Returning Customer”
     */

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        //Call the method “selectMyAccountOptions” method and pass the parameter Login
        myAccountsPage.selectMyAccountOption("Login");
        //Verify the text “Returning Customer”.
        String expextedText = "Returning Customer";
        String actualText = myAccountsPage.verifyTextReturningCustomer();
        Assert.assertEquals(actualText, expextedText);
    }

    /*
    3. Test name verifyThatUserRegisterAccountSuccessfully()
3.1 Clickr on My Account Link.
3.2 Call the method “selectMyAccountOptions” method and pass the parameter
“Register”
3.3 Enter First Name
3.4 Enter Last Name
3.5 Enter Email
3.6 Enter Telephone
3.7 Enter Password
3.8 Enter Password Confirm
3.9 Select Subscribe Yes radio button
3.10 Click on Privacy Policy check box
3.11 Click on Continue button
3.12 Verify the message “Your Account Has Been Created!”
3.13 Click on Continue button
3.14 Clickr on My Account Link.
3.15 Call the method “selectMyAccountOptions” method and pass the parameter
“Logout”
3.16 Verify the text “Account Logout”
3.17 Click on Continue button
   */
    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        //Clickr on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.selectMyAccountOption("Register");
        myAccountsPage.enterFirstName();                                          //Enter First Name
        myAccountsPage.enterLastName();                                           //Enter Last Name
        myAccountsPage.enterEMail();                                              //Enter Email
        myAccountsPage.enterPhoneNumber();                                          //Enter Telephone
        //Enter Password
        myAccountsPage.enterPassword();
        //Enter Password Confirm
        myAccountsPage.enterConfirmPassword();
        //Select Subscribe Yes radio button
        myAccountsPage.selectYesRadioButton();
        //Click on Privacy Policy check box
        myAccountsPage.tickPrivacyCheckBox();
        //Click on Continue button
        myAccountsPage.clickContinue();
        //Verify the message “Your Account Has Been Created!”
        String expextedText = "Your Account Has Been Created!";
        String actualText = myAccountsPage.accountCreationText();
        Assert.assertEquals(actualText, expextedText);
        //Click on Continue button
        myAccountsPage.clickingContinue();
        //Clickr on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        //Verify the text “Account Logout”
        myAccountsPage.selectMyAccountOption("Logout");
        expextedText = "Account Logout";
        actualText = myAccountsPage.accountLogoutText();
        Assert.assertEquals(actualText, expextedText);
        //Click on Continue button
        myAccountsPage.clickOnFinalContinue();
    }
    /*
    4. Test name verifyThatUserShouldLoginAndLogoutSuccessfully()
4.1 Clickr on My Account Link.
4.2 Call the method “selectMyAccountOptions” method and pass the parameter
“Login”
4.3 Enter Email address
4.4 Enter Last Name
4.5 Enter Password
4.6 Click on Login button
4.7 Verify text “My Account”
4.8 Clickr on My Account Link.
4.9 Call the method “selectMyAccountOptions” method and pass the parameter
“Logout”
4.10 Verify the text “Account Logout”
4.11 Click on Continue button
     */

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {

        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.selectMyAccountOption("Login");
        myAccountsPage.enterEmail();
        myAccountsPage.enterPassword();
        myAccountsPage.clickOnLogin();
        String expextedText = "My Account";
        String actualText = myAccountsPage.myAccountText();
        Assert.assertEquals(actualText, expextedText);
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.selectMyAccountOption("Logout");
        expextedText = "Account Logout";
        actualText = myAccountsPage.accountLogoutText();
        Assert.assertEquals(actualText, expextedText);
        myAccountsPage.clickOnFinalContinue();

    }
}
