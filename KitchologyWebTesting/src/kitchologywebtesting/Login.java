package kitchologywebtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Login {

    //Empty constructor
    public Login() {
    }

    //Login via Chrome using the input credentials
    public void loginAsChrome(String username, String password) {
        //Instantiate Driver
        WebDriver driver = new ChromeDriver();

        try {
            //navigate to the base url
            driver.get(Main.baseURL);
            //wait for the page to load
            Thread.sleep(1000);
            //locate and click the login link
            driver.findElement(By.id("loginLink")).click();
            //Find the name field and enter credentials
            driver.findElement(By.id("name")).sendKeys(username);
            //find the password field and enter credentials
            driver.findElement(By.id("password")).sendKeys(password);
            //find the button and cllick submit
            driver.findElement(By.id("j_idt26")).click();
            //wait for the browser to navigate to the new page
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Close the driver, free memory
        driver.close();
    }

    //Login via Firefox using the input credentials
    public void loginAsFirefox(String username, String password) {
        //Instantiate Driver
        WebDriver driver = new FirefoxDriver();

        try {
            //navigate to the base url
            driver.get(Main.baseURL);
            //wait for the page to load
            Thread.sleep(1000);
            //locate and click the login link
            driver.findElement(By.id("loginLink")).click();
            //Find the name field and enter credentials
            driver.findElement(By.id("name")).sendKeys(username);
            //find the password field and enter credentials
            driver.findElement(By.id("password")).sendKeys(password);
            //find the button and cllick submit
            driver.findElement(By.id("j_idt26")).click();
            //wait for the browser to navigate to the new page
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Close the driver, free memory
        driver.close();
    }

    //Login via Internet Explorer using the input credentials
    public void loginAsIE(String username, String password) {
        //Instantiate Driver
        WebDriver driver = new InternetExplorerDriver();

        try {
            //navigate to the base url
            driver.get(Main.baseURL);
            //wait for the page to load
            Thread.sleep(1000);
            //locate and click the login link
            driver.findElement(By.id("loginLink")).click();
            //Find the name field and enter credentials
            driver.findElement(By.id("name")).sendKeys(username);
            //find the password field and enter credentials
            driver.findElement(By.id("password")).sendKeys(password);
            //find the button and cllick submit
            driver.findElement(By.id("j_idt26")).click();
            //wait for the browser to navigate to the new page
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Close the driver, free memory
        driver.close();
    }
}
