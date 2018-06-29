/**
 *
 */
package BO;

import java.util.ArrayList;
import java.util.List;

public class AppliTestBO {

    public static void main(String[] args) {
        try {
            //********************************
            // tester la gestion des clients
            //********************************

            List<Client> clients = null;
            clients = new ArrayList<Client>();
            System.out.println("\nREM : Affichage d'un client ");
            System.out.println("---------------------------------------------------------------");


            // Ajout des clients à la liste.
            clients.add(new Client(1, "Chef'hoat", "Ewalentin", "Rue du test", "Rue du test", "35850", "Gévezé", "0705235698", "assurance", "machin@chepa.com", "no comment", 1));
            clients.add(new Client(2, "Waterman", "WOBGreen", "Waterman Orion Bille vert", "Rue du test", "35850", "Gévezé", "0705235698", "assurance", "machin@chepa.com", "no comment", 1));

            System.out.println("---------------------------------------------------------------");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
