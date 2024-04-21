package ADS.sistemaBancario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        System.out.println("------------------------------------------ \n");
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe seu sobrenome");
        String sobrenome = sc.nextLine();
        System.out.println("Informe seu CPF:");
        String cpf = sc.nextLine();
        Usuario usuario = new Usuario(nome, sobrenome, cpf);
        System.out.println("Dados Cadastrados!");
        boolean continuar =  true;
        while (continuar) {
            System.out.println("O que Deseja: ");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Realizar um depósito");
            System.out.println("3 - Realizar um saque");
            System.out.println("4 - Encerrar aplicação");
            int resp = sc.nextInt();

            switch (resp) {
                case 1:
                    System.out.println(usuario.getSaldo()); 
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Digite o valor do deposito:");
                    Double deposito = sc.nextDouble();
                    usuario.deposito(deposito);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Digit o valor do saque");
                    Double saque = sc.nextDouble();
                    usuario.saque(saque);
                    System.out.println("\n");
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Encerrando aplicações");
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Comando invalido!");
                    System.out.println("\n");
                    break;
            }
        }



    }
}
