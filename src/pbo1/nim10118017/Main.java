package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menampilkan hasil simulasi tabungan, mulai dari input saldo kemudian penarikan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tabungan tabungan;
        
        //Input data
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        
        //Menghitung dan menampilkan sisa saldo
        tabungan.ambilUang(scanner.nextInt());
        
    }
    
}
