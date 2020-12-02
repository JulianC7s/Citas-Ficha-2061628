
package modelo;


public class Consultorio 
{
    private String consultorioconsul;
    private String nombreconsul;

  
    public Consultorio(String consultorioconsul, String nombreconsul){
       this.consultorioconsul = consultorioconsul;
       this.nombreconsul = nombreconsul;
    }
   
    public String getConsultorioconsul() {
        return consultorioconsul;
    }
    public void setConsultorioconsul(String consultorioconsul){
        this.consultorioconsul = consultorioconsul;
    }
    public String getNombreconsul() {
        return nombreconsul;
    }
    public void setNombreconsul(String nombreconsul){
        this.nombreconsul = nombreconsul;
    }
} 
