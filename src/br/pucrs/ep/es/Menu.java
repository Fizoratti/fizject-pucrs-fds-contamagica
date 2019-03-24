package br.pucrs.ep.es;

import br.pucrs.ep.es.model.Cliente;

import java.util.Scanner;

public class Menu {
    private static Menu INSTANCE = new Menu();

    private Menu() {

    }

    public static Menu getInstance() {
        return INSTANCE;
    }

    public void showMenu() {
        System.out.println("--------------------------");
        System.out.println("MENU PRINCIPAL");
        System.out.println("1 - Registrar Cliente");
        System.out.println("2 - Chamar Cliente");

        System.out.println("0 - Sair");
        System.out.print("\n$ Digite a opção: ");

        Scanner ler = new Scanner(System.in);
        int opc = ler.nextInt();

        switch(opc) {

            case 1:
                showMenuRegistroCliente();
                break;

            case 2:
                //showMenuDevolucao();
                break;

            case 0:
                System.out.println("\nVolte logo!");
                break;

            default:
                showMenu();
                break;
        }
    }

    public void showMenuRegistroCliente() {
        Scanner ler = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("MENU REGISTRAR CLIENTE");

        System.out.print("\n$ Digite nome: ");
        String nome = ler.nextLine();

        System.out.print("\n$ Digite idade: ");
        int idade = ler.nextInt();

        Cliente cliente = new Cliente(nome, idade);

        System.out.println("--------------------------");
        System.out.println("MENU REGISTRAR CLIENTE");
        System.out.println(cliente.toString() + "\n");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.print("$ Confirma registro desse cliente?: ");

        int opc = ler.nextInt();

        switch(opc) {

            case 1:
                Banco.getInstance().registrarCliente(cliente);
                System.out.println("Cliente registrado!\n");
                // Wait 2 seconds
                try {
                    Thread.sleep(2000);
                } catch(Exception e) {
                    Thread.currentThread().interrupt();
                }

            case 0:
                showMenu();
                break;

            default:
                showMenuRegistroCliente();
                break;
        }
    }
}
