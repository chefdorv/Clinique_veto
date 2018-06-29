/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinique_veto;

import IHM.EcranConnexion;
import javax.swing.SwingUtilities;

/**
 *
 * @author Administrateur
 */
public class Clinique_veto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                /* **** OUVERTURE DE L'APPLI **** */
                EcranConnexion maConnection = new EcranConnexion();
                maConnection.setVisible(true);

            }
        });

    }
    
}
