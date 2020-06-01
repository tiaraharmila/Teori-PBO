/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_teori;

/**
 *
 * @author User
 */
public class WrapperClass {
    public static void main(String[] args) {
        Integer i = new Integer (1000);
        Character c = new Character('T');
        Byte by = new Byte ("100");
        Short s = new Short ("10");
        Long l = new Long (1000);
        Boolean bol = new Boolean (true);
        Float f = new Float(99.17);
        Double d = new Double(89.99);
        
        System.out.println("Integer   : " +i);
        System.out.println("Character : " +c);
        System.out.println("Byte      : " +by);
        System.out.println("Short     : " +s);
        System.out.println("Long      : " +l);
        System.out.println("Boolean   : " +bol);
        System.out.println("Float     : " +f);
        System.out.println("Double    : " +d);
    }
    
}
