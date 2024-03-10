package com.bookstore.step_defs;

import com.bookstore.services.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookStore_StepDefs {

    GetAllBooks getAllBooks = new GetAllBooks();
  //  AssignNewBook assignNewBook = new AssignNewBook();

    PostNewUser postNewUser = new PostNewUser();
   // UpdateBook updateBook = new UpdateBook();

    UpdateUser updateBook = new UpdateUser();

  //  DeleteBook deleteBook = new DeleteBook();

    DeleteUser deleteBook = new DeleteUser();

    @When("Get All Books")
    public void get_all_books() {
        getAllBooks.getAllBooks();
    }

    @When("Get Single User")
    public void get_single_user() {
        getAllBooks.getSingleUser(7);
    }

    @Then("Validate that all books are listed")
    public void validate_that_all_books_are_listed() {
        getAllBooks.validateThatAllBooksAreListed();
    }

    @Then("validateUserisListed")
    public void validate_useris_listed() {
        // Write code here that turns the phrase above into concrete actions
        getAllBooks.validateUserisListed();
    }

    @When("Assign a new book to the user")
    public void assignANewBookToTheUser() {
        postNewUser.postNewUser();
    }

    @Then("Validate that the book is assigned to the user")
    public void validateThatTheBookIsAssignedToTheUser() {
        postNewUser.validateThatUserIsCreated();
    }

    @When("Update the existing book")
    public void updateTheExistingBook() {
        updateBook.updateBook();
    }

    @Then("Validate that the book is updated")
    public void validateThatTheBookIsUpdated() {
        updateBook.validateThatBookIsUpdated();
    }

    @When("Delete an existing user as {int}")
    public void delete_an_existing_user_as(Integer int1) {
        deleteBook.deleteAnExistingBook(int1);
    }



    @Then("Validate that the book is removed")
    public void validate_that_the_book_is_removed() {
        deleteBook.validateBookIsRemoved();
    }

    @When("Delete an user which has been created userId")
    public void deleteAnUserWhichHasBeenCreatedUserId() {
        deleteBook.deleteAnUserWhichHasBeenCreatedUserId();
    }
}
