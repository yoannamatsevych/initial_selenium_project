import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;



public class _03_Recap {
    /*
    TEST CASE 4
    Go to https://www.google.com/
    Enter "Software Engineer in Test" to search input box
    Click the search button
    Validate the first result contains the text "Software Engineer in Test" (edited)
     */
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");
        WebElement searchInput = driver.findElement(By.className("gLFyf"));
        WebElement searchButton = driver.findElement(By.className("gNO89b"));

        searchInput.sendKeys("Software Engineer in Test");
        searchButton.click();

        if(driver.findElement(By.xpath("(//div[@class='yuRUbf']//h3)[1]")).getText().contains("Software Engineer in Test"))
            System.out.println("PASSED");
        else System.out.println("FAILED");

        Driver.quitDriver();



    }
}
