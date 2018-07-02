package BO;

public class Personnel {
    private Integer code;
    private String nom;
    private String prenom;
    private String mdp;
    private String role;
    private Boolean archive;

    public Personnel() {
    }

    public Personnel(Integer code, String nom, String prenom, String mdp, String role, Boolean archive) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.role = role;
        this.archive = archive;
    }

    public Personnel(String nom, String prenom, String mdp, String role, Boolean archive) {
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.role = role;
        this.archive = archive;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
        public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String Prenom) {
        this.prenom = prenom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    @Override
    public String toString() {
        return "Personnels [CodePerso=" + code + ", Nom=" + nom + ", Prenom=" + prenom + ", MotPasse=" + mdp + ", Role=" + role
                + ", Archive=" + archive + "]";
    }

    // ------------------------S'authentifier----------------------
    public String Authentifier(String nom, String mdp) {
        // methode BDD_authentifier
        return role;
    }
}
