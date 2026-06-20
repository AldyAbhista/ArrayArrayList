package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {
        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Beras");
        belanja.add("Minyak");
        belanja.add("Gula");
        belanja.add("Telur");
        belanja.remove(1);
        System.out.println("Isi Belanja: " + belanja + " | Jumlah: " + belanja.size());

        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(70); 
        nilai.add(95); 
        nilai.add(60); 
        nilai.add(88); 
        nilai.add(75);
        int max = nilai.get(0);
        for (int n : nilai) {
            if (n > max) max = n;
        }
        System.out.println("\nNilai terbesar: " + max);

        ArrayList<String> nama = new ArrayList<>();
        String[] data = {"Andi", "Budi", "Ayu", "Citra", "Adit", "Doni"};
        for (String d : data) {
            nama.add(d);
        }
        System.out.println("\nNama yang diawali huruf A:");
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}