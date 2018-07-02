package IHM;

import javax.swing.SwingUtilities;

import IHM.EcranConnexion;


public class AppliTestIHM {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                /* **** OUVERTURE DE L'APPLI **** */
                EcranGestionPersonnel maConnection = new EcranGestionPersonnel();
                maConnection.setVisible(true);

            }
        });

    }

}
