// Nama: Muhammad Reynaldy Abhista Putra
// NPM: 2410010010
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Struktur Data", "Basis Data"};

        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(new Mahasiswa("Reynaldy", "2410010010", 88.5));
        kelas.tambahMahasiswa(new Mahasiswa("Ahmad Fauzi", "2410010011", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Siti Aminah", "2410010012", 76.5));
        kelas.tambahMahasiswa(new Mahasiswa("Rian Hidayat", "2410010013", 61.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dewi Lestari", "2410010014", 42.0));

        kelas.tampilkanSemua();
        System.out.println();

        System.out.println("Rata-rata Nilai Kelas : " + kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println("Total Mahasiswa Awal  : " + kelas.getJumlahData());
        System.out.println();

        System.out.println(">> Menambahkan 1 Mahasiswa Baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Fikri Hanafi", "2410010015", 92.0));
        System.out.println("Total Mahasiswa Terbaru: " + kelas.getJumlahData());
        System.out.println();

        kelas.tampilkanSemua();
    }
}