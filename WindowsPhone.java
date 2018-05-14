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
public class WindowsPhone {
    private int version = 5;
    private int ram = 6;
    
    public void getDatos(){
        System.out.println("Windows Phone");
        System.out.printf("Ram:%s%n Version:%s%n",ram, version);
    }
}
