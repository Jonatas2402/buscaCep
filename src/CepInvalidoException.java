public class CepInvalidoException extends RuntimeException {
    private String mensagem;
    //construtor
    public CepInvalidoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
