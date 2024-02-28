package aula2;

public class Exercicio1 {

    public static int minArray(int[] array) {
        int min = array[0];
        for (int elemento : array) {
            if (elemento < min) {
                min = elemento;
            }
        }
        return min;
    }
}
