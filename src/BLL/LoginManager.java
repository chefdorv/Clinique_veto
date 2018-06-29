package BLL;

import DAL.DALException;
import DAL.DAOFactory;
import DAL.PersonnelsDAO;

public class LoginManager {

    PersonnelsDAO personnelsDao;

    public LoginManager() {
        personnelsDao = DAOFactory.getPersonnelsDAO();
    }

    public String Login(String name, String password) throws Exception {
        String role = "vide";
        try {
            FieldVerif.VerifPersoName(name);
            FieldVerif.VerifPersoPassword(password);

            role = personnelsDao.Login(name, password);

        } catch (DALException | BLLException e) {
            // TODO Auto-generated catch block

            throw e;
        }
        return role;
    }


}