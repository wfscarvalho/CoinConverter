import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //chamar conversionrequest para converter valores
        CalculatedResults calculate = new CalculatedResults();
        Scanner sc = new Scanner(System.in);

        //criar menu para converter até 7 moedas diferentes e opção sair
        var coinName1 = "BRL";
        var value1 = 2.0;
        var coinName2 = "CAD";
        int selectedOption = 0;

        while (true){
            System.out.println("Essas são as opções de conversão: \n");
            System.out.println("Digite 1 para converter BRL para USD");
            System.out.println("Digite 2 para converter BRL para EUR");
            System.out.println("Digite 3 para converter BRL para INR");
            System.out.println("Digite 4 para converter BRL para CNY");
            System.out.println("Digite 5 para converter USD para BRL");
            System.out.println("Digite 6 para converter EUR para BRL");
            System.out.println("Digite 7 para converter INR para BRL");
            System.out.println("Digite 8 para converter CNY para BRL");
            System.out.println("Digite 0 para Sair");
            System.out.println("\nDIGITE A OPÇÃO ESCOLHIDA: ");
            selectedOption = sc.nextInt();
            if (selectedOption==0){
                break;
            } else if (selectedOption==1) {
                coinName1 = "BRL";
                coinName2 = "USD";
            } else if (selectedOption==2) {
                coinName1 = "BRL";
                coinName2 = "EUR";
            } else if (selectedOption==3) {
                coinName1 = "BRL";
                coinName2 = "INR";
            } else if (selectedOption==4) {
                coinName1 = "BRL";
                coinName2 = "CNY";
            } else if (selectedOption==5) {
                coinName1 = "USD";
                coinName2 = "BRL";
            } else if (selectedOption==6) {
                coinName1 = "EUR";
                coinName2 = "BRL";
            } else if (selectedOption==7) {
                coinName1 = "INR";
                coinName2 = "BRL";
            } else if (selectedOption==8) {
                coinName1 = "CNY";
                coinName2 = "BRL";
            }

            System.out.println("Agora digite o valor a ser convertido: ");
            value1 = sc.nextDouble();

            var convertendo = calculate.RetornaCalculado(value1, coinName1, coinName2);

            System.out.println("O Valor de " + coinName1 + " " + value1 + " Convertido para " + coinName2 + " é igual à: " + convertendo);
            break;
        }



        //gera valores convertidos com data e hora da conversão para referencia futura. Cria nova linha em arquivo unico

    }
}