/*2. Să se scrie un program care citește un set de numerele din fișierul de intrare in.txt, care
conține câte un număr pe un rând, având valorile din figura 18. Programul va determină suma
lor, media aritmetică, valoarea minimă, valoarea maximă, va afișa aceste valori pe ecran și le
va scrie în fișierul de ieșire out.txt. Media aritmetică va fi afișată ca un număr real. */

package Pb2;

import java.io.*;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Pb2_Main {
    public static void main(String[] args) throws IOException {
        String nume_fisier = "in.txt", linie;
        BufferedReader br = new BufferedReader(new FileReader(nume_fisier));
        PrintStream ps = new PrintStream("out.txt");

        int[] numere = new int[6];
        int i = 0, suma, min, max;
        OptionalDouble mediaAritrmetica;

        do {
            linie = br.readLine();
            if(linie == null)
                break;
            
            numere[i++] = Integer.parseInt(linie);
            
        } while (true);

        suma = Arrays.stream(numere).sum();
        mediaAritrmetica = Arrays.stream(numere).average();
        min = Arrays.stream(numere).min().getAsInt();
        max = Arrays.stream(numere).max().getAsInt();

        System.out.println(suma);
        System.out.println(mediaAritrmetica.getAsDouble());
        System.out.println(min);
        System.out.println(max);

        ps.println(suma);
        ps.println(mediaAritrmetica.getAsDouble());
        ps.println(min);
        ps.println(max);
    }
}
