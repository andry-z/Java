public class Persona {
    protected String nome;
    protected String cognome;
    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    protected String stampa(){
        return "Nome: " + nome + ", Cognome: " + cognome;
    };
}