package model.Asiento;
public class Asiento {
    public enum TipoAsiento {
        ESTANDAR,
        VIP,
        ACCESIBLE
    }

    public enum EstadoAsiento {
        LIBRE,
        RESERVADO,
        OCUPADO,
        MANTENIMIENTO
    }

    private int numAsiento;
    private char fila;
    private EstadoAsiento estadoAsiento;
    private TipoAsiento tipoAsiento;

    public Asiento(int numAsiento, char fila, EstadoAsiento estadoAsiento, TipoAsiento tipoAsiento) {
        this.numAsiento = numAsiento;
        this.fila = fila;
        this.estadoAsiento = estadoAsiento;
        this.tipoAsiento = tipoAsiento;
    }

    public Asiento() {
    }
}
