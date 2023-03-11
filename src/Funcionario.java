public class Funcionario {
    
    String nome;
    Double horasTrabalhadas;
    Double valorHora;

    public Funcionario(String nome, Double horasTrabalhadas, Double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public Double calculaSalario() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public String toString() {
        return "Nome => " + nome + "; Salário => " + calculaSalario();
    }
}
