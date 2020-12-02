
package modelo;

public class Paciente 
{
    private String identificacion;
    private String nombres;
    private String apellidos;
   // private String fechaNacimiento;
    private String genero;
    
   public Paciente(String identificacion, String nombres, String apellidos, String genero){
       this.identificacion = identificacion;
       this.nombres = nombres;
       this.apellidos = apellidos;
    //   this.fechaNacimiento = fechaNacimiento;
       this.genero = genero;
    }
   
     
   
    public String getIdentificacion() {
        return identificacion;
    }
    public void setidentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    public String getNombres() {
        return nombres;
    }
    public void setnombres(String nombres){
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setapellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public String getFechaNacimiento() {
        return apellidos;
    }
    // public void setaFechaNacimiento(String FechaNacimiento){
    //    this.fechaNacimiento = fechaNacimiento;
    // }
    public String getGenero() {
        return genero;
    }
    public void setgenero(String genero){
        this.genero = genero;
    }
}   
