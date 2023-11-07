package com.example.ekWateur.testTech;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class ClientParticulier extends Client implements ClientEkwateur {

    private static final double VAR_KWH_ELECTRICITY_PART = 0.133 ;
    private static final double VAR_KWH_GAZ_PART = 0.108;
    private String civilite;
    private String nom;
    private String prenom;

    public ClientParticulier(String civilite, String nom, String prenom, double consommationElectricite, double consommationGaz) {
        super(consommationElectricite, consommationGaz);
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public double calculerMontantFacture() {


        double montantElectricite = consommationElectricite * VAR_KWH_ELECTRICITY_PART;
        double montantGaz = consommationGaz * VAR_KWH_GAZ_PART;

        return montantElectricite + montantGaz;
    }
}
