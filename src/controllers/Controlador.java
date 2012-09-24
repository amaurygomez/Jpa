/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.PreexistingEntityException;
import entities.Clientes;
import Vist.AgreeClient;
import Vist.ViewClients;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;

/**
 *
 * @author Amaury Gomez
 */
public class Controlador{

   
    private static ClientesJpaController controller = new ClientesJpaController(ConectionUnit.getConectionUnit());
    
    public Controlador(){
    
    }
    
    public static void agregar(){
        
      
        Clientes cliente = new Clientes();
        int azar=(int)(Math.random()*10);
   
        cliente.setNombre(AgreeClient.getVentana().getNombre().getText().toString());
        cliente.setApellido(AgreeClient.getVentana().getApellido().getText().toString());
        cliente.setCedula("12");
       cliente.setId(new Integer(azar++));
        try {
            controller.create(cliente);
        } catch (PreexistingEntityException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
