package BLL;

public class FieldVerif {
    //Verif Personnels
    public static void VerifPersoName(String name) throws BLLException {
        if (name.length() > 30) {
            throw new BLLException("Le nom est trop long, il est limité a 30 caractères");
        }
    }

    public static void VerifPersoPassword(String Password) throws BLLException {
        if (Password.length() > 10) {
            throw new BLLException(
                    "Le mot de passe est trop long, il est limité a 10 caractères");
        }
    }

    public static void VerifPersoRole(String role) throws BLLException {
        if (role.length() > 3) {
            throw new BLLException("Le role est trop long, il est limité a 3 caractères");
        }
    }

    //Verif Clients
    public static void VerifClientName(String name) throws BLLException {
        if (name.length() > 30) {
            throw new BLLException("Le nom est trop long, il est limité a 30 caractères");
        }
    }

    public static void VerifClientPrenom(String prenom) throws BLLException {
        if (prenom.length() > 30) {
            throw new BLLException("Le prénom est trop long, il est limité a 30 caractères");
        }
    }

    public static void VerifClientAdresse1(String adresse) throws BLLException {
        if(adresse.length() > 80) {
            throw new BLLException("Le prénom est trop long, il est limité a 80 caractères");
        }
    }

    public static void VerifClientAdresse2(String adresse) throws BLLException {
        if(adresse.length() > 80) {
            throw new BLLException("Le prénom est trop long, il est limité a 80 caractères");
        }
    }

    public static void VerifClientCodePostal(String codepostal) throws BLLException {
        if (codepostal.length() > 5) {
            throw new BLLException("Le code postal est trop long, il est limité a 5 caractères");
        }
    }

    public static void VerifClientVille(String ville) throws BLLException {
        if (ville.length() > 50) {
            throw new BLLException("Le code postal est trop long, il est limité a 50 caractères");
        }
    }

    public static void VerifClientNumTel(String num) throws BLLException {
        if (num.length() > 10) {
            throw new BLLException("Le numéro de téléphone est trop long, il est limité a 10 caractères");
        }
    }

    public static void VerifClientAssurance(String assurance) throws BLLException {
        if (assurance.length() > 30) {
            throw new BLLException("Le nom de l'assurance est trop long, il est limité a 30 caractères");
        }
    }

    public static void VerifClientEmail(String email) throws BLLException {
        if (email.length() > 60) {
            throw new BLLException("L'email est trop long, il est limité a 60 caractères");
        }
    }

    public static void VerifClientRemarque(String remarque) throws BLLException {
        if (remarque.length() > 60) {
            throw new BLLException("L'email est trop long, il est limité a 60 caractères");
        }
    }
}