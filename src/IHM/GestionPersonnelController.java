/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import IHM.Personnel.AjouterPersonnel;
import IHM.Personnel.EcranGestionPersonnel;
import BLL.GestionPersonnelManager;
import BLL.BLLException;
import BO.Personnel;
import java.util.List;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author epenanchoat2017
 */
public class GestionPersonnelController {
    
    private EcranAccueil ecranAccueil;
    private GestionPersonnelManager manager;
    private EcranGestionPersonnel ecranGestionPersonnel;
    private List<Personnel> listePersonnels;
    private static GestionPersonnelController instance;
    private AjouterPersonnel ajouterPersonnel;
    
     //Constructeur
    private GestionPersonnelController() {
        try {
            manager = GestionPersonnelManager.getInstance();

            //Initialisation du catalogue en mémoire
            listePersonnels = manager.getListePersonnels();

        } catch (BLLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Personnel> getListePersonnels() {
        return listePersonnels;
    }
    
    //Méthodes 
    public static synchronized GestionPersonnelController get() {
    if (instance == null) {
        instance = new GestionPersonnelController();
    }
    return instance;
    }
    
    /*public void affichageEcranAccueil() {
        ecranAccueil = new EcranAccueil(this);
        ecranAccueil.setVisible(true);
    }*/

    public void affichageEcranGestionPersonnel() {
        if (ecranGestionPersonnel == null)
            ecranGestionPersonnel = new EcranGestionPersonnel(this);
        ecranAccueil.add(ecranGestionPersonnel);
        ecranAccueil.revalidate();
    }
    
    public void ajouter(){
        System.out.println("ajouter");
        ajouterPersonnel = new AjouterPersonnel(this);
        
        ecranAccueil.add(ajouterPersonnel);
        
        ecranAccueil.revalidate();
    }
    
     public void ajouterPersonnel(JTextField lblNom, JTextField lblPrenom,JPasswordField mdp) {
        System.out.println("ajouterPersonnel");
        System.out.println(lblNom.getText());
        System.out.println(lblPrenom.getText());        
        System.out.println(mdp.getText());
        Personnel personne = null;
        
      
        ecranAccueil.remove(ajouterPersonnel);
        ecranAccueil.remove(ecranGestionPersonnel);
        ecranAccueil.add(ecranGestionPersonnel);

        ecranAccueil.revalidate();
     }
}
