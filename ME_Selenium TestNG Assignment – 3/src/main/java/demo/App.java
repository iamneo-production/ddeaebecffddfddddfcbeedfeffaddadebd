package demo;

//App.java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class App {
    WebDriver driver;

    public void setup(String browser) {
 /*
  if (browser.equalsIgnoreCase("chrome")) {
            ChromeDriver driver = new ChromeDriver();
            driver = new ChromeDriver();
        }
  */      
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://flipkart.com");
    }

    public int countLinks() {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        return links.size();
    }

    public void printLinks() {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Link Text and URLs:");
        for (WebElement link : links) {
            System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }
    }
    public static void main(String[] args) 
    {
        
    } 
        
    
}

