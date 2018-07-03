package DAL;
import BO.Personnel;
import DAL.jdbc.PersonnelDAOjdbcImpl;

public class DAOFactory {
    public static PersonnelsDAO getPersonnelsDAO() {
        return new DAL.jdbc.PersonnelDAOjdbcImpl();
    }
    
    public static PersonnelsDAO getPersonnelDAO(){
        return new PersonnelDAOjdbcImpl();
    }
}