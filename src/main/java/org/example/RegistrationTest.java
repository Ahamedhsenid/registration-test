package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/insurance/v1/register.php");

        Select title = new Select(driver.findElement(By.xpath("//*[@id=\"user_title\"]")));
        title.selectByVisibleText("Sir");

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"user_firstname\"]"));
        firstName.sendKeys("Ahamed");
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"user_surname\"]"));
        lastName.sendKeys("Amhar");
        WebElement phone = driver.findElement(By.xpath("//*[@id=\"user_phone\"]"));
        phone.sendKeys("0774784467");

        Select year =new Select(driver.findElement(By.xpath("//*[@id=\"user_dateofbirth_1i\"]")));
        year.selectByVisibleText("1995");
        Select month =new Select(driver.findElement(By.xpath("//*[@id=\"user_dateofbirth_2i\"]")));
        month.selectByVisibleText("June");
        Select date =new Select(driver.findElement(By.xpath("//*[@id=\"user_dateofbirth_3i\"]")));
        date.selectByVisibleText("2");

        WebElement radio = driver.findElement(By.xpath("//*[@id=\"licencetype_f\"]"));
        radio.click();

        Select license =new Select(driver.findElement(By.xpath("//*[@id=\"user_licenceperiod\"]")));
        license.selectByVisibleText("3");
        Select academic =new Select(driver.findElement(By.xpath("//*[@id=\"user_occupation_id\"]")));
        academic.selectByVisibleText("Engineer");

        WebElement address = driver.findElement(By.xpath("//*[@id=\"user_address_attributes_street\"]"));
        address.sendKeys("123");
        WebElement city = driver.findElement(By.xpath("//*[@id=\"user_address_attributes_city\"]"));
        city.sendKeys("Colombo");
        WebElement country = driver.findElement(By.xpath("//*[@id=\"user_address_attributes_county\"]"));
        country.sendKeys("Sri Lanka");
        WebElement code = driver.findElement(By.xpath("//*[@id=\"user_address_attributes_postcode\"]"));
        code.sendKeys("1234");
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"user_user_detail_attributes_email\"]"));
        Email.sendKeys("ahamed@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"user_user_detail_attributes_password\"]"));
        password.sendKeys("123456");
        WebElement confirmPassword = driver.findElement(By.xpath("//*[@id=\"user_user_detail_attributes_password_confirmation\"]"));
        confirmPassword.sendKeys("123456");

        WebElement create = driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/input[2]"));
        create.click();

        driver.quit();
    }
}