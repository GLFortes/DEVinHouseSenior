import filmes.Filme;
import usuarios.Usuario;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import static filmes.Genero.*;

public class Plataforma {
    public void curtirFilme(Filme filme, Usuario usuario, boolean curtir){
        if (curtir){
            filme.setCurtidas(filme.getCurtidas() + 1);
        }else{
            filme.setDescurtidas(filme.getDescurtidas() + 1);
        }
    }

    public void recomendarFilme(Filme filme, Usuario usuario, String msg) {
    }

    public void Login(String username){
        System.out.println("Usuário logado com sucesso");
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    Plataforma devinflix = new Plataforma();
    HashSet<String>filmesSugeridos = new HashSet<String>();
    HashSet<Filme> catalogoFilmes = new HashSet<Filme>();
    catalogoFilmes.add(new Filme("Avengers Ultimato", "Os caras tretam com o Thanos", ACAO));
    catalogoFilmes.add(new Filme("Miranha Sem Volta pra Casa", "Peter Parker estraga a linha do tempo", ACAO));
    catalogoFilmes.add(new Filme("O rei Leão", "Leão e seus amigos se preparam para a guerra pelo terreno da família", ANIMACAO));
    catalogoFilmes.add(new Filme("A lagoa azul kkk", "Não lembro, faz tempo que vi", DRAMA));
    HashSet<Usuario> usuarios = new HashSet<Usuario>();
    usuarios.add(new Usuario("Guilherme", "Alvorada", "24/08/1995"));
    usuarios.add(new Usuario("Julia", "Alvorada", "20/03/2000"));
    usuarios.add(new Usuario("Juvencio", "Alvorada", "09/03/1969"));
    System.out.println(usuarios.toString());

    while (true) {
        System.out.println("Digite o nome do usuário que deseja logar");
        String nome = scanner.nextLine();
        if(usuarios.contains(usuarios.contains(nome))){
            System.out.println("Usuário logado com sucesso");
        }
    }
    }
}
