package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FirstSeleniumTest {

    WebDriver driver;

    // before  -  setUp
    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(); // options

        //driver.get("https://www.google.com");
        driver.navigate().to("https://telranedu.web.app/login"); //  with history   (a fost  schimbat)

        // maximize browser window
        driver.manage().window().maximize();
    }

    // tests   -
    @Test
    public void findElementByTagName(){
        System.out.println("Site opened !!!");

        // find element by tag
        // driver.findElement(By.tagName("h1"));
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());


        // find list of element
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

        // find element by class name
        WebElement element1 = driver.findElement(By.className("navbar-component_nav__1X_4m"));
        System.out.println(element1.getText());

        // find element by name
        driver.findElement(By.name("email"));
        // WebElement element2 = driver.findElement(By.name("email"));
        // System.out.println(element2.getText());

    }

    // after   -  tearDown
    @AfterMethod
    public void tearDown(){
              driver.quit(); // all tabs & close browser
             //driver.close();  // only one tab (if tab only one -> close browser )
    }
}
