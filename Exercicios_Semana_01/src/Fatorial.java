import java.util.Scanner;

/*Ex. 7 - Crie um programa em Java que, utilizando a classe Scanner,
calcule o fatorial de um número inteiro de 0 a 10.
O programa deve pedir para o usuário inserir um número inteiro,
mas só deve aceitar valores de 0 a 10, e então deve calcular o fatorial desse número e
escrever o resultado na tela.*/
public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, fat = 1;
        System.out.println("Digite um número inteiro de 0 a 10:");
        n = scanner.nextInt();
        if (n < 0 || n > 10) {
            System.out.println("Número inválido!");
        } else {
            for (int i = 1; i <= n; i++) {
                fat = fat * i;
            }
            System.out.println("O fatorial de " + n + " é " + fat);
        }
    scanner.close();
    }
}
