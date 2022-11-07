public class Main
{ 
	public static void main(String [] args)
	{
		System.out.println("Inserire i valori richiesti per il primo rettangolo: ");
		Rettangolo rett1 = new Rettangolo();
		System.out.println("Inserire i valori richiesti per il secondo rettangolo: ");
		Rettangolo rett2 = new Rettangolo();
		System.out.println("Inserire i valori richiesti per il terzo rettangolo: ");
		Rettangolo rett3 = new Rettangolo();
		float sommaArea = 0.0F;
		float sommaPerimetro = 0.0F;
		sommaArea = rett1.area() + rett2.area() + rett3.area();
		sommaPerimetro = rett1.perimetro() + rett2.perimetro() + rett3.perimetro();
		System.out.println("La somma dei perimetri è " + sommaPerimetro + ". La somma delle aree è " + sommaArea);
		rett1.ridimensiona(20, 50);
		sommaArea = rett1.area() + rett2.area() + rett3.area();
		sommaPerimetro = rett1.perimetro() + rett2.perimetro() + rett3.perimetro();
		System.out.println("La somma dei perimetri è " + sommaPerimetro + ". La somma delle aree è " + sommaArea);
	}
}