import com.sun.source.tree.IfTree;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = "Pedro Peter";
        String tipoConta = "Corrente";
        double saldo = 2600.00;
        int opcao = 0;

        System.out.println("****************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println();
        System.out.println("Nome:          " + nome);
        System.out.println("Tipo Conta:    " + tipoConta);
        System.out.println("Saldo Inicial: " + saldo);
        System.out.println("****************************************");
        System.out.println();

        System.out.println("Operações: ");
        System.out.println();

        String menu = """
                      ** Digite uma opção: **
                      1 - Consultar Saldo
                      2 - Transferir valor
                      3 - Receber Valor
                      4 - Sair
                      """;

        while (opcao != 4 ) {
            System.out.println(menu);
            opcao = sc.nextInt();

            if (opcao == 1){
                System.out.println("Saldo Atual: " + saldo);
                System.out.println();
            } else if (opcao == 2) {
                System.out.println("Digite o valor para transferir: ");
                double valor = sc.nextDouble();
                if (valor > saldo){
                    System.out.println("Não possui saldo suficiente: ");
                    System.out.println();
                } else {
                    System.out.println("Valor transferido com sucesso!");
                    saldo -= valor;
                    System.out.println("Saldo atualizado: " + saldo);
                    System.out.println();
                }

            } else if (opcao == 3){
                System.out.println("Digite o valor que irá receber: ");
                double valor = sc.nextDouble();
                saldo += valor;
                System.out.println("Saldo Atualizado: " + saldo);
                System.out.println();
            } else if (opcao !=4) {
                System.out.println("Opção inválida!");

            }
        }
    }
}
