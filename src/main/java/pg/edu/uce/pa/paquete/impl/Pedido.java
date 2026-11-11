package pg.edu.uce.pa.paquete.impl;

public class Pedido {

    private int id;
    private String cliente;
    private double monto;
    private boolean envioExpres;


    public Pedido(int id, String cliente, double monto, boolean envioExpres) {
        this.id = id;
        this.cliente = cliente;
        this.monto = monto;
        this.envioExpres = envioExpres;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getCliente() {
        return cliente;
    }


    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public double getMonto() {
        return monto;
    }


    public void setMonto(double monto) {
        this.monto = monto;
    }


    public boolean isEnvioExpres() {
        return envioExpres;
    }


    public void setEnvioExpres(boolean envioExpres) {
        this.envioExpres = envioExpres;
    }

    

    

}
