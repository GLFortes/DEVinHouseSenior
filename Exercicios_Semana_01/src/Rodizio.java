import java.util.Scanner;

/*Ex. 9 - Crie um software que oferece ao usuário três sabores diferentes de pizza fixos
 (exemplo: mussarela, calabresa, portuguesa) identificadas por um número.
 Enquanto o usuário escolher um sabor válido, pergunte se ele deseja uma nova fatia.
 Caso contrário, exiba quantas fatias ele comeu e encerre o programa.
Exemplo:
“Você deseja uma pizza? Envie “1” para calabresa, “2” para mussarela, “3” para portuguesa ou “0” caso esteja satisfeito”
*/

public class Rodizio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo ao Rodizio do Fulano de Tal");
        String resposta = " ";
        while (!resposta.equals("0")) {
            System.out.println("Por favor, escolha um dos sabores abaixo:");
            System.out.println("1 - Mussarela\n2 - Calabresa\n3 - Portuguesa\n0 - Sair");
            resposta = scanner.nextLine();
            switch (resposta) {
                case "1":
                    System.out.println("Você escolheu a pizza mussarela\n");
                    break;
                case "2":
                    System.out.println("Você escolheu a pizza calabresa\n");
                    break;
                case "3":
                    System.out.println("Você escolheu a pizza portuguesa\n");
                    break;
                case "0":
                    System.out.println("Você saiu do Rodízio\n");
                    break;
                default:
                    System.out.println("Opção inválida\n");
            }}
    scanner.close();
    }
}
