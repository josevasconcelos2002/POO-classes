package aula2;

public class Exercicio1 {

    // alinea A já testada
    public static int minArray(int[] array) {
        int min = array[0];
        for (int elemento : array) {
            if (elemento < min) {
                min = elemento;
            }
        }
        return min;
    }

    // experimentar alínea B
    public static int[] alineaB(int[] array, int indiceA, int indiceB)
    {
        if(indiceB >= indiceA)
        {
            int numeroElementos = indiceB - indiceA;
            int[] arrayResultante = new int[numeroElementos]
            for(int i = indiceA; i<=indiceB ; i++)
            {
                int j = 0;
                arrayResultante[j] = array[i];
                j++;
            }
            return arrayResultante;
        }
    }
}
