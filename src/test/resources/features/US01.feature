Feature: US01 Sistem kayit testi

  @tc1
  Scenario: TC01 Gecerli SSN

  *  Kullanici url e gider.
  *  Kullanici sayfanin sag ust kismindaki insan ikonuna tiklar.
  *  Kullanici acilan sekmelerden Register butonuna tiklar.
  *  Kullanici SSN textbox'a tiklar
  *  Kullanici acilan sayfasindan  SSN kismini bos birakamadigini dogrulamalidir.
  *  Kullanici acilan sayfada 8 haneli SSN numarasi yazamadigini dogrulamalidir.
  *  2 sn bekler
  *  Kullanici acilan sayfaya uygun 9 haneli SSN numarasi yazdigini dogrulamalidir.

  @tc2
  Scenario: TC02 First name
 * Kullanici url e gider.
 * Kullanici sayfanin sag ust kismindaki insan ikonuna tiklar.
 * Kullanici acilan sekmelerden Register butonuna tiklar.
 * Kullanici First Name textbox kismina rakam girememelidir.
 * Kullanici First Name textbox kismina karakter girememelidir.
 * Kullanici First Name textbox kismina harflerden olusan isim girmelidir.
 * Kullanici First Name textbox kismini bos birakamamalidir.

  @tc3
  Scenario: TC03 Last name
  * Kullanici url e gider.
  * Kullanici sayfanin sag ust kismindaki insan ikonuna tiklar.
  * Kullanici acilan sekmelerden Register butonuna tiklar.
  * Kullanici Last Name textbox kismina rakam girememelidir.
  * Kullanici Last Name textbox kismina karakter girememelidir.
  * Kullanici Last Name textbox kismina harflerden olusan isim girmelidir.
  * Kullanici Last Name textbox kismini bos birakamamalidir.

  @tc4
  Scenario: TC04 Adres
  * Kullanici url e gider.
  * Kullanici sayfanin sag ust kismindaki insan ikonuna tiklar.
  * Kullanici acilan sekmelerden Register butonuna tiklar.
  * Kullanici Adress textbox kismina rakam girebilmelidir.
  * Kullanici Adress textbox kismina harf girebilmelidir.
  * Kullanici Adress textbox kismina karakter girebilmelidir.

  @tc5
  Scenario: TC05 Tel No
  * Kullanici url e gider.
  * Kullanici sayfanin sag ust kismindaki insan ikonuna tiklar.
  * Kullanici acilan sekmelerden Register butonuna tiklar.
  * Kullanici acilan sayfasindan  Phone Number textbox bos birakilmamalidir.
  * Kullanici acilan sayfadan  Phone Number textboxa harf  yazamamalidir.
  * Kullanici acilan sayfadan Phone Number textboxa 10 haneli numara yazmalidir..


Scenario: TC06 Usernam TextBox

  * Kullanici url e gider.
  * Kullanici sayfanin sag ust kismindaki insan ikonuna tiklar.
  * Kullanici acilan sekmelerden Register butonuna tiklar.
  * Kullanici acilan sayfasindan  Username textbox bos birakilmamalidir.
  * Kullanici acilan sayfasindan  Username textbox sadece rakam yazamamalidir.
  * Kullanici acilan sayfasindan  Username textbox kismina karakter yazabilmelidir.
  * Kullanici acilan sayfasindan Username textbox kismina harf yazabilmelidir.

Scenario: TC07
   *  Kullanici url e gider.
   *  Kullanici sayfanin sag ust kismindaki insan ikonuna tiklar.
   *  Kullanici acilan sekmelerden Register butonuna tiklar.
   *  Kullanici acilan sayfasindan  Email textbox bos birakilmamalidir.
   *  Kullanici acilan sayfasindan  Email textbox @ ve . isareti zorunlu olmali
