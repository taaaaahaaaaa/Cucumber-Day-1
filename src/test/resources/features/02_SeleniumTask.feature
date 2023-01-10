Feature: Google search test

  Scenario: Google da bir kelime arandığında ilgili kelimeyi barındıran sonuçlar görüntülenmelidir.

    Given Kullanıcı google sayfasındadır
    When Kullanıcı samsung kelşimesini arar
    Then Kullanıcı sayfada samsung kelimesi geçtiğini doğrular