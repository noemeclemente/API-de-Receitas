import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    private static final String API_KEY = "90ba65d00a0d41ceb38722a21078e204";
    private static final String BASE_URL = "https://api.spoonacular.com/recipes/complexSearch";

    public String buscarReceitasPorIngrediente(String ingrediente) throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        String address = BASE_URL + "?quey=" + ingrediente + "&apiKey=" + API_KEY;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();


    }
}
