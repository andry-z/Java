import java.util.Scanner;

public class Lampadina {
    public boolean accesa = false;
    String stato = "Spenta";
    Scanner in = new Scanner(System.in);
    int maxClicks;
    void inizializza(){
        System.out.println("Inserisci il numero massimo di click prima che la lampadina si rompa: ");
         maxClicks = in.nextInt();
    }

    public void stato() {
        if(accesa == false){
            stato = "Spenta";
        }else{
            stato = "Accesa";
        }
        if(maxClicks == 0){
            stato = "Rotta";
        }
        System.out.println("\n" + stato + "\n");
    }

    public void click(){
        if(stato == "Accesa" || stato == "Spenta"){
            if(accesa == false){
                accesa = true;
            }else{
                accesa = false;
            }
            maxClicks = maxClicks - 1;
        }else{
            System.out.println("La lampadina é rotta!");
        }

    }
}
