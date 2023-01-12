import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;

public class _11_Child_Element_Index {

    public static void main(String[] args) {

        /*
        TEST CASE
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Xpath-CSS Locators" card
        Validate the headers below
        Programming Languages
        Automation Tools
         */

        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontendTesting();

        driver.findElement(By.id("card-2")).click();

        System.out.println(driver.findElement(By.xpath("(//div[@id='root']//h3)[2]")).getText()); // (//h3[@class='Xpath_subheader__VOtsU'])[2]

        for (WebElement element : driver.findElements(By.cssSelector(".Xpath_subheader__VOtsU"))) {
            System.out.println(element.getText());
        }

        //((//ul//ul)[1]/li)[2]

        //((//ul)[3]/li)[3]

        Driver.quitDriver();


    }


}
