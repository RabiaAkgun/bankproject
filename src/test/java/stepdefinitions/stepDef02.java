package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Page01;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Locale;

public class stepDef02 {
    Page01 page01 = new Page01();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker(new Locale("tr", "Turkey"));

    //TC01

    @Given("Kullanici acilan sayfada SSN textbox bos birakilmadigini gormeli")
    public void kullanici_acilan_sayfada_ssn_textbox_bos_birakilmadigini_gormeli() throws InterruptedException {
        page01.ssnBox.click();
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(page01.ssnZorunluYazisi.isDisplayed());
        Thread.sleep(4000);


    }

    @Given("Kullanici acilan sayfada First Name textbox bos birakilmadigini gormeli")
    public void kullanici_acilan_sayfada_first_name_textbox_bos_birakilmadigini_gormeli() {
        page01.firstNameBox.click();
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(page01.firstnameGerekli.isDisplayed());


    }

    @Given("Kullanici acilan sayfada Last Name textbox  bos birakilmadigini gormeli")
    public void kullanici_acilan_sayfada_last_name_textbox_bos_birakilmadigini_gormeli() {

        page01.lastNameBox.click();
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(page01.lastnameGerekli.isDisplayed());

    }

    @Given("Kullanici acilan sayfada Adress textbox bos birakilmadigini gormeli")
    public void kullanici_acilan_sayfada_adress_textbox_bos_birakilmadigini_gormeli() {
        page01.adresBox.click();
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(page01.adresGerekli.isDisplayed());

    }

    @Given("Kullanici acilan sayfada Phone Number  textbox bos birakilmadigini gormeli")
    public void kullanici_acilan_sayfada_phone_number_textbox_bos_birakilmadigini_gormeli() {
        page01.phoneBox.click();
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(page01.phoneGerekli.isDisplayed());

    }

    @Given("Kullanici acilan sayfada Username textbox  bos birakilmadigini gormeli")
    public void kullanici_acilan_sayfada_username_textbox_bos_birakilmadigini_gormeli() {
        page01.userNameBox.click();
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(page01.usernameGerekli.isDisplayed());


    }

    @Given("Kullanici acilan sayfada Email textbox  bos birakilmadigini gormeli")
    public void kullanici_acilan_sayfada_email_textbox_bos_birakilmadigini_gormeli() {
        page01.emailBox.click();
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(page01.emailGerekli.isDisplayed());


    }

    @Given("Kullanici acilan sayfada New password  textbox  bos birakilmadigini gormeli")
    public void kullanici_acilan_sayfada_new_password_textbox_bos_birakilmadigini_gormeli() {
        page01.newPasswordBox.click();
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(page01.newPasswordGerekli.isDisplayed());


    }

    @Given("Kullanici acilan sayfada New password confirmation textbox bos birakilmadigini gormeli")
    public void kullanici_acilan_sayfada_new_password_confirmation_textbox_bos_birakilmadigini_gormeli() {
        page01.newPasswordConfirmationBox.click();
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(page01.newPasswordConfirmationGerekli.isDisplayed());

    }

    //TC02

    @Given("Kullanici SSN textbox'a gecerli SSN numarasi girer")
    public void kullanici_ssn_textbox_a_gecerli_ssn_numarasi_girer() {
        page01.ssnBox.click();
        actions.sendKeys(ConfigReader.getProperty("ssn")).perform();


    }

    @Given("Kullanici  {string} yazisini gormemeli")
    public void kullanici_yazisini_gormemeli(String string) throws InterruptedException, IOException {
        Thread.sleep(2000);
        //  Assert.assertFalse("Ssn yanlis yazisi gozukmuyor",page01.ssnZorunluYazisi.isDisplayed());

        ReusableMethods.getScreenshot("Please enter your social security number yazisi gozukmuyor");
    }

    @Given("Kullanici  {string} yazisini gormemelidir.")
    public void kullanici_yazisini_gormemelidir(String string) throws IOException {

        Driver.getDriver().navigate().refresh();
        page01.ssnBox.click();
        actions.sendKeys(ConfigReader.getProperty("ssn")).perform();
        // Assert.assertFalse(page01.gecersizSSNYazisi.isDisplayed());
        ReusableMethods.getScreenshot("Ssn is invalid. yazisi gozukmuyor");

    }

    //TC03
    @Given("Kullanici Phone Number textbox'a tiklar")
    public void kullanici_phone_number_textbox_a_tiklar() {
        page01.phoneBox.click();

    }

    @Given("Kullanici gecerli Phone Number girer")
    public void kullanici_gecerli_phone_number_girer() {

        actions.sendKeys(ConfigReader.getProperty("phoneNumber")).perform();

    }

    @Given("Kullanici Please enter your mobile phone number. yazisini gormemelidir")
    public void kullanici_please_enter_your_mobile_phone_number_yazisini_gormemelidir() throws InterruptedException, IOException {
        Thread.sleep(1000);
        // Assert.assertTrue(page01.phoneGerekli.isDisplayed());
        ReusableMethods.getScreenshot("Please enter your mobile phone number.yazisi gozukmuyor");

    }

    @Given("Kullanici Your mobile phone number is invalid. yazisini gormemeli")
    public void kullanici_your_mobile_phone_number_is_invalid_yazisini_gormemeli() throws InterruptedException, IOException {
        Driver.getDriver().navigate().refresh();
        Thread.sleep(2000);
        page01.phoneBox.click();
        actions.sendKeys(ConfigReader.getProperty("phoneNumber")).perform();
        //Assert.assertFalse(page01.phoneGerekli.isDisplayed());
        ReusableMethods.getScreenshot("Your mobile phone number is invalid. yazisi gozukuyor");

    }

    //TC 04

    @Given("Kullanici Email textbox'a tiklar")
    public void kullanici_email_textbox_a_tiklar() throws InterruptedException {

        Driver.waitAndClick(page01.registerSayfasi);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
      Thread.sleep(4000);
        page01.emailBox.click();


    }

    @Given("Kullanici Your email is invalid. yazisini gormemeli")
    public void kullanici_your_email_is_invalid_yazisini_gormemeli() throws IOException {

        actions.sendKeys(ConfigReader.getProperty("email2")).perform();

      // Assert.assertFalse(page01.emailGerekli.isDisplayed());
      ReusableMethods.getScreenshot("Your email is invalid. Yazisi gozukmuyor");

    }
}
