import org.mockserver.client.server.MockServerClient;
import com.google.gson.*;
import org.mockserver.model.Delay;
import org.mockserver.model.Header;
import java.util.concurrent.TimeUnit;
import static org.mockserver.integration.ClientAndServer.*;
import static org.mockserver.model.HttpResponse.response;
import static org.mockserver.model.HttpRequest.request;
import models.*;

public class Service {
    static  MockServerClient mockServer = startClientAndServer(8081);
    static Gson gson = new Gson();

    public static void req (String method, String url, int statusCode, String contentType, String body, int delay) {
        mockServer.when(
                request().withMethod(method)
                        .withPath(url)
        ).respond(
                response().withStatusCode(statusCode).withHeader(new Header("Content-Type", contentType))
                        .withBody(body)
                        .withDelay(new Delay(TimeUnit.MILLISECONDS, delay))
        );

    }


    public static void main(String[] args) {
        Item item = new Item(1232343);
        User user = new User (1234567);
        Site site = new Site("MLV");
        Country country = new Country("AR");

        req("GET", "/item/.*", 200, "application/json",gson.toJson(item),200);
        req ("GET", "/users/.*", 200, "application/json", gson.toJson(user),200 );
        //req ("GET", "/users/.*", 200, "application/json", gson.toJson(country),200 );
        req ("GET", "/countries/.*", 500, "text/plain", "error procesando Country",200);
        req ("GET", "/sites/.*", 200, "application/json", gson.toJson(site),200);

    }


}

