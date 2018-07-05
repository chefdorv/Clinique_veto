package BO;

public class Secretaire extends Personnel {

    public Secretaire() {
        // TODO Auto-generated constructor stub
    }

    public Secretaire(int codePersonnel, String nom, String prenom, String motPasse, String role, Integer sexe, boolean archive) {
        super(codePersonnel, nom, prenom, motPasse, role, sexe, archive);
        // TODO Auto-generated constructor stub
    }

    public Secretaire(String nom, String prenom, String motPasse, String role, Integer sexe, boolean archive) {
        super(nom, prenom, motPasse, role, sexe, archive);
        // TODO Auto-generated constructor stub
    }
}
