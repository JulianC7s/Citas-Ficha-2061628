
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;



public class ConsultorioControl implements ActionListener{
    vista.RegistrarConsultorio consultorioVista;
    modelo.Consultorio consultorioModelo;
    modelo.GestorConsultorio gestorconsultorioModelo;
    
    public ConsultorioControl(vista.RegistrarConsultorio consultorioVista){
        
        this.consultorioVista=consultorioVista;
        gestorconsultorioModelo =new modelo.GestorConsultorio();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource().equals(consultorioVista.registrarConsul)){  
        
        String consultorioNumero=consultorioVista.txt_consultorio.getText();
        String consultorioNombre=consultorioVista.txt_tipconsultorio.getText();
        
        }
     //consultorioModelo=new modelo.Consultorio(consultorioNumero, ConsultorioNombre);
       gestorconsultorioModelo.RegistrarConsultorios(consultorioModelo);
    }
     }
    /*
    if(e.getSource().equals(pacienteVista.btn_nuevo)){
        
        consultorioVista.txt_consultorio.setText("");
        consultorioVista.txt_tipconsultorio.setText("");
        consultorioVista.txt_consultorio.requestFocus();
   }
        
    }
} 
*/
