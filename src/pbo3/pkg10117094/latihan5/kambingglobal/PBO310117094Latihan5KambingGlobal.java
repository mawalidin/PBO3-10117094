/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan5.kambingglobal;

/**
 *
 * @author
 * NAMA                 : Muhammad Walidin 
 * KELAS                : PBO-3 
 * NIM                  : 10117094 
 * Program Deskripsi    : Program ini berisi program untuk menampilkan proses
 * variabel yang bervariabel global
 */
public class PBO310117094Latihan5KambingGlobal {

    //Variabel jumlahkambing menjadi variabel instance
        
        int jumlahKambing = 88;
        
        //Method untuk menampilkan jumlah kambing
        public void getJumlahKambing() {
            System.out.println("Jumlah kambing: " + jumlahKambing);
        }
        
        public void tambahKambing() {
            jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah Kambing setelah ditambah: " +
                    jumlahKambing);
        }
    public static void main(String[] args) {
        PBO310117094Latihan5KambingGlobal kambingSusu = new 
        PBO310117094Latihan5KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    }
    
}
