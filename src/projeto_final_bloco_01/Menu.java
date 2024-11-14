package projeto_final_bloco_01;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import projeto.model.Model;
import projeto.model.Clientes;

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
            
            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                leia.nextLine(); 
                opcao = 0;
            }

            if (opcao == 6) {
                System.out.println("\nObrigada pela preferência");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
            case 1:
                System.out.println("\nRealizar cadastro\n");

                System.out.println("Digite o Nome do Cliente: ");
                leia.skip("\\R");
                String cliente1 = leia.nextLine();

                System.out.println("Digite o produto desejado: ");
                String produto = leia.nextLine();

                System.out.println("Digite o preço do produto (R$): ");
                float preco = leia.nextFloat();
                
                System.out.println("Cliente criado com sucesso ");

                keyPress();
                break;
                case 2:
                    System.out.println("\nBuscar cadastro por ID\n");
                    keyPress();
                    break;
                case 3:
                    System.out.println("\nAtualizar cadastro\n");
                    keyPress();
                    break;
                case 4:
                    System.out.println("\nApagar cadastro\n");
                    keyPress();
                    break;
                case 5:
                    System.out.println("\nRealizar compra\n");
                    keyPress();
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    keyPress();
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
    
    private static void keyPress() {
        System.out.println("\n\nPressione Enter para Continuar...");
        try {
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }
}

