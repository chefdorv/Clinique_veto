/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BLL.BLLException;
import BLL.LoginManager;
import BO.Personnel;
import IHM.EcranAccueil;

import javax.swing.*;
import java.util.List;
import IHM.EcranConnexion;
import java.awt.TextField;
import java.util.List;

public class LoginController {
    
    private EcranConnexion ecranConnexion;
    
    private EcranAccueil ecranAccueil;
    private int indexListe;

    private LoginManager manager;

    private List<Personnel> listePersonnels;

    private static LoginController instance;

    private boolean isPresent;

    private Personnel persoConnected;

    //Constructeur
    private LoginController() {
        try {
            manager = LoginManager.getInstance();

            //Initialisation du catalogue en mémoire
            listePersonnels = manager.getListePersonnels();

        } catch (BLLException e) {
            e.printStackTrace();
        }
    }

    public static synchronized LoginController get() {
        if (instance == null) {
            instance = new LoginController();
        }
        return instance;
    }

    public void startApp() {
        ecranConnexion = new EcranConnexion(this);
        ecranConnexion.setVisible(true);
    }


    public void connexion(JTextField txtNom, JPasswordField mdp) throws BLLException {
        System.out.println(txtNom.getText());
        System.out.println(mdp.getText());

        isPresent = false;
        for (Personnel personne : listePersonnels) {

            if (personne.getNom().equals(txtNom.getText()) && personne.getMdp().equals(mdp.getText())) {
                isPresent = true;
                persoConnected = personne;
                break;
            }
        }
        if (isPresent) {
            System.out.println("ok");

            ecranAccueil = new EcranAccueil(persoConnected);
            ecranAccueil.setVisible(true);
            ecranConnexion.setVisible(false);
        } else
            System.out.println("wrong credentials");
    }

    public void deconnexion() {
        ecranConnexion = new EcranConnexion(this);
        ecranAccueil.setVisible(false);
        ecranConnexion.setVisible(true);
    }
}
