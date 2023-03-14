public class Vettura extends Veicolo{
    private String tipologia;
    public Vettura(String targa, String modello, String marca, boolean isGuasto, String tipologia) {
        super(targa, modello, marca, isGuasto);
        this.tipologia = tipologia;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isGuasto() {
        return isGuasto;
    }

    public void setGuasto(boolean guasto) {
        isGuasto = guasto;
    }

    public void setTipologia(String tipologia){
        this.tipologia = tipologia;
    }

    public String getTipologia(){
        return this.tipologia;
    }
}
