package student.group.JpaMySQL;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface MasinaSpringDataJpaRepository extends JpaRepository<Masina, String> {
    List<Masina> findByAnGreaterThan(int an_cautare);
    int countByMarca(String marca);
    @Query("SELECT COUNT(m) FROM Masina m WHERE m.nr_km < :nr")
    int countByNr(@Param("nr") int nr);
}
