// Tyasastri Hning Kurniasih - L0325034
// Praktikum 9
// Kegiatan 2: Membuat Thread dengan Interface Runnable

package Praktikum9;

public class TugasDownload implements Runnable {
    private String namaFile;

    public TugasDownload(String namaFile) {
        this.namaFile = namaFile;
    }

    @Override
    public void run() {
        System.out.println("Mulai mengunduh: " + namaFile);
        try {
            Thread.sleep(2000); // Simulasi waktu unduh 2 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Selesai mengunduh: " + namaFile);
    }
}
