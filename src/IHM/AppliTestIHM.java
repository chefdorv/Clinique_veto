package IHM;

import javax.swing.SwingUtilities;

import IHM.EcranConnexion;


public class AppliTestIHM {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                /* **** OUVERTURE DE L'APPLI **** */
                EcranAccueil maConnection = new EcranAccueil();
                maConnection.setVisible(true);

            }
        });

    }

}
