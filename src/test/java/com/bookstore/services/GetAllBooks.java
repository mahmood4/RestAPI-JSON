package com.bookstore.services;

import com.bookstore.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

public class GetAllBooks extends Globals {

    public void getAllBooks() {
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .when().log().all()
            //    .get("/BookStore/v1/Books")
                .get("/users")
                .prettyPeek();
    }

    public void getSingleUser(int id) {
        response = RestAssured.given()
                .accept(ContentType.JSON)
                .when().log().all()
                //    .get("/BookStore/v1/Books")
                .get("/users/"+id+"")
                .prettyPeek();
    }

    public void validateThatAllBooksAreListed() {
        //assert status code
        Assert.assertEquals(200, response.statusCode());

        //get the data from body

    }
    public void validateUserisListed() {
        //assert status code
        Assert.assertEquals(200, response.statusCode());

        //get the data from body
        isbnNumbers = response.path("users.number");
        Assert.assertEquals("lalal", response.path("name"));
        Assert.assertEquals("abc@gmail.com", response.path("email"));
        Assert.assertEquals("636363", response.path("number"));
        //assert that all isbn numbers are  not null
     //   isbnNumbers.forEach(number -> Assert.assertNotNull(number));
      //  isbnNumbers.forEach(Assert::assertNotNull);

     //   for (String isbnNumber : isbnNumbers) {
       //     Assert.assertNotNull(isbnNumber);
      //  }
    }
}
