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
public class Finalize {
    public void finalize(){
        System.out.println("Objek yang tidak terpakai sudah dibersihkan : ");
    }
    
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Jumlah Memori Awal : " +rt.totalMemory());
        
        Finalize obj1 = new Finalize(); //block satu
        Finalize obj2 = new Finalize(); //block dua
        Finalize obj3 = obj1; //obj3 mengembalikan nilai obj1
        obj1 = null;
        obj2 = null;
        System.out.println("Jumlah Memori yang tersedia sebelum di GC : " +rt.freeMemory());
        System.gc();
        System.out.println("Jumlah Memori Yeng Tersedia Setelah di GC : "+rt.freeMemory());
    }
}
