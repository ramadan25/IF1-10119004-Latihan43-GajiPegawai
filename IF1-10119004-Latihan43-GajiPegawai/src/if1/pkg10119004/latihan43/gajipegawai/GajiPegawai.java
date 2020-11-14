/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan43.gajipegawai;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Menampilkan gaji pegawai
 */
class GajiPegawai {
     private double total;
     
     public void hitung(double transport,double tunjangan,double gaji){ 
       total = transport + tunjangan + gaji;
       tampil();
   }
     private void tampil(){
        System.out.println("======Gaji Total======");
        System.out.println("TOTAL GAJI\t\t\t: Rp. " + total);
        System.out.println("(Developed by : Muhamad Ramadan)");
       
   }
    
}
