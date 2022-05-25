package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.apache.poi.ss.formula.functions.T;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Page01;
import utilities.Driver;

import java.util.Locale;

public class StepDef03 {

          Page01 page01 = new Page01();
          Actions actions = new Actions(Driver.getDriver());
          Faker faker = new Faker();

    @Given("Kullanici acilan sayfada New password textbox'a tiklar.")
    public void kullanici_acilan_sayfada_new_password_textbox_a_tiklar() throws InterruptedException {
        Thread.sleep(2000);
        Driver.waitAndClick(page01.registerSayfasi);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(4000);
         page01.newPasswordBox.click();
    }
    @Given("Kullanici New password textbox'a bir kucuk harf girmelidir.")
    public void kullanici_new_password_textbox_a_bir_kucuk_harf_girmelidir() {

         actions.sendKeys("a").perform();
    }
    @Given("Password strength bolumunun renginin kirmizi oldugu gorulmelidir.")
    public void password_strength_bolumunun_renginin_kirmizi_oldugu_gorulmelidir() {
        Assert.assertTrue(page01.newPasswordTekHarfKirmiziRenk.isDisplayed());
    }

    @Given("Kullanici New password textbox'a {int}.karakter olarak ta buyuk harf girmelidir.")
    public void kullanici_new_password_textbox_a_karakter_olarak_ta_buyuk_harf_girmelidir(Integer int1) throws InterruptedException {
        page01.newPasswordBox.clear();
        page01.newPasswordBox.click();
        actions.sendKeys("aA").perform();
    }
    @Given("Password strength bolumunun renginin Turuncu gorulmelidir.")
    public void password_strength_bolumunun_renginin_turuncu_gorulmelidir() {
        Assert.assertTrue(page01.NewPasswordTuruncuRenk.isDisplayed());
    }

    @Given("Kullanici New password textbox'a {int}.karakter olarak ta rakam girmelidir.")
    public void kullanici_new_password_textbox_a_karakter_olarak_ta_rakam_girmelidir(Integer int1) {
        page01.newPasswordBox.clear();
        page01.newPasswordBox.click();
        actions.sendKeys("aA3").perform();

    }
    @Given("Password strength bolumunun renginin Sari gorulmelidir.")
    public void password_strength_bolumunun_renginin_sari_gorulmelidir() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(page01.newPasswordSariRenk.isDisplayed());
    }

    @Given("Kullanici New password textbox'a {int}.karakter olarak ta ozel karakter girmelidir.")
    public void kullanici_new_password_textbox_a_karakter_olarak_ta_ozel_karakter_girmelidir(Integer int1) {
        page01.newPasswordBox.clear();
        page01.newPasswordBox.click();
        actions.sendKeys("aA3?").perform();

    }
    @Given("Password strength bolumunun renginin Acik Yesil oldugu gorulmelidir.")
    public void password_strength_bolumunun_renginin_acik_yesil_oldugu_gorulmelidir() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(page01.newPasswordAcikYesilRenk.isDisplayed());
    }

    @Given("Kullanici New password textbox'a {int} {int} ve {int}. basamaklar doldurulmaldir.")
    public void kullanici_new_password_textbox_a_ve_basamaklar_doldurulmaldir(Integer int1, Integer int2, Integer int3) {
        page01.newPasswordBox.clear();
        page01.newPasswordBox.click();
        actions.sendKeys("aA3?123").perform();

    }
    @Given("Password strength bolumunun renginin Koyu Yesil oldugu gorulmelidir.")
    public void password_strength_bolumunun_renginin_koyu_yesil_oldugu_gorulmelidir() throws InterruptedException {
       Thread.sleep(2000);
       Assert.assertTrue(page01.newPasswordKoyuYesilRenk.isDisplayed());
    }

    @Given("Kullanici tum bosluklari doldurduktan sonra Register butonuna tiklar.")
    public void kullanici_tum_bosluklari_doldurduktan_sonra_register_butonuna_tiklar() throws InterruptedException {
        page01.ssnBox.click();
        actions.sendKeys(faker.idNumber().ssnValid())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().username())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .perform();
        String newPassword = faker.internet().password(12,20,true,true,true);
        page01.newPasswordBox.click();
        actions.sendKeys(newPassword).perform();
        actions.sendKeys(Keys.TAB).perform();
        page01.newPasswordConfirmationBox.sendKeys(newPassword);

               Thread.sleep(1000);
                Driver.waitAndClick(page01.registerButonu);


    }
    @Given("Kullanici sol ust kosede Registration saved! Please check your email for confirmation yazisini  gormelidir.")
    public void kullanici_sol_ust_kosede_registration_saved_please_check_your_email_for_confirmation_yazisini_gormelidir() throws InterruptedException {

               Thread.sleep(2000);
               Assert.assertTrue(page01.basariliKayitOlduYazisi.isDisplayed());

    }

}
