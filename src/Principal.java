import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //testando busca de cep.
        Scanner sc = new Scanner(System.in);
        BuscaEndereco busca = new BuscaEndereco();
        Endereco endereco;
        System.out.println("Digite o cep: ");
        String cep = sc.nextLine();
        try {
            endereco = busca.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaEndereco(endereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("finalizando o programa.");
        }
    }
}
