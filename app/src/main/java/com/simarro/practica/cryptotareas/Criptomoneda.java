package com.simarro.practica.cryptotareas;

public class Criptomoneda {

    private String nombre;
    private String protocolo;
    private double precioAct;
    private int imagenView;

    public Criptomoneda(String nombre, String protocolo, double precioAct, int imagenView) {
        this.nombre = nombre;
        this.protocolo = protocolo;
        this.precioAct = precioAct;
        this.imagenView = imagenView;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public double getPrecioAct() {
        return precioAct;
    }

    public void setPrecioAct(double precioAct) {
        this.precioAct = precioAct;
    }

    public int getImagenView() {
        return imagenView;
    }

    public void setImagenView(int imagenView) {
        this.imagenView = imagenView;
    }

    @Override
    public String toString() {
        return "Criptomoneda{" +
                "nombre='" + nombre + '\'' +
                ", protocolo='" + protocolo + '\'' +
                ", precioAct=" + precioAct +
                ", imagenView=" + imagenView +
                '}';
    }
}
