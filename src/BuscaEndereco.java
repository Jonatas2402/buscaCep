import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaEndereco {
    public Endereco buscaEndereco(String cep) {
        if (cep.length() < 8) {
            throw  new CepInvalidoException("cep invalido, o cep deve conter 8 caracteres.");
        }
        Gson gson = new Gson();
        HttpClient client = HttpClient.newHttpClient();

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();


        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return gson.fromJson(response.body(), Endereco.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        } catch (CepInvalidoException e) {
            System.out.println(e.getMensagem());
        }

        return null;
    }
}