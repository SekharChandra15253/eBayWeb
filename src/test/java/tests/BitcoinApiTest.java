package tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.*;

public class BitcoinApiTest extends BaseTest {

    @Test
    public void verifyBitcoinApi() {

        // 1. Send GET request
        Response response =
                given()
                        .when()
                        .get("/coins/bitcoin")
                        .then()
                        .statusCode(200)
                        .extract().response();

        // Verify 3 currencies (USD, GBP, EUR)
        Assert.assertNotNull(response.jsonPath().get("market_data.current_price.usd"));
        Assert.assertNotNull(response.jsonPath().get("market_data.current_price.gbp"));
        Assert.assertNotNull(response.jsonPath().get("market_data.current_price.eur"));

        // Verify market cap & total volume
        Assert.assertNotNull(response.jsonPath().get("market_data.market_cap.usd"));
        Assert.assertNotNull(response.jsonPath().get("market_data.total_volume.usd"));

        // Verify price change percentage 24h
        Float change = response.jsonPath().getFloat("market_data.price_change_percentage_24h");
        Assert.assertNotNull(change);

        // Verify homepage not empty
        String homepage = response.jsonPath().getString("links.homepage[0]");
        Assert.assertNotNull(homepage);
        Assert.assertFalse(homepage.isEmpty());
    }
}