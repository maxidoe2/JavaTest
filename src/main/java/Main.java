import java.sql.*;
import java.sql.DriverManager;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main {
    
    public static void main (String[] args){

        // Crea un DataSource con las credenciales de la base de datos
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mitiendita");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
/* 
        // Crea un objeto JdbcTemplate para realizar operaciones con la base de datos
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // Ejecuta una consulta y muestra los resultados
        String sql = "SELECT * FROM johnwick";
        jdbcTemplate.query(sql, (rs, rowNum) -> rs.getInt("id") + ", " + rs.getString("nombre") + " " + rs.getString("apellido"))
                .forEach(System.out::println);
*/
        // crear un objeto
       
       
        Entidad obj = new Entidad();
        obj.setNombre("Juan");
        obj.setApellido("Dominguez");
        obj.setEdad(99L);
        // crear el DAO y llamar al método insert
        JohnwickDAO dao = new JohnwickDAO();
        dao.insertar(obj);
        // verificar que el objeto se haya insertado correctamente
        Entidad obj2 = dao.get(obj.getId());
        if (obj2 == null) {
            System.out.println("Error: el objeto no se insertó correctamente");
        } else {
            System.out.println("El objeto se insertó correctamente: " + obj2);
        }


      /*   try {
            // carga el controlador JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            // establece la conexión con la base de datos
            String url = "jdbc:mysql://localhost:3306/mitiendita";
            String user = "root";
            String password = "123456";
            Connection conexion = DriverManager.getConnection(url, user, password);
        
            // hacer algo con la conexión
               // 2. Crear la sentencia SQL
               String sql = "SELECT * FROM johnwick";

               // 3. Ejecutar la sentencia SQL
               Statement sentencia = conexion.createStatement();
               ResultSet resultado = sentencia.executeQuery(sql);
   
               // 4. Recorrer los resultados
               while (resultado.next()) {
                   int id = resultado.getInt("id");
                   String nombre = resultado.getString("nombre");
                   String apellido = resultado.getString("apellido");
                   System.out.println(id + ", " + nombre + " " + apellido);
               }
   
               // 5. Cerrar la conexión y liberar recursos
               resultado.close();
               sentencia.close();
        
            conexion.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
        
        
/*
    Usuario jorge = new Usuario();
    jorge.setNombre("Jorge");
    jorge.setApellido("Quinteros");
    System.out.println(jorge.getNombre());
    jorge.setNacimiento(54, 4, 20, 22, 0, 24);
    System.out.println(jorge.getNacimiento());
*/
    }
}
