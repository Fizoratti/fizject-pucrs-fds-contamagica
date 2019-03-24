package br.pucrs.ep.es;

import br.pucrs.ep.es.db.Database;

public class Main {

    public static void main(String[] args) {
        System.out.print("Bem-vindo ao Banco Mágico!\n");

        Database.start();

        Banco.start();

        Menu.getInstance().showMenu();
    }
}
