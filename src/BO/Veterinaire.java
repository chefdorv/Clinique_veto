package BO;

public class Veterinaire extends Personnel{

    public Veterinaire() {
        // TODO Auto-generated constructor stub
    }


    public Veterinaire(int codePersonnel, String nom, String prenom, String motPasse, String role, Integer sexe, boolean archive) {
        super(codePersonnel, nom, prenom, motPasse, role, sexe, archive);
        // TODO Auto-generated constructor stub
    }


    public Veterinaire(String nom, String prenom, String motPasse, String role, Integer sexe, boolean archive) {
        super(nom, prenom, motPasse, role, sexe, archive);
        // TODO Auto-generated constructor stub
    }
}
