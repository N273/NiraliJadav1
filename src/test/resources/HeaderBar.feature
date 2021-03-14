Feature: Registration for a Ring Go account
  As a Ring Go User
  I want to register
  so I can do payment for parking
  Background: Given user is on Ring Go Registration Page
  // HeaderBar menu Scenarios
  //  Registration Scenarios
  // footerBar Scenarios

  Scenario: Ring Go logo linked to the home Page
    When User clicks on Ring Go Logo link on header Bar
    Then User should be redirected to Ringo Home Page
  Scenario: How it works linked to the how it works page
    When User clicks on How it works link on header Bar
    Then User should be redirected to How it works page
  Scenario: Locations linked to the parking locator page
    When User clicks on Locations link on header Bar
    Then User should be redirected to parking locator page
  Scenario: permits linked to the permits page
    When User clicks on permit linked on a header Bar
    Then User should be redirected to permits page
  Scenario: Download linked to apps page
    When User clicks on Download link on header Bar
    Then User should be redirected to apps page
  Scenario: Help linked to the help page
    When user clicks on help link on header Bar
    Then User should be redirected to the help page
  Scenario: Hover over Login button
    When User Hover Over Login button
    Then User should see Login button change to green
  Scenario: Login linked to account/login page
    When User clicks on Login button on header Bar
    Then User should redirect to account/Login Page
  Scenario: Register button refresh the page
    When User clicks on register button on a header Bar
    Then User should see page has been refreshed
  Scenario: Personal link highlighted in bold and Corporate not highlighted bold
    When user view the Personal link
    Then user should see the Personal is highlighted in bold
    And Corporate should not be highlighted in bold
  Scenario: Personal links to account/login page
    When user clicks on PERSONAL button on header bar
    Then user should be redirected to account/login page
  Scenario: Corporate links to a corplogin page
    When user clicks on CORPORATE  button on header bar
    Then user should be redirected to corplogin page
  Scenario: Read cookie text
    When user reads the cookie text
    Then the user should be seeing “Cookie help us deliver our services. By using our services, you agree to our use of cookies.”
  Scenario: Click on Read our cookie policy
    When user clicks on the link for Read our cookie policy
    Then user should be redirected to the cookies page
  Scenario: User accept cookies
    When user accept the cookies
    Then user should not see the cookie container
  Scenario: Breadcrumbs menu have homepage link and text
    When user see the breadcrumbs menu
    Then user should see a link for home page
    And text stating “Register for a RingGo account”
  Scenario: Verify h1 title “Register for a RingGo account”
    When user checks the h1 title
    Then user should see the text “Register for a RingGo account”
  Scenario: Click on the link Permits
    When user clicks on the link Permits
    Then user should be redirected to rvpuserreg page
  Scenario: Click on Corporate Account  user redirected to corporate.myrgo-preprod.ctt.co.uk
    When user clicks on Corporate Account
    Then user should be redirected to corporate.myrgo-preprod.ctt.co.uk

  Scenario: Default and active empty fields status
    When user looks at the fields
    Then user notice the greyed default status of the fields
        #When user selects any fields
        #Then user notice the active empty status of the fields in blue border
      | fields       |
      | Mobile number |
      | Email address    |
      | Password     |
  Scenario: Disabled "Next” your account" button
    When all the fields are empty
    And user clicks “Next button"
    Then the user should see an error message “We are sorry, but an error has occurred.Please check your information and try again.”
    And user should be on register page

  Scenario: cancel link user to the myrgo-preprod.ctt.co.uk/home
    When all the fields are filled
    Then user clicks “cancel button"
    And User should be redirected to myrgo-preprod.ctt.co.uk/home



  Scenario: Text to park  linked to the Text to park  Page
    When User clicks on text to park link on footer Bar
    Then User should be redirected to text to park page
  Scenario: Residency linked to the residency page
    When User clicks on residency link on footer Bar
    Then User should be redirected to residency page
  Scenario: Career linked user to the career.park-now.com
    When User clicks on career link on footer Bar
    Then User should be redirected to the career.park-now.com
  Scenario: security linked to the security page
    When User clicks on security link on footer Bar
    Then User should be redirected to security page
  Scenario: Accessibility linked to the accessibility page
    When User clicks on Accessibility link on footer Bar
    Then User should be redirected to accessibility page
  Scenario: siteMap linked to the sitemap page
    When User clicks on sitemap link on footer Bar
    Then User should be redirected to sitemap page
  Scenario: Terms and condition linked to the terms and condition page
    When User clicks on Terms and condition link on footer Bar
    Then User should be redirected to terms and condition page
  Scenario:privacy notice linked to the privacy page
    When User clicks on privacy notice link on footer Bar
    Then User should be redirected to privacy page
  Scenario:cookies linked to the cookies page
    When User clicks on cookies link on footer Bar
    Then User should be redirected to cookies page
  Scenario: mobile site  linked to the style=m page
    When User clicks on mobile link on footer Bar
    Then User should be redirected to style=m page
    And User should view sign in pop up
  Scenario: I-phone icon linked to the i-phone apps page
    When User clicks on i-phone icon link on footer Bar
    Then User should be redirected to i-phone apps page
  Scenario:Android icon linked to the  android apps page
    When User clicks on android  icon link on footer Bar
    Then User should be redirected to android apps page
  Scenario:Twitter icon linked user to the  twitter.com page
    When User clicks on Twitter  icon link on footer Bar
    Then User should be redirected to twitter.com page
  Scenario:facebook icon linked user to the  facebook.com page
    When User clicks on facebook icon link on footer Bar
    Then User should be redirected to facebook.com page
    And  User should see cookies pop up on the browser page
  Scenario: User Read address text
    When User reads the address text on footer Bar
    Then User should be seeing"PARK NOW Ltd, Ground Floor East, Maplewood, Chineham Park, Basingstoke, Hampshire, RG24 8YBRegistration number: 3151938.Part of PARK NOW"
  Scenario: Park now linked user to your-now.com
    When  User clicks on park now link on footer Bar
    Then  User should be redirected to your-now.com
  Scenario:User Read country text
    When User reads the country text on footer Bar
    Then User should be seeing country text
  Scenario:  Uk flag image link user to myrgo-preprod.ctt.co.uk
    When  User clicks on uk flag image on footer Bar
    Then  User should be redirected to myrgo-preprod.ctt.co.uk
  Scenario:  Australia flag image link user to myrgo-preprod.ctt.co.uk
    When  User clicks on Australia flag image on footer Bar
    Then  User should be redirected to au.myrgo-preprod.ctt.co.uk
    And   User should see sign in pop up on the browser

  Scenario: Read 'select language' text and verify drop down button is clickable
    When User reads text and clicks on button
    Then User should be seeing the list of all the languages
    And  User selects the Language
    And  User should be seeing translated to page
  Scenario Outline: Checkbox default and selected state for T&C + marketing consent appearence
    When user enter  "<Mobile Number>" and "<Email>" and "<Password>
    When user select the T&C + marketing consent
    Then user should see the T&C + marketing consent selected state
    Examples:
      | Mobile Number | Email                     |Password           |
      |0 78 5678 6979 | acmtesting@abby.com | Acm9test|

  Scenario Outline: Account creation with valid credentials
    When user enter  "<Mobile Number>" and "<Email>" and "<Password>”
    And user pass the recaptcha
    And user accept  Terms and conditions
    And user clicks next button
    Then user should be directed to _______ page
    And should see highlighted confirmation "<message>”
    Examples:
      |Mobile Number | Email  |Password           | message|
      | 078 5678 6979 | acmtesting@hotmail.com |Acm9test|The verification code was sent via SMS. |

  Scenario Outline: Email validation error message
    When user enter  "<Mobile Number>" and "<Email>" and "<Password>"
    And the provided email format is invalid
    And user pass the recaptcha
    And user accept  Terms and conditions
    And user clicks next button
    Then user should see the error "<message>" under header bar
    Examples:
    Mobile Number | Email                      	         |Password           | message                            |
    078 5678 6979 | acmtestinghotmail.com | Acmtesting00hotmail.com|Email address is invalid |
    078 5678 6979 | acmtesting@ab@by.com | Acmtesting00hotmail.com|Email address is invalid |
    078 5678 6979 | macc  esting@hotmail.com | Acmtesting00hotmail.com|Email address is invalid|
    078 5678 6979  | &*())@hotmail..com         |  078 5678 6979|Email address is invalid |

  Scenario Outline: Password validation error message
    When user enter  "<Mobile Number>" and "<Email>" and "<Password>"
    And the provided Password format is invalid
    And user pass the recaptcha
    And user accept  Terms and conditions
    And user clicks next button
    Then user should see the error "<message>" under header bar
    Examples:
      | Mobile Number | Email                      	         |Password           | message                                    |
      |0 78 5678 6979 | acmtesting@abby.com | ac9test| The password does not meet the correct format. |
      | 078 5678 6979 | acmtesting@abby.com | Acmtest|The password does not meet the correct format. |
      |078 5678 6979 | acmtesting@abby.com| ACMTEST*|The password does not meet the correct format.|
      | 078 5678 6979  |acmtesting@abby.com |  &^&^&7777|The password does not meet the correct format. |

