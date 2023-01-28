package com.company.andrea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scontrino scontrino = new Scontrino();
        int sceltaMenu;
        int sceltaPanino = 0;
        int quantitaPanino = 0;
        double pagamento;
        double resto;
        boolean acquistoEffettuato = false;

	    Panino[] menu = {
                new Panino("1", "BigMac", 2, 6.00),
                new Panino("2", "Crispy McBacon", 2, 7.00),
                new Panino("3", "CheeseBurger", 2, 3.00),
                new Panino("4", "McChicken", 2, 5.00),
                new Panino("5", "Hamburger", 2, 2.00)
        };

        do{
            System.out.println("\n1. Visualizza menu\n2. Acquista\n3. Visualizza scontrino\n4. Pagamento\n5. Termina programma\n");
            sceltaMenu = in.nextInt();
            if(sceltaMenu == 1){
                for(int i = 0; i<5; i++){
                    System.out.println(menu[i].codice + ". " + menu[i].descrizione + " - Prezzo: " + menu[i].prezzo + "€" + " (" + menu[i].quantita + " panini disponibili)");
                }
            }else if(sceltaMenu == 2){
                System.out.println("Inserisci il codice del panino che vuoi acquistare (1-5): ");
                sceltaPanino = in.nextInt();
                System.out.println("\nInserisci la quantità di panini da acquistare: ");
                quantitaPanino = in.nextInt();

                if(sceltaPanino == 0 || quantitaPanino == 0){
                    System.out.println("Acquisto non riuscito.");
                }else if(sceltaPanino > 5){
                    System.out.println("Codice prodotto non riconosciuto.");
                } else{
                    if(quantitaPanino > menu[sceltaPanino-1].quantita){
                        System.out.println("Quantità in magazzino non sufficienti.");
                    }
                    if(quantitaPanino <= menu[sceltaPanino-1].quantita){
                        System.out.println("Acquisto effettuato.");
                        menu[sceltaPanino-1].quantita = menu[sceltaPanino-1].quantita - quantitaPanino;
                        acquistoEffettuato = true;
                        scontrino.compilaScontrino(menu[sceltaPanino-1].descrizione, quantitaPanino, menu[sceltaPanino-1].prezzo);
                    }
                }
            }else if(sceltaMenu == 3){
                if(acquistoEffettuato = true){
                    scontrino.stampaScontrino();
                }else{
                    System.out.println("Nessun acquisto effettuato.");
                }
            }else if(sceltaMenu == 4){
                System.out.println("Il totale ammonta a " + scontrino.totaleScontrino + "€. \nInserire l'importo con cui si desidera pagare: ");
                pagamento = in.nextFloat();
                if(pagamento == scontrino.totaleScontrino){
                    System.out.println("Pagamento completato.");
                    scontrino.scontrino = "";
                    scontrino.totaleScontrino = 0;
                }else if(pagamento > scontrino.totaleScontrino){
                    resto = pagamento - scontrino.totaleScontrino;
                    System.out.println("Pagamento completato. Resto: " + resto + "€.");
                    scontrino.scontrino = "";
                    scontrino.totaleScontrino = 0;
                }else if(pagamento < scontrino.totaleScontrino){
                    System.out.println("Pagamento incompleto. Importo mancante: " + (scontrino.totaleScontrino - pagamento) + "€.");
                }
            }
        }while(sceltaMenu < 5);
    }
}
