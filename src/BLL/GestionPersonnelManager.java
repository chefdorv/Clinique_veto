/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BO.Personnel;
import DAL.DALException;
import DAL.DAOFactory;
import DAL.PersonnelsDAO;
import java.util.List;

/**
 *
 * @author epenanchoat2017
 */
public class GestionPersonnelManager {
    
    private PersonnelsDAO daoPersonnels;
    private List<Personnel> listePersonnels;
    private static GestionPersonnelManager instance = null;

    public GestionPersonnelManager() throws BLLException {
        daoPersonnels = DAOFactory.getPersonnelDAO();
        // Charger la liste de personnels
        try {
            listePersonnels = daoPersonnels.selectAll();
        } catch (DALException e) {
            throw new BLLException("Echec du chargement de la liste des personnels - ", e);
        }
    }
    
     public static GestionPersonnelManager getInstance() throws BLLException {
        if (instance == null) {
            instance = new GestionPersonnelManager();
        }
        return instance;
    }
     
         public Personnel getPersonnel(int codePers) throws BLLException {

        return listePersonnels.get(codePers);
    }

    public List<Personnel> getListePersonnels() throws BLLException {
        return listePersonnels;
    }

    public void addPersonnel(Personnel personnel) throws BLLException {

        //validerPersonnel(personnel);

        try {
            daoPersonnels.insert(personnel);
        } catch (DALException e) {
            throw new BLLException("Erreur lors de l'insertion en BDD du personnel.");
        }

    }
    
}
