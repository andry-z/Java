public class Officina {
    public int ripara(Veicolo veicolo){
        if(veicolo.isGuasto){
            veicolo.isGuasto = false;
            if(veicolo instanceof Vettura){
                if(((Vettura) veicolo).getTipologia().equals("Utilitaria")){
                    return 500;
                }else if(((Vettura) veicolo).getTipologia().equals("Sportiva")){
                    return 2000;
                }
            }
            if(veicolo instanceof Motociclo){
                return ((Motociclo) veicolo).getCilindrata() * 10;
            }
        }else {
            return 50;
        }
        return 0;
    }
}
