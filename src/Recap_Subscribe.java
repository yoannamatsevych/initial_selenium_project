import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class Recap_Subscribe {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement firstName = driver.findElement(By.id("input_comp-khwayxk9"));
        WebElement lastName = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement email = driver.findElement(By.id("input_comp-khwb0zsz"));

        firstName.sendKeys("John");
        lastName.sendKeys("Doe");
        email.sendKeys("john.doe@gmail.com");
        Waiter.pause(1);

        System.out.println(firstName.getAttribute("value"));
        System.out.println(lastName.getAttribute("value"));
        System.out.println(email.getAttribute("value"));

        driver.quit();


    }
}
