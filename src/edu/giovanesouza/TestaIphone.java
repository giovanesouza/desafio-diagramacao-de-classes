package edu.giovanesouza;

import edu.giovanesouza.iphone.Iphone;

public class TestaIphone {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple",
                "iphone 8 Plus",
                2017, "256 GB", "iOS");

        // System.out.println(iphone); // Imprime os dados do iphone criado

        // Métodos AparelhoTelefonico
        //iphone.ligar("988888888");
        //iphone.atender();
        //iphone.iniciarCorreioVoz();

        // Métodos NavagadorNaInternet
        //iphone.exibirPagina("https://github.com/giovanesouza");
        //iphone.adicionarNovaAba();
        //iphone.atualizarPagina();

        // Métodos ReprodutorMusical
        //iphone.selecionarMusica("O rei está voltando");
        //iphone.tocar();
        //iphone.pausar();
        //iphone.tocar();

    }

}
