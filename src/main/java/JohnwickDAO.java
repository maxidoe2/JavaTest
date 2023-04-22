import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.ResultSetExtractor;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.core.JdbcTemplate;


@Repository
public class JohnwickDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Entidad> listar() {
        String sql = "SELECT * FROM johnwick";
        List<Entidad> entidades = jdbcTemplate.query(sql, new EntidadRowMapper());
        return entidades;
    }

    public Entidad obtenerPorId(Long id) {
        String sql = "SELECT * FROM johnwick WHERE id = ?";
        Entidad entidad = jdbcTemplate.query(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setLong(1, id);
                return ps;
            }
        }, new ResultSetExtractor<Entidad>() {
            public Entidad extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                if (resultSet.next()) {
                    Entidad entidad = new Entidad();
                    entidad.setId(resultSet.getLong("id"));
                    entidad.setNombre(resultSet.getString("nombre"));
                    entidad.setApellido(resultSet.getString("apellido"));
                    entidad.setEdad(resultSet.getLong("edad"));
                    return entidad;
                }
                return null;
            }
        });

        return entidad;
    }

    public void insertar(Entidad entidad) {
        if (entidad == null) {
            throw new IllegalArgumentException("La entidad no puede ser nula");
        }
        String sql = "INSERT INTO johnwick (nombre, apellido, edad) VALUES (?, ?, ?)";
        if (jdbcTemplate != null) {
            jdbcTemplate.update(sql, entidad.getNombre(), entidad.getApellido(), Long.valueOf(entidad.getEdad()));
        } else {
            throw new NullPointerException("jdbcTemplate es nulo");
        }
    }
    

    public void actualizar(Entidad entidad) {
        String sql = "UPDATE johnwick SET nombre = ?, apellido = ?, edad = ? WHERE id = ?";
        jdbcTemplate.update(sql, entidad.getNombre(), entidad.getApellido(), entidad.getEdad(), entidad.getId());
    }

    public void eliminar(Long id) {
        String sql = "DELETE FROM johnwick WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
    public Entidad get(Long id) {
        String sql = "SELECT * FROM johnwick WHERE id = ?";
        Object[] params = new Object[]{id};
        try {
            return jdbcTemplate.queryForObject(sql, params, new EntidadRowMapper<Entidad>() {
                public Entidad mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Entidad entidad = new Entidad();
                    entidad.setId(rs.getLong("id"));
                    entidad.setNombre(rs.getString("nombre"));
                    entidad.setApellido(rs.getString("apellido"));
                    return entidad;
                }
            });
        } catch (DataAccessException e) {
            // Handle exception
            return null;
        }
        
    }
}
    
