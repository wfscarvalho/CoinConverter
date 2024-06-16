import java.io.IOException;

public class CalculatedResults {
    double valor1;
    String coin1;
    String coin2;
    double moedaPara;

    public Double RetornaCalculado(double valor1, String coin1, String coin2) throws IOException, InterruptedException {
        this.valor1=valor1;
        this.coin1=coin1;
        this.coin2=coin2;

        ConversionRequest conversion = new ConversionRequest();
        ConversionRates voltaconversao = conversion.converter(coin1);
        switch (coin2) {
            case "BRL" -> moedaPara = Double.parseDouble(voltaconversao.BRL());
            case "USD" -> moedaPara = Double.parseDouble(voltaconversao.USD());
            case "EUR" -> moedaPara = Double.parseDouble(voltaconversao.EUR());
            case "INR" -> moedaPara = Double.parseDouble(voltaconversao.INR());
            case "CNY" -> moedaPara = Double.parseDouble(voltaconversao.CNY());
            default -> System.out.println("Moeda irregular");
        }

        var valorVolta = valor1*moedaPara;
        return valorVolta;
    }
}
