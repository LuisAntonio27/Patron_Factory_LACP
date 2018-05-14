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
public class iPhone {
    private int version = 3;
    private int ram = 4;
    
    public void getDatos(){
        System.out.println("iPhone");
        System.out.printf("Ram:%s%n Version:%s%n",ram, version);
    }
}
