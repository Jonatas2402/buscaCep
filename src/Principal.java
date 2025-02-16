import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //testando busca de cep.
        BuscaEndereco busca = new BuscaEndereco();


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o cep: ");
        String cep = sc.nextLine();
        Endereco endereco = busca.buscaEndereco(cep);
        System.out.println(endereco);
    }
}
