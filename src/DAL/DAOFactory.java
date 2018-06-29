package DAL;

public class DAOFactory {
    public static PersonnelsDAO getPersonnelsDAO() {
        return new DAL.jdbc.PersonnelDAOjdbcImpl();
    }
}