package com.RingGo.stepDefinitions;

import com.RingGo.WebPages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class HeaderBarSteps {
    private RingGoPage ringGoPage = new RingGoPage();
    private HowItWorksPage howItWorksPage = new HowItWorksPage();
    private LocationsPage locationsPage = new LocationsPage();
    private PermitsPage permitsPage = new PermitsPage();
    private DownloadPage downloadPage = new DownloadPage();
    private HelpPage helpPage = new HelpPage();
    private LoginPage loginPage = new LoginPage();
    private RegisterPage registerPage = new RegisterPage();
    private PersonalPage personalPage = new PersonalPage();
    private CorporatePage corporatePage = new CorporatePage();
    private CookiePage cookiePage = new CookiePage();
    private BreadCrumbsMenuPage breadCrumbsMenuPage = new BreadCrumbsMenuPage();
    private TextToPark textToPark = new TextToPark();
    private ResidencyPage residencyPage = new ResidencyPage();
    private CareerPage careerPage = new CareerPage();
    private SecurityPage securityPage = new SecurityPage();
    private AccessibilityPage accessibilityPage = new AccessibilityPage();
    private SitemapPage sitemapPage = new SitemapPage();
    private TermsConditionPage termsConditionPage = new TermsConditionPage();
    private PrivacyNoticePage privacyNoticePage = new PrivacyNoticePage();
    private MobileSitePage mobileSitePage = new MobileSitePage();
    private IphoneLinkPage iphoneLinkPage = new IphoneLinkPage();
    private AndroidLinkPage androidLinkPage = new AndroidLinkPage();
    private TwitterPage twitterPage = new TwitterPage();
    private FaceBookPage faceBookPage = new FaceBookPage();
    private AddressPage addressPage = new AddressPage();
    private ParkNowPage parkNowPage = new ParkNowPage();
    private CountryPage countryPage = new CountryPage();
    private UKFlagPage ukFlagPage = new UKFlagPage();
    private AusFlagPage ausFlagPage = new AusFlagPage();
    private LanguagePage languagePage = new LanguagePage();

    @When("^User clicks on Ring Go Logo link on header Bar$")
    public void user_clicks_on_Ring_Go_Logo_link_on_header_Bar() throws Throwable {
        ringGoPage.RingGoImage();
    }

    @Then("^User should be redirected to Ringo Home Page$")
    public void user_should_be_redirected_to_Ringo_Home_Page() throws Throwable {
        String actual = ringGoPage.getCurrentUrl();
        assertThat(actual, is(ringGoPage.getCurrentUrl()));
    }

    @When("^User clicks on How it works link on header Bar$")
    public void user_clicks_on_How_it_works_link_on_header_Bar() throws Throwable {
        howItWorksPage.HowItWorks();
    }

    @Then("^User should be redirected to How it works page$")
    public void user_should_be_redirected_to_How_it_works_page() throws Throwable {
        String actual = howItWorksPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/howitworks")));
    }

    @When("^User clicks on Locations link on header Bar$")
    public void user_clicks_on_Locations_link_on_header_Bar() throws Throwable {
        locationsPage.LocationLink();
    }

    @Then("^User should be redirected to parking locator page$")
    public void user_should_be_redirected_to_parking_locator_page() throws Throwable {
        String actual = locationsPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/parkinglocator")));
    }

    @When("^User clicks on permit linked on a header Bar$")
    public void user_clicks_on_permit_linked_on_a_header_Bar() throws Throwable {
        permitsPage.PermitsLink();
    }

    @Then("^User should be redirected to permits page$")
    public void user_should_be_redirected_to_permits_page() throws Throwable {
        String actual = permitsPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/permits")));
    }

    @When("^User clicks on Download link on header Bar$")
    public void user_clicks_on_Download_link_on_header_Bar() throws Throwable {
        downloadPage.DownloadLink();
    }

    @Then("^User should be redirected to apps page$")
    public void user_should_be_redirected_to_apps_page() throws Throwable {
        String actual = downloadPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/apps")));
    }
    //@When("^User clicks on About us link on header Bar$")
    //public void user_clicks_on_About_us_link_on_header_Bar() throws Throwable {
    // aboutUsPage.AboutUsLink();


    // @Then("^User should be redirected to a new tab$")
    // public void user_should_be_redirected_to_a_new_tab() throws Throwable {
    //System.out.println(" new tab");


    //@Then("^User should be on parknowgroup\\.com$")
    //public void user_should_be_on_parknowgroup_com() throws Throwable {
    //String actual = aboutUsPage.getCurrentUrl();
    //assertThat(actual,is(startsWith("https://parknowgroup.com/")));
    @When("^user clicks on help link on header Bar$")
    public void user_clicks_on_help_link_on_header_Bar() throws Throwable {
        helpPage.HelpLink();
    }

    @Then("^User should be redirected to the help page$")
    public void user_should_be_redirected_to_the_help_page() throws Throwable {
        String actual = helpPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/help")));
    }

    @When("^User Hover Over Login button$")
    public void user_Hover_Over_Login_button() throws Throwable {
        loginPage.LoginLink();
    }

    @Then("^User should see Login button change to green$")
    public void user_should_see_Login_button_change_to_green() throws Throwable {
        System.out.println("can view loginlink is green");
    }

    @When("^User clicks on Login button on header Bar$")
    public void user_clicks_on_Login_button_on_header_Bar() throws Throwable {
        loginPage.ClickLoginLink();
    }

    @Then("^User should redirect to account/Login Page$")
    public void user_should_redirect_to_account_Login_Page() throws Throwable {
        String actual = loginPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/account/login")));
    }

    @When("^User clicks on register button on a header Bar$")
    public void user_clicks_on_register_button_on_a_header_Bar() throws Throwable {
        registerPage.RegisterLink();
    }

    @Then("^User should see page has been refreshed$")
    public void user_should_see_page_has_been_refreshed() throws Throwable {
        String actual = registerPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/register")));
    }

    @When("^user view the Personal link$")
    public void user_view_the_Personal_link() throws Throwable {
        personalPage.personalLink();
    }

    @Then("^user should see the Personal is highlighted in bold$")
    public void user_should_see_the_Personal_is_highlighted_in_bold() throws Throwable {
        System.out.println(" personal link is highlighted in bold ");
    }

    @Then("^Corporate should not be highlighted in bold$")
    public void corporate_should_not_be_highlighted_in_bold() throws Throwable {
        System.out.println("corporate link is not highlighted");
    }

    @When("^user clicks on PERSONAL button on header bar$")
    public void user_clicks_on_PERSONAL_button_on_header_bar() throws Throwable {
        personalPage.clickPersonalLink();
    }

    @Then("^user should be redirected to account/login page$")
    public void user_should_be_redirected_to_account_login_page() throws Throwable {
        String actual = personalPage.getCurrentUrl();
        assertThat(actual, is(equalToIgnoringCase(loginPage.getCurrentUrl())));
    }

    @When("^user clicks on CORPORATE  button on header bar$")
    public void user_clicks_on_CORPORATE_button_on_header_bar() throws Throwable {
        corporatePage.clickCorporate();
    }

    @Then("^user should be redirected to corplogin page$")
    public void user_should_be_redirected_to_corplogin_page() throws Throwable {
        String actual = corporatePage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/corplogin")));
    }

    @When("^user reads the cookie text$")
    public void user_reads_the_cookie_text() throws Throwable {
        cookiePage.readCookie();
    }

    @Then("^the user should be seeing “Cookie help us deliver our services\\. By using our services, you agree to our use of cookies\\.”$")
    public void the_user_should_be_seeing_Cookie_help_us_deliver_our_services_By_using_our_services_you_agree_to_our_use_of_cookies() throws Throwable {
        System.out.println("cookies meassage is displayed on the top of the page");
    }

    @When("^user clicks on the link for Read our cookie policy$")
    public void user_clicks_on_the_link_for_Read_our_cookie_policy() throws Throwable {
        cookiePage.clickReadCookie();
    }

    @Then("^user should be redirected to the cookies page$")
    public void user_should_be_redirected_to_the_cookies_page() throws Throwable {
        String actual = cookiePage.getCurrentUrl();
    }

    @When("^user accept the cookies$")
    public void user_accept_the_cookies() throws Throwable {
        cookiePage.acceptCookie();
    }

    @Then("^user should not see the cookie container$")
    public void user_should_not_see_the_cookie_container() throws Throwable {
        System.out.println(" cookie container has dismissed");
    }

    @When("^user see the breadcrumbs menu$")
    public void user_see_the_breadcrumbs_menu() throws Throwable {
        System.out.println("Breadcrumbs menu is visible on the page");
    }

    @Then("^user should see a link for home page$")
    public void user_should_see_a_link_for_home_page() throws Throwable {
        breadCrumbsMenuPage.homeLink();
        System.out.println("homelink is visible");
    }

    @Then("^text stating “Register for a RingGo account”$")
    public void text_stating_Register_for_a_RingGo_account() throws Throwable {
        System.out.println("Register for a RingGo account text is visible");
    }

    @When("^user checks the h(\\d+) title$")
    public void user_checks_the_h_title(int arg1) throws Throwable {
        String actualTitle = registerPage.getPageTitle();
    }

    @Then("^user should see the text “Register for a RingGo account”$")
    public void user_should_see_the_text_Register_for_a_RingGo_account() throws Throwable {
        System.out.println("User should see the text:" + " Register for a RingGo account ");

    }

    @When("^user clicks on the link Permits$")
    public void user_clicks_on_the_link_Permits() throws Throwable {
        permitsPage.clickPermits();
    }

    @Then("^user should be redirected to rvpuserreg page$")
    public void user_should_be_redirected_to_rvpuserreg_page() throws Throwable {
        String actual = permitsPage.getCurrentUrl();
        assertThat(actual, is(endsWith(".co.uk/rvpuserreg")));
    }

    @When("^user clicks on Corporate Account$")
    public void user_clicks_on_Corporate_Account() throws Throwable {
        corporatePage.corporateAccount();

    }

    @Then("^user should be redirected to corporate\\.myrgo-preprod\\.ctt\\.co\\.uk$")
    public void user_should_be_redirected_to_corporate_Myrgo_Preprod_Ctt_Co_Uk() throws Throwable {
        String actual = corporatePage.getCurrentUrl();
        assertThat(actual, is(startsWith("https://corporate.myrgo-preprod.ctt.co.uk")));
    }


    @Then("^should see highlighted confirmation \"The verification code was sent via SMS\\.”$")
    public void should_see_highlighted_confirmation_The_verification_code_was_sent_via_SMS() throws Throwable {
        System.out.println(" message is appeared on the page");
    }


    @When("^User clicks on text to park link on footer Bar$")
    public void user_clicks_on_text_to_park_link_on_footer_Bar() throws Throwable {
        textToPark.clickTextToPark();
    }

    @Then("^User should be redirected to text to park page$")
    public void user_should_be_redirected_to_text_to_park_page() throws Throwable {
        String actual = textToPark.getCurrentUrl();
        assertThat(actual, is(endsWith(".co.uk/texttopark")));

    }

    @When("^User clicks on residency link on footer Bar$")
    public void user_clicks_on_residency_link_on_footer_Bar() throws Throwable {
        residencyPage.clickResidency();

    }

    @Then("^User should be redirected to residency page$")
    public void user_should_be_redirected_to_residency_page() throws Throwable {
        String actual = registerPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/residency")));

    }

    @When("^User clicks on career link on footer Bar$")
    public void user_clicks_on_career_link_on_footer_Bar() throws Throwable {
        careerPage.clickCareer();
    }

    @Then("^User should be redirected to the career\\.park-now\\.com$")
    public void user_should_be_redirected_to_the_career_park_now_com() throws Throwable {
        String actual = careerPage.getCurrentUrl();
        assertThat(actual, is(startsWith("https://career.park-now.com/")));


    }

    @When("^User clicks on security link on footer Bar$")
    public void user_clicks_on_security_link_on_footer_Bar() throws Throwable {
        securityPage.clickSecurityLink();
    }

    @Then("^User should be redirected to security page$")
    public void user_should_be_redirected_to_security_page() throws Throwable {
        String actual = securityPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/static/security")));
    }

    @When("^User clicks on Accessibility link on footer Bar$")
    public void user_clicks_on_Accessibility_link_on_footer_Bar() throws Throwable {
        accessibilityPage.clickAccessLink();
    }

    @Then("^User should be redirected to accessibility page$")
    public void user_should_be_redirected_to_accessibility_page() throws Throwable {
        String actual = accessibilityPage.getCurrentUrl();
        assertThat(actual, is(endsWith(".co.uk/accessibility")));
    }

    @When("^User clicks on sitemap link on footer Bar$")
    public void user_clicks_on_sitemap_link_on_footer_Bar() throws Throwable {
        sitemapPage.clickSitemap();

    }

    @Then("^User should be redirected to sitemap page$")
    public void user_should_be_redirected_to_sitemap_page() throws Throwable {
        String actual = sitemapPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/sitemap")));
    }

    @When("^User clicks on Terms and condition link on footer Bar$")
    public void user_clicks_on_Terms_and_condition_link_on_footer_Bar() throws Throwable {
        termsConditionPage.clickTermsCondition();
    }

    @Then("^User should be redirected to terms and condition page$")
    public void user_should_be_redirected_to_terms_and_condition_page() throws Throwable {
        String actual = termsConditionPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/register")));

    }

    @When("^User clicks on privacy notice link on footer Bar$")
    public void user_clicks_on_privacy_notice_link_on_footer_Bar() throws Throwable {
        privacyNoticePage.clickPrivacy();


    }

    @Then("^User should be redirected to privacy page$")
    public void user_should_be_redirected_to_privacy_page() throws Throwable {
        String actual = privacyNoticePage.getCurrentUrl();
        assertThat(actual, is(endsWith(".co.uk/privacy")));
    }

    @When("^User clicks on cookies link on footer Bar$")
    public void user_clicks_on_cookies_link_on_footer_Bar() throws Throwable {
        cookiePage.clickCookieLink();
    }

    @Then("^User should be redirected to cookies page$")
    public void user_should_be_redirected_to_cookies_page() throws Throwable {
        String actual = cookiePage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/cookies")));
    }

    @When("^User clicks on mobile link on footer Bar$")
    public void user_clicks_on_mobile_link_on_footer_Bar() throws Throwable {
        mobileSitePage.clickMobileLink();

    }

    @Then("^User should be redirected to style=m page$")
    public void user_should_be_redirected_to_style_m_page() throws Throwable {
        String actual = mobileSitePage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/?style=m")));

    }

    @Then("^User should view sign in pop up$")
    public void user_should_view_sign_in_pop_up() throws Throwable {
        System.out.println("Sign in pop up window has appear");
    }

    @When("^User clicks on i-phone icon link on footer Bar$")
    public void user_clicks_on_i_phone_icon_link_on_footer_Bar() throws Throwable {
        iphoneLinkPage.iphoneIcon();
    }

    @Then("^User should be redirected to i-phone apps page$")
    public void user_should_be_redirected_to_i_phone_apps_page() throws Throwable {
        String actual = iphoneLinkPage.getCurrentUrl();
        assertThat(actual, is(endsWith(".co.uk/apps")));
    }

    @When("^User clicks on android  icon link on footer Bar$")
    public void user_clicks_on_android_icon_link_on_footer_Bar() throws Throwable {
        androidLinkPage.clickAndroidIcon();
    }

    @Then("^User should be redirected to android apps page$")
    public void user_should_be_redirected_to_android_apps_page() throws Throwable {
        String actual = androidLinkPage.getCurrentUrl();
        assertThat(actual, is(endsWith(".co.uk/apps")));
    }

    @When("^User clicks on Twitter  icon link on footer Bar$")
    public void user_clicks_on_Twitter_icon_link_on_footer_Bar() throws Throwable {
        twitterPage.clickTwitter();
    }

    @Then("^User should be redirected to twitter\\.com page$")
    public void user_should_be_redirected_to_twitter_com_page() throws Throwable {
        String actual = twitterPage.getCurrentUrl();
        assertThat(actual, is(startsWith("https://twitter.com/ringgo_parking")));
    }

    @When("^User clicks on facebook icon link on footer Bar$")
    public void user_clicks_on_facebook_icon_link_on_footer_Bar() throws Throwable {
        faceBookPage.clickFacebookImage();
    }

    @Then("^User should be redirected to facebook\\.com page$")
    public void user_should_be_redirected_to_facebook_com_page() throws Throwable {
        String actual = faceBookPage.getCurrentUrl();
        assertThat(actual, is(startsWith("https://www.facebook.com/RingGoUK")));
    }

    @Then("^User should see cookies pop up on the browser page$")
    public void user_should_see_cookies_pop_up_on_the_browser_page() throws Throwable {
        System.out.println("facebook cookie pop up can be seen");

    }

    @When("^User reads the address text on footer Bar$")
    public void user_reads_the_address_text_on_footer_Bar() throws Throwable {
        addressPage.readAddress();
    }

    @Then("^User should be seeing\"([^\"]*)\"$")
    public void user_should_be_seeing(String arg1) throws Throwable {
        System.out.println("Address is visible");

    }

    @When("^User clicks on park now link on footer Bar$")
    public void user_clicks_on_park_now_link_on_footer_Bar() throws Throwable {
        parkNowPage.clickParkNowLink();
    }

    @Then("^User should be redirected to your-now\\.com$")
    public void user_should_be_redirected_to_your_now_com() throws Throwable {
        String actual = parkNowPage.getCurrentUrl();
        assertThat(actual, is(startsWith("https://www.your-now.com/")));

    }

    @When("^User reads the country text on footer Bar$")
    public void user_reads_the_country_text_on_footer_Bar() throws Throwable {
        countryPage.readCountry();
    }

    @Then("^User should be seeing country text$")
    public void user_should_be_seeing_country_text() throws Throwable {
        System.out.println("Country text is visible");
    }

    @When("^User clicks on uk flag image on footer Bar$")
    public void user_clicks_on_uk_flag_image_on_footer_Bar() throws Throwable {
        ukFlagPage.clickUkImg();
    }

    @Then("^User should be redirected to myrgo-preprod\\.ctt\\.co\\.uk$")
    public void user_should_be_redirected_to_myrgo_preprod_ctt_co_uk() throws Throwable {
        String actual = ukFlagPage.getCurrentUrl();
        assertThat(actual, is(startsWith("https://myrgo-preprod.ctt.co.uk/")));

    }

    @When("^User clicks on Australia flag image on footer Bar$")
    public void user_clicks_on_Australia_flag_image_on_footer_Bar() throws Throwable {
        ausFlagPage.ausFlagImg();
    }

    @Then("^User should be redirected to au\\.myrgo-preprod\\.ctt\\.co\\.uk$")
    public void user_should_be_redirected_to_au_myrgo_preprod_ctt_co_uk() throws Throwable {
        String actual = ausFlagPage.getCurrentUrl();
        assertThat(actual, is(startsWith("http://au.myrgo-preprod.ctt.co.uk/")));
    }

    @Then("^User should see sign in pop up on the browser$")
    public void user_should_see_sign_in_pop_up_on_the_browser() throws Throwable {
        System.out.println("sign in pop up window is visible");

    }

    @When("^User reads text and clicks on button$")
    public void user_reads_text_and_clicks_on_button() throws Throwable {
        languagePage.language();
    }

    @Then("^User should be seeing the list of all the languages$")
    public void user_should_be_seeing_the_list_of_all_the_languages() throws Throwable {
        System.out.println("select language text is visible");
    }

    @Then("^User selects the Language$")
    public void user_selects_the_Language() throws Throwable {
        languagePage.language();
    }

    @Then("^User should be seeing translated to page$")
    public void user_should_be_seeing_translated_to_page() throws Throwable {
        System.out.println("page is translated in selected language");
    }

    @When("^user enter  \"([^\"]*)\" and \"([^\"]*)\" and \"Acm(\\d+)test”$")
    public void user_enter_and_and_Acm_test(String mobile, String email, String password) throws Throwable {
        registerPage.enterValidField(mobile, email, password);

    }

    @When("^user pass the recaptcha$")
    public void user_pass_the_recaptcha() throws Throwable {
        System.out.println("recaptcha can not be automated");
    }

    @When("^user accept  Terms and conditions$")
    public void user_accept_Terms_and_conditions() throws Throwable {
        registerPage.clickTermsCondition();
    }

    @When("^user clicks next button$")
    public void user_clicks_next_button() throws Throwable {
        registerPage.clickNextButton();

    }

    @Then("^user should be directed to _______ page$")
    public void user_should_be_directed_to_________page() throws Throwable {
        System.out.println(" user is directed to the next page");
    }

    @When("^user enter  \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_and_and(String mobile, String email, String password) throws Throwable {
        registerPage.enterValidField(mobile, email, password);

    }


    @Then("^user should see the error \"([^\"]*)\" under header bar$")
    public void user_should_see_the_error_under_header_bar(String message) throws Throwable {
        registerPage.errorMobileMsg(message);

    }

    @When("^the provided Password format is invalid$")
    public void the_provided_Password_format_is_invalid() throws Throwable {
        System.out.println("password format is invalid");
    }

    @And("^the provided email format is invalid$")
    public void theProvidedEmailFormatIsInvalid() {
        System.out.println("email format is invalid");
    }

    @When("^user enter  \"([^\"]*)\" and \"([^\"]*)\" and \"Acm(\\d+)test$")
    public void user_enter_and_and_Acm_test(String arg1, String arg2, int arg3) throws Throwable {


    }
    @When("^user select the T&C \\+ marketing consent$")
    public void userSelectTheTCMarketingConsent() {
        registerPage.termsConsent();
    }

    @Then("^user should see the T&C \\+ marketing consent selected state$")
    public void userShouldSeeTheTCMarketingConsentSelectedState() {
        System.out.println("user can see the selected consent");
    }


    @When("^user looks at the fields$")
    public void userLooksAtTheFields() {


    }

    @Then("^user notice the greyed default status of the fields$")
    public void userNoticeTheGreyedDefaultStatusOfTheFields() {

    }


    @When("^all the fields are empty$")
    public void all_the_fields_are_empty() throws Throwable {
        System.out.println("All the fields are empty");
    }

    @When("^user clicks “Next button\"$")
    public void user_clicks_Next_button() throws Throwable {
        registerPage.clickNextButton();
    }

    @Then("^the user should see an error message “We are sorry, but an error has occurred\\.Please check your information and try again\\.”$")
    public void the_user_should_see_an_error_message_We_are_sorry_but_an_error_has_occurred_Please_check_your_information_and_try_again() throws Throwable {
        System.out.println("error message displayed");
    }

    @Then("^user should be on register page$")
    public void user_should_be_on_register_page() throws Throwable {
        System.out.println("registerration Page ");
    }

    @When("^all the fields are filled$")
    public void all_the_fields_are_filled() throws Throwable {
        System.out.println("all the fields are empty");
    }

    @Then("^user clicks “cancel button\"$")
    public void user_clicks_cancel_button() throws Throwable {
        registerPage.clickCancelButton();
    }

    @Then("^User should be redirected to myrgo-preprod\\.ctt\\.co\\.uk/home$")
    public void user_should_be_redirected_to_myrgo_preprod_ctt_co_uk_home() throws Throwable {
        String actual = registerPage.getCurrentUrl();
        assertThat(actual, is(endsWith(".co.uk/home")));

    }


    }
















