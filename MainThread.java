// Tyasastri Hning Kurniasih - L0325034
// Praktikum 9
// Kegiatan 1: Membuat Thread Dasar (Extends Thread)

package Praktikum9;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("Program Utama Dimulai...");
        
        PekerjaCetak pekerja1 = new PekerjaCetak("Thread-A");
        PekerjaCetak pekerja2 = new PekerjaCetak("Thread-B");
        
        // PENTING: Gunakan start(), BUKAN run()
        pekerja1.start();
        pekerja2.start();
        
        System.out.println("Program Utama Selesai Mengeksekusi Baris Terakhir.");
    }
}
