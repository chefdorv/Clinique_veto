/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import BLL.LoginController;

/**
 *
 * @author Administrateur
 */
public class EcranAccueil extends javax.swing.JFrame {

    /**
     * Creates new form EcranAccueil
     */
    public EcranAccueil() {
        initComponents();
    }

    public EcranAccueil(LoginController aThis) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar = new javax.swing.JMenuBar();
        menuFichier = new javax.swing.JMenu();
        menuItemDeconnexion = new javax.swing.JMenuItem();
        menuItemFermer = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuItemPriseDeRDV = new javax.swing.JMenuItem();
        menuItemGestionDesClients = new javax.swing.JMenuItem();
        menuAgenda = new javax.swing.JMenu();
        menuGestionPersonnel = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));

        menuFichier.setText("Fichier");
        menuFichier.setMargin(new java.awt.Insets(0, 5, 0, 5));

        menuItemDeconnexion.setLabel("Déconnexion");
        menuFichier.add(menuItemDeconnexion);

        menuItemFermer.setLabel("Fermer");
        menuFichier.add(menuItemFermer);

        jMenuBar.add(menuFichier);

        jMenu1.setText("Gestion des rendez-vous");
        jMenu1.setMargin(new java.awt.Insets(0, 5, 0, 5));

        menuItemPriseDeRDV.setText("Prise de rendez-vous");
        jMenu1.add(menuItemPriseDeRDV);

        menuItemGestionDesClients.setText("Gestion des clients");
        jMenu1.add(menuItemGestionDesClients);

        jMenuBar.add(jMenu1);

        menuAgenda.setLabel("Agenda");
        menuAgenda.setMargin(new java.awt.Insets(0, 5, 0, 5));
        jMenuBar.add(menuAgenda);

        menuGestionPersonnel.setLabel("Gestion du personnel");
        menuGestionPersonnel.setMargin(new java.awt.Insets(0, 5, 0, 5));
        jMenuBar.add(menuGestionPersonnel);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(EcranAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EcranAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EcranAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EcranAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EcranAccueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenu menuFichier;
    private javax.swing.JMenu menuGestionPersonnel;
    private javax.swing.JMenuItem menuItemDeconnexion;
    private javax.swing.JMenuItem menuItemFermer;
    private javax.swing.JMenuItem menuItemGestionDesClients;
    private javax.swing.JMenuItem menuItemPriseDeRDV;
    // End of variables declaration//GEN-END:variables
}
