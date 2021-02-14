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
public class Input {
    String rekening;
    int pilihan1, pilihan2, pilihan3, banyak;
    boolean c = true;
    
    int count = 0, total = 0;
    
    String[] pilihan= {"","Jual sampah","Beli sampah"};
    String[] trans = {"","Tunai","Non Tunai"};
    
    Scanner in = new Scanner(System.in);
    
    void identitas(){
        System.out.print("Masukkan nama\t : ");
        String nama = in.nextLine();
        System.out.print("Masukkan alamat\t : ");
        String alamat = in.nextLine();
        System.out.print("Masukkan no.hp\t : ");
        double nomer = in.nextDouble();
        System.out.println();
    }
    void pilih(){
        for (int i = 1; i <= 2; i++){
            System.out.println(i+". "+pilihan[i]);
        }
        System.out.print("=> ");
        pilihan1 = in.nextInt();
    }
    void jenis(){
        System.out.println("\n=============================\n");
        Harga as1 = new Harga("1. Botol plastik  ",5000);
        Harga as2 = new Harga("2. Kantong plastik",2000);
        Harga as3 = new Harga("3. Sterofoam      ",4000);
        Harga as4 = new Harga("4. Sedotan        ",1000);
    }
    void pilih_jenis(){
        System.out.print("\nMasukkan pilihan anda  : ");
        pilihan2 = in.nextInt();
        System.out.print("Masukkan banyak sampah : ");
        banyak = in.nextInt();
    }
    void hitung(){
        if (pilihan2 == 1) {
            count = 5000 * banyak;
        }
        else if (pilihan2 == 2) {
            count = 2000 * banyak;
        }
        else if (pilihan2 == 3) {
            count = 4000 * banyak;
        }
        else if (pilihan2 == 4) {
            count = 1000 * banyak;
        }
    }
    void hasil(){
        if (pilihan1 == 1) {
            total = count;
            System.out.println("\nanda mendapat uang sebesar : Rp "+total);
        }
        else if (pilihan1 == 2) {
            total += count;
            System.out.println("\nanda membayar sebesar : Rp "+total);
        }
    }
    void transaksi(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n=============================\n==========Transaksi==========\n");
        for (int i = 1; i <= 2; i++) {
            System.out.println(i+". "+trans[i]);
        }
        System.out.print("=> ");
        pilihan3 = in.nextInt();
        System.out.println("\n=============================\n");
        
        if (pilihan1 == 1 && pilihan3 == 1) {
            System.out.println("Anda mendapat uang sebesar\nRp "+total+" secara tunai");
        }
        else if (pilihan1 == 1 && pilihan3 == 2) {
            System.out.print("Masukkan nomor rekening\n=> ");
            rekening = input.nextLine();
            System.out.println("\nAnda mendapat uang sebesar\nRp "+total+" secara non tunai melalui\nnomor rekening "+rekening);
        }
        else if (pilihan1 == 2 && pilihan3 == 1) {
            System.out.println("Total : Rp "+total);
            
        while(c){
            int bayar, kembalian, kurang;
            
            System.out.print("Masukkan uang anda\n=> ");
            bayar = input.nextInt();
            
            kembalian = bayar - total;
            kurang = total - bayar;
            
            if (bayar > total) {
                System.out.println("Transaksi berhasil");
                System.out.println("Kembalian Rp "+kembalian);
                c = false;
            }
            else if (bayar == total) {
                System.out.println("Transaksi berhasil");
                System.out.println("Uang pas");
                c = false;
            }
            else if (bayar < total) {
                System.out.println("Uang anda kurang Rp "+kurang);
                c = true;
            }
            else {
                System.out.println("error");
                c = true;
            }
            }
        }
        else if (pilihan1 == 2 && pilihan3 == 2) {
            System.out.print("Masukkan nomor rekening\n=> ");
            rekening = input.nextLine();
            System.out.println("\nAnda membayar sebesar\nRp "+total+" secara non tunai melalui\nnomor rekening : "+rekening);
        }
    }


}
