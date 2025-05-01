package student.group.bd_lab10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;
import java.util.Optional;

@Controller
public class CarteWebController {
    @Autowired
    private CarteSpringDataJpaRepository repository;

    @GetMapping("/lista-carti")
    public String listaCarti(Model model) {
        model.addAttribute("str", "Lista cartilor preluate prin repository");
        model.addAttribute("lista", repository.findAll());
        return "carti";
    }

    @PostMapping("/operatii")
    public String operatii(
            @RequestParam(required = false) String isbn,
            @RequestParam(required = false) String titlul,
            @RequestParam(required = false) String autorul,
            @RequestParam(required = false) String adauga,
            @RequestParam(required = false) String modifica,
            @RequestParam(required = false) String sterge,
            @RequestParam(required = false) String filtreaza,
            Model model) {

        String mesaj = "";

        if (adauga != null) {
            if (!Objects.equals(isbn, "") && !Objects.equals(titlul, "") && !Objects.equals(autorul, "")) {
                repository.save(new Carte(isbn, titlul, autorul));
                mesaj = "Adaugare realizata cu succes!";
                model.addAttribute("lista", repository.findAll());
            } else {
                mesaj = "Adaugarea nu se realizeaza dacă nu completati toate caracteristicile!";
                model.addAttribute("lista", repository.findAll());
            }
        } else if (modifica != null) {
            Optional<Carte> carteOpt = repository.findById(isbn);
            if (carteOpt.isPresent() && !Objects.equals(titlul, "") && !Objects.equals(autorul, "")) {
                Carte carte = carteOpt.get();
                carte.setTitlul(titlul);
                carte.setAutorul(autorul);
                repository.save(carte);
                mesaj = "Cartea cu ISBN-ul " + isbn + " a fost modificata!";
                model.addAttribute("lista", repository.findAll());
            } else {
                mesaj = "Nu se gaseste nicio carte cu ISBN-ul introdus. Completati toate campurile corect!";
                model.addAttribute("lista", repository.findAll());
            }
        } else if (sterge != null) {
            if (repository.existsById(isbn)) {
                repository.deleteById(isbn);
                mesaj = "Cartea cu ISBN-ul " + isbn + " a fost stearsa!";
                model.addAttribute("lista", repository.findAll());
            } else {
                mesaj = "Nu se gaseste nicio carte cu ISBN-ul introdus.";
                model.addAttribute("lista", repository.findAll());
            }
        } else if (filtreaza != null) {
            if (autorul != null && !autorul.isEmpty()) {
                model.addAttribute("lista", repository.findByAutorul(autorul));
                mesaj = "Cartile urmatoare apartin autorului " + autorul + ".";
            } else {
                model.addAttribute("lista", repository.findAll());
                mesaj = "Toate cartile au fost afisate.";
            }
        }

        model.addAttribute("str", mesaj);
        return "carti";
    }
}
