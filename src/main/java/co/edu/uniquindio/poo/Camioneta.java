package co.edu.uniquindio.poo;

public class Camioneta extends VehiculoProvision {
    private boolean cuatroxcuatro;

    public Camioneta(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velocidadMaxima,
            double cilindraje, Transmision transmision, Combustible combustible, int numeroPasajeros, int numeroPuertas,
            int numeroBolsasAire, boolean aireAcondicionado, boolean abs, boolean camaraReversa, boolean sensorColision,
            boolean sensorTrafico, boolean asistentePermanenciaCarril, boolean velocidadCrucero, double capacidadCarga,
            boolean cuatroxcuatro) {
        super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible,
                numeroPasajeros, numeroPuertas, numeroBolsasAire, aireAcondicionado, abs, camaraReversa, sensorColision,
                sensorTrafico, asistentePermanenciaCarril, velocidadCrucero, capacidadCarga);
        this.cuatroxcuatro = cuatroxcuatro;
    }

    public boolean isCuatroxcuatro() {
        return cuatroxcuatro;
    }

    public void setCuatroxcuatro(boolean cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro;
    }

    @Override
    public String toString() {
        return "Camioneta: "+super.toString()+", cuatroxcuatro=" + cuatroxcuatro;
    }
    
    
}
