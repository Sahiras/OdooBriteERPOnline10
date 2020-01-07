
  Feature: Contact

    @Contact
    Scenario: Create a Contact
      Given user is on the login page
      Then user logs in as purchasing manager
      Then user navigates to "Contacts" module
      Then user clicks "Create" button
      Then user enters "John Paul"  into name box
      Then user enters "Rocky Mountain" into street box
      Then user enters "Court" into second street box
      Then user enters "Plano" into city box
      Then user clicks on "State" dropdown box
      Then user selects "Aveiro" from given option
      Then user enters "75075" into zip box
      Then user clicks on "Country" dropdown box
      Then user selects "Albania" from given option
      Then user enters "AE45678989" into tin box
      Then user clicks on "Tag" dropdown box
      Then user selects "dsa" from given options
      Then user enters "Director" into job title box
      Then user enters "4659253060" into phone box
      Then user enters "4444444444" into mobile phone box
      Then user enters "johnpaul@gmail.com" into email box
      Then user enters "www.johnpaul.net" into website box
      Then user clicks on "Title" dropdown box
      Then user selects "Doctor" from given options
      Then user clicks on "Save" button

