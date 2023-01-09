import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/janamatsevych/IdeaProjects/initial_selenium_project_6/chromedriver");

        WebDriver driver = new ChromeDriver(); //Instantiating Chrome Driver

        driver.manage().window().fullscreen();

        driver.get("https://www.google.com/"); //Navigate to the URL

        System.out.println(driver.getTitle());

        driver.quit(); //Quit the driver instance
    }
}
