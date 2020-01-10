
  Feature: Contact

    @Contact
    Scenario: Create a Contact
      Given user is on the login page

      When user logs in as purchasing manager
      And user navigates to "Contacts" module

      Then user clicks "Create" button
      And user fills the form with the following data


      |Name       | Street        | City  | ZIP  |Country| TIN        | Tags  | Job Position|Phone      | Mobile  | Email              |Website         |

      | Paul      |Rocky Mountain | Plano|  75080| USA   |  AE45678989|Prof.  | Director    |4699304060 |4699314060|johnpaul@gmail.com |www.johnpaul.net|

      Then user clicks on "Save" button
      Then user verify the added name "John Paul" is displayed at Contacts Page








