package Main;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader flux_in;
        try {
            flux_in = new BufferedReader(new InputStreamReader(new FileInputStream("trenuri.txt")));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String linie;

        Set<Tren> colectieTrenuri = new HashSet<>();

        while (true) {
            try {
                if ((linie = flux_in.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String[] parametrii = linie.split(",");

            if (parametrii[3].equals("accelerat"))
                colectieTrenuri.add(new Accelerat(Integer.parseInt(parametrii[0]),
                        Integer.parseInt(parametrii[1]),
                        LocalDate.parse(parametrii[2]), Integer.parseInt(parametrii[4]),
                        Boolean.parseBoolean(parametrii[5])));
            else
                colectieTrenuri.add(new Marfar(Integer.parseInt(parametrii[0]),
                        Integer.parseInt(parametrii[1]),
                        LocalDate.parse(parametrii[2]), parametrii[4]));
        }

        System.out.println("\nAfisare colectie trenuri:\n");
        colectieTrenuri.forEach(tren -> System.out.println(tren.toString()));

        Scanner scanner = new Scanner(System.in);
        int x;

        while (true) {
            try {
                System.out.print("\nx = ");
                x = scanner.nextInt();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("\nIntroduceti un numar!");
                scanner.nextLine();
            }
        }

        System.out.println("\nAccelerate cu numar mai mare de locuri decat " + x + ":\n");
        for (Tren tren : colectieTrenuri) {
            if (tren.getType().equals("Accelerat") && tren.getVar() > x)
                System.out.println(tren.toString());
        }

        System.out.println("Afisare ordonata:\n");
        colectieTrenuri.stream()
                .sorted((a, b) -> a.getNumarTren() > b.getNumarTren() ? 1 : -1)
                .forEach(tren -> System.out.println(tren.toString()));
    }
}
