public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Paolo");
        Studente studente = new Studente("Carlo");

        saluto(persona);
        saluto(studente);
    }
    public static void saluto(Studente studente) {
        System.out.println("Ciao studente " + studente.nome);
    }

    public static void saluto(Persona persona) {
        System.out.println("Ciao persona " + persona.nome);
    }
}