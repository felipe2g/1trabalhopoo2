public class ContaCorrente {
    public String nome;
    private String senha;
    private int saldo;

    public void cadastrarSenha(String senha) {
        this.senha = senha;
    }

    public void alterarSenha(String senhaAntiga, String senhaNova) {
        if(senhaAntiga.equals(this.senha)) {
            this.senha = senhaNova;
        }
    }

    public void creditar(int valor) {
        this.saldo += valor;
    }
    
    public void debitar(int valor, String senha) {
        if(senha.equals(this.senha)) {
            this.saldo -= valor;
        }
    }

    public int getSaldo() {
        return saldo;
    }
}
