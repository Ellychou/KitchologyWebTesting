package kitchologywebtesting;

import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.collections.Lists;

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
                //TODO: Use textSimilarity method to confirm link accuracy
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
                //TODO: Use textSimilarity method to confirm link accuracy
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
                //TODO: Use textSimilarity method to confirm link accuracy
            } catch (Exception e) {
                //Print error and associated link
                System.out.println(tmpLink);
                System.out.println(e.getMessage().substring(0, e.getMessage().indexOf(".")));
            }
        }
        //Close driver
        driver.close();
    }

    //Compares two imput strings and returns two if their similarity exceeds a certain threshold
    public boolean textSimilarity(String s1, String s2) {

        double thresh = 0.8;
        int simTally = 0;

        //remove pluralizations and possessives
        s1 = s1.replace("'s", "");
        s2 = s2.replace("'s", "");
        s1 = s1.replace("s ", " ");
        s2 = s2.replace("s ", " ");

        //Split the strings into individual words
        //then remove nonKeywords
        String[] split1 = s1.split(" ");
        String[] split2 = s2.split(" ");

        split1 = removeNonKeywords(s1.split(" "));
        split2 = removeNonKeywords(s2.split(" "));

        //Compare all possible pairs of split1 and split2
        for (String tmpString1 : split1) {
            for (String tmpString2 : split2) {
                //if the strings are equivalent, increment the similarity tally
                if (tmpString1.equalsIgnoreCase(tmpString2)) {
                    simTally++;
                }
            }
        }

        //if the number of equvalent words is > 80% of
        if ((double) simTally / Math.min(split1.length, split2.length) > thresh) {
            return true;
        } else {
            return false;
        }
    }

    public String[] removeNonKeywords(String[] input) {
        ArrayList<String> resultList = new ArrayList<String>();

        for (String item : input) {
            if (item.length() > 4) {
                resultList.add(item);
            }
        }

        String[] resultArray = new String[resultList.size()];
        resultList.toArray(resultArray);
        return resultArray;
    }
}
