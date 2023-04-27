import java.util.Scanner;

//INICIALIZAR DADOS DO CLIENTE
/*
INICIALIZAR DADOS -OK
MENU DE OPÇÕES - OK
VIZUALIZAÇÃO DE SALDO -
RECEBER VALOR
*/
public class Main {
    public static void main(String[] args) {
        //VARIAVEIS
        String nome = "Matheus";
        double saldoInicial = 2600;
        String tipoConta = "Corrente";
        int operacoes = 0;

        System.out.println("\n****************************");
        System.out.println("DESAFIO ALURA CONTROLE BANCARAIO");

        System.out.println("Nome do cliente:" + nome);

        System.out.println("Tipo de Conta:" + tipoConta);

        System.out.println("Saldo Inicial = " + saldoInicial);
        System.out.println("\n****************************");

        String Menu = """
                ---Digite sua opção---
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;
        Scanner leitura = new Scanner(System.in);

        while (operacoes != 4) {
            System.out.println(Menu);
            operacoes = leitura.nextInt();
            if (operacoes == 1) {
                System.out.println("Seu saldo é de " + saldoInicial);

            } else if (operacoes == 2) {
                System.out.println("Valor para depósito:");
                double valor = leitura.nextDouble();
                saldoInicial -= valor; // atualiza o valor do saldo
                System.out.println("Seu novo saldo é de " + saldoInicial);
            }
            else if (operacoes == 3) {
                System.out.println("Valor para receber:");
                double valor = leitura.nextDouble();
                saldoInicial += valor; // atualiza o valor do saldo
                System.out.println("Seu novo saldo é de " + saldoInicial);
            }
            if (operacoes != 4 ){
                System.out.println("\nOperação Invalida Digite um valor valido");
            }
        }
    }
}