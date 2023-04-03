package com;

public class Klinik {
    public static void main(String[] args) {

        Doktah dokterUmum = new Doktah("Dokter Umum", "A");
        Doktah dokterSpesialis = new Doktah("Dokter Spesialis", "B");

        dokterUmum.ambilNomor("A001", "Rita", "dr. Budi", "Dokter Umum");
        dokterUmum.ambilNomor("A002", "Kiki", "dr. Siti", "Dokter Umum");
        dokterSpesialis.ambilNomor("B001", "Ika", "dr. Mimi", "Dokter THT");

        dokterUmum.panggilanKlinik();
        dokterSpesialis.panggilanKlinik();
        dokterSpesialis.ambilNomor("B002", "Fikri", "dr. Kiki", "Dokter Penyakit Dalam");
    }
}
