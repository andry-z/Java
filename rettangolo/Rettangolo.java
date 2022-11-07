import java.util.scanner;

public class Rettangolo{
    Scanner in = new Scanner(System.in);
    public float base;
    public float altezza;
    public float perimetro;
    public float area;
    public void ridimensiona(newBase, newAltezza){
        System.out.println("Inserire un nuovo valore per la base: ");
        base = in.nextFloat();
        System.out.println("Inserire un nuovo valore per l'altezza: ");
        altezza = in.nextFloat();
    }
    public float perimetro(base, altezza){
        perimetro = (base+altezza)*2;
        return perimetro;
    }
    public float area(base, altezza){
        area = (base*altezza);
        return area;
    }





}