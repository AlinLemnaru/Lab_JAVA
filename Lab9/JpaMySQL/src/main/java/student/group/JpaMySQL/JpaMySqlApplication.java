package student.group.JpaMySQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Comentati modul pe care nu il doriti 

//JPA

/*@SpringBootApplication
public class JpaMySqlApplication implements CommandLineRunner {
    @Autowired
    MasinaJpaRepository repository;

    public static void displayMeniu() {
        System.out.println(
                """
                        \na. Adaugarea unei masini
                        b. Stergerea unei masini dupa numarul de inmatriculare
                        c. Cautarea unei masini dupa numarul de inmatriculare
                        d. Extragerea unei liste a tuturor masinilor
                        e. Numarul de masini cu o anumita marca
                        f. Numarul de masini cu mai putin de 100.000 km
                        g. Extragerea unei liste cu masini mai noi de 5 ani
                        q. Iesire
                        """
        );
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaMySqlApplication.class, args);
    }

    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);

        char optiune;

        while (true) {
            displayMeniu();
            System.out.print("Optiunea dvs: ");
            optiune = sc.next().charAt(0);

            switch (optiune) {
                case 'a':
                    System.out.println("\n\n### Adaugarea unei masini ###\n");

                    Masina masina = new Masina();

                    System.out.print("nr_inm: ");
                    sc.nextLine();
                    masina.setNr_inm(sc.nextLine());
                    System.out.print("marca: ");
                    masina.setMarca(sc.nextLine());
                    System.out.print("an: ");
                    masina.setAn(sc.nextInt());
                    System.out.print("culoare: ");
                    sc.nextLine();
                    masina.setCuloare(sc.nextLine());
                    System.out.print("nr_km: ");
                    masina.setNr_km(sc.nextInt());

                    System.out.println("Adaugare: " + repository.insert(masina));

                    break;
                case 'b':
                    System.out.println("\n\n### Stergerea unei masini dupa numarul de inmatriculare ###\n");

                    String nr_inm;

                    System.out.print("nr_inm: ");
                    sc.nextLine();
                    nr_inm = sc.nextLine();

                    System.out.println("Stergere: ");
                    repository.deleteById(nr_inm);

                    break;
                case 'c':
                    System.out.println("\n\n### Cautarea unei masini dupa numarul de inmatriculare ###\n");

                    System.out.print("nr_inm: ");
                    sc.nextLine();
                    nr_inm = sc.nextLine();

                    System.out.println("Masina gasita: " + repository.findById(nr_inm));

                    break;
                case 'd':
                    System.out.println("\n\n### Lista tuturor masinilor ###\n");

                    System.out.println("Lista:\n");
                    for (Masina m : repository.findAll())
                        System.out.println(m);

                    break;
                case 'e':
                    System.out.println("\n\n### Numarul de masini cu o anumita marca ###\n");

                    String marca;
                    int nr = 0;

                    System.out.print("marca: ");
                    sc.nextLine();
                    marca = sc.nextLine();

                    for (Masina m : repository.findAll()) {
                        if (m.getMarca().equals(marca))
                            nr++;
                    }

                    System.out.println("Numarul de masini cu marca " + marca + ": " + nr);

                    break;
                case 'f':
                    System.out.println("\n\n### Numarul de masini cu mai putin de 100.000 km ###\n");

                    nr = 0;

                    for (Masina m : repository.findAll()) {
                        if (m.getNr_km() < 100000)
                            nr++;
                    }

                    System.out.println("Numarul de masini cu mai putin de 100.000 km: " + nr);

                    break;
                case 'g':
                    System.out.println("\n\n### Lista de masini mai noi de 5 ani ###\n");

                    List<Masina> masiniNoi = new ArrayList<>();
                    int an_cautare = LocalDate.now().getYear() - 5;

                    System.out.println("Masini mai noi de 5 ani: ");
                    for (Masina m : repository.findAll())
                        if (m.getAn() >= an_cautare)
                            masiniNoi.add(m);

                    for (Masina m : masiniNoi)
                        System.out.println(m);

                    break;
                case 'q':
                    System.out.println("\n\nIesire...\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\nOptiune invalida!\n");
                    break;
            }
        }
    }
}*/

//Spring Data JPA

@SpringBootApplication
public class JpaMySqlApplication implements CommandLineRunner {
    @Autowired
    MasinaSpringDataJpaRepository repository;

    public static void displayMeniu() {
        System.out.println(
                """
                        \na. Adaugarea unei masini
                        b. Stergerea unei masini dupa numarul de inmatriculare
                        c. Cautarea unei masini dupa numarul de inmatriculare
                        d. Extragerea unei liste a tuturor masinilor
                        e. Numarul de masini cu o anumita marca
                        f. Numarul de masini cu mai putin de 100.000 km
                        g. Extragerea unei liste cu masini mai noi de 5 ani
                        q. Iesire
                        """
        );
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaMySqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);

        char optiune;

        while (true) {
            displayMeniu();
            System.out.print("Optiunea dvs: ");
            optiune = sc.next().charAt(0);

            switch (optiune) {
                case 'a':
                    System.out.println("\n\n### Adaugarea unei masini ###\n");

                    Masina masina = new Masina();

                    System.out.print("nr_inm: ");
                    sc.nextLine();
                    masina.setNr_inm(sc.nextLine());
                    System.out.print("marca: ");
                    masina.setMarca(sc.nextLine());
                    System.out.print("an: ");
                    masina.setAn(sc.nextInt());
                    System.out.print("culoare: ");
                    sc.nextLine();
                    masina.setCuloare(sc.nextLine());
                    System.out.print("nr_km: ");
                    masina.setNr_km(sc.nextInt());

                    System.out.println("Adaugare: " + repository.save(masina));

                    break;
                case 'b':
                    System.out.println("\n\n### Stergerea unei masini dupa numarul de inmatriculare ###\n");

                    String nr_inm;

                    System.out.print("nr_inm: ");
                    sc.nextLine();
                    nr_inm = sc.nextLine();

                    System.out.println("Stergere: ");
                    repository.deleteById(nr_inm);

                    break;
                case 'c':
                    System.out.println("\n\n### Cautarea unei masini dupa numarul de inmatriculare ###\n");

                    System.out.print("nr_inm: ");
                    sc.nextLine();
                    nr_inm = sc.nextLine();

                    System.out.println("Masina gasita: " + repository.findById(nr_inm));

                    break;
                case 'd':
                    System.out.println("\n\n### Lista tuturor masinilor ###\n");

                    System.out.println("Lista:\n");
                    for (Masina m : repository.findAll())
                        System.out.println(m);

                    break;
                case 'e':
                    System.out.println("\n\n### Numarul de masini cu o anumita marca ###\n");

                    String marca;

                    System.out.print("marca: ");
                    sc.nextLine();
                    marca = sc.nextLine();

                    System.out.println("Numarul de masini cu marca " + marca + ": " + repository.countByMarca(marca));

                    break;
                case 'f':
                    System.out.println("\n\n### Numarul de masini cu mai putin de 100.000 km ###\n");

                    System.out.println("Numarul de masini cu mai putin de 100.000 km: "
                            + repository.countByNr(100000));

                    break;
                case 'g':
                    System.out.println("\n\n### Lista de masini mai noi de 5 ani ###\n");

                    int an_cautare = LocalDate.now().getYear() - 5;

                    List<Masina> masiniNoi = repository.findByAnGreaterThan(an_cautare);

                    for (Masina m : masiniNoi)
                        System.out.println(m);

                    break;
                case 'q':
                    System.out.println("\n\nIesire...\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\nOptiune invalida!\n");
                    break;
            }
        }
    }
}