Feature: Amazon search Feature

  Scenario Outline: Kullanıcı aratacağı kelimeyi sonuçlarda görebilmelidir
    Given Kullanıcı amazon sitesine gider
    When Kullanıcı amazonda "<kelime>" aratır
    Then Kullanıcı arama sonuçlarında "<kelime>" görmelidir
    And Kullanıcı Ekran görüntüsü alır
    And Kullanıcı browser'ı kapatır
    Examples:
      | kelime  |
      | mac     |
      | windows |
      | linux   |

