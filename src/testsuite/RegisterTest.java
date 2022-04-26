/*5. Write down the following test into ‘RegisterTest’ class
1. userShouldNavigateToRegisterPageSuccessfully
* click on the ‘Register’ link
* Verify the text ‘Register’
2. userSholdRegisterAccountSuccessfully
* click on the ‘Register’ link
* Select gender radio button
* Enter First name
* Enter Last name
* Select Day Month and Year
* Enter Email address
* Enter Password
* Enter Confirm password
* Click on REGISTER button
* Verify the text 'Your registration completed’*/

package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility
{
    String BaseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }
    @Test//1
    public void userShouldNavigateToRegisterPageSuccessfully()
    {
        clickOnElement(By.linkText("Register"));//Find the Register link and click on Register link
        String actTab = getTextFromElement(By.xpath("//a[contains(text(),'Register')]")); //Find the text element for Register Tab and get the text
        System.out.println("Actual Tab Name Is:" +actTab);
        messageValidation("Register",actTab); //Validate actual and expected message
    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){

        clickOnElement(By.linkText("Register"));//Find the Register link and click on Register link
        //Find the gender radio button element
        clickOnElement(By.id("gender-male")); //Checking gender-male radio button
        clickOnElement(By.id("gender-female")); //Checking gender-female radio button

        sendTextToElement(By.id("FirstName"),"Krishna"); //Find the first name element and enter name
        sendTextToElement(By.id("LastName"),"Gothadiya"); //Find the last name element and enter name
        sendTextToElement(By.name("DateOfBirthDay"),"15");//Find the Day element and Enter Day
        sendTextToElement(By.name("DateOfBirthMonth"),"July"); //Find the Month element and Enter Month
        sendTextToElement(By.name("DateOfBirthYear"),"2010");//Find the Year element and Enter Year
        sendTextToElement(By.id("Email"),"kag9@gmail.com");//Find the Emailid element and enter emailid//Please Enter kag10,kag11....email for each register
        sendTextToElement(By.name("Password"),"kag123"); //Find the password element and Enter password
        sendTextToElement(By.name("ConfirmPassword"),"kag123");//Find the Confirm password element and Enter Confirm password

        clickOnElement(By.name("register-button"));//Find the Register Button element and click
        String actTab = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));   //Find the text element for Register Tab and get the text
        System.out.println("Actual Registration Successfull message :" +actTab);
        messageValidation("Your registration completed",actTab);//Validate actual and expected message
    }
    @After
    public void closedown(){
         closeBrowser();
    }
}

