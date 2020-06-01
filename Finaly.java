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
public class Finaly {
    public static void main(String[] args) {
        try{
            int ex = 10/0;
            System.out.println("Hasil : " +ex);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("Akhir Program");
        }
    }
    
}
