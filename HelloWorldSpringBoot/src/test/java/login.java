import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login {

	@Given("^I navigate to login page$")
	public void i_navigate_to_login_page() throws Throwable {
         System.out.println("Saurabh Cucumber");
	}

	@Given("^I enter username as admin and password as admin$")
	public void i_enter_username_as_admin_and_password_as_admin() throws Throwable {
        System.out.println("Saurabh Cucumber");
	}

	@Given("^I click login button$")
	public void i_click_login_button() throws Throwable {
        System.out.println("Saurabh Cucumber");
	}
	
	@Then("^I should see the userform page$")
	public void i_should_see_the_userform_page() throws Throwable {
        System.out.println("Saurabh Cucumber");
	}
}
