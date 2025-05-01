/*4. Să se determine cmmdc a două numere naturale, a căror valoare maximă este 30. Numerele
vor fi generate aleatoriu cu ajutorul unui obiect de tip Random și metodei nextInt(); */

package Pb4;

import java.util.Random;

public class Pb4_Main {
    public static int getCMMDC(int a, int b) {
        if (a == 0 || b == 0)
            return -10;
        int r = a % b;

        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        return b;
    }

    public static void main(String[] args) {
        int num1 = new Random().nextInt(31), num2 = new Random().nextInt(31), cmmdc = getCMMDC(num1, num2);

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        if (cmmdc == -10)
            System.out.println("\nnum1 si num2 trebuie sa fie diferite de 0");
        else
            System.out.println("\nCMMDC: " + cmmdc);
    }
}
