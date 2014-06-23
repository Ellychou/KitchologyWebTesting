package kitchologywebtesting;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Navigation {

    private String baseURL;

    public Navigation(String url) {
        baseURL = url;
        clickLinksChrome();
    }

    public void clickLinksChrome() {
        //Instantiate Driver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseURL);

        //a list which stores the urls all of the clickable elements headings
        List<String> links = new LinkedList<String>();

        //a list which stores all of the web elements contained by the specified webpage
        List<WebElement> elements = driver.findElements(By.tagName("a"));

        //for each clickable element on the page, copy the elemnts heading into the "links" linked list
        for (WebElement element : elements) {
            String tmpString = element.getText();
            if (tmpString != null && !tmpString.equals("")) {
                links.add(tmpString);
                System.out.println(tmpString);
            }

        }

        //for all clickable elements
        for (String tmpLink : links) {
            try {
                //return to base url
                driver.get(baseURL);
                //find element
                driver.findElement(By.linkText(tmpLink)).click();
                //Wait for browser
                Thread.sleep(2000);
            } catch (Exception e) {
                //Print error and associated link
                System.out.println(tmpLink);
                System.out.println(e.getMessage().substring(0, e.getMessage().indexOf(".")));
            }
        }
        //Close driver
        driver.close();
    }

    public void clickLinksFirefox() {
        //Instantiate Driver
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);

        //a list which stores the urls all of the clickable elements headings
        List<String> links = new LinkedList<String>();

        //a list which stores all of the web elements contained by the specified webpage
        List<WebElement> elements = driver.findElements(By.tagName("a"));

        //for each clickable element on the page, copy the elemnts heading into the "links" linked list
        for (WebElement element : elements) {
            String tmpString = element.getText();
            if (tmpString != null && !tmpString.equals("")) {
                links.add(tmpString);
                System.out.println(tmpString);
            }

        }

        //for all clickable elements
        for (String tmpLink : links) {
            try {
                //return to base url
                driver.get(baseURL);
                //find element
                driver.findElement(By.linkText(tmpLink)).click();
                //Wait for browser
                Thread.sleep(2000);
            } catch (Exception e) {
                //Print error and associated link
                System.out.println(tmpLink);
                System.out.println(e.getMessage().substring(0, e.getMessage().indexOf(".")));
            }
        }
        //Close driver
        driver.close();
    }

    public void clickLinksIE() {
        //Instantiate Driver
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);

        //a list which stores the urls all of the clickable elements headings
        List<String> links = new LinkedList<String>();

        //a list which stores all of the web elements contained by the specified webpage
        List<WebElement> elements = driver.findElements(By.tagName("a"));

        //for each clickable element on the page, copy the elemnts heading into the "links" linked list
        for (WebElement element : elements) {
            String tmpString = element.getText();
            if (tmpString != null && !tmpString.equals("")) {
                links.add(tmpString);
                System.out.println(tmpString);
            }

        }

        //for all clickable elements
        for (String tmpLink : links) {
            try {
                //return to base url
                driver.get(baseURL);
                //find element
                driver.findElement(By.linkText(tmpLink)).click();
                //Wait for browser
                Thread.sleep(2000);
            } catch (Exception e) {
                //Print error and associated link
                System.out.println(tmpLink);
                System.out.println(e.getMessage().substring(0, e.getMessage().indexOf(".")));
            }
        }
        //Close driver
        driver.close();
    }
}
