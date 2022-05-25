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


public class StepDef01 {
    Page01 page01=new Page01();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Given("Kullanici url e gider.")
    public void kullanici_url_e_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("Kullanici sayfanin sag ust kismindaki insan ikonuna tiklar.")
    public void kullanici_sayfanin_sag_ust_kismindaki_insan_ikonuna_tiklar() {
        page01.ikon.click();
    }
    @Given("Kullanici acilan sekmelerden Register butonuna tiklar.")
    public void kullanici_acilan_sekmelerden_register_butonuna_tiklar() {
        page01.register.click();
    }
    @Given("Kullanici SSN textbox'a tiklar")
    public void kullanici_ssn_textbox_a_tiklar() {
        page01.ssnBox.click();
    }
    @Given("Kullanici acilan sayfasindan  SSN kismini bos birakamadigini dogrulamalidir.")
    public void kullanici_acilan_sayfasindan_ssn_kismini_bos_birakamadigini_dogrulamalidir() {
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(page01.ssnZorunluYazisi.isDisplayed());
    }
    @Given("Kullanici acilan sayfada {int} haneli SSN numarasi yazamadigini dogrulamalidir.")
    public void kullanici_acilan_sayfada_haneli_ssn_numarasi_yazamadigini_dogrulamalidir(Integer int1) {
        page01.ssnBox.sendKeys(ConfigReader.getProperty("ssn8"));
        Assert.assertTrue(page01.gecersizSSNYazisi.isDisplayed());
        page01.ssnBox.clear();
    }
    @Given("Kullanici acilan sayfaya uygun {int} haneli SSN numarasi yazdigini dogrulamalidir.")
    public void kullanici_acilan_sayfaya_uygun_haneli_ssn_numarasi_yazdigini_dogrulamalidir(Integer int1) throws IOException {
        page01.ssnBox.sendKeys(ConfigReader.getProperty("ssn"));
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(page01.gecerliSSN.isDisplayed());
        ReusableMethods.getScreenshot("gecerliSSN");
    }
    @Given("{int} sn bekler")
    public void sn_bekler(Integer int1) throws InterruptedException {
        Thread.sleep(2000);
    }

    @Given("Kullanici First Name textbox kismina rakam girememelidir.")
    public void kullanici_first_name_textbox_kismina_rakam_girememelidir() throws InterruptedException {
        page01.firstNameBox.sendKeys(ConfigReader.getProperty("firstnameRakam"));
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        page01.firstNameBox.clear();
        //bag var
    }
    @Given("Kullanici First Name textbox kismina karakter girememelidir.")
    public void kullanici_first_name_textbox_kismina_karakter_girememelidir() throws InterruptedException {
        page01.firstNameBox.sendKeys(ConfigReader.getProperty("firstnamekarakter"));
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        page01.firstNameBox.clear();

    }
    @Given("Kullanici First Name textbox kismina harflerden olusan isim girmelidir.")

    public void kullanici_first_name_textbox_kismina_harflerden_olusan_isim_girmelidir() throws InterruptedException {


        page01.firstNameBox.sendKeys(ConfigReader.getProperty("firstnameIsim"));
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).perform();
        page01.firstNameBox.clear();
    }
    @Given("Kullanici First Name textbox kismini bos birakamamalidir.")
    public void kullanici_first_name_textbox_kismini_bos_birakamamalidir() throws InterruptedException {

         // BURADA ONCE USTEKI ADIMI YAPTIKTAN SONRA SAYFAYI YENILEMEK LAZIM CUNKU
         //TAB YAPINCA LASTNAME KISMINDA UYARI MESAJI KALMAMASI İCİN

       Thread.sleep(2000);
       Driver.getDriver().navigate().refresh();
        page01.firstNameBox.click();

       actions.sendKeys(Keys.TAB).perform();

        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(1000);

        Assert.assertTrue(page01.firstnameGerekli.isDisplayed());
        Thread.sleep(2000);
        //bag var
    }

    @Given("Kullanici Last Name textbox kismina rakam girememelidir.")
    public void kullanici_last_name_textbox_kismina_rakam_girememelidir() {
       page01.lastNameBox.sendKeys(ConfigReader.getProperty("lastnameRakam"));
       actions.sendKeys(Keys.TAB).perform();
       page01.lastNameBox.clear();
    }
    @Given("Kullanici Last Name textbox kismina karakter girememelidir.")
    public void kullanici_last_name_textbox_kismina_karakter_girememelidir() {
        page01.lastNameBox.sendKeys(ConfigReader.getProperty("lastnamekarakter"));
        actions.sendKeys(Keys.TAB).perform();
        page01.lastNameBox.clear();
    }
    @Given("Kullanici Last Name textbox kismina harflerden olusan isim girmelidir.")
    public void kullanici_last_name_textbox_kismina_harflerden_olusan_isim_girmelidir() {
        page01.lastNameBox.sendKeys(ConfigReader.getProperty("lastnameIsim"));
        actions.sendKeys(Keys.TAB).perform();
        page01.lastNameBox.clear();
    }
    @Given("Kullanici Last Name textbox kismini bos birakamamalidir.")
    public void kullanici_last_name_textbox_kismini_bos_birakamamalidir() throws InterruptedException {
        Driver.waitAndClick(page01.lastNameBox);
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
    }

    @Given("Kullanici Adress textbox kismina rakam girebilmelidir.")
    public void kullanici_adress_textbox_kismina_rakam_girebilmelidir() {
        page01.adresBox.sendKeys(ConfigReader.getProperty("adresRakam"));
        actions.sendKeys(Keys.TAB).perform();
    }
    @Given("Kullanici Adress textbox kismina harf girebilmelidir.")
    public void kullanici_adress_textbox_kismina_harf_girebilmelidir() {
        page01.adresBox.sendKeys(ConfigReader.getProperty("adresHarf"));
        actions.sendKeys(Keys.TAB).perform();
    }
    @Given("Kullanici Adress textbox kismina karakter girebilmelidir.")
    public void kullanici_adress_textbox_kismina_karakter_girebilmelidir() {
        page01.adresBox.sendKeys(ConfigReader.getProperty("adresKarakter"));
        actions.sendKeys(Keys.TAB).perform();
    }

    @Given("Kullanici acilan sayfasindan  Phone Number textbox bos birakilmamalidir.")
    public void kullanici_acilan_sayfasindan_phone_number_textbox_bos_birakilmamalidir() {
        page01.phoneBox.click();
        actions.sendKeys(Keys.TAB).perform();

    }
    @Given("Kullanici acilan sayfadan  Phone Number textboxa harf  yazamamalidir.")
    public void kullanici_acilan_sayfadan_phone_number_textboxa_harf_yazamamalidir() {
        page01.phoneBox.sendKeys(ConfigReader.getProperty("phoneHarf"));
        actions.sendKeys(Keys.TAB).perform();
        page01.phoneBox.clear();
    }
    @Given("Kullanici acilan sayfadan Phone Number textboxa {int} haneli numara yazmalidir..")
    public void kullanici_acilan_sayfadan_phone_number_textboxa_haneli_numara_yazmalidir(Integer int1) {
        page01.phoneBox.sendKeys(ConfigReader.getProperty("phoneNumber"));

    }

    @Given("Kullanici acilan sayfasindan  Username textbox bos birakilmamalidir.")
    public void kullanici_acilan_sayfasindan_username_textbox_bos_birakilmamalidir() throws IOException, InterruptedException {
        page01.userNameBox.click();
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(page01.usernameYazisiElementi.isDisplayed());


    }
    @Given("Kullanici acilan sayfasindan  Username textbox sadece rakam yazamamalidir.")
    public void kullanici_acilan_sayfasindan_username_textbox_sadece_rakam_yazamamalidir() throws InterruptedException, IOException {

  // KOD PASS OLDU
        Thread.sleep(3000);
        Driver.waitAndClick(page01.userNameBox);
        actions.sendKeys(ConfigReader.getProperty("Username")).perform();
        Thread.sleep(4000);
        ReusableMethods.getScreenshot("RAKAM YAZİLAMİYOR");

        Assert.assertTrue(page01.usernameYanlisYazisi.isDisplayed());
        page01.userNameBox.clear();


    }
    @Given("Kullanici acilan sayfasindan  Username textbox kismina karakter yazabilmelidir.")
    public void kullanici_acilan_sayfasindan_username_textbox_kismina_karakter_yazabilmelidir() {

        page01.userNameBox.click();
        actions.sendKeys(ConfigReader.getProperty("username")).perform();
        Assert.assertTrue(page01.userNameKarakterYazilincaCikanYazi.isDisplayed());


    }
    @Given("Kullanici acilan sayfasindan Username textbox kismina harf yazabilmelidir.")
    public void kullanici_acilan_sayfasindan_username_textbox_kismina_harf_yazabilmelidir() throws InterruptedException {
        page01.userNameBox.clear();
        page01.userNameBox.click();
        actions.sendKeys(ConfigReader.getProperty("username1")).perform();
        Thread.sleep(2000);
        Assert.assertTrue(page01.usernameYanlisYazisi.isDisplayed());

    }
    @Given("Kullanici acilan sayfasindan  Email textbox bos birakilmamalidir.")
    public void kullanici_acilan_sayfasindan_email_textbox_bos_birakilmamalidir() {
        page01.emailBox.click();
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(page01.emailBosYaziElementi.isDisplayed());

    }
    @Given("Kullanici acilan sayfasindan  Email textbox @ ve . isareti zorunlu olmalidir.")
    public void kullanici_acilan_sayfasindan_email_textbox_ve_isareti_zorunlu_olmalidir() throws InterruptedException {
        page01.emailBox.click();
        actions.sendKeys(ConfigReader.getProperty("email")).perform();
        Thread.sleep(2000);
        Assert.assertTrue(page01.emailYanlisYaziElementi.isDisplayed());

        page01.emailBox.clear();
        page01.emailBox.click();
        actions.sendKeys(ConfigReader.getProperty("email1")).perform();
        Thread.sleep(2000);
        Assert.assertTrue(page01.emailYanlisYaziElementi.isDisplayed());

        page01.emailBox.clear();
        page01.emailBox.click();
        actions.sendKeys(ConfigReader.getProperty("email2")).perform();
        Thread.sleep(2000);
        String expectedYazisi=ConfigReader.getProperty("email2");
        Assert.assertEquals(expectedYazisi,page01.emailBox.getAttribute("value"));

    }

}
