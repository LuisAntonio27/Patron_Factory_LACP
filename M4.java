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
public class M4 {
    private int version = 7;
    private int ram = 8;
    
    public void getDatos(){
        System.out.println("M4");
        System.out.printf("Ram:%s%n Version:%s%n",ram, version);
    }
}
