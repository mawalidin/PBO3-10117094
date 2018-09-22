/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117094.latihan3.memasukkannilaidarikeyboard;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA                 : Muhammad Walidin 
 * KELAS                : PBO-3 
 * NIM                  : 10117094 
 * Program Deskripsi    : Program ini berisi program untuk menampilkan nilai
 * dari keyboard
 */
public class PBO310117094Latihan3MemasukkanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " +nama);
    }
    
}
