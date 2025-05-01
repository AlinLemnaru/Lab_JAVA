package masini.group.SpringJdbcMySQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class MasinaJdbcDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Masina> findAll() {
        String sql = "select * from masini";
        return jdbcTemplate.query(sql, new MasinaMapper());
    }

    public Masina findById(String nr) {
        String sql = "select * from masini where nr_inm=?";
        return jdbcTemplate.queryForObject(sql, new MasinaMapper(), nr);
    }

    public List<Masina> findNewerCar() {
        int an_cautare = LocalDate.now().getYear() - 5;

        String sql = "select * from masini where an>=?";
        return jdbcTemplate.query(sql, new MasinaMapper(), an_cautare);
    }


    public int deleteById(String nr) {
        String sql = "delete from masini where nr_inm=?";
        return jdbcTemplate.update(sql, nr);
    }

    public int insert(Masina p) {
        String sql = "insert into masini values(?,?,?,?,?)";
        return jdbcTemplate.update(sql, p.getNr_inm(), p.getMarca(), p.getAn(), p.getCuloare(), p.getNr_km());
    }

    public int update(Masina p) {
        String sql = "update masini set marca=?,an=?,culoare=?,nr_km=? where nr_inm=?";
        return jdbcTemplate.update(sql, p.getNr_inm(), p.getMarca(), p.getAn(), p.getCuloare(), p.getNr_km());
    }
}
