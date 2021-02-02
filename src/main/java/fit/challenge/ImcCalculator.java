package fit.challenge;

import java.math.BigDecimal;

public class ImcCalculator {
    public static String calculate(double valuePeso, double valueAltura) {
        if (!(valuePeso > 0 && valueAltura > 0))
            throw new RuntimeException("Argumentos informados  nao sao validos ");

        double imc = calcular(valuePeso, valueAltura);
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc < 24.9) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        }
        return "Obesidade";
    }

    private static double calcular(double valuePeso, double valueAltura) {
        return valuePeso / (Math.pow(valueAltura, 2));
    }
}
