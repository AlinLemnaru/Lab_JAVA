package student.group.bd_lab10;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarteSpringDataJpaRepository extends JpaRepository<Carte, String> {
    List<Carte> findByAutorul(String autorul);
}
