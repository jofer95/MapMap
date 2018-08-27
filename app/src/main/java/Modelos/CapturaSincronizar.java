package Modelos;

import java.util.ArrayList;
import java.util.List;

import codeandoxalapa.org.mapmap.RouteCapture;
import codeandoxalapa.org.mapmap.RouteStop;

public class CapturaSincronizar {

    private String descripcion;
    private long distancia;
    private long id;
    private String imei;
    private String numeroCamion;
    private String tipoVehiculo;
    private int capacidadVehiculo;
    private int pasajerosActual;
    private long fechaInicio;
    private long fechaFin;
    private List<Parada> paradas;

    public CapturaSincronizar() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getDistancia() {
        return distancia;
    }

    public void setDistancia(long distancia) {
        this.distancia = distancia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getNumeroCamion() {
        return numeroCamion;
    }

    public void setNumeroCamion(String numeroCamion) {
        this.numeroCamion = numeroCamion;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCapacidadVehiculo() {
        return capacidadVehiculo;
    }

    public void setCapacidadVehiculo(int capacidadVehiculo) {
        this.capacidadVehiculo = capacidadVehiculo;
    }

    public int getPasajerosActual() {
        return pasajerosActual;
    }

    public void setPasajerosActual(int pasajerosActual) {
        this.pasajerosActual = pasajerosActual;
    }

    public long getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(long fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public long getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(long fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(List<Parada> paradas) {
        this.paradas = paradas;
    }

    public CapturaSincronizar ModeloSincronizar(RouteCapture capture){
        CapturaSincronizar capturaSincronizar = new CapturaSincronizar();
        capturaSincronizar.descripcion = capture.description;
        capturaSincronizar.distancia = capture.distance;
        capturaSincronizar.id = capture.id;
        capturaSincronizar.imei = capture.imei;
        capturaSincronizar.numeroCamion = capture.notes;
        capturaSincronizar.tipoVehiculo = capture.vehicleType;
        capturaSincronizar.capacidadVehiculo = Integer.valueOf(capture.vehicleCapacity);
        capturaSincronizar.pasajerosActual = capture.totalPassengerCount;
        capturaSincronizar.fechaInicio = capture.startTime;
        capturaSincronizar.fechaFin = capture.stopTime;
        List<Parada> paradas = new ArrayList<>();
        for(RouteStop obj : capture.stops){
            Parada parada = new Parada();
            parada.setLatitud(obj.location.getLatitude());
            parada.setLongitud(obj.location.getLongitude());
            parada.setParadaSeñalizada(obj.signalStop);
            parada.setHoraPartida(obj.departureTime);
            parada.setHoraLlegada(obj.arrivalTime);
            parada.setAbordados(obj.board);
            parada.setDesabordados(obj.alight);
            paradas.add(parada);
        }
        capturaSincronizar.paradas = paradas;
        return capturaSincronizar;

    }
}
