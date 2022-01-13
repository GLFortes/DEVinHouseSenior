import java.util.Scanner;

/*Ex.3 - Crie um programa em Java que, utilizando a classe Scanner,
  pergunte ao usuário seu sobrenome, depois seu nome,
  e então escreva na tela, em uma única “string”, o nome completo do usuário.*/
public class NomeCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome completo: " + nomeCompleto);
        scanner.close();
    }
}
