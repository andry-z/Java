package com.company.andrea;

public class Scontrino{
    String scontrino = "";
    double totale;
    double totaleScontrino;
    int quantita;
    String quantitaStringa;
    public void compilaScontrino(String descrizione, int quantita, double prezzo){
        totale = prezzo * quantita;
        totaleScontrino = totaleScontrino + totale;
        this.quantita = quantita;
        quantitaStringa = String.valueOf(quantita);
        scontrino = scontrino + "\n" + quantitaStringa + " " + descrizione + " - " + totale + "€";
    }

    public void stampaScontrino(){
        System.out.println(scontrino + "\n\nTotale: " + totaleScontrino + "€");
    }
}
