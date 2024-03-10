package com.bookstore.step_defs;

import com.bookstore.services.AddNewUser1;
import com.bookstore.services.AuthorizeUser;
import com.bookstore.services.GenerateToken;
import com.bookstore.services.PostNewUser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Account_StepDefs {

    PostNewUser postNewUser = new PostNewUser();
    GenerateToken generateToken = new GenerateToken();
    AuthorizeUser authorizeUser = new AuthorizeUser();

    @When("Add new User")
    public void add_new_user() {
        postNewUser.postNewUser();
    }

    @Then("Validate that the new user is posted")
    public void validate_that_the_new_user_is_posted() {
        postNewUser.validateThatUserIsCreated();
    }

    @When("Generate Token")
    public void generateToken() {
        generateToken.generateToken();
    }

    @Then("Validate that the token is generated")
    public void validateThatTheTokenIsGenerated() {
        generateToken.validateTokenIsGenerated();
    }

    @When("Authorize User")
    public void authorizeUser() {
        authorizeUser.authorizeUser();
    }

    @Then("Validate that the user is authorized")
    public void validateThatTheUserIsAuthorized() {
        authorizeUser.validateThatUserIsAuthorized();
    }
}
