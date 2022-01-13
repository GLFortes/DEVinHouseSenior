import java.util.Scanner;

/*Ex. 6 - Crie um programa em Java que, utilizando a classe Scanner,
peça ao usuário para inserir as notas do semestre, e deve retornar a média final.
O programa deve pedir 3 notas, que devem ser números reais,
e retornar um número real com 2 casas depois da vírgula,
com o texto “Sua média final é:” seguido do valor.*/
public class Boletim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota 3: ");
        double nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Sua média final é: %.2f", media);
    }

    }

