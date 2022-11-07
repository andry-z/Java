import java.util.scanner;

public class Rettangolo{
    Scanner in = new Scanner(System.in);
    
    public Rettangolo(){
        public float base = 0.0F;
        public float altezza = 0.0F;
        public float perimetro = 0.0F;
        public float area = 0.0F;
    }

    System.out.println("Inserire un valore per la base: ");
    base = in.nextFloat();
    System.out.println("Inserire un valore per l'altezza: ");
    altezza = in.nextFloat();

    public void ridimensiona(float newBase, float newAltezza){
        base = newBase;
        altezza = newAltezza;
    }
    public float perimetro(){
        perimetro = (base+altezza)*2;
        return perimetro;
    }
    public float area(){
        area = (base*altezza);
        return area;
    }
}