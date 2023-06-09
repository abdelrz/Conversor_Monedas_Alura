/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.ImageIcon;

/**
 *
 * @author abdel
 */
public class VistaMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public VistaMenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this); // Centra la ventana
        this.setTitle("Convertour");
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/convertour.png")).getImage()); // Añade ícono a la ventana
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonCalculadora = new javax.swing.JButton();
        botonFraseIdioma = new javax.swing.JButton();
        botonMoneda = new javax.swing.JButton();
        botonDescuento = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuAcercaDe = new javax.swing.JMenuItem();
        menuDesarrollador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(5, 29, 59));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Convertour");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Conversor y herramientas para viajeros");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Challenge Conversor Oracle + Alura");

        botonCalculadora.setBackground(new java.awt.Color(163, 255, 191));
        botonCalculadora.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonCalculadora.setForeground(new java.awt.Color(5, 29, 59));
        botonCalculadora.setText("Calculadora");
        botonCalculadora.setBorder(null);
        botonCalculadora.setBorderPainted(false);
        botonCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCalculadora.setFocusPainted(false);

        botonFraseIdioma.setBackground(new java.awt.Color(163, 255, 191));
        botonFraseIdioma.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonFraseIdioma.setForeground(new java.awt.Color(5, 29, 59));
        botonFraseIdioma.setText("Frases Idiomas");
        botonFraseIdioma.setBorder(null);
        botonFraseIdioma.setBorderPainted(false);
        botonFraseIdioma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonFraseIdioma.setFocusPainted(false);

        botonMoneda.setBackground(new java.awt.Color(163, 255, 191));
        botonMoneda.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonMoneda.setForeground(new java.awt.Color(5, 29, 59));
        botonMoneda.setText("Monedas");
        botonMoneda.setBorder(null);
        botonMoneda.setBorderPainted(false);
        botonMoneda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMoneda.setFocusPainted(false);

        botonDescuento.setBackground(new java.awt.Color(163, 255, 191));
        botonDescuento.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonDescuento.setForeground(new java.awt.Color(5, 29, 59));
        botonDescuento.setText("Descuento");
        botonDescuento.setBorder(null);
        botonDescuento.setBorderPainted(false);
        botonDescuento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonDescuento.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(246, 246, 246))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonFraseIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonFraseIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(33, 33, 33))
        );

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setBorder(null);
        menuBar.setForeground(new java.awt.Color(5, 29, 59));
        menuBar.setBorderPainted(false);
        menuBar.setFocusable(false);
        menuBar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        menuArchivo.setBackground(new java.awt.Color(5, 29, 59));
        menuArchivo.setBorder(null);
        menuArchivo.setForeground(new java.awt.Color(5, 29, 59));
        menuArchivo.setText("   Archivo   ");
        menuArchivo.setBorderPainted(false);

        menuSalir.setBackground(new java.awt.Color(255, 255, 255));
        menuSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        menuSalir.setForeground(new java.awt.Color(5, 29, 59));
        menuSalir.setText("Salir");
        menuArchivo.add(menuSalir);

        menuBar.add(menuArchivo);

        menuAyuda.setBorder(null);
        menuAyuda.setForeground(new java.awt.Color(5, 29, 59));
        menuAyuda.setText("   Ayuda   ");
        menuAyuda.setBorderPainted(false);
        menuAyuda.setContentAreaFilled(false);

        menuAcercaDe.setBackground(new java.awt.Color(255, 255, 255));
        menuAcercaDe.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        menuAcercaDe.setForeground(new java.awt.Color(5, 29, 59));
        menuAcercaDe.setText("Acerca de   ");
        menuAyuda.add(menuAcercaDe);

        menuDesarrollador.setBackground(new java.awt.Color(255, 255, 255));
        menuDesarrollador.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        menuDesarrollador.setForeground(new java.awt.Color(5, 29, 59));
        menuDesarrollador.setText("Desarrollador   ");
        menuAyuda.add(menuDesarrollador);

        menuBar.add(menuAyuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonCalculadora;
    public javax.swing.JButton botonDescuento;
    public javax.swing.JButton botonFraseIdioma;
    public javax.swing.JButton botonMoneda;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JMenuItem menuAcercaDe;
    public javax.swing.JMenu menuArchivo;
    public javax.swing.JMenu menuAyuda;
    public javax.swing.JMenuBar menuBar;
    public javax.swing.JMenuItem menuDesarrollador;
    public javax.swing.JMenuItem menuSalir;
    // End of variables declaration//GEN-END:variables

}
