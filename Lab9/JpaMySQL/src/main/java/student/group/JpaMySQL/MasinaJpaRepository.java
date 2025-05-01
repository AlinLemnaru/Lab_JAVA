package student.group.JpaMySQL;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class MasinaJpaRepository {
    @PersistenceContext
    EntityManager entityManager;

    public List<Masina> findAll() {
        TypedQuery<Masina> query = entityManager.createQuery("from Masina", Masina.class);
        return query.getResultList();
    }

    public Masina findById(String nr) {
        return entityManager.find(Masina.class, nr);
    }

    public void deleteById(String nr) {
        Masina masina = findById(nr);
        entityManager.remove(masina);
    }

    public Masina insert(Masina p) {
        return entityManager.merge(p);
    }

    public Masina update(Masina p) {
        return entityManager.merge(p);
    }
}