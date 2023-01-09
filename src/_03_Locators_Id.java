import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators_Id {
    public static void main(String[] args) throws InterruptedException {

        /*
        Go to
        Validate that company logo is display
         */

        //1.Set up

        System.setProperty("webdriver.chrome.driver", "/Users/janamatsevych/IdeaProjects/initial_selenium_project_6/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2.Validation
        driver.get("https://techglobal-training.netlify.app/");

        Thread.sleep(2000);

        //Locate the logo and validate if it is located
        WebElement logo = driver.findElement(By.id("logo"));

       if(logo.isDisplayed()) System.out.println("Logo validation PASSED");
       else System.out.println("Logo validation FAIL");//true

        //3. Teardown
        driver.quit();
    }
}
