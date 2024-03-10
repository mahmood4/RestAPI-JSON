@UserAPI
Feature: BookStore Flow

  Scenario: Get all Users
    When Get All Books
    Then Validate that all books are listed

  Scenario: Get Single User
    When Get Single User
    Then validateUserisListed

  Scenario: Post New User
    When Add new User
    Then Validate that the new user is posted

  Scenario: Update a User
    When Update the existing book
    Then Validate that the book is updated

#  Scenario: Test-5
 #  When Delete an existing user as 23
  # Then Validate that the book is removed

  Scenario: Delete a user which is created
    When Delete an user which has been created userId
    Then Validate that the book is removed

#  Scenario Outline: Test 6 Delete all the Existing Users
 #   When Delete an existing user as <ID>
  #  Then Validate that the book is removed

