
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;



public class PacienteControl    implements ActionListener {
    vista.RegistrarPaciente pacienteVista;
    modelo.Paciente pacienteModelo;
    modelo.GestorPaciente gestorpacienteModelo;
    
    public PacienteControl(vista.RegistrarPaciente pacienteVista){
        
        this.pacienteVista=pacienteVista;
        gestorpacienteModelo =new modelo.GestorPaciente();
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(pacienteVista.btn_registrar)){
        
        String identificacion=pacienteVista.txt_identificacion.getText();
        String nombres=pacienteVista.txt_nombres.getText();
        String apellidos=pacienteVista.txt_apellidos.getText();
        SimpleDateFormat formato=new SimpleDateFormat("dd/mm/yyyy");
       //String fecha_nacimeinto=formato.format(pacienteVista.Dtd_Fecha_Nacimiento);
        String genero="";
        if(pacienteVista.rdb_masculino.isSelected()){
             genero="M";
        }
        
        if(pacienteVista.rdb_femenino.isSelected()){
            genero="F";
        }
     pacienteModelo=new modelo.Paciente(identificacion, nombres, apellidos, genero);
       gestorpacienteModelo.RegistrarPacientes(pacienteModelo);
    }
    
    if(e.getSource().equals(pacienteVista.btn_nuevo)){
        
        pacienteVista.txt_identificacion.setText("");
        pacienteVista.txt_nombres.setText("");
        pacienteVista.txt_apellidos.setText("");
       // pacienteVista.Dta_Fecha_Nacimiento.setDate(null);
        pacienteVista.rdb_masculino.setSelected(true);
        pacienteVista.rdb_femenino.setSelected(false);
        pacienteVista.txt_identificacion.requestFocus();
        
    }
        
    }
}
