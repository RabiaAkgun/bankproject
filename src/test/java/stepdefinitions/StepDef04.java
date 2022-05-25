package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Page01;
import utilities.Driver;

import java.awt.image.Kernel;

public class StepDef04 {
    Page01 page01 = new Page01();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Given("Kullanici acilan sekmelerden Sing in butonuna tiklar.")
    public void kullanici_acilan_sekmelerden_sing_in_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(2000);
        page01.singButton.click();


    }
    @Given("Kullanici acilan sayfada ki Username textbox'i gecerli sekilde doldurur.")
    public void kullanici_acilan_sayfada_ki_username_textbox_i_gecerli_sekilde_doldurur() {
         page01.userNameBox.click();
         actions.sendKeys("employee32").perform();
         actions.sendKeys(Keys.TAB);
    }
    @Given("Kullanici acilan sayfada ki New Pasword textbox'i gecerli sekilde doldurur.")
    public void kullanici_acilan_sayfada_ki_new_pasword_textbox_i_gecerli_sekilde_doldurur() {
         actions.sendKeys("team32team32-").perform();
    }
    @Given("Kullanici acilan sayfada ki Sing in butonuna tiklar.")
    public void kullanici_acilan_sayfada_ki_sing_in_butonuna_tiklar() throws InterruptedException {
          Thread.sleep(2000);
          page01.singGirisButtonu.click();
    }
    @Given("Kullanici  basarili bir sekilde giris yaptigini dogrular.")
    public void kullanici_basarili_bir_sekilde_giris_yaptigini_dogrular() throws InterruptedException {
          Thread.sleep(2000);
        Assert.assertTrue(page01.basariliGirisYapildi.isDisplayed());

    }

    @Given("Kullanici acilan sayfada Cancel butonunu gorebilmelidir.")
    public void kullanici_acilan_sayfada_cancel_butonunu_gorebilmelidir() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(page01.cancelButtonu.isDisplayed());
    }
}
