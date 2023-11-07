package com.example.ekWateur;


import com.example.ekWateur.testTech.ClientParticulier;
import com.example.ekWateur.testTech.ClientPro;
import com.example.ekWateur.testTech.ClientEkwateur;

public class EkWateurApplication {

    public static void main(String[] args) {
        ClientEkwateur clientPro = new ClientPro("47852256", "Enreprise",1400000, 5000, 3000);
        ClientEkwateur clientParticulier = new ClientParticulier( "M.", "Dupont", "Pierre", 3000, 2000);

        double montantFacturePro = clientPro.calculerMontantFacture();
        double montantFactureParticulier = clientParticulier.calculerMontantFacture();

        System.out.println("Montant facture client Pro : " + montantFacturePro + " €");
        System.out.println("Montant facture client Particulier : " + montantFactureParticulier + " €");

    }
}
