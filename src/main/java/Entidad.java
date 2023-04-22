import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "johnwick")
public class Entidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "edad")
    private Long edad;

    /*Getters*/

    public Long getId() {
        return id;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }

    public Long getEdad(){
        return this.edad;
    }

    /*Setters*/

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    
    public void setApellido(String nuevoApellido){
        this.apellido = nuevoApellido;
    }

    public void setEdad(Long nuevoEdad){
        this.edad = nuevoEdad;
    }
}