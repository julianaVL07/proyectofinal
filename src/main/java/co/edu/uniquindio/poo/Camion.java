package co.edu.uniquindio.poo;

public class Camion extends Vehiculo{
    
    private double capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenosAire;
    private boolean abs;
    private int numeroEjes;
    private TipoCamion tipoCamion;
    
    public Camion(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velocidadMaxima,
            double cilindraje, Transmision transmision, Combustible combustible, double capacidadCarga,
            boolean aireAcondicionado, boolean frenosAire, boolean abs, int numeroEjes, TipoCamion tipoCamion) {
        super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosAire = frenosAire;
        this.abs = abs;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    @Override
    public String toString() {
        return "Camion: "+super.toString()+", capacidadCarga=" + capacidadCarga + ", aireAcondicionado=" + aireAcondicionado + ", frenosAire="+ frenosAire + ", abs=" + abs + ", numeroEjes=" + numeroEjes + ", tipoCamion=" + tipoCamion;
    }
    
    

}
