/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok4;


/**
 *
 * @author MOKLET-2
 */
public class JualBeliSampahPlastik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        awal();
        
        Input data = new Input();
        
        data.identitas();
        data.pilih();
        data.jenis();
        data.pilih_jenis();
        data.hitung();
        data.hasil();
        data.transaksi();
    }
    
    static void awal(){
        System.out.println("== JUAL BELI SAMPAH PASTIK ==\n=============================\n");
    }
}
