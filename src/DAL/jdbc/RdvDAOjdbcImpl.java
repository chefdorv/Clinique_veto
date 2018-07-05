package DAL.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BO.Personnel;
import BLL.BLLException;
import BO.Rdv;
import DAL.DALException;
import DAL.JdbcTools;
import DAL.RdvDAO;
import java.util.Date;

public class RdvDAOjdbcImpl implements RdvDAO {

    private static final String sqlAll = "SELECT Animaux.NomAnimal, Clients.NomClient, Animaux.Race, Rdv.HeureRdv FROM dbo.Rdv, dbo.Clients, dbo.Animaux WHERE Rdv.CodeClient = Clients.CodeClient AND Rdv.CodeAnimal = Animaux.CodeAnimal";

    public class testRdv {
        public String NomAnimal;
        public String NomClient;
        public String Race;
        public Date HeureRdv;

        testRdv(String NomAnimal, String NomClient, String Race, Date HeureRdv){
            this.NomAnimal = NomAnimal;
            this.NomClient = NomClient;
            this.Race = Race;
            this.HeureRdv = HeureRdv;
        }
    }
    
    @Override
    public List<Object> selectAll() throws DALException, BLLException {
        Connection cnx = null;
        PreparedStatement rqt = null;
        ResultSet rs = null;
        Object[] lstRdv = new Object[]{};
        try {
            cnx = JdbcTools.getConnection();
            rqt = cnx.prepareStatement(sqlAll);
            rs = rqt.executeQuery();
            int i = 0;
            while (rs.next()) {
                try {
                    lstRdv[i] = new testRdv(rs.getString("NomAnimal"), rs.getString("NomClient"), rs.getString("Race"), rs.getDate("HeureRdv"));
                    i++;
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        } catch (SQLException e) {
            throw new DALException("Connexion failed :" + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (rqt != null) {
                    rqt.close();
                }
                if (cnx != null) {
                    cnx.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return lstPerso;
    }

    @Override
    public void insert(Rdv personnel) throws DALException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rdv read(int id) throws DALException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Rdv data) throws DALException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Rdv obj) throws DALException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
