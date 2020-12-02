package controlador;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;

public class GestorPacienteControl implements ActionListener{
    
    modelo.GestorPaciente pacientesModelo;
    vista.ConsultarPaciente consultarPacienteVista;
    modelo.GestorPaciente gestorpacienteModelo;
    DefaultTableModel tmodelo;
    public GestorPacienteControl(vista.ConsultarPaciente consultarPacienteVista){
        this.consultarPacienteVista=consultarPacienteVista;
        pacientesModelo=new modelo.GestorPaciente();
        //this.consultarPacientesVista.Blistar.addActionListener(this);
    }
    @Override
    
    public void actionPerformed(ActionEvent e){
        
        String valor=consultarPacienteVista.txt_valor.getText();
         int parametro=0;
         
         if(consultarPacienteVista.rdb_identificacion.isSelected()){
          parametro=1;   
         }
         if(consultarPacienteVista.rdb_nombres.isSelected()){   
          parametro=2;
         }
         if(consultarPacienteVista.rdb_apellidos.isSelected()){
          parametro=3;
         }
         if(consultarPacienteVista.rdb_genero.isSelected()){
          parametro=4;
         }
         
         LinkedList<modelo.Paciente> pacientes = null;
         String registro[]=new String [4];
         
         String []Titulos ={"Identificacion","Nombre","Apellidos","Genero"};
         
         tmodelo=new DefaultTableModel();
         tmodelo.setColumnIdentifiers(Titulos);
         
         for(modelo.Paciente p:pacientes){
             registro[0]=p.getIdentificacion();
             registro[1]=p.getNombres();
             registro[2]=p.getApellidos();
            // registro[3]=p.getFechaNacimiento();
             registro[3]=p.getGenero();
             tmodelo.addRow(registro);
         }
         
         consultarPacienteVista.tbl_datos.setModel(tmodelo);
         
        /* if(e.getSource().equals(consultarPacienteVista.Blistar))
         {
             Listar(consultarPacienteVista.tbl_datos);
         }
         }*/
}
  }  
