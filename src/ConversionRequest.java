import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversionRequest {

    //envia conversão, recebe conversar e retorna conversao para quem pediu
    public ConversionRates converter(String moeda) throws IOException, InterruptedException {
        URI converter = URI.create("https://v6.exchangerate-api.com/v6/638048a7f5995308e90cdc14/latest/"+moeda);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(converter)
                .build();


        HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        var test = new Gson();
        var convertido = test.fromJson(response.body(), Conversions.class);
        System.out.println(convertido.conversion_rates());
        return convertido.conversion_rates();



    }
}