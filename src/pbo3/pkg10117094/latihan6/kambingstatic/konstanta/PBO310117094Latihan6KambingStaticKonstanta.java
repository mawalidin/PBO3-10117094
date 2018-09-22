/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan6.kambingstatic.konstanta;

/**
 *
 * @author 
 * NAMA                 : Muhammad Walidin 
 * KELAS                : PBO-3 
 * NIM                  : 10117094 
 * Program Deskripsi    : Program ini berisi program untuk menampilkan proses
 * variabel yang bervariabel static & konstanta
 */
public class PBO310117094Latihan6KambingStaticKonstanta {
  
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";

    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " 
                            + Mamalia.jumlahKambing);
    }
    
}
