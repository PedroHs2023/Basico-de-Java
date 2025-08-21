import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Informações Cliente
        //----------------------------------------
        String nome = "Joelson Filisberto Aguiar";
        String tipoConta = "Corrente";
        double saldo = 5000;
        //----------------------------------------

        Scanner ler = new Scanner(System.in);
        boolean continuar = true;


        while (continuar) {

            System.out.println("""
                Operações
                -------------------------
                1- Consultar saldo
                2- Sacar valor
                3- Depositar valor
                4- Transferir valor
                5- Sair
                -------------------------
                """);

            System.out.println("Escolha uma opcão: ");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo da conta: R$" + saldo);
                    break;
                case 2:
                    System.out.println("Qual o valor que deseja sacar: ");
                    double valor = ler.nextDouble();

                    if(valor <= saldo) {
                        saldo -= valor;
                        System.out.println("Saldo atualizado: R$" + saldo);
                    }else {
                        System.out.println("Transação não pode ser efetuada");
                    }
                    break;
                case 3:
                    System.out.println("Qual o valor que deseja receber: ");
                    double valorD = ler.nextDouble();
                    saldo += valorD;
                    System.out.println("Saldo atualizado: R$" + saldo);
                    break;
                case 4:
                    System.out.println("Qual o valor que deseja transferir: ");
                    double valorT = ler.nextDouble();
                    if(valorT <= saldo) {
                        saldo -= valorT;
                        System.out.println("Saldo atualizado: R$" + saldo);
                    }else{
                        System.out.println("Transação não pode ser efetuada");
                    }
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Programa Finalizado..... ");
                    break;
            }
        }

    }
}