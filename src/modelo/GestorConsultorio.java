
package modelo;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import recursos.Conexion;


public class GestorConsultorio 
{
    private static LinkedList<Consultorio> consultorios =new LinkedList<Consultorio>();
    
    Connection con;
     Conexion conectar = new Conexion();
     PreparedStatement pst;
    public GestorConsultorio(){
        
      
    
    }
    
     public void RegistrarConsultorios(Consultorio consultorio){
        
        
        try{
           con=conectar.getConnection();
           pst=con.prepareStatement("insert into consultorios values(?,?,?)");
           pst.setString(1, consultorio.getConsultorioN());
           pst.setString(2, consultorio.getConsultorioNom());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Consultorios Registrados");
        }catch (SQLException ex) {
            Logger.getLogger(GestorConsultorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        consultorios.add(consultorio);
    }
    public LinkedList<Consultorio> getConsultoriobyparametro (int parametro, String valor)throws SQLException{
     con =conectar.getConnection();
     LinkedList<Consultorio> resultado=new LinkedList<Consultorio>();
     String sql="";
     for(Consultorio con:consultorios)
     {
         switch(parametro){
             
             case 1: if(con.getConsultorioN().equals(valor));
                     sql="select 'from consultorio where ConConsultorioN='"+valor+"'";
                     resultado.add(con);
                     Statement at = con.createStatement();
                     ResultSet rs = at.executeQuery("select / from pacientes where PacIdentificacion="+valor);
                     break; 
             
             case 2: if(con.getConsultorioNom().equals(valor));
                     sql="select 'from consultorios where ConConsultorioNom="+valor+"'";
                     resultado.add(con);
                     break; 
             
        }
    }
     
     try{
    
           try (Statement st = con.createStatement() ){
               ResultSet rs=st.executeQuery(sql);
           while(rs.next()){
          
                 resultado.add(new Consultorio(rs.getString("ConConsultorioN"),rs.getString("ConConsultorioNom")));
      
      
             }   }
      
      
        
       }catch (SQLException e){
          
           JOptionPane.showMessageDialog(null, e.getMessage());
          
          
       }


 return resultado; 
}

    public LinkedList<Paciente> getConsultoriobyParametro(int parametro, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
