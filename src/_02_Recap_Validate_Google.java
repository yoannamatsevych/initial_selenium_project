import org.openqa.selenium.WebDriver;
import utils.Driver;

public class _02_Recap_Validate_Google {
    public static void main(String[] args) {

        /*
        TEST CASE 3
        Go to https://www.google.com/
        Validate the page title is "Google"
        Validate the page url is "https://www.google.com/"
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        if(driver.getTitle().equals("Google")) System.out.println("PASSED");
        else System.out.println("FAIL");

        if(driver.getCurrentUrl().equals("https://www.google.com/")) System.out.println("PASSED");
        else System.out.println("FAIL");

        Driver.quitDriver();



    }
}
