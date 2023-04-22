import java.util.Date;
import java.util.Calendar;

public class Usuario {
    private String nombre;
    private String apellido;
    private Integer dni;
    private String pais;
    private Date nacimiento;


public Usuario(String nombre, String apellido, Integer dni, String pais, Date nacimiento){
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.pais = pais;
    this.nacimiento = nacimiento;
}

public Usuario(){   /* inicializa constructor desde cero */

}

public String getNombre(){
    return this.nombre;
}

public String getApellido(){
    return this.apellido;
}

public Integer getDni(){
    return this.dni;
}

public String getPais(){
    return this.pais;
}

public Date getNacimiento(){
    return this.nacimiento;
}

public void setNombre(String nuevoNombre){
    this.nombre = nuevoNombre;
}

public void setApellido(String nuevoApellido){
    this.apellido = nuevoApellido;
}

public void setDni(Integer nuevoDni){
    this.dni = nuevoDni;
}

public void setPais(String nuevoPais){
    this.pais = nuevoPais;
}

public void setNacimiento(int year, int month, int day, int hour, int minute, int second) {
    Calendar cal = Calendar.getInstance();
    cal.set(year, month - 1, day, hour, minute, second);
    this.nacimiento = cal.getTime();
}


}
