package com.bookstore.services;

import com.bookstore.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class DeleteUser extends Globals {

    public void deleteAnExistingBook(int userNumber) {

     //   Map<String, Object> map = new HashMap<>();
      //  map.put("isbn", isbnNumbers.get(1));
     //   map.put("id", 4);
       // int id = 6;
        response = RestAssured
                .given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when().log().all()
                .delete("/users/"+userNumber+"")
                .prettyPeek();
        System.out.println("    dddd::: "+response);
    }

    public void deleteAnUserWhichHasBeenCreatedUserId()
    {
        response = RestAssured
                .given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when().log().all()
                .delete("/users/"+userId+"")
                .prettyPeek();
        System.out.println("Deleted the UserID that has been created recently::: "+response);

    }

    public void validateBookIsRemoved() {
        //validate status code is 204
        Assert.assertEquals(response.statusCode(), 200);
    }
}