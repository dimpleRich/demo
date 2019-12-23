package com.example.demo.service.impl;

import com.example.demo.service.TestService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    public static void main(String[] args) {

        openChrome();
    }

    public static void openFirefox() {
        /**
         * 打开firefox
         */
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("D:\\softwareInstallMenu\\Firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(options);
        driver.get("http://www.baidu.com");
    }

    /**
     * 打开chrome
     */
    public static void openChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.get("http://www.taobao.com");
        driver.get("http://www.imooc.com/user/newlogin/from_url/");
        driver.findElement(By.tagName("input")).sendKeys("609037724@qq.com");
        driver.findElement(By.name("password")).sendKeys("xu221168");
        driver.findElement(By.id("auto-signin")).click();
        driver.findElement(By.linkText("登录")).click();
        driver.findElement(By.partialLinkText("直接")).click();
        driver.findElement(By.className("btn-red")).click();
        driver.manage().window().maximize();
        driver.get("http://www.imooc.com");
        driver.findElement(By.className("search-input")).click();
        driver.findElement(By.className("search-input")).sendKeys("sss");
        WebElement element=driver.findElement(By.className("nav-item"));
        List<WebElement> elements=element.findElements(By.tagName("li"));
        elements.get(3).click();
    }
    /**
     * 打开chrome
     */
    public void openTaobaoChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.taobao.com");
        //driver.get("http://www.imooc.com/user/newlogin/from_url/");
        driver.findElement(By.tagName("input")).sendKeys("女裙子");
        driver.findElement(By.className("search-button")).click();
    }

    /**
     * 打开IE
     */
    public static void openIE() {
        System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://www.baidu.com");
    }

    /**
     * 打开Edge
     */
    public static void openEdge() {
        // 指定MicrosoftWebDriver路径
        System.setProperty("webdriver.edge.driver", ".\\drivers\\MicrosoftWebDriver.exe");
        //启动 Edge浏览器
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.baidu.com");
    }
}
