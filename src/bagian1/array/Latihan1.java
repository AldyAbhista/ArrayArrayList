package bagian1.array;

public class Latihan1 {
    public static void main(String[] args) {
        int[] nilai = new int[5]; // [cite: 61]
        nilai[0] = 80; // [cite: 62]
        nilai[1] = 75; // [cite: 63]
        nilai[2] = 90; // [cite: 65]
        nilai[3] = 60; // [cite: 66]
        nilai[4] = 85; // [cite: 70]

        String[] nama = {"Andi", "Budi", "Citra"}; // [cite: 72]

        System.out.println("Nilai pertama: " + nilai[0]); // [cite: 73]
        System.out.println("Nilai ketiga : " + nilai[2]); // [cite: 74]
        System.out.println("Mahasiswa ke-2: " + nama[1]); // [cite: 75]
        System.out.println("Jumlah nilai: " + nilai.length); // [cite: 76]
    }
}