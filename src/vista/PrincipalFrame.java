
package vista;


public class PrincipalFrame extends javax.swing.JFrame {

    
    public PrincipalFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Registrar = new javax.swing.JMenuItem();
        Consultar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        RegistrarMedicos = new javax.swing.JMenuItem();
        ConsultarMedicos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Registrar2Consultorios = new javax.swing.JMenuItem();
        ConsultarConsultorios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion De Citas");
        setName("Principal"); // NOI18N

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        Salir.setText("Salir");
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pacientes");

        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jMenu2.add(Registrar);

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });
        jMenu2.add(Consultar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Medicos");

        RegistrarMedicos.setText("Registrar");
        RegistrarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarMedicosActionPerformed(evt);
            }
        });
        jMenu3.add(RegistrarMedicos);

        ConsultarMedicos.setText("Consultar");
        ConsultarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarMedicosActionPerformed(evt);
            }
        });
        jMenu3.add(ConsultarMedicos);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultorios");

        Registrar2Consultorios.setText("Registrar");
        jMenu4.add(Registrar2Consultorios);

        ConsultarConsultorios.setText("Consultar");
        jMenu4.add(ConsultarConsultorios);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        RegistrarPaciente ventana =new RegistrarPaciente();
        this.Escritorio.add(ventana);
        ventana.show();
    }//GEN-LAST:event_RegistrarActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        ConsultarPaciente ventana1 =new ConsultarPaciente();
        this.Escritorio.add(ventana1);
        ventana1.show();
    }//GEN-LAST:event_ConsultarActionPerformed

    private void RegistrarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarMedicosActionPerformed
        RegistrarMedicos ventana2 =new RegistrarMedicos();
        this.Escritorio.add(ventana2);
        ventana2.show();
    }//GEN-LAST:event_RegistrarMedicosActionPerformed

    private void ConsultarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarMedicosActionPerformed
        ConsultarMedico ventana3 =new ConsultarMedico();
        this.Escritorio.add(ventana3);
        ventana3.show();
    }//GEN-LAST:event_ConsultarMedicosActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Consultar;
    private javax.swing.JMenuItem ConsultarConsultorios;
    private javax.swing.JMenuItem ConsultarMedicos;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem Registrar;
    private javax.swing.JMenuItem Registrar2Consultorios;
    private javax.swing.JMenuItem RegistrarMedicos;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
