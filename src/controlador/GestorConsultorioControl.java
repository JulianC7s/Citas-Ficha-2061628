package controlador;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Consultorio;

public class GestorConsultorioControl implements ActionListener{
    
    modelo.GestorConsultorio consultoriosModelo;
    vista.ConsultarConsultorio consultarConsultorioVista;
    modelo.GestorConsultorio gestorconsultorioModelo;
    DefaultTableModel tmodelo;
    public GestorConsultorioControl(vista.ConsultarConsultorio consultarConsultorioVista){
        this.consultarConsultorioVista=consultarConsultorioVista;
        consultoriosModelo=new modelo.GestorConsultorio();
        //this.consultarPacientesVista.Blistar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String valor=consultarConsultorioVista.txt_valorconsultorio.getText();
         int parametro=0;
         
         if(consultarConsultorioVista.rdb_consultorio.isSelected()){
          parametro=1;   
         }
         if(consultarConsultorioVista.rdb_nombreconsultorio.isSelected()){   
          parametro=2;
         }
         
         LinkedList<modelo.Consultorio> consultorios = null;
         String registro[]=new String [4];
         
         String []Titulos ={"Consultorio Numero","Consultorio Nmbre"};
         
         tmodelo=new DefaultTableModel();
         tmodelo.setColumnIdentifiers(Titulos);
         
         for(modelo.Consultorio p:consultorios){
             registro[0]=p.getconsultorioN();
             registro[1]=p.getconsultorioNom();
             tmodelo.addRow(registro);
         }
         
         consultarConsultorioVista.tbl_datosconsul.setModel(tmodelo);
         
        /* if(e.getSource().equals(consultarPacienteVista.Blistar))
         {
             Listar(consultarPacienteVista.tbl_datos);
         }
         }*/
}
  }  