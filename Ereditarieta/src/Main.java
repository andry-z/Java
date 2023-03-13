public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        Dipendente dip1 = new Dipendente("Pippo", "Baudo", "1/1/1900", 5000);
        Dipendente dip2 = new Dipendente("Mario", "Rossi", "1/2/1900", 7000);
        Dipendente dip3 = new Dipendente("Paola", "Bianchi", "1/3/1900", 1000);
=======
        Dipendente dip1 = new Dipendente("Pippo", "Baudo", "1/1/1900", 5100);
        Dipendente dip2 = new Dipendente("Mario", "Rossi", "2/2/1950", 7800);
        Dipendente dip3 = new Dipendente("Paola", "Bianchi", "3/1/2000", 1250);
>>>>>>> 6d235f49cb6d95d7d7b0f55d6b638a9744d729e5
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