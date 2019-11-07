package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class yang berfungsi layaknya simulasi tabungan.
 * 
 */
public class Tabungan {
    //Atribut
    private int saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    //Setiap method dipanggil, otomatis menampilkan sysout
    public int ambilUang(int jumlah) {
        saldo -= jumlah;
        System.out.println("Saldo Anda Sekarang :" + saldo);
        return saldo;
    }
}
