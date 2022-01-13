import java.util.Scanner;

/* Ex. 5 - Nível de dificuldade para alfabetização de crianças
* Crie um programa em Java que, utlizando a classe Scanner, peça ao usuário que digite um nome
* qualquer, e em seguida escreva na tela o tamanho de letras que o nome possui */
public class Alfabetizacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String nome = scanner.nextLine();
        System.out.println("O nome possui " + nome.length() + " letras.");
        scanner.close();
    }
}
