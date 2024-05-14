package Anfiteatro_2;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Galford
 */
public class Main {
    
static PlantillaTicket objPlantillaTicket = new PlantillaTicket();
static List<Ticket> listaTicket = new ArrayList<>();

public static void main(String[] args) throws AWTException {

        Scanner teclado = new Scanner(System.in);
        String valorFila;
        boolean bandInicio = false;
    
        do {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            System.out.println("Sistema de Anfiteatro");
            System.out.println("------- -- ----------");
            if (!bandInicio) {
                listaTicket = objPlantillaTicket.crearListaTickets((ArrayList<Ticket>) listaTicket);
                objPlantillaTicket.mostrarListaTickets();
            }
            System.out.println();
            System.out.println("Suma total del precio de los asientos: " + objPlantillaTicket.sumarPrecioTicket((ArrayList<Ticket>) listaTicket));
            System.out.println();
            System.out.println("Opciones del sistema: ");
            System.out.println("  1. Escriba el número de fila.");
            System.out.println("  2. Salir [E]");
            //System.out.println("Seleccione una opción: ");
            System.out.println("Ingrese el número de fila que desea visualizar: ");
            valorFila = teclado.nextLine();

            bandInicio = true;
            if (isNumero(valorFila)) {
                if ((Integer.valueOf(valorFila) > 0) && (Integer.valueOf(valorFila) <= 10)) {
                    objPlantillaTicket.mostrarFilaTicket(Integer.valueOf(valorFila) + 1);
                } else {
                    System.out.println("Número fuera de rango -> Elija otra fila.");
                    System.out.println("Presione ENTER para continuar..");
                    teclado.nextLine();
                }
            }

        } while (!valorFila.equals("E"));

    }

    public static boolean isNumero(String cad) {
        boolean resultado;
        try {
            Integer.parseInt(cad);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        }
        return resultado;
    }

}
