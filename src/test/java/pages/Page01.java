package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page01 {

    public Page01(){
      PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement ikon;

    @FindBy (xpath = "//span[text()='Register']")
    public WebElement register;

    @FindBy (xpath = "//input[@name='ssn']")
    public WebElement ssnBox;

    @FindBy (xpath = "//div[text()='Please enter your social security number.']")
    public WebElement ssnZorunluYazisi;

    @FindBy (xpath = "//div[text()='Ssn is invalid.']")
    public WebElement gecersizSSNYazisi;

    @FindBy (xpath = "//input[@class='is-touched is-dirty av-valid form-control']")
    public WebElement gecerliSSN;

    @FindBy (xpath = "//input[@name='firstname']")
    public WebElement firstNameBox;

    @FindBy (xpath = "//div[text()='Please enter your first name.']")
    public WebElement firstnameGerekli;

    @FindBy (xpath = "//input[@name='lastname']")
    public WebElement lastNameBox;

    @FindBy (xpath = "//input[@name='address']")
    public WebElement adresBox;

    @FindBy (xpath = "//input[@name='mobilephone']")
    public WebElement phoneBox;


    //US02

    @FindBy (xpath = "//input[@name='username']")
    public WebElement userNameBox;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//div[text()='Your username is required.']")
    public WebElement usernameYazisiElementi;

    @FindBy(xpath = "//input[@class='is-touched is-dirty av-valid form-control']")
    public WebElement usernameYanlisYazisi;

    @FindBy(xpath = "//div[text()='Your username is invalid.']")
    public WebElement userNameKarakterYazilincaCikanYazi;

    @FindBy(xpath = "//div[text()='Please enter your email.']")
    public WebElement emailBosYaziElementi;

    @FindBy(xpath = "//div[text()='Your email is invalid.']")
    public WebElement emailYanlisYaziElementi;



    //US02 LOcateleri

    @FindBy(xpath = "//div[text()='Please enter your last name.']")
    public WebElement lastnameGerekli;

    @FindBy(xpath = "//div[text()='Please enter your address.']")
    public WebElement adresGerekli;

    @FindBy(xpath = "//div[text()='Please enter your mobile phone number.']")
    public WebElement phoneGerekli;

    @FindBy(xpath = "//div[text()='Your username is required.']")
    public WebElement usernameGerekli;

    @FindBy(xpath = "//div[text()='Please enter your email.']")
    public WebElement emailGerekli;

    @FindBy (xpath = "//input[@name='firstPassword']")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//div[text()='Your password is required.']")
    public WebElement newPasswordGerekli;

    @FindBy (xpath = "//input[@name='secondPassword']")
    public WebElement newPasswordConfirmationBox;

    @FindBy(xpath = "//div[text()='Your confirmation password is required.']")
    public WebElement newPasswordConfirmationGerekli;

    @FindBy(xpath = "//(//div[@class='col-md-8'])[2]\n")
    public WebElement registerSayfasi;

    //US03

    @FindBy (xpath ="(//li[@class='point'])[1]" )
    public  WebElement newPasswordTekHarfKirmiziRenk;

    @FindBy (xpath = "(//li[@class='point'])[2]")
    public WebElement NewPasswordTuruncuRenk;

    @FindBy (xpath = "(//li[@class='point'])[3]")
    public WebElement newPasswordSariRenk;

    @FindBy (xpath = "(//li[@class='point'])[4]")
    public WebElement newPasswordAcikYesilRenk;

    @FindBy (xpath = "(//li[@class='point'])[5]")
    public WebElement newPasswordKoyuYesilRenk;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement registerButonu;

    @FindBy(xpath = "//strong[text()='Registration saved!']")
    public WebElement basariliKayitOlduYazisi;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement singButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement singGirisButtonu;

    @FindBy(xpath = "//span[text()='Ahmet Kaya']")
    public WebElement basariliGirisYapildi;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancelButtonu;

    //US05

    @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement girisYapilamadiYazisi;

    @FindBy(xpath = "//span[text()='Did you forget your password?']")
    public WebElement passworduUnuttunuzMuYazisi;

    @FindBy(xpath = "//span[text()='Enter the email address you used to register']")
    public WebElement resetYourPasswordSayfasi;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//span[text()='Reset password']")
    public WebElement resetPasswordButtonu;






}
