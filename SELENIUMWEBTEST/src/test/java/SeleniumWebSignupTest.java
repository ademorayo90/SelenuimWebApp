import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumWebSignupTest {
    //import selenium WebDriver.
    private WebDriver driver;

   @Test
    public void start () throws InterruptedException {
        //locate where the chrome driver is


       System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\FacebookTest\\Resources\\chromedriver.exe");
        //open your Chrome browser
        driver = new ChromeDriver();
        Thread.sleep(10000);
        //Input your selenium Demo page URL(https://selenium-blog.herokuapp.com)
        driver.get("https://selenium-blog.herokuapp.com/");
        Thread.sleep(10000);
        //maximize the browser
        driver.manage().window().maximize();
        //click on the signup button to open the signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        //Input your username on the username field

        driver.findElement(By.id("user_username")).sendKeys("morayo10");
        //Input your email on the email field
        driver.findElement(By.id("user_email")).sendKeys("mora@mailinator.com");
        //locate the password field and Input your password on the password field
        driver.findElement(By.id("user_password")).sendKeys("admin");
        //click on the signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(10000);
        // click on user1 item on the listpage
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        //click on logout
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();


    }
    @AfterTest
    public void closeBrowser() {
       //quit the browser
        driver.quit();

    }
}
