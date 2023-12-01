Feature:User should calculate BMİ
@bmi
Scenario: BMI based on height and weight

  Given user is on the main page of "expand.testing.bmi.url"
  When user enters HisHer profile spesifications

  |gender  |Male |
  |age     |45   |
  |height  |165  |
  |weight  |85   |

  And user clicks Calculate button
  Then user should be shown as a "Obese Class I"
  When user enters HisHer profile spesifications

    |gender  |Male |
    |age     |45   |
    |height  |165  |
    |weight  |80   |

  And user clicks Calculate button

  Then  user should be shown as a "Overweight"





