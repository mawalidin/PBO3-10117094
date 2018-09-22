/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan4.kambing;

/**
 *
 * @author 
 * NAMA                 : Muhammad Walidin 
 * KELAS                : PBO-3 
 * NIM                  : 10117094 
 * Program Deskripsi    : Program ini berisi program untuk menampilkan variabel
 * kambing yang setelah ditambah
 */
public class PBO310117094Latihan4Kambing {

    public void tambahKambing() {
    //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + 
                jumlahKambing);
    }

    
    public static void main(String[] args) {
        PBO310117094Latihan4Kambing kambingJantan = new 
         PBO310117094Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
