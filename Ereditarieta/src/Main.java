public class Main {
    public static void main(String[] args) {
        Dipendente dip1 = new Dipendente("Pippo", "Baudo", "1/1/1900", 5100);
        Dipendente dip2 = new Dipendente("Mario", "Rossi", "2/2/1950", 7800);
        Dipendente dip3 = new Dipendente("Paola", "Bianchi", "3/1/2000", 1250);
        if(dip1.guadagnaPiuDi(dip2)){
            if(dip2.guadagnaPiuDi(dip3)){
                System.out.println(dip3.stampa());
                System.out.println(dip1.stampa());
                System.out.println(dip2.stampa());
            }else{
                if(dip1.guadagnaPiuDi(dip3)){
                    System.out.println(dip3.stampa());
                    System.out.println(dip2.stampa());
                    System.out.println(dip1.stampa());
                }else{
                    System.out.println(dip2.stampa());
                    System.out.println(dip3.stampa());
                    System.out.println(dip1.stampa());
                }
            }
        }else{
            if(dip1.guadagnaPiuDi(dip3)){
                System.out.println(dip3.stampa());
                System.out.println(dip1.stampa());
                System.out.println(dip2.stampa());
            }else{
                if(dip2.guadagnaPiuDi(dip3)){
                    System.out.println(dip1.stampa());
                    System.out.println(dip3.stampa());
                    System.out.println(dip2.stampa());
                }else{
                    System.out.println(dip1.stampa());
                    System.out.println(dip2.stampa());
                    System.out.println(dip3.stampa());
                }
            }
        }
    }
}