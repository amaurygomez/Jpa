/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Amaury Gomez
 */
public class ConectionUnit {
    private static EntityManagerFactory emf;
  
    public static EntityManagerFactory getConectionUnit(){
         emf = Persistence.createEntityManagerFactory("FacturacionPU");
      return emf;
    }
   
}
