package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int opcao;

        while (true) {
            System.out.println("-----------------------------------------------");
            System.out.println("                                               ");
            System.out.println("        Bem vindo ao Mercadinho da Loira       ");
            System.out.println("                                               ");
            System.out.println("-----------------------------------------------");
            System.out.println("                                               ");
            System.out.println("               1 - Realizar cadastro           ");
            System.out.println("               2 - Buscar cadastro por ID      ");
            System.out.println("               3 - Atualizar cadastro          ");
            System.out.println("               4 - Apagar cadastro             ");
            System.out.println("               5 - Realizar compra             ");
            System.out.println("               6 - Sair                        ");
            System.out.println("                                               ");
            System.out.println("-----------------------------------------------");
            System.out.println("Entre com a opção desejada:                    ");
            System.out.println("                                               ");

            opcao = leia.nextInt();

            if (opcao == 6) {
                System.out.println("\nObrigada pela preferência");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Realizar cadastro \\n\\n");
                    break;
                case 2:
                    System.out.println("Buscar cadastro por ID \\n\\n");
                    break;
                case 3:
                    System.out.println("Atualizar cadastro \\n\\n");
                    break;
                case 4:
                    System.out.println("Apagar cadastro \\n\\n");
                    break;
                case 5:
                    System.out.println("Realizar compra \\n\\n");
                    break;
                default:
                    System.out.println("\\nOpção Inválida!\\n");
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println("\n-------------------------------------------");
        System.out.println("Projeto Desenvolvido por: ");
        System.out.println("Bruna Bosco - BrunaB@genstudents.org");
        System.out.println("---------------------------------------------");
    }
}