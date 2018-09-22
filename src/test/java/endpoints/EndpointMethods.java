package endpoints;

import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class EndpointMethods{
    static String baseURI ="https://jsonplaceholder.typicode.com";
    static RequestSpecification requestSpecification = given().contentType("application/json");

    public static Response getAllPosts(){
        return requestSpecification.when().get(baseURI+"/posts");
    }

    public static Response getSelectedPosts(int id){
        requestSpecification.pathParam("id", id);
        return requestSpecification.when().get(baseURI+"/posts/{id}");
    }
}
