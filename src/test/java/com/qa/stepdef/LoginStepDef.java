package com.qa.stepdef;

import com.qa.pages.LoginPage;
import com.qa.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @When("^I enter username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String username) {
        // Write code here that turns the phrase above into concrete actions

        new LoginPage().enterUserName(username);
    }

    @When("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        // Write code here that turns the phrase above into concrete actions

        new LoginPage().enterPassword(password);
    }

    @When("^I login$")
    public void iLogin() {
        // Write code here that turns the phrase above into concrete actions

        new LoginPage().pressLoginButton();


    }

    @Then("^login should fail with an error \"([^\"]*)\"$")
    public void loginShouldFailWithAnError(String err) {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertEquals(new LoginPage().getErrText(), err);
    }

    @Then("^I should see products page title \"([^\"]*)\"$")
    public void iShouldSeeProductsPageTitle(String title) {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertEquals(new ProductsPage().getTitle(), title);
    }


}
