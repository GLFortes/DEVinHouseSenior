import java.util.Scanner;

/*Ex. 10 - Crie um software que verifica se um número inserido pelo usuário é primo
* */
public class Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
            scanner.close();
        }
        if (numero == 1){
            System.out.println("O número 1 é primo");
        }else if (contador == 2) {
            System.out.println("O número " + numero + " é primo");
        } else {
            System.out.println("O número " + numero + " não é primo");
        }
    }
}
