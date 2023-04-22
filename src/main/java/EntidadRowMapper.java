import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EntidadRowMapper<T> implements RowMapper<Entidad> {

    @Override
    public Entidad mapRow(ResultSet rs, int rowNum) throws SQLException {
        Entidad entidad = new Entidad();
        entidad.setId(rs.getLong("id"));
        entidad.setNombre(rs.getString("nombre"));
        entidad.setApellido(rs.getString("apellido"));
        entidad.setEdad(rs.getLong("edad"));
        return entidad;
    }

}
