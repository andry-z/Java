public class TestRettangolo
{ 
	public static void main(String [] args)
	{
		Rettangolo rett1 = new Rettangolo();
		Rettangolo rett2 = new Rettangolo();
		Rettangolo rett3 = new Rettangolo();

		System.out.println("Inserire i valori richiesti per il primo rettangolo: ");
		rett1.startRettangolo();
		System.out.println("Inserire i valori richiesti per il secondo rettangolo: ");
		rett2.startRettangolo();
		System.out.println("Inserire i valori richiesti per il terzo rettangolo: ");
		rett3.startRettangolo();

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