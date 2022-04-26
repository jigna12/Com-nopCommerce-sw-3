/*Project-1 - ProjectName : com-nopcommerce-sw-2
BaseUrl = https://demo.nopcommerce.com/
1. Create the package ‘browserfactory’ and create the class
with the name ‘BaseTest’ inside the ‘browserfactory’
package. And write the browser setup code inside the
class ‘Base Test’.
2. Create the package ‘testsuite’ and create the following
classes inside the ‘testsuite’ package.
1. LoginTest
2. TopMenuTest
3. RegisterTest*/

package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    //opening browser setup code
    public void openBrowser(String url){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);//Launch Url
        driver.manage().window().maximize();//Maximise the windows
        //driver.manage().window().minimize();//Minimise the windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//We give implicit time to driver 20sec.
    }
    //Closing browser setup code
    public void closeBrowser(){
        driver.quit();
    }

}