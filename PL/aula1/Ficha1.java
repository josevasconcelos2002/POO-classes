import java.lang.Math;

public class Ficha1 {

    /**
     * Converts a temperature from Celsius to Fahrenheit.
     *
     * @param celsius the temperature in Celsius
     * @return the temperature in Fahrenheit
     */
    public double celsiusParaFahrenheit(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }

    public int maximoNumeros(int a, int b) {
        int max = java.lang.Math.max(a, b);
        return max;
    }

    public static void main(String[] args) {
        Ficha1 ficha = new Ficha1();

        // Exemplo de conversão de temperatura
        double temperaturaCelsius = 25.0;
        double temperaturaFahrenheit = ficha.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit");

        // Exemplo de encontrar o máximo entre dois números
        int num1 = 10;
        int num2 = 20;
        int maximo = ficha.maximoNumeros(num1, num2);
        System.out.println("O máximo entre " + num1 + " e " + num2 + " é " + maximo);
    }

}