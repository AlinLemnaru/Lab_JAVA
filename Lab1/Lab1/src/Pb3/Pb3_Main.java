/*3. Să se scrie un program care citește un număr n natural de la tastatură și afișează toți
divizorii acestuia pe ecran. Dacă numărul este prim se va afișa un mesaj corespunzător.*/

package Pb3;

import java.util.Scanner;

public class Pb3_Main {

    public static int getDiv(int num) {
        int cnt = 1;

        for (int i = 1; i <= num / 2; i++)
            if (num % i == 0) {
                cnt++;
                System.out.print(i + " ");
            }
        System.out.println(num);

        if (cnt == 2)
            return 1; // prim
        else
            return 0; // nu e prim
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0, ePrim = 0;

        System.out.print("num: ");
        num = sc.nextInt();

        System.out.println("DIVIZORII:");
        ePrim = getDiv(num);

        if(ePrim == 1)
            System.out.println("\nNumarul e Prim");
    }
}
