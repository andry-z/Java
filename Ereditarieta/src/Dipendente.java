public class Dipendente extends Persona{
    private String dataAssunzione;
    private double stipendio;
    public Dipendente(String nome, String cognome, String dataAssunzione, double stipendio) {
        super(nome, cognome);
        this.dataAssunzione = dataAssunzione;
        this.stipendio = stipendio;
    }
    public boolean guadagnaPiuDi(Dipendente dipendente){
        if(this.stipendio > dipendente.stipendio){
            return true;
        }else{
            return false;
        }
    }
    @Override
    protected String stampa(){
        return "Nome: " + nome + ", Cognome: " + cognome + ", Data assunzione: " + dataAssunzione + ", Stipendio: " + String.valueOf(this.stipendio);
    }

}
