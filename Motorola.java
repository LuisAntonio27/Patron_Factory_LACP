/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ico;

/**
 *
 * @author Luis
 */
public class Motorola {
    private int version = 11;
    private int ram = 12;
    
    public void getDatos(){
        System.out.println("Motorola");
        System.out.printf("Ram:%s%n Version:%s%n",ram, version);
    }
}
