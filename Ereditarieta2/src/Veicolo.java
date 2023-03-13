public class Veicolo {
    protected String targa;
    protected String modello;
    protected String marca;
    protected boolean isGuasto;

    public Veicolo(String targa, String modello, String marca, boolean isGuasto){
        this.targa = targa;
        this.modello = modello;
        this.marca = marca;
        this.isGuasto = isGuasto;
    }

    public String getTarga(){
        return this.targa;
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
}
