/*4. Write down the following test into ‘TopMenuTest’ class
1. userShouldNavigateToComputerPageSuccessfully
* click on the ‘Computers’ Tab
* Verify the text ‘Computers’
2. userShouldNavigateToElectronicsPageSuccessfully
* click on the ‘Electronics’ Tab
* Verify the text ‘Electronics’
3. userShouldNavigateToApparelPageSuccessfully
* click on the ‘Apparel’ Tab
* Verify the text ‘Apparel’
4.
userShouldNavigateToDigitalDownloadsPageSuccessfully
* click on the ‘Digital downloads’ Tab
* Verify the text ‘Digital downloads’
5. userShouldNavigateToBooksPageSuccessfully
* click on the ‘Books’ Tab
* Verify the text ‘Books’
6. userShouldNavigateToJewelryPageSuccessfully
* click on the ‘Jewelry’ Tab
* Verify the text ‘Jewelry’
7. userShouldNavigateToGiftCardsPageSuccessfully
* click on the ‘Gift Cards’ Tab
* Verify the text ‘Gift Cards’*/

package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility
{
    String BaseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }
    @Test//1
    public void userShouldNavigateToComputerPageSuccessfully()
    {
        clickOnElement(By.linkText("Computers"));//Find the Computer link and click
        String actTab = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));//Find the text element for computer Tab and get the text
        System.out.println("Actual Tab Name Is:" +actTab);
        messageValidation("Computers",actTab);//Validate actual and expected message
    }
    @Test//2
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        clickOnElement(By.linkText("Electronics")); //Find the Electronics link and click
        String actTab = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));//Find the text element for Electronics Tab and get the text
        System.out.println("Actual Tab Name Is:" +actTab);
        messageValidation( "Electronics",actTab);//Validate actual and expected message
    }
    @Test//3
    public void userShouldNavigateToApparelPageSuccessfully()
    {
        clickOnElement(By.linkText("Apparel"));//Find the Apparel link and click
        String actTab = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]")); //Find the text element for Apparel Tab and get the text
        System.out.println("Actual Tab Name Is:" +actTab);
        messageValidation("Apparel", actTab);//Validate actual and expected message
    }
    @Test//4
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully()
    {
        clickOnElement(By.linkText("Digital downloads"));//Find the Digital downloads link and click
        String actTab = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));//Find the text element for Digital downloads Tab and get the text
        System.out.println("Actual Tab Name Is:" +actTab);
        messageValidation("Digital downloads",actTab);//Validate actual and expected message
    }
    @Test//5
    public void userShouldNavigateToBooksPageSuccessfully()
    {
        clickOnElement(By.linkText("Books"));//Find the Books link and click
        String actTab = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));//Find the text element for Books Tab and get the text
        System.out.println("Actual Tab Name Is:" +actTab);
        messageValidation( "Books",actTab);//Validate actual and expected message
    }
    @Test//6
    public void userShouldNavigateToJewelryPageSuccessfull()
    {
        clickOnElement(By.linkText("Jewelry"));//Find the Jewelry link and click
        String actTab = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));//Find the text element for Jewelry Tab and get the text
        System.out.println("Actual Tab Name Is:" +actTab);
        messageValidation( "Jewelry",actTab); //Validate actual and expected message
    }
    @Test//7
    public void userShouldNavigateToGiftCardsPageSuccessfully()
    {
        clickOnElement(By.linkText("Gift Cards"));//Find the Gift Cards link and click
        String actTab = getTextFromElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));//Find the text element for Gift Cards Tab and get the text
        System.out.println("Actual Tab Name Is:" +actTab);
        messageValidation("Gift Cards",actTab); //Validate actual and expected message
    }
    @After
    public void closedown(){
        closeBrowser();
    }
}