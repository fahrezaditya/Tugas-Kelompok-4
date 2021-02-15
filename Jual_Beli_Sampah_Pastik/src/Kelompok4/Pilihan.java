/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok4;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Pilihan {
    void jualBeli(){
        Scanner scan = new Scanner(System.in);
        boolean tanya = true;
        
        while (tanya){
            Input data = new Input();
            awal();
            data.identitas();
            data.pilih();
            data.jenis();
            data.pilih_jenis();
            data.hitung();
            data.hasil();
            data.transaksi();
            System.out.println("\n=============================\n");
            System.out.println("Apakah ingin melakukan transaksi ulang ?");
            System.out.print("('Ya' untuk lanjut, 'Tidak' untuk keluar)\n=> ");
            String jawab = scan.nextLine();
            
            if(jawab.equalsIgnoreCase("Ya")){
                System.out.println("\n\n");
                tanya = true;
            }
            else{
                tanya = false;
            }
        }
    }
    static void awal(){
        System.out.println("== JUAL BELI SAMPAH PASTIK ==\n=============================\n");
    }
    
}
