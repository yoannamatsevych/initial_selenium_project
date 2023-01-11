import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;
import utils.Waiter;

public class TestFacebook {
    public static void main(String[] args) {



        WebDriver driver = Driver.getDriver();

        driver.get("https://www.facebook.com/");
        Waiter.pause(1);

        if(driver.getTitle().equals("Facebook - log in or sign up")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");

        if(driver.getCurrentUrl().equals("https://www.facebook.com/")) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAIL");

        if( driver.findElement(By.xpath("//div[@class='_8ice']/img")).isDisplayed()) System.out.println("Logo validation PASSED");
        else System.out.println("Logo validation FAILED");

        if( driver.findElement(By.xpath("//h2[@class='_8eso']")).isDisplayed()) System.out.println("H2 validation PASSED");
        else System.out.println("H2 validation FAILED");

        if( driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).isDisplayed())
            System.out.println("Email box validation PASSED");
        else System.out.println("Email box validation FAILED");

        if( driver.findElement(By.id("passContainer")).isDisplayed())
            System.out.println("Password box validation PASSED");
        else System.out.println("Password box validation FAILED");

        if( driver.findElement(By.name("login")).isEnabled())
            System.out.println("Login button validation PASSED");
        else System.out.println("Login button validation FAILED");

        if(driver.findElement(By.linkText("Forgot password?")).isDisplayed())
            System.out.println("Forgot password link validation PASSED");
        else System.out.println("Forgot password link validation FAILED");

        if(driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).isDisplayed())
            System.out.println("\"Create new account button\" validation PASSED");
        else System.out.println("\"Create new account button\" validation FAILED");


//    System.out.println(driver.findElement(By.className("fb_logo")).isDisplayed());
//    System.out.println(driver.findElement(By.className("_8eso")).getText());
//    System.out.println(driver.findElement(By.id("email")).isDisplayed());
//    System.out.println(driver.findElement(By.id("pass")).isDisplayed());
//    System.out.println(driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).getText());
//    System.out.println(driver.findElement(By.cssSelector("._6ltj>a")).getText());
//    System.out.println(driver.findElement(By.cssSelector("a[id*='u_0_0_']")).getText());


        Driver.quitDriver();


    }
}
