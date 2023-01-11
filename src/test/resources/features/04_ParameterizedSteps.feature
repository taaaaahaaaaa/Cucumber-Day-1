Feature: Google Arama Feature
  Background:
    Given Kullanıcı google sayfasındadır

    Scenario: Cucumber search
      When Kullanıcı "cucumber" arattığında
      Then Kullanıcı title'da "cucumber" görmelidir