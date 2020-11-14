/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan43.gajipegawai;
import java.util.Scanner;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Menampilkan gaji pegawai
 */
public class IF110119004Latihan43GajiPegawai {
    private static double transport,tunjangan,gaji;
    private static String nama,alamat;
    static Scanner scanner = new Scanner (System.in);
    private static void inputGaji(){
    System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
    System.out.println("-------------------------");
    System.out.print("Masukan Nama Karyawan : ");
    nama = scanner.next();
    System.out.print("Alamat : ");
    alamat = scanner.next();
    System.out.print("Uang Transport : Rp. ");
    transport = scanner.nextDouble();
    System.out.print("Tunjangan : Rp. ");
    tunjangan = scanner.nextDouble();
    System.out.print("Gaji Pokok : Rp. ");
    gaji = scanner.nextDouble();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai Gaji = new GajiPegawai();
        inputGaji();
        Gaji.hitung(transport, tunjangan, gaji);
    }
    
}
