package com.qa.stepdef;

import com.qa.pages.LoginPage;
import com.qa.pages.ProductDetailsPage;
import com.qa.pages.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductStepDef {


    @Given("^I'm logged in$")
    public void iMLoggedIn() {
        // Write code here that turns the phrase above into concrete actions

        new LoginPage().login("standard_user", "secret_sauce");
    }


    @Then("^the product is listed with title \"([^\"]*)\" and price \"([^\"]*)\"$")
    public void theProductIsListedWithTitleAndPrice(String title, String price) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Boolean titleCheck = new ProductsPage().getSLBTitle().equalsIgnoreCase(title);
        Boolean priceCheck = new ProductsPage().getSLBPrice().equalsIgnoreCase(price);

        Assert.assertTrue("titleCheck = " + titleCheck + ", priceCheck = " +
                priceCheck, titleCheck & priceCheck);





    }

    @When("^I click product title \"([^\"]*)\"$")
    public void iClickProductTitle(String title) {
        // Write code here that turns the phrase above into concrete actions

        new ProductsPage().pressSLBTitle();
    }
    @Then("^I should be on product details page with title \"([^\"]*)\",and price \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iShouldBeOnProductDetailsPageWithTitleAndPriceAnd(String title, String price, String description) {
        // Write code here that turns the phrase above into concrete actions

        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        boolean titleCheck = productDetailsPage.getSLBTitle().equalsIgnoreCase(title);
        boolean priceCheck = productDetailsPage.getSLBPrice().equalsIgnoreCase(price);
        boolean descCheck =  productDetailsPage.getSLBText().equalsIgnoreCase(description);

        Assert.assertTrue("titleCheck = " + titleCheck + ", descCheck = " + descCheck + ", priceCheck = "
                + priceCheck, titleCheck & descCheck & priceCheck);
    }

}
