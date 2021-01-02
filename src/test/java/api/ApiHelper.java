package api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpHeaders;
import org.junit.Assert;

public class ApiHelper {

    private RequestSpecification request;
    private Response response;
    private String token;

        public void setEndPoint(String endPoint){
            RestAssured.baseURI = endPoint;
            request = RestAssured.given();
        }

        public void setHeader(){
            request.header("Content-Type", "application/json");
        }

        public void postEmailAndPassword(String email, String password ){
            String req = "{ \"email\":\"" + email + "\", \"password\":\"" + password + "\"}";
            response = request.body(req).post();
        }

        public void getToken(){
            String jsonString = response.asString();
            token = JsonPath.from(jsonString).get("token");
            System.out.println("Token : "+token);
        }

    public void testStatusCode200(){
        Assert.assertEquals(200, response.getStatusCode());
    }

    public void postOnlyEmail(String email){
        String req = "{ \"email\":\"" + email + "\"}";
        response = request.body(req).post();
    }

    public void testStatusCode400(){
        Assert.assertEquals(400, response.getStatusCode());
    }

    public void getUsers(){
            response = request.get();
        String jsonString = response.asString();
        System.out.println(jsonString);
    }

}




