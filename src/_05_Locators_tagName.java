import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;
import utils.Waiter;

public class _05_Locators_tagName {
    public static void main(String[] args) {

        /*
        TEST CASE
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Locators" card
        Validate the "Locators " header

        NOTE Make sure it is display, make sure text is locator
         */

        try{
            WebDriver driver = Driver.getDriver();

            //2. Action
            TechGlobalUtil.getFrontendTesting();

            driver.findElement(By.tagName("h1")).click();
            Waiter.pause(2);

            WebElement locatorsItem = driver.findElement(By.id("main_heading"));
            if (locatorsItem.isDisplayed()) System.out.println("Locators item validation is PASSED");
            else System.out.println("Locator item validation is FAIL");

            if (locatorsItem.getText().equals("Locators")) System.out.println("Text \"Locators\" item validation is PASSED");
            else System.out.println("Text \"Locator\" item validation is FAIL");

        }catch (Exception c){
            System.out.println("Test FAIL due to:" + c.getMessage());
        }
        finally{
            //3. teardown

            Driver.quitDriver();
        }

    }
}
