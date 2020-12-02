
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


public class GestorMedico 
{
    private static LinkedList<Medico> pacientes =new LinkedList<Medico>();
    
    Connection con;
     Conexion conectar = new Conexion();
     PreparedStatement pst;
    public GestorMedico(){
        
      
    }
    
    public void RegistrarMedicos(Medico medico){
        
        
        try{
           con=conectar.getConnection();
           pst=con.prepareStatement("insert into medicos values(?,?,?)");
           pst.setString(1, medico.getIdentificacionmed());
           pst.setString(2, medico.getNombremed());
           pst.setString(3, medico.getApellidomed());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Medicos Registrados");
        }catch (SQLException ex) {
            Logger.getLogger(GestorMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        pacientes.add(medico);
    }
    public LinkedList<Medico> getMedicobyparametro (int parametro, String valor)throws SQLException{
     con =conectar.getConnection();
     LinkedList<Medico> resultado=new LinkedList<Medico>();
     String sql="";
        Iterable<Medico> medicos = null;
     for(Medico med:medicos)
     {
         switch(parametro){
             
             case 1: if(med.getIdentificacionmed().equals(valor));
                     sql="select 'from pacientes where MedIdentificacionmed='"+valor+"'";
                     resultado.add(med);
                     Statement at = con.createStatement();
                     ResultSet rs = at.executeQuery("select / from medicos where MedIdentificacionmed="+valor);
                     break; 
             
             case 2: if(med.getNombremed().equals(valor));
                     sql="select 'from medicos where MedNombresmed="+valor+"'";
                     resultado.add(med);
                     break; 
             
             case 3: if(med.getApellidomed().equals(valor));
                     sql="select 'from pacientes where MedApellidosmed="+valor+"'";
                     resultado.add(med);
                     break;
             
        }
    }
     
     try{
    
           try (Statement st = con.createStatement() ){
               ResultSet rs=st.executeQuery(sql);
           while(rs.next()){
          
                 resultado.add(new Medico(rs.getString("MedIdentificacionmed"),rs.getString("MedNombremed"),rs.getString("MedApellidomed")));
      
      
             }   }
      
      
        
       }catch (SQLException e){
          
           JOptionPane.showMessageDialog(null, e.getMessage());
          
          
       }


 return resultado; 
}

    public LinkedList<Medico> getmedicobyParametro(int parametro, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
    

