
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


public class GestorPaciente 
{
    private static LinkedList<Paciente> pacientes =new LinkedList<Paciente>();
    
    Connection con;
     Conexion conectar = new Conexion();
     PreparedStatement pst;
    public GestorPaciente(){
        
      
    }
    
    public void RegistrarPacientes(Paciente paciente){
        
        
        try{
           con=conectar.getConnection();
           pst=con.prepareStatement("insert into pacientes values(?,?,?)");
           pst.setString(1, paciente.getIdentificacion());
           pst.setString(2, paciente.getNombres());
           pst.setString(3, paciente.getApellidos());
          // pst.setString(4, Paciente.getFechaNacimiento());
           pst.setString(4, paciente.getGenero());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Pacientes Registrados");
        }catch (SQLException ex) {
            Logger.getLogger(GestorPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        pacientes.add(paciente);
    }
    public LinkedList<Paciente> getPacientebyparametro (int parametro, String valor)throws SQLException{
     con =conectar.getConnection();
     LinkedList<Paciente> resultado=new LinkedList<Paciente>();
     String sql="";
     for(Paciente pac:pacientes)
     {
         switch(parametro){
             
             case 1: if(pac.getIdentificacion().equals(valor));
                     sql="select 'from pacientes where PacIdentificacion='"+valor+"'";
                     resultado.add(pac);
                     Statement at = con.createStatement();
                     ResultSet rs = at.executeQuery("select / from pacientes where PacIdentificacion="+valor);
                     break; 
             
             case 2: if(pac.getNombres().equals(valor));
                     sql="select 'from pacientes where PacNombres="+valor+"'";
                     resultado.add(pac);
                     break; 
             
             case 3: if(pac.getApellidos().equals(valor));
                     sql="select 'from pacientes where PacApellidos="+valor+"'";
                     resultado.add(pac);
                     break;
             
             case 4: if(pac.getGenero().equals(valor));
                     sql="select 'from pacientes where PacGenero="+valor+"'";
                     resultado.add(pac);
                     break;
        }
    }
     
     try{
    
           try (Statement st = con.createStatement() ){
               ResultSet rs=st.executeQuery(sql);
           while(rs.next()){
          
                 resultado.add(new Paciente(rs.getString("PacIdentificacion"),rs.getString("PacNombres"),rs.getString("PacApellidos"),rs.getString("PacGenero")));
      
      
             }   }
      
      
        
       }catch (SQLException e){
          
           JOptionPane.showMessageDialog(null, e.getMessage());
          
          
       }


 return resultado; 
}
} 
 

 
     

