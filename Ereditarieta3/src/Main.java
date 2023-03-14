import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList <Veicolo> veicoli = new ArrayList<>();
        Vettura vett1 = new Vettura("AB123CD", "Panda", "Fiat", false, "Utilitaria");
        Vettura vett2 = new Vettura("EF456GH", "P1", "McLaren", false, "Sportiva");
        Motociclo moto1 = new Motociclo("IL789MN", "RS", "Aprilia", false, 50);
        Motociclo moto2 = new Motociclo("OP010QR", "Duke", "KTM", false, 125);
        Officina officina = new Officina();
        veicoli.add(vett1);
        veicoli.add(vett2);
        veicoli.add(moto1);
        veicoli.add(moto2);
        int random_int = (int)Math.floor(Math.random() * (3 - 0 + 1) + 0);
        int random_int2 = (int)Math.floor(Math.random() * (3 - 0 + 1) + 0);
        veicoli.get(random_int).setGuasto(true);
        veicoli.get(random_int2).setGuasto(true);
        for (Veicolo veicolo : veicoli) {
            if (veicolo.isGuasto()) {
                System.out.println("Veicolo guasto: " + veicolo.getTarga());
            }
        }
        for (Veicolo veicolo : veicoli) {
            System.out.println("Prezzo della riparazione del veicolo " + veicolo.targa + ": " + officina.ripara(veicolo) + "€");
        }
    }
}

