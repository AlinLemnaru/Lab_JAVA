/*1. Se cere să se scrie un program Java care să calculeze şi să afişeze perimetru şi aria unui
dreptunghi. Valorile pentru lungime şi lățime se citesc de la tastatura. Sa se adauge un break
point pe prima linie care citește valoarea unei laturi si din acel punct să se ruleze programul
linie cu linie urmărind valorile variabilelor în memorie.*/

package Pb1;

import java.util.Scanner;

public class Pb1_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lungime = 0, latime = 0, perimetru = 0, aria = 0;

        System.out.print("lungime: ");
        lungime = sc.nextInt();

        System.out.print("latime: ");
        latime = sc.nextInt();

        perimetru = 2 * (lungime + latime);
        aria = lungime * latime;

        System.out.println("\nPerimetru: " + perimetru);
        System.out.println("\nAria: " + aria);
    }
}
