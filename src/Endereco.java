public record Endereco(String cep,
                       String logradouro,
                       String bairro,
                       String localidade,
                       String uf,
                       String estado,
                       String regiao) {
    //A classe record só será responsável por salvar os dados que seram utilizados como parâmetro.
}
