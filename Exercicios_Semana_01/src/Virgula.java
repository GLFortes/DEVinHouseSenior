import java.util.Scanner;

/*Ex. 4 - Crie um programa em Java que, utilizando a classe Scanner,
* peça ao usuário que digite um número com 2 ou mais casas depois da vírgula,
* converta esse número para um inteiro e escreva o resultado na tela.*/
public class Virgula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número com 2 ou mais casas depois da vírgula: ");
        double num = scanner.nextDouble();
        int numInt = (int) num;
        System.out.println("O número inteiro é: " + numInt);
        scanner.close();
    }
}
