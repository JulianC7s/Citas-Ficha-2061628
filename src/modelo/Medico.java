
package modelo;


public class Medico 
{
    private String identificacionmed;
    private String nombremed;
    private String apellidomed;
  
    public Medico(String identificacionmed, String nombremed, String apellidomed){
       this.identificacionmed = identificacionmed;
       this.nombremed = nombremed;
       this.apellidomed = apellidomed;
    }
   
    public String getIdentificacionmed() {
        return identificacionmed;
    }
    public void setIdentificacionmed(String identificacionmed){
        this.identificacionmed = identificacionmed;
    }
    public String getNombremed() {
        return nombremed;
    }
    public void setNombremed(String nombremed){
        this.nombremed = nombremed;
    }
    public String getApellidomed() {
        return apellidomed;
    }
    public void setApellidomed(String apellidomed){
        this.apellidomed = apellidomed;
    }
} 
    

