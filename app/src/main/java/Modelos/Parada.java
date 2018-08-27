package Modelos;

public class Parada {

    private double latitud;
    private double longitud;
    private boolean paradaSeñalizada;
    private long horaLlegada;
    private long horaPartida;
    private int desabordados;
    private int abordados;

    public Parada() {
    }


    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public boolean isParadaSeñalizada() {
        return paradaSeñalizada;
    }

    public void setParadaSeñalizada(boolean paradaSeñalizada) {
        this.paradaSeñalizada = paradaSeñalizada;
    }

    public long getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(long horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public long getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(long horaPartida) {
        this.horaPartida = horaPartida;
    }

    public int getDesabordados() {
        return desabordados;
    }

    public void setDesabordados(int desabordados) {
        this.desabordados = desabordados;
    }

    public int getAbordados() {
        return abordados;
    }

    public void setAbordados(int abordados) {
        this.abordados = abordados;
    }
}
