package com.example.ekWateur.testTech;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientPro extends Client implements ClientEkwateur {
    private static final int VAR_CA = 1000000;
    private static final double VAR_KWH_ELECTRICITY_PRO_SUP = 0.110;
    private static final double VAR_KWH_ELECTRICITY_PRO_INF = 0.112;
    private static final double VAR_KWH_GAZ_PRO_SUP = 0.123;
    private static final double VAR_KWH_GAZ_PRO_INF = 0.117;

    private String siret;
    private String raisonSociale;
    private double ca;

    public ClientPro(String siret, String raisonSociale, double ca,double consommationElectricite, double consommationGaz) {
        super(consommationElectricite, consommationGaz);
        this.siret = siret;
        this.raisonSociale = raisonSociale;
        this.ca = ca;
    }


    @Override
    public double calculerMontantFacture() {
        double prixKWhElectricite = ca > VAR_CA ? VAR_KWH_ELECTRICITY_PRO_SUP : VAR_KWH_ELECTRICITY_PRO_INF;
        double prixKWhGaz = ca > VAR_CA ? VAR_KWH_GAZ_PRO_SUP : VAR_KWH_GAZ_PRO_INF;

        double montantElectricite = consommationElectricite * prixKWhElectricite;
        double montantGaz = consommationGaz * prixKWhGaz;

        return montantElectricite + montantGaz;
    }
}
