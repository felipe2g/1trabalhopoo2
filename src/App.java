import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra para exibí-la em maíusculo:");
        System.out.println(sc.nextLine().toUpperCase());

        System.out.println("Digite 2 palavras para compará-las.");
        System.out.println("Primeira palavra: ");
        String primeiraPalavra = sc.nextLine();
        System.out.println("Segunda palavra: ");
        String segundaPalavra = sc.nextLine();

        if(primeiraPalavra.equals(segundaPalavra)) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }

        Circulo circulo1 = new Circulo(32);
        Circulo circulo2 = new Circulo(44);
        Circulo circulo3 = new Circulo(17);

        System.out.println("Circulo 1 => " + circulo1.toString());
        System.out.println("Circulo 2 => " + circulo2.toString());
        System.out.println("Circulo 3 => " + circulo3.toString());

        Funcionario funcionario1 = new Funcionario("João", 20.0, 3.5);
        Funcionario funcionario2 = new Funcionario("Mateus", 40.0, 5.5);
        Funcionario funcionario3 = new Funcionario("Lucas", 40.0, 13.5);

        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        System.out.println(funcionario3.toString());

        Pessoa pessoa1 = new Pessoa("Pessoa Pássaro", "937.842.029-33", 503);
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Rick Sanchez");
        pessoa2.setIdade(58);
        pessoa2.setCpf("847.162.398-23");

        System.out.println("Pessoa 1 => Nome: " + pessoa1.getNome() + " Idade => " + pessoa1.getIdade() + "Cpf => " + pessoa1.getCpf());
        System.out.println("Pessoa 2 => Nome: " + pessoa2.getNome() + " Idade => " + pessoa2.getIdade() + "Cpf => " + pessoa2.getCpf());

        Aluno ana = new Aluno("Ana", 10.0, 9.0);
        Aluno beto = new Aluno("Beto", 9.0, 10.0);

        Calculo calc1 = new Calculo(0);
        calc1.credito(100);
        calc1.debito(27);
        System.out.println("Saldo final => " + calc1.getSaldo());


        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.nome = "Morty Smith C-137";
        contaCorrente.cadastrarSenha("ilovejessica22");
        contaCorrente.creditar(500);
        contaCorrente.debitar(200, "ilovejessica22");
        
        System.out.println("Saldo => " + contaCorrente.getSaldo());

        CodigoPostal codigoPostal = new CodigoPostal("indicativo", "extensão", "Nome da Zona");
        System.out.println(codigoPostal.toString());

        sc.close();
    }
}
