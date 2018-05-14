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
public class Android {
    private int version = 1;
    private int ram = 2;
    
    public void getDatos(){
        System.out.println("Android");
        System.out.printf("Ram:%s%n Version:%s%n",ram, version);
    }
    
}
