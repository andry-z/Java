public class Main {
    public static void main(String[] args) {
        Dipendente dip1 = new Dipendente("Pippo", "Baudo", "1/1/1900", 5000);
        Dipendente dip2 = new Dipendente("Mario", "Rossi", "1/2/1900", 7000);
        Dipendente dip3 = new Dipendente("Paola", "Bianchi", "1/3/1900", 1000);
        if(dip1.guadagnaPiuDi(dip2)){
            if(dip1.guadagnaPiuDi(dip3)){
                if(dip2.guadagnaPiuDi(dip3)){
                    System.out.println(dip3.stampa() + "\n" + dip2.stampa() + "\n" + dip1.stampa());
                }else{
                    System.out.println(dip2.stampa() + "\n" + dip3.stampa() + "\n" + dip1.stampa());
                }
            }else{
                System.out.println(dip2.stampa() + "\n" + dip1.stampa() + "\n" + dip3.stampa());
            }
        }
    }
}