package DAL;

import BLL.BLLException;
import BO.Rdv;

import java.util.List;

public interface RdvDAO extends DAO<Rdv> {

    public List<Object> selectAll() throws DALException, BLLException;
    
    public void insert(Rdv personnel) throws DALException;

}
