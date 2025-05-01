package masini.group.SpringJdbcMySQL;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MasinaMapper implements RowMapper<Masina> {
    @Override
    public Masina mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Masina(rs.getString("nr_inm"),
                rs.getString("marca"),
                rs.getInt("an"),
                rs.getString("culoare"),
                rs.getInt("nr_km"));
    }
}
