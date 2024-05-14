package Anfiteatro_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Galford
 */
public class Cliente {
    
    private int idCliente;
    private String dniCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private List<Ticket> listaTicket;
    
    public Cliente(){
    }

    public Cliente(int idCliente, String dniCliente, String nombreCliente, String apellidoCliente) {
        this.idCliente = idCliente;
        this.dniCliente = dniCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
    }

    public Cliente(int idCliente, String dniCliente, String nombreCliente, String apellidoCliente, ArrayList listaTicket) {
        this.idCliente = idCliente;
        this.dniCliente = dniCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.listaTicket = listaTicket;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public List<Ticket> getListaTicket() {
        return listaTicket;
    }

    public void setListaTicket(List<Ticket> listaTicket) {
        this.listaTicket = listaTicket;
    }
    
}
