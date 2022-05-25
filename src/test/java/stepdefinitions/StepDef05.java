package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Page01;
import utilities.Driver;

public class StepDef05 {
    Page01 page01 =new Page01();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker =new Faker();

    @Given("Kullanici acilan sayfada ki Username textbox'i GECERSIZ sekilde doldurur.")
    public void kullanici_acilan_sayfada_ki_username_textbox_i_gecersız_sekilde_doldurur() {
          page01.userNameBox.click();
          actions.sendKeys("employee").perform();
          actions.sendKeys(Keys.TAB);
    }
    @Given("Kullanici acilan sayfada ki New Pasword textbox'i GECERLI sekilde doldurur.")
    public void kullanici_acilan_sayfada_ki_new_pasword_textbox_i_gecerlı_sekilde_doldurur() {
        actions.sendKeys("team32team32-").perform();

    }
    @Given("Kullanici  giris yapamadigini dogrular.")
    public void kullanici_giris_yapamadigini_dogrular() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(page01.girisYapilamadiYazisi.isDisplayed());

    }
    @Given("Kullanici acilan sayfada ki Username textbox'i GECERLI sekilde doldurur.")
    public void kullanici_acilan_sayfada_ki_username_textbox_i_gecerlı_sekilde_doldurur() {
        page01.userNameBox.click();
        actions.sendKeys("employee32").perform();
        actions.sendKeys(Keys.TAB);

    }
    @Given("Kullanici acilan sayfada ki New Pasword textbox'i GECERSIZ sekilde doldurur.")
    public void kullanici_acilan_sayfada_ki_new_pasword_textbox_i_gecersız_sekilde_doldurur() throws InterruptedException {
        Thread.sleep(1000);
        actions.sendKeys("team32team32").perform();
    }


    @Given("Kullanici {string} linkine tiklar.")
    public void kullanici_linkine_tiklar(String string) throws InterruptedException {
        Thread.sleep(1000);
       page01.passworduUnuttunuzMuYazisi.click();
       Thread.sleep(1000);
       page01.passworduUnuttunuzMuYazisi.click();

    }
    @Given("Kullanici Reset your password sayfasina gittigini dogrular.")
    public void kullanici_reset_your_password_sayfasina_gittigini_dogrular() {
       Assert.assertTrue(page01.resetYourPasswordSayfasi.isDisplayed());
    }

    //TC05
    @Given("Kullanici Email textbox'a tiklar.")
    public void kullanici_email_textbox_a_tiklar() throws InterruptedException {
        Thread.sleep(1000);
        page01.emailTextBox.click();

    }
    @Given("Kuallnici Email textBox'a gecerli email girer.")
    public void kuallnici_email_text_box_a_gecerli_email_girer() throws InterruptedException {
        Thread.sleep(2000);
        actions.sendKeys("bank@gmail.com").perform();
    }
    @Given("Kulalnici Reset password butonuna tiklar.")
    public void kulalnici_reset_password_butonuna_tiklar() {
        page01.resetPasswordButtonu.click();

    }
    @Given("Kullanici \"Check your emails for details on how to reset your password.\"yazisini gordugunu dogrulamalidir.")
    public void kullanici_check_your_emails_for_details_on_how_to_reset_your_password_yazisini_gordugunu_dogrulamalidir() {

    }

   //TC06
   @Given("Kullanici {string} yazisini gordugunu dogrular.")
   public void kullanici_yazisini_gordugunu_dogrular(String string) {


   }
    @Given("Kullanici {string} yazisina tiklar.")
    public void kullanici_yazisina_tiklar(String string) {


    }
    @Given("Registration sayfasina gidildigini dogrular.")
    public void registration_sayfasina_gidildigini_dogrular() {

    }
}
