public class Motociclo extends Veicolo{
    private int cilindrata;
    public Motociclo(String targa, String modello, String marca, boolean isGuasto, int cilindrata) {
        super(targa, modello, marca, isGuasto);
        this.cilindrata = cilindrata;
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

    public void setCilindrata(int cilindrata){
        this.cilindrata = cilindrata;
    }

    public int getCilindrata(){
        return this.cilindrata;
    }
}
