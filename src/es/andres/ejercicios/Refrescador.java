/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.andres.ejercicios;

/**
 *
 * @author Coke
 */
public class Refrescador extends Thread{
    boolean isAliva = true;
    
    public Refrescador(){
        Conexionsql sql = new Conexionsql();
    }
    
    @Override
    public void run(){
        while(isAlive){
            
        }
    }
}
