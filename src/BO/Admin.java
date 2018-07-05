package BO;

public class Admin extends Personnel {
    public Admin() {
        // TODO Auto-generated constructor stub
    }

    public Admin(int codePersonnel, String nom, String prenom, String motPasse, String role, Integer sexe, boolean archive) {
        super(codePersonnel, nom, prenom, motPasse, role, sexe, archive);
        // TODO Auto-generated constructor stub
    }

    public Admin(String nom, String prenom, String motPasse, String role, Integer sexe, boolean archive) {
        super(nom, prenom, motPasse, role, sexe, archive);
        // TODO Auto-generated constructor stub
    }
}
