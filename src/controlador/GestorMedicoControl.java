package controlador;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Medico;

public class GestorMedicoControl implements ActionListener{
    
    modelo.GestorMedico medicosModelo;
    vista.ConsultarMedico consultarMedicoVista;
    modelo.GestorMedico gestormedicoModelo;
    DefaultTableModel tmodelo;
    public GestorMedicoControl(vista.ConsultarMedico consultarMedicoVista){
        this.consultarMedicoVista=consultarMedicoVista;
        medicosModelo=new modelo.GestorMedico();
        //this.consultarPacientesVista.Blistar.addActionListener(this);
    }
    @Override
    
    public void actionPerformed(ActionEvent ae) {
       
        String valor=consultarMedicoVista.Txtbusdoctor.getText();
         int parametro=0;
         
         if(consultarMedicoVista.txt_identmed.isSelected()){
          parametro=1;   
         }
         if(consultarMedicoVista.nombremed.isSelected()){   
          parametro=2;
         }
         if(consultarMedicoVista.apellidosmed.isSelected()){
          parametro=3;
         }
        
         LinkedList<modelo.Medico> medicos = null;
         String registro[]=new String [4];
         
         String []Titulos ={"Identificacionmed","Nombremed","Apellidosmed"};
         
         tmodelo=new DefaultTableModel();
         tmodelo.setColumnIdentifiers(Titulos);
         
         for(modelo.Medico p:medicos){
             registro[0]=p.getIdentificacionmed();
             registro[1]=p.getNombremed();
             registro[2]=p.getApellidomed();
             tmodelo.addRow(registro);
         }
         
         consultarMedicoVista.Tmedicos.setModel(tmodelo);
         
        /* if(e.getSource().equals(consultarMedicoVista.Blistar))
         {
             Listar(consultarMedicoVista.tbl_datos);
         }
         }*/
}
  }  
    
    
    

