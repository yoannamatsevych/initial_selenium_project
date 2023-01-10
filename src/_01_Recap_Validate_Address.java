import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

import java.util.List;

public class _01_Recap_Validate_Address {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://techglobal-training.netlify.app/");
        Waiter.pause(1);

        List<WebElement> elements = driver.findElements(By.xpath("//footer[@class='Footer_footer__kXlYa']//p"));

        String[] actualText = {"2860 S River Rd Suite 350, Des Plaines IL 60018", "© 2023 TechGlobal - All Rights Reserved"};

        for (int i = 0; i < elements.size(); i++) {
            if(elements.get(i).getText().equals(actualText[i]))
                System.out.println("PASSED");
            else System.out.println("FAILED");
        }

        List<WebElement> elementList = driver.findElements(By.xpath("//div[@class='Footer_socials__7h4n1']/a"));

        for (int i = 0; i < elementList.size(); i++) {
            if (elementList.get(i).isDisplayed() && elementList.get(i).isEnabled())
                System.out.println("PASSED");
            else System.out.println("FAIL");
        }

        Driver.quitDriver();






    }

}
