/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Canaima
 */
public class registrodepacientes extends javax.swing.JFrame {

    /**
     * Creates new form registrodepacientes
     */
    Connection cc;
    public registrodepacientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registrodepacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        fechadenacimiento = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        tipodesangre = new javax.swing.JTextField();
        masculino = new javax.swing.JRadioButton();
        femenino = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-user-icon-32.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        fechadenacimiento.setBackground(new java.awt.Color(153, 153, 255));
        fechadenacimiento.setText("Fecha de nacimiento");
        fechadenacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fechadenacimientoFocusGained(evt);
            }
        });
        fechadenacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechadenacimientoActionPerformed(evt);
            }
        });
        getContentPane().add(fechadenacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 170, -1));

        id.setBackground(new java.awt.Color(153, 153, 255));
        id.setText("Introduce el ID del Paciente");
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFocusGained(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 210, -1));

        nombre.setBackground(new java.awt.Color(153, 153, 255));
        nombre.setText("Introduce el nombres del Paciente");
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreFocusGained(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 210, -1));

        apellido.setBackground(new java.awt.Color(153, 153, 255));
        apellido.setText("Introduce el Apellidos del Paciente");
        apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apellidoFocusGained(evt);
            }
        });
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 210, -1));

        tipodesangre.setBackground(new java.awt.Color(153, 153, 255));
        tipodesangre.setText("Tipo de Sangre del paciente");
        tipodesangre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tipodesangreFocusGained(evt);
            }
        });
        getContentPane().add(tipodesangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 210, -1));

        masculino.setBackground(new java.awt.Color(0, 0, 153));
        grupo1.add(masculino);
        masculino.setForeground(new java.awt.Color(255, 255, 255));
        masculino.setText("MASCULINO");
        getContentPane().add(masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        femenino.setBackground(new java.awt.Color(0, 0, 204));
        grupo1.add(femenino);
        femenino.setForeground(new java.awt.Color(255, 255, 255));
        femenino.setText("FEMENINO");
        getContentPane().add(femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 90, -1));

        jLabel3.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRO DE PACIENTE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRES:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("APELLIDOS:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TIPO DE SANGRE:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/38wyLT.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 350));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("High Tower Text", 2, 18)); // NOI18N
        jMenuBar1.setOpaque(false);

        jMenu2.setText("Opciones");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem4.setText("Inicio");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Pacientes");

        jMenuItem2.setText("Menu");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Consulta");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    
        sistemaprincipal sp=new sistemaprincipal();
        sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       interfaz it= new interfaz();
       it.setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        String sexo="";
        
        if(masculino.isSelected()){
        
            sexo="M";
            
        }
        if(femenino.isSelected()){
        
            sexo="F";
            
        }
        
        if(nombre.getText().isEmpty() || apellido.getText().isEmpty() || fechadenacimiento.getText().isEmpty() || tipodesangre.getText().isEmpty() || sexo.isEmpty()){
        
            JOptionPane.showMessageDialog(null,"complete los campos");
        
        }
        
        else{
            try {
                cc=DriverManager.getConnection("jdbc:mysql://localhost/proyecto","root","");
                Statement stmt=cc.createStatement();
                stmt.executeUpdate("INSERT INTO pacienteS VALUES('"+id.getText()+"','"+nombre.getText()+"','"+apellido.getText()+"','"+fechadenacimiento.getText()+"','"+tipodesangre.getText()+"','"+sexo+"')");
                JOptionPane.showMessageDialog(null,"Registro exitoso");
            } catch (SQLException ex) {
                Logger.getLogger(registrodepacientes.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"error");
            }
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fechadenacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechadenacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechadenacimientoActionPerformed

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained

        id.setText("");
    }//GEN-LAST:event_idFocusGained

    private void nombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusGained
    
        nombre.setText("");
    }//GEN-LAST:event_nombreFocusGained

    private void apellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoFocusGained
    
        apellido.setText("");
    }//GEN-LAST:event_apellidoFocusGained

    private void tipodesangreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tipodesangreFocusGained
    
        tipodesangre.setText("");
    }//GEN-LAST:event_tipodesangreFocusGained

    private void fechadenacimientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechadenacimientoFocusGained
    
        fechadenacimiento.setText("");
    }//GEN-LAST:event_fechadenacimientoFocusGained

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    
        consulta con= new consulta();
        con.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrodepacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new registrodepacientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField fechadenacimiento;
    private javax.swing.JRadioButton femenino;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField tipodesangre;
    // End of variables declaration//GEN-END:variables
}
