
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;



public class MedicoControl implements ActionListener {
    vista.RegistrarMedicos medicoVista;
    modelo.Medico medicoModelo;
    modelo.GestorMedico gestormedicoModelo;
    
    public MedicoControl(vista.RegistrarMedicos MedicoVista){
        
        this.medicoVista=medicoVista;
        gestormedicoModelo =new modelo.GestorMedico();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource().equals(medicoVista.Registrarmed)){   
        
        String identificacion=medicoVista.Txtidentificacionmed.getText();
        String nombre=medicoVista.Txtnombremed.getText();
        String apellido=medicoVista.Txtapellidomed.getText();
        }
     //medicoModelo=new modelo.Medico(identificacion, nombre, apellido);
       gestormedicoModelo.RegistrarMedicos(medicoModelo);
    }
    }
    
    /*
    if(e.getSource().equals(medicoVista.btn_nuevomed)){
        
        medicoVista.Txtidentificacionmed.setText("");
        medicoVista.Txtnombremed.setText("");
        medicoVista.Txtapellidomed.setText("");
        medicoVista.Txtidentificacionmed.requestFocus();   
    }
        
    }
} 
*/

    