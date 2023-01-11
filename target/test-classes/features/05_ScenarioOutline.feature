Feature: Google Arama Feature

  #Scenario Outline: bize ddt(Data Driven Test) yapma yeteneğini sağlar.
  #Testimiz tabloda bulunan satır sayısı (ilk satır hariç) kadar sırasıyla her bir satırdaki verilerle çalışır

  Scenario Outline:
    Given Kullanıcı google sayfasındadır
    When  Kullanıcı "<aranacakKelime>" arattığında
    Then Kullanıcı title'da "<dogrulanacakKelime>" görmelidir

    Examples:
    |aranacakKelime|dogrulanacakKelime|
    |samsung       |samsung           |
    |cucumber      |cucumber          |
    |selenium      |selenium          |