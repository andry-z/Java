import java.util.Scanner;

public class TestLampadina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lampadina lamp = new Lampadina();
        lamp.inizializza();
        do{
            System.out.println("Click rimanenti: " + lamp.maxClicks);
            System.out.println("1. Click\n2. Stato\n3. Termina");
            int scelta = in.nextInt();
            switch(scelta){
                case 1:
                    lamp.click();
                    break;
                case 2:
                    lamp.stato();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }while(!lamp.stato.equals("Rotta"));
        System.out.println("La lampadina si é rotta.");
    }
}