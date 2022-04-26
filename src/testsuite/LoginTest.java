/*3. Write down the following test into ‘LoginTest’ class
1. userShouldNavigateToLoginPageSuccessfully
* click on the ‘Login’ link
* Verify the text ‘Welcome, Please Sign
 In!’
2. userShouldLoginSuccessfullyWithValidCredentials
* click on the ‘Login’ link
* Enter valid username
* Enter valid password
* Click on ‘LOGIN’ button
* Verify the ‘Log out’ text is display
3. verifyTheErrorMessage
* click on the ‘Login’ link
* Enter invalid username
* Enter invalid password
* Click on Login button
* Verify the error message ‘Login was unsuccessful.
 Please correct the errors and try again. No customer account found'*/

package testsuite;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String BaseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }
    public void userShouldNavigateToLoginPageSuccessfully(){
        //Find log in Link and Click on Login link
        clickOnElement(By.linkText("Log in"));

        //This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";//variable insilition
        //Find the welcome text element and get the text
        String actualMessageElement = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        System.out.println(actualMessageElement);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        //Find log in Link and Click on Login link
        clickOnElement(By.linkText("Log in"));
        sendTextToElement(By.name("Email"),"kag@gmail.com");//Find the Email field
        sendTextToElement(By.name("Password"),"kag123");//Find the password field
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));//Find the login button field and click
    }
    @Test
    public void verifyTheErrorMessage()
    {
        //Find log in Link and Click on Login link
        clickOnElement(By.linkText("Log in"));
        sendTextToElement(By.name("Email"),"kag1@gmail.com");//Find the Email field
        sendTextToElement(By.name("Password"),"kag1234");//Find the password field
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));//Find the login button field and click

        //Find the text element for unsuccessfully login and get the text
        String actualMessageElement = getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
        System.out.println("Unsuccessfull Login Actual Message:  \n"+actualMessageElement);
        //Message Validation
        messageValidation("Login was unsuccessful. Please correct the errors and try again. No customer account found",actualMessageElement);
    }
    @After
    public void closedown(){
        closeBrowser();
    }


}