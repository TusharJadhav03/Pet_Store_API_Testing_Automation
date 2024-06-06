package Api_Automation;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.File;

import static io.restassured.RestAssured.given;

public class Pet_Store_Automation {

    //User//
    @Test
    public void create_user(){
        Response res = given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"username\": \"tushar0328\",\n" +
                        "  \"firstName\": \"string\",\n" +
                        "  \"lastName\": \"string\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"Jadhav1228\",\n" +
                        "  \"phone\": \"string\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .when()
                .post("https://petstore.swagger.io/v2/user");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void create_multiple_user_array(){
        Response res = given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("[\n" +
                        "  {\n" +
                        "    \"id\": 0,\n" +
                        "    \"username\": \"tushar03\",\n" +
                        "    \"firstName\": \"string\",\n" +
                        "    \"lastName\": \"string\",\n" +
                        "    \"email\": \"string\",\n" +
                        "    \"password\": \"1999\",\n" +
                        "    \"phone\": \"string\",\n" +
                        "    \"userStatus\": 0\n" +
                        "  },\n" +
                        "{\n" +
                        "    \"id\": 1,\n" +
                        "    \"username\": \"sakshi28\",\n" +
                        "    \"firstName\": \"string\",\n" +
                        "    \"lastName\": \"string\",\n" +
                        "    \"email\": \"string\",\n" +
                        "    \"password\": \"2002\",\n" +
                        "    \"phone\": \"string\",\n" +
                        "    \"userStatus\": 0\n" +
                        "  }\n" +
                        "]")
                .when()
                .post("https://petstore.swagger.io/v2/user/createWithArray");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void create_multiple_user_list(){
        Response res = given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("[\n" +
                        "  {\n" +
                        "    \"id\": 0,\n" +
                        "    \"username\": \"tushar03\",\n" +
                        "    \"firstName\": \"string\",\n" +
                        "    \"lastName\": \"string\",\n" +
                        "    \"email\": \"string\",\n" +
                        "    \"password\": \"1999\",\n" +
                        "    \"phone\": \"string\",\n" +
                        "    \"userStatus\": 0\n" +
                        "  },\n" +
                        "  {\n" +
                        "    \"id\": 1,\n" +
                        "    \"username\": \"sakshi28\",\n" +
                        "    \"firstName\": \"string\",\n" +
                        "    \"lastName\": \"string\",\n" +
                        "    \"email\": \"string\",\n" +
                        "    \"password\": \"2002\",\n" +
                        "    \"phone\": \"string\",\n" +
                        "    \"userStatus\": 0\n" +
                        "  }\n" +
                        "]")
                .when()
                .post("https://petstore.swagger.io/v2/user/createWithList");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void retrieve_user(){
        Response res = given()
                .header("accept","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/user/tushar03");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void user_login(){
        Response res = given()
                .header("accept","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/user/login?username=tushar03&password=1999");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void user_logout(){
        Response res = given()
                .header("accept","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/user/logout");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void update_user(){
        Response res = given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"username\": \"tushar03\",\n" +
                        "  \"firstName\": \"Tushar\",\n" +
                        "  \"lastName\": \"Jadhav\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"string\",\n" +
                        "  \"phone\": \"string\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .when()
                .put("https://petstore.swagger.io/v2/user/tushar03");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void delete_user(){
        Response res = given()
                .header("accept","application/json")
                .when()
                .delete("https://petstore.swagger.io/v2/user/tushar03");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    //Store//
    @Test
    public void place_order(){
        Response res = given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"petId\": 1,\n" +
                        "  \"quantity\": 1,\n" +
                        "  \"shipDate\": \"2024-05-28T11:42:59.317Z\",\n" +
                        "  \"status\": \"placed\",\n" +
                        "  \"complete\": true\n" +
                        "}")
                .when()
                .post("https://petstore.swagger.io/v2/store/order");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void retrieve_inventory(){
        Response res = given()
                .header("accept","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/store/inventory");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void retrieve_order_by_id(){
        Response res = given()
                .header("accept","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/store/order/1  ");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void delete_order_by_id(){
        Response res = given()
                .header("accept","application/json")
                .when()
                .delete("https://petstore.swagger.io/v2/store/order/1");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    //Pet//

    @Test
    public void add_new_pet(){
        Response res = given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 1,\n" +
                        "    \"name\": \"mike\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .when()
                .post("https://petstore.swagger.io/v2/pet");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void update_pet_data(){
        Response res = given()
                .header("accept","application/json")
                .header("Content-Type","application/x-www-form-urlencoded")
                .when()
                .post("https://petstore.swagger.io/v2/pet/1");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void upload_pet_image(){
        File file = new File("C:\\Users\\tusha\\Downloads\\wallpaper.jpg");
        Response res = given()
                .header("accept","application/json")
                .header("Content-Type","multipart/form-data")
                .multiPart(file)
                .when()
                .post("https://petstore.swagger.io/v2/pet/1/uploadImage");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void update_existing_pet(){
        Response res = given()
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 1,\n" +
                        "    \"name\": \"mark\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"marks\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 1,\n" +
                        "      \"name\": \"tas\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .when()
                .put("https://petstore.swagger.io/v2/pet");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void find_pet_by_id(){
        Response res = given()
                .header("accept","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/pet/1");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void find_pet_by_status(){
        Response res = given()
                .header("accept","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void delete_pet(){
        Response res = given()
                .header("accept","application/json")
                .when()
                .delete("https://petstore.swagger.io/v2/pet/1");
        res.prettyPrint();
        res.then().statusCode(200);
        Assert.assertEquals(res.statusCode(),200);
    }




}
