package Anfiteatro_2;

/**
 *
 * @author Galford
 */
public class Ticket {

    private int numeroTicket;
    private int filaTicket;
    private int asientoTicket;
    private String fechaCompraTicket;
    private String fechaValidezTicket;
    private int precioTicket;
    private Cliente objCliente;
    
    public Ticket() {
    }
 
    public Ticket(int numeroTicket, int filaTicket, int asientoTicket, String fechaCompraTicket, String fechaValidezTicket, int precioTikect, Cliente objCliente) {
        this.numeroTicket = numeroTicket;
        this.filaTicket = filaTicket;
        this.asientoTicket = asientoTicket;
        this.fechaCompraTicket = fechaCompraTicket;
        this.fechaValidezTicket = fechaValidezTicket;
        this.precioTicket = precioTikect;
        
        this.objCliente = objCliente;
        
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public int getFilaTicket() {
        return filaTicket;
    }

    public void setFilaTicket(int filaTicket) {
        this.filaTicket = filaTicket;
    }

    public int getAsientoTicket() {
        return asientoTicket;
    }

    public void setAsientoTicket(int asientoTicket) {
        this.asientoTicket = asientoTicket;
    }

    public String getFechaCompraTicket() {
        return fechaCompraTicket;
    }

    public void setFechaCompraTicket(String fechaCompraTicket) {
        this.fechaCompraTicket = fechaCompraTicket;
    }

    public String getFechaValidezTicket() {
        return fechaValidezTicket;
    }

    public void setFechaValidezTicket(String fechaValidezTicket) {
        this.fechaValidezTicket = fechaValidezTicket;
    }

    public int getPrecioTicket() {
        return precioTicket;
    }

    public void setPrecioTicket(int precioTicket) {
        this.precioTicket = precioTicket;
    }

    public Cliente getObjCliente() {
        return objCliente;
    }

    public void setObjCliente(Cliente objCliente) {
        this.objCliente = objCliente;
    }
    
    @Override
    public String toString() {
        return String.valueOf(numeroTicket) + "  " 
                          + "F:" + String.valueOf(filaTicket) + "  " 
                          + "A:" + String.valueOf(asientoTicket) + "  "
                          + "FC:" + fechaCompraTicket + "  " 
                          + "FV:" + fechaValidezTicket + "  " 
                          + "P:" + String.valueOf(precioTicket);
    }

    /*@Override
    public String toString() {
        return "Ticket{" + "numeroTicket=" + numeroTicket + ", filaTicket=" + filaTicket + ", asientoTicket=" + asientoTicket + ", fechaCompraTicket=" + fechaCompraTicket + ", fechaValidezTicket=" + fechaValidezTicket + ", precioTicket=" + precioTicket + ", objCliente=" + objCliente + '}';
    }*/

}
