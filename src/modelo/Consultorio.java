
package modelo;

import java.sql.Statement;


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

    String getConsultorioN() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getConsultorioNom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getconsultorioN() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getconsultorioNom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
