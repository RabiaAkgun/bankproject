Feature:

  Scenario: TC01 Kayit Yspma

  * Kullanici url e gider.
  * Kullanici sayfanin sag ust kismindaki insan ikonuna tiklar.
  * Kullanici acilan sekmelerden Register butonuna tiklar.
  * Kullanici acilan sayfada SSN textbox bos birakilmadigini gormeli
  * Kullanici acilan sayfada First Name textbox bos birakilmadigini gormeli
  * Kullanici acilan sayfada Last Name textbox  bos birakilmadigini gormeli
  * Kullanici acilan sayfada Adress textbox bos birakilmadigini gormeli
  * Kullanici acilan sayfada Phone Number  textbox bos birakilmadigini gormeli
  * Kullanici acilan sayfada Username textbox  bos birakilmadigini gormeli
  * Kullanici acilan sayfada Email textbox  bos birakilmadigini gormeli
  * Kullanici acilan sayfada New password  textbox  bos birakilmadigini gormeli
  * Kullanici acilan sayfada New password confirmation textbox bos birakilmadigini gormeli


    Scenario: TC02 Gecerli SSN BİLGİSİ

    * Kullanici url e gider.
    * Kullanici sayfanin sag ust kismindaki insan ikonuna tiklar.
    * Kullanici acilan sekmelerden Register butonuna tiklar.
    * Kullanici SSN textbox'a tiklar
    * Kullanici SSN textbox'a gecerli SSN numarasi girer
    * Kullanici  "Please enter your social security number." yazisini gormemeli
    * Kullanici  "Ssn is invalid." yazisini gormemelidir.

    @number
    Scenario: TC03 Gecerli Phone Bilgisi

    * Kullanici url e gider.
    * Kullanici sayfanin sag ust kismindaki insan ikonuna tiklar.
    * Kullanici acilan sekmelerden Register butonuna tiklar.
    * Kullanici Phone Number textbox'a tiklar
    * Kullanici gecerli Phone Number girer
    * Kullanici Please enter your mobile phone number. yazisini gormemelidir
    * Kullanici Your mobile phone number is invalid. yazisini gormemeli

   Scenario: TC04 Gecerli Email Bilgisi

     * Kullanici url e gider.
     * Kullanici sayfanin sag ust kismindaki insan ikonuna tiklar.
     * Kullanici acilan sekmelerden Register butonuna tiklar.
     * Kullanici Email textbox'a tiklar
     * Kullanici Your email is invalid. yazisini gormemeli
