package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) count++;
        }
        return count;
    }

    public void tampilkanSemua() {
        System.out.println("--- Daftar Mahasiswa Kelas ---");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa mhs = daftarMahasiswa.get(i);
            String status = mhs.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.println((i + 1) + ". NPM: " + mhs.getNpm() + 
                               " | Nama: " + mhs.getNama() + 
                               " | Nilai: " + mhs.getNilai() + 
                               " [" + status + "]");
        }
    }

    public int getJumlahData() { 
        return daftarMahasiswa.size(); 
    }
}