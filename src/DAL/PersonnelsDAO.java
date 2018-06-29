package DAL;

import BLL.BLLException;
import BO.Personnel;

import java.util.List;

public interface PersonnelsDAO extends DAO<Personnel> {

    public List<Personnel> selectAll() throws DALException, BLLException;

    public String Login(String name, String password) throws DALException, BLLException;
}
