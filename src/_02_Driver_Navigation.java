import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Driver_Navigation {
    public static void main(String[] args) {
        /*
        Go to https://www.techglobalschool.com
        Refresh the page
        Navigate to https://www.amazon.com/
        Navigate back to TechGlobal web site
        Navigate forward Amazon web site
        Validate the URL of the page
        Validate the title of the page


        EXPECTED RESULT:
        URL  = https://www.amazon.com/
        Title = Amazon.com. Spend less. Smile more.
         */

        System.setProperty("webdriver.chrome.driver", "/Users/janamatsevych/IdeaProjects/initial_selenium_project_6/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.techglobalschool.com/");

        driver.navigate().refresh();

        driver.navigate().to("https://www.amazon.com/");

        driver.navigate().back();

        driver.navigate().forward();

        if(driver.getTitle().equals("Amazon.com. Spend less. Smile more.")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAIL");

        if (driver.getCurrentUrl().equals("https://www.amazon.com/")) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAIL");

        driver.quit();
    }
}
