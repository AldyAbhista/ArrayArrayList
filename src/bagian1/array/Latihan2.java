package bagian1.array; // [cite: 82]

public class Latihan2 { // [cite: 83]
    public static void main(String[] args) { // [cite: 84]
        int[] nilai = {80, 75, 90, 60, 85};

        System.out.println("== Menggunakan for =="); // [cite: 89]
        for (int i = 0; i < nilai.length; i++) { // [cite: 89]
            System.out.println("Indeks " + i + " = " + nilai[i]); // [cite: 91]
        }

        System.out.println("== Menggunakan for-each =="); // [cite: 93]
        int total = 0; // [cite: 94]
        for (int n : nilai) { // [cite: 95]
            total += n; // [cite: 97]
        }

        double rata = (double) total / nilai.length; // [cite: 98]
        System.out.println("Total: " + total); // [cite: 99]
        System.out.println("Rata-rata: " + rata); // [cite: 100]
    }
}