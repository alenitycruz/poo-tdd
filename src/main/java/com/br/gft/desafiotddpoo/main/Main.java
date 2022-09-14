package com.br.gft.desafiotddpoo.main;

import com.br.gft.desafiotddpoo.empregados.Gerente;
import com.br.gft.desafiotddpoo.empregados.Supervisor;
import com.br.gft.desafiotddpoo.empregados.Vendedor;
import com.br.gft.desafiotddpoo.loja.model.Livro;
import com.br.gft.desafiotddpoo.loja.model.Loja;
import com.br.gft.desafiotddpoo.loja.model.VideoGame;
import com.br.gft.desafiotddpoo.veiculo.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 1 - VEICULO");

        Veiculo v1 = new Veiculo();

        v1.setMarca("Jeep");
        v1.setModelo("Renegade");
        v1.setPlaca("ALE5555");
        v1.setCor("Amarelo");
        v1.setKm(10.00f);
        v1.setLigado(true);
        v1.setLitrosCombustivel(30);
        v1.setVelocidade(0);
        //v1.setVelocidade(30);
        v1.setPreco(90000.00);
        //v1.acelerar();
        v1.abastecer(30);
        v1.abastecer(30);
        v1.pintar("Dourado");
        v1.desligar();

        System.out.println(v1);

        System.out.println("=================================================");

        System.out.println("EXERCICIO 2 - LOJA");

        List<Livro> livro = new ArrayList<>();
        Livro l1 = new Livro("Harry Potter", 40d, 50, "J. K. Rowling", "fantasia", 300);
        Livro l2 = new Livro("Senhor dos Aneis", 60d, 30, "J. R. R. Tolkien", "fantasia", 500);
        Livro l3 = new Livro("Java POO", 20d, 50, "GFT", "educativo", 500);

        livro.add(l1);
        livro.add(l2);
        livro.add(l3);

        List<VideoGame> games = new ArrayList<>();
        VideoGame ps4 = new VideoGame("PS4", 1800d, 100, "Sony", "Slim", false);
        VideoGame ps4Usado = new VideoGame("PS4", 1000d, 7, "Sony", "Slim", true);
        VideoGame xbox = new VideoGame("XBOX", 1500d, 500, "Microsoft", "One", false);

        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);

        Loja americanas = new Loja("Americanas", "12345678", livro, games);

        l2.calculaImposto();
        l3.calculaImposto();

        ps4Usado.calculaImposto();
        ps4.calculaImposto();

        System.out.println(l2.calculaImposto());
        System.out.println(l3.calculaImposto());
        System.out.println(ps4Usado.calculaImposto());
        System.out.println(ps4.calculaImposto());
        System.out.println("---------------------------------------");
        System.out.println("A loja Americanas possui estes livros para venda: ");
        americanas.listaLivros();
        System.out.println("---------------------------------------");
        System.out.println("A loja Americanas possui estes video-games para venda: ");
        americanas.listaVideoGames();
        System.out.println("---------------------------------------");
        americanas.calculaPatrimonio();

        System.out.println("=================================================");

        System.out.println("EXERCICIO 5 - EMPREGADOS");

        Gerente g1 = new Gerente("Severino Portões", 60, 50000.d);
        Supervisor s1 = new Supervisor("NicoleDickman", 30, 30000.0d);
        Vendedor vv = new Vendedor("Fernando Pessoa", 50, 10000.0d);

        g1.setNome("Johnny Deep");
        g1.setIdade(40);
        g1.setSalario(40000.0d);

        vv.bonificacao();
        s1.bonificacao();

        System.out.println(g1);
        System.out.println(vv);
        System.out.println(s1);



    }
}
