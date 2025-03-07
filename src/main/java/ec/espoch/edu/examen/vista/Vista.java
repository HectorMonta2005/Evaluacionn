/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.espoch.edu.examen.vista;

import ec.espoch.edu.examen.controlador.Controlador;

/**
 *
 * @author KARLA
 */
public class Vista extends javax.swing.JFrame {

    private Controlador controlador;
    private Listar listar;

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        this.listar = new Listar();
        this.controlador = new Controlador(this, listar);
    }

    public void respuesta(String mensaje) {
        System.out.println("Error: " + mensaje);
    }

    public String getNombre() {
        return txtNombre.getText();
    }

    public String getApellido() {
        return txtApellido.getText();
    }

    public int getEdad() {
        try {
            return Integer.parseInt(txtEdad.getText());
        } catch (Exception e) {
            System.out.println("Error: Edad no valida");
            return -1;
        }
    }
    
    public void limpiar(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        lblRegistrarPersonas = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnAlmacenar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemListarPersona = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegistrarPersonas.setText("SISTEMA DE REGISTAR PERSONAS");

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblEdad.setText("Edad");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnAlmacenar.setText("ALMACENAR");
        btnAlmacenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenarActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");

        jMenu1.setText("Listar");

        MenuItemListarPersona.setText("Listar Personas");
        MenuItemListarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemListarPersonaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemListarPersona);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtApellido)
                            .addComponent(txtEdad)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnAlmacenar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblRegistrarPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistrarPersonas)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnAlmacenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAlmacenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenarActionPerformed
        // TODO add your handling code here:
        if (controlador != null) {
            controlador.almacenar();
        } else {
            System.out.println("Error: Controlador no inicializado");
        }
    }//GEN-LAST:event_btnAlmacenarActionPerformed

    private void MenuItemListarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemListarPersonaActionPerformed
        // TODO add your handling code here:
        listar.setVisible(true);
        controlador.listarPersona();
    }//GEN-LAST:event_MenuItemListarPersonaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemListarPersona;
    private javax.swing.JButton btnAlmacenar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistrarPersonas;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
