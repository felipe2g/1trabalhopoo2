public class Aluno {
    public String nome;
    public Double n1;
    public Double n2;

    public Aluno(String nome, Double n1, Double n2) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }

    public Double media() {
        return (n1 + n2) / 2;
    }
}
