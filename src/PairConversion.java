import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PairConversion {
    public Coin conversion(String base_code, String target_code, float amount){
        URI url = URI.create("https://v6.exchangerate-api.com/v6/PON-TU-API-KEY/pair/"+
                base_code+"/"+target_code+"/"+amount+"/");

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

                try{
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                    return new Gson().fromJson(response.body(), Coin.class);
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }

    }

}
