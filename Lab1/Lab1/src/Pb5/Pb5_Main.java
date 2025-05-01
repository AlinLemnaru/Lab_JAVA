/*5. Să se scrie un program care generează aleatoriu un număr întreg cuprins între 0 și 20.
Programul va determina dacă numărul aparține șirului lui Fobonacci. */

package Pb5;

import java.util.Random;

public class Pb5_Main {
    public static boolean isNumFib(int n) {
        int t1 = 0, t2 = 1, t3 = 0;

        if(n == 0)
            return true;
        while(t3 <= n){
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
            if (t3 == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = new Random().nextInt(21);
        boolean isFib = isNumFib(num);

        if(isFib == true)
            System.out.println(num + " is Fib");
        else
            System.out.println(num + " is NOT Fib");
    }
}
