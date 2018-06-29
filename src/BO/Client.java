package BO;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private Integer code;
    private String nom;
    private String prenom;
    private String adresse;
    private String adresse2;
    private String codePostal;
    private String ville;
    private String num;
    private String assurance;
    private String email;
    private String remarque;
    private Integer archive;

    private List<Animal> listeAnimaux;

    public Client(Integer code, String nom, String prenom, String adresse, String adresse2, String codePostal, String ville, String num, String assurance, String email, String remarque, Integer archive) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.adresse2 = adresse2;
        this.codePostal = codePostal;
        this.ville = ville;
        this.num = num;
        this.assurance = assurance;
        this.email = email;
        this.remarque = remarque;
        this.archive = archive;
    }
    public Client(String nom, String prenom, String adresse, String adresse2, String codePostal, String ville, String num, String assurance, String email, String remarque, Integer archive) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.adresse2 = adresse2;
        this.codePostal = codePostal;
        this.ville = ville;
        this.num = num;
        this.assurance = assurance;
        this.email = email;
        this.remarque = remarque;
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

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getAssurance() {
        return assurance;
    }

    public void setAssurance(String assurance) {
        this.assurance = assurance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public Integer getArchive() { return archive; }

    public void setArchive(Integer archive) {
        this.archive = archive;
    }

    public List<Animal> getListeAnimaux() {
        if (listeAnimaux == null)
            listeAnimaux = new ArrayList<Animal>();
        return listeAnimaux;
    }

    public void setListeAnimaux(List<Animal> listeAnimaux) {
        this.listeAnimaux = listeAnimaux;
    }


    public void addAnimal(Animal animal) {
        getListeAnimaux().add(animal);
    }

}
