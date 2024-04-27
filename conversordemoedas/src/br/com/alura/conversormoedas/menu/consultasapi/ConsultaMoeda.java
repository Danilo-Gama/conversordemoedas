package br.com.alura.conversormoedas.menu.consultasapi;

import br.com.alura.conversormoedas.menu.moedas.Moedas;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;




public class ConsultaMoeda {
    public Moedas buscaMoeda(String base_code){
        try {
            URI busca = URI.create("https://v6.exchangerate-api.com/v6/a1d25c3fe8c3862dbe9dc9ac/latest/" + base_code);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri((busca))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            return gson.fromJson(response.body(), Moedas.class);
        } catch ( IOException | InterruptedException e) {
            throw new RuntimeException(("Moeda não encontrada!."));
        }
    }
}
