/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.andres.ejercicios;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Coke
 */
public class Refrescador extends Thread{
   // boolean isAliva = true;
    
    public Refrescador(){
        Conexionsql sql = new Conexionsql();
    }
    
    @Override
    public void run(){
        //while(isAlive){
        
        try {
            Conexionsql sql = new Conexionsql();
            int contador = 0;
            while(contador>0){
                sleep(10);
                sql.leermensajes();
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Refrescador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Refrescador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Refrescador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
