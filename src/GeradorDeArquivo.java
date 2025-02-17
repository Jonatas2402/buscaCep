import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void salvaEndereco(Endereco endereco) throws IOException {
        //Esta classe tem como objetivo criar gerador de Json com os dados de cep informados pelo usuário.
        //Utilizando Gson para alterar o formato do arquivo que será salvo.
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //Utilizando FIleWriter para pegar os dados do cep e utiliza o gson para transformalos em Json.
        FileWriter escrita = new FileWriter(endereco.cep() + ".json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }
}
