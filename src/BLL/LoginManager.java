package BLL;

import BO.Personnel;
import DAL.DALException;
import DAL.DAOFactory;
import DAL.PersonnelsDAO;

import java.util.List;

public class LoginManager {
    private PersonnelsDAO daoPersonnels;
    private List<Personnel> listePersonnels;
    private static LoginManager instance = null;

    private LoginManager() throws BLLException {
        daoPersonnels = DAOFactory.getPersonnelsDAO();
        // Charger la liste de personnels
        try {
            listePersonnels = daoPersonnels.selectAll();
        } catch (DALException e) {
            throw new BLLException("Echec du chargement de la liste des personnels - ", e);
        }
    }

    public static LoginManager getInstance() throws BLLException {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }

    public Personnel getPersonnel(int codePers) throws BLLException {

        return listePersonnels.get(codePers);
    }

    public List<Personnel> getListePersonnels() throws BLLException {
        return listePersonnels;
    }
}
