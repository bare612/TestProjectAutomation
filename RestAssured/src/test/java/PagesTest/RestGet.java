package PagesTest;

import common.CommonAPI;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;

public class RestGet extends CommonAPI {
    public RestGet(){
    }
    @Test
    public void ValidateGetTest(){

       Response response= RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.asString());
        System.out.println(response.getBody().toString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());

        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }
    @Test
    public void Get_Test(){

        given().
                get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200).
                body("data.id[1]",equalTo(8)).
                body("data.first_name",hasItems("Michael","Lindsay"));
    }

}
