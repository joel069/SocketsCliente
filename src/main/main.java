/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import vista.vistaCliente;

/**
 *
 * @author fvasq
 */
public class main {

    private static vistaCliente vista;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vista = new vistaCliente();
        vista.resize(795, 455);
        vista.setResizable(false);
        vista.setVisible(true);
        vista.setTitle("CLIENTE...!!!");
    }

    public static vistaCliente getVista() {
        return vista;
    }

    public static void setVista(vistaCliente vista) {
        main.vista = vista;
    }
    
}
