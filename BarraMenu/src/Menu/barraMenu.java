package Menu;

import javax.swing.ImageIcon;

/**
 *
 * @author Mariela Nina
 */
public class barraMenu extends javax.swing.JFrame {
    public barraMenu() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Menu/icons8_menubar_20px.png")).getImage());
        this.setTitle("BARRA DE MENU");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu7 = new javax.swing.JPopupMenu();
        jPopupMenu8 = new javax.swing.JPopupMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        editar = new javax.swing.JMenu();
        abc = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        a = new javax.swing.JMenuItem();
        b = new javax.swing.JMenuItem();
        c = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenu();
        acercade = new javax.swing.JMenu();
        contenido = new javax.swing.JMenuItem();
        paleta = new javax.swing.JMenuItem();
        uso = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("barraMenu");

        archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_opened_folder_15px.png"))); // NOI18N
        archivo.setText("Archivo");
        archivo.setAlignmentX(10.0F);

        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_new_copy_15px_3.png"))); // NOI18N
        nuevo.setText("Nuevo");
        archivo.add(nuevo);

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_save_15px_2.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        archivo.add(guardar);

        jMenuBar1.add(archivo);

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_edit_15px.png"))); // NOI18N
        editar.setText("Editar");

        abc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_rich_text_converter_15px.png"))); // NOI18N
        abc.setText("ABC");
        editar.add(abc);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_windows8_tablet_15px_2.png"))); // NOI18N
        jMenu4.setText("Extra");

        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_align_text_left_15px.png"))); // NOI18N
        a.setText("A");
        jMenu4.add(a);

        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_align_text_center_15px.png"))); // NOI18N
        b.setText("B");
        jMenu4.add(b);

        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_align_text_right_15px.png"))); // NOI18N
        c.setText("C");
        jMenu4.add(c);

        editar.add(jMenu4);

        jMenuBar1.add(editar);

        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_computer_support_15px_3.png"))); // NOI18N
        ayuda.setText("Ayuda");

        acercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_info_15px.png"))); // NOI18N
        acercade.setText("Acerca de");

        contenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_bulleted_list_15px.png"))); // NOI18N
        contenido.setText("Contenido");
        acercade.add(contenido);

        paleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_color_palette_15px.png"))); // NOI18N
        paleta.setText("Paletas");
        acercade.add(paleta);

        uso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/icons8_user_manual_15px_3.png"))); // NOI18N
        uso.setText("Uso");
        acercade.add(uso);

        ayuda.add(acercade);

        jMenuBar1.add(ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(barraMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barraMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barraMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barraMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barraMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem a;
    private javax.swing.JMenuItem abc;
    private javax.swing.JMenu acercade;
    private javax.swing.JMenu archivo;
    private javax.swing.JMenu ayuda;
    private javax.swing.JMenuItem b;
    private javax.swing.JMenuItem c;
    private javax.swing.JMenuItem contenido;
    private javax.swing.JMenu editar;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu7;
    private javax.swing.JPopupMenu jPopupMenu8;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JMenuItem paleta;
    private javax.swing.JMenuItem uso;
    // End of variables declaration//GEN-END:variables
}
