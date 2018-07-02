package DAL.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BO.Personnel;
import BLL.BLLException;
import DAL.DALException;
import DAL.JdbcTools;
import DAL.PersonnelsDAO;

public class PersonnelDAOjdbcImpl implements PersonnelsDAO {

    private static final String sqlLogin = "SELECT Role from Personnels where Nom ='%1s' AND MotPasse = '%2s'";
    private static final String sqlRead = "SELECT * from Personnels where CodePers = %1d ";
    private static final String sqlAll = "SELECT * from Personnels";
    private static final String sqlCreate = "INSERT INTO Personnels(Nom,MotPasse,Role,Archive) VALUES (?,?,?,?)";
    private static final String sqlId = "SELECT CodePers from Personnels where Nom = '%1s' ";
    private static final String sqlUpdate = "UPDATE Personnels SET Nom = '%1s',MotPasse = '%2',Role = '%3',Archive = '%4' WHERE Personnels.CodePers = %5 ";
    private static final String sqlDelete = "delete from Personnels where role=?";

    public void connexionStatus() throws DALException {
        Connection cnx = null;
        PreparedStatement rqt = null;
        ResultSet rs = null;
        try {
            cnx = JdbcTools.getConnection();

        } catch (SQLException e) {
            throw new DALException("Connexion failed ");
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
    }

    @Override
    public String Login(String name, String password) throws DALException, BLLException {

        String role = "vide"; 
       Connection cnx = null;
        PreparedStatement rqt = null;
        ResultSet rs = null;
        try {
            cnx = JdbcTools.getConnection();
            rqt = cnx.prepareStatement(String.format(sqlLogin, name, password));
            rs = rqt.executeQuery();
            if (rs.next()) {
                role = rs.getString("Role");
            }
            if (role == "vide") {
                throw new BLLException("Nom ou Mot De Passe incorrect");
            }
        } catch (SQLException e) {

            throw new DALException("Connexion failed ");
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
        return role;
    }

    @Override
    public Personnel read(int id) throws DALException {
        Connection cnx = null;
        PreparedStatement rqt = null;
        ResultSet rs = null;
        Personnel perso = null;
        try {
            cnx = JdbcTools.getConnection();
            rqt = cnx.prepareStatement(String.format(sqlRead, id));
            rs = rqt.executeQuery();
            if (rs.next()) {
                try {
                    perso = new Personnel(rs.getInt("Code"), rs.getString("Nom"),rs.getString("Prenom"), rs.getString("Mot de passe"), rs.getString("Role"), rs.getBoolean("Archive"));
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        } catch (SQLException e) {
            throw new DALException("Connexion failed ");
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
        return perso;
    }

    @Override
    public void update(Personnel newdata) throws DALException {
        Connection cnx = null;
        PreparedStatement rqt = null;
        ResultSet rs = null;
        Personnel data = read(GetId(newdata));

        if (data != null) {
            try {
                cnx = JdbcTools.getConnection();
                rqt = cnx.prepareStatement(String.format(sqlUpdate, newdata.getNom(), newdata.getMdp(),
                        newdata.getRole(), newdata.getArchive(), GetId(newdata)));
                rqt.executeUpdate();

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
        }

    }

    @Override
    public void delete(Personnel obj) throws DALException {
        Connection cnx = null;
        PreparedStatement rqt = null;
        try {
            cnx = JdbcTools.getConnection();
            // l'intégrité référentielle s'occupe d'invalider la suppression
            // si l'article est référencé dans une ligne de commande
            rqt = cnx.prepareStatement(sqlDelete);
            rqt.setInt(1, obj.getCode());
            rqt.executeUpdate();
        } catch (SQLException e) {
            throw new DALException("Delete article failed - id=" + obj.getCode(), e);
        } finally {
            try {

                if (rqt != null){
                    rqt.close();
                }
                if(cnx!=null){
                    cnx.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    @Override
    public List<Personnel> selectAll() throws DALException, BLLException {
        Connection cnx = null;
        PreparedStatement rqt = null;
        ResultSet rs = null;
        List<Personnel> lstPerso = new ArrayList<Personnel>();
        Personnel perso = null;
        try {
            cnx = JdbcTools.getConnection();
            rqt = cnx.prepareStatement(sqlAll);
            rs = rqt.executeQuery();
            while (rs.next()) {
                try {
                    perso = new Personnel(rs.getInt("CodePers"), rs.getString("Nom"), rs.getString("Prenom"),
                            rs.getString("MotPasse"), rs.getString("Role"), rs.getBoolean("Archive"));
                    lstPerso.add(perso);
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
    public void create(Personnel data) throws DALException {
        Connection cnx = null;
        PreparedStatement rqt = null;
        ResultSet rs = null;
        try {
            cnx = JdbcTools.getConnection();
            rqt = cnx.prepareStatement(sqlCreate);
            rqt.setString(1, data.getNom());
            rqt.setString(2, data.getMdp());
            rqt.setString(3, data.getRole());
            rqt.setBoolean(4,data.getArchive());
            rqt.executeUpdate();

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
    }

    public Integer GetId(Personnel perso) throws DALException {
        Connection cnx = null;
        PreparedStatement rqt = null;
        ResultSet rs = null;
        Integer id = null;
        try {
            cnx = JdbcTools.getConnection();
            rqt = cnx.prepareStatement(String.format(sqlId, id));
            rs = rqt.executeQuery();
            if (rs.next()) {
                id = rs.getInt("CodePers");
            }

        } catch (SQLException e) {
            throw new DALException(e.getMessage());
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
        return id;
    }

}