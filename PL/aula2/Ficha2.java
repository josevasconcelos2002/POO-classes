package aula2;

public class Ficha2 {

    public static void main(String[] args) {

    }

}

public class Exercicio1 {

    public int minArray(int[] array) {
        int min = array[0];
        for (int elemento : array) {
            if (elemento < min) {
                min = elemento;
            }
        }
        return min;
    }
}