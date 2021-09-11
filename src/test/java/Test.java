import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import java.util.Map;

public class Test {

    public static RequestSpecification spec;
    String baseURI = "auth.mail.ru/jsapi/auth";
    @BeforeAll
    static void setUp() {
        String baseURI = "auth.mail.ru";


    }

    @org.junit.jupiter.api.Test
    @DisplayName("Имена авторов кто упоминал теслу за последний месяц")
    void stateTeslaOnMonth() {
        Response response = (Response) RestAssured.given().baseUri(baseURI).contentType(ContentType.JSON).accept(ContentType.JSON)
                .queryParam("login", "leva.trapeznikova")
                .queryParam("password", "Oneninenine8")
                .queryParam("saveauth","1")
                .post();

        JsonPath jsonPath = response.jsonPath();
        Map<String, String> cookies = response.cookies();
        System.out.println(cookies);
    }
}
