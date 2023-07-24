/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3_6;

import pkg3_6.modelo.ConexionDB;
import pkg3_6.vista.FabricaVistas;
import static pkg3_6.vista.FabricaVistas.TipoVista.APLICACION_CLIENTE;
import static pkg3_6.vista.FabricaVistas.TipoVista.APLICACION_MAESTRA;
import pkg3_6.vista.VistaAplicacionCliente;
import pkg3_6.vista.VistaAplicacionMaestra;

/**
 *
 * @author Sergio Cazares
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaVistas.crearVista(APLICACION_CLIENTE).setVisible(true);
        FabricaVistas.crearVista(APLICACION_MAESTRA).setVisible(true);
    }
    
}
