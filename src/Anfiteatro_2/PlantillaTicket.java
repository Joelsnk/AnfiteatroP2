package Anfiteatro_2;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Galford
 */
public class PlantillaTicket {

    Ticket objTicket;
    Cliente objCliente;
    LocalDateTime fechaHoy;
    List<Ticket> listaTicket = new ArrayList<>();
    
    public ArrayList crearListaTickets(ArrayList<Ticket> listTicket) {
        System.out.println("Crear Lista de Tickets");
        this.listaTicket = listTicket;
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                objTicket = new Ticket();
                fechaHoy = LocalDateTime.now();
                objTicket.setNumeroTicket(cont+1);
                objTicket.setFilaTicket(i+1);
                objTicket.setAsientoTicket(j+1);
                objTicket.setFechaCompraTicket(fechaHoy.getDayOfMonth()+"-"+fechaHoy.getMonthValue()+"-"+fechaHoy.getYear());
                objTicket.setFechaValidezTicket(fechaHoy.getDayOfMonth()+"-"+String.valueOf(fechaHoy.getMonthValue()+1)+"-"+fechaHoy.getYear());
                objTicket.setPrecioTicket(10 + (i * 10));
                objTicket.setObjCliente(new Cliente((cont+1),"dni"+String.valueOf(cont+1),"Nombre" + String.valueOf(cont+1),"Apellido" + String.valueOf(cont+1)));
                listaTicket.add(objTicket);
                cont++;
            }
        }
        return (ArrayList) listaTicket;
    }
    
    public void mostrarListaTickets() {
        System.out.println("Mostrar Lista de Tickets");
        listaTicket.forEach((x) -> System.out.println(x));
    }

    public int sumarPrecioTicket(ArrayList<Ticket> listTicket){
        int sumaTotal = 0;
        this.listaTicket = listTicket;
        for(Ticket ticket: listaTicket){
            sumaTotal = sumaTotal + ticket.getPrecioTicket();
        }
        /*for(int k=0; k<listaTicket.size(); k++){
            sumaTotal = sumaTotal + listaTicket.get(k).getPrecioTicket();
        }*/
        return sumaTotal;
    }
    
    public void mostrarFilaTicket(int nFila){
        int numeroFila = nFila;
        for(int l=0; l<listaTicket.size(); l++){
            if(listaTicket.get(l).getFilaTicket() == numeroFila-1){
                System.out.println(listaTicket.get(l).getNumeroTicket()
                        + "  F:" + listaTicket.get(l).getFilaTicket() 
                        + "  A:" + listaTicket.get(l).getAsientoTicket() 
                        + "  FC:" + listaTicket.get(l).getFechaCompraTicket() 
                        + "  FV:" + listaTicket.get(l).getFechaValidezTicket() 
                        + "  P:" + listaTicket.get(l).getPrecioTicket()
                        + "  C:" + listaTicket.get(l).getObjCliente().getIdCliente() + " " 
                                 + listaTicket.get(l).getObjCliente().getDniCliente() + " " 
                                 + listaTicket.get(l).getObjCliente().getNombreCliente() + " " 
                                 + listaTicket.get(l).getObjCliente().getApellidoCliente());
                //System.out.println(listaTicket.toString());
            }
        }
        /*for(Ticket ticket: listaTicket){
            if(ticket.getFilaTicket()== numeroFila){
                System.out.println(ticket.toString());
            }
        }*/
    }
    
}
