
import java.util.Scanner;

public class Exercicio01 {

    public static void executar() {

        String nome = Prompt.lerLinha("Digite o nome do aluno");
        double nota = Prompt.lerDecimal("Digite a nota do aluno");

        Prompt.imprimir("Nome: " + nome);
        Prompt.imprimir("Nota: " + nota);

    }

    // public static void executar() {

    // Scanner leitor = new Scanner(System.in);
    // System.out.println("Digite o nome do aluno");
    // String nome = leitor.nextLine();
    // System.out.println("Digite a nota do aluno");
    // double nota = leitor.nextDouble();
    // leitor.close();

    // }

}
