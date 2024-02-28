package aula2;

import java.time.LocalDate;

public class Exercicio2 {

    // testar alínea A
    public static LocalDate[] insereData(LocalDate[] array, LocalDate data) {
        LocalDate[] newArray = new LocalDate[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = data;
        return newArray;
    }
}
