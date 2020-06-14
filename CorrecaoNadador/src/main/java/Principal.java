import java.util.Scanner;

/**
 *
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Natacao natacao = new Natacao();
        System.out.println("Digite o nome: ");
        natacao.setNome(scanner.nextLine());
        System.out.println("Digite a idade ");
        natacao.setIdade(scanner.nextInt());

        System.out.println(natacao);

    }
}
