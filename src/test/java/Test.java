import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

public class Test {
    public static final String API_KEY = "82edc87933e14dc38b65bc307bc86b33";
    public static RequestSpecification spec;

    @BeforeAll
    static void setUp() {
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder
                .setBaseUri("https://newsapi.org/")
                .setBasePath("v2/everything")
                .addQueryParam("apiKey", API_KEY)
                .log(LogDetail.ALL);

        spec = builder.build();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Имена авторов кто упоминал теслу за последний месяц")
    void stateTeslaOnMonth() {
        Response response = RestAssured.given().spec(spec)
                .queryParam("from", "2021-07-27")
                .queryParam("sortBy", "publishedAt")
                .when().get("?q=tesla");

        JsonPath jsonPath = response.jsonPath();
        List<Object> title = jsonPath.getList("articles.author");
        title.forEach(System.out::println);
        Assertions.assertFalse(title.isEmpty());
    }
}
