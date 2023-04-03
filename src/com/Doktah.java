package com;

import java.util.LinkedList;
import java.util.Queue;

public class Doktah {
  private Queue<com.Patient> antrian = new LinkedList<>();
  private String jenisDokter;
  private String kodeDokter;

  public Doktah(String jenisDokter, String kodeDokter) {
    this.jenisDokter = jenisDokter;
    this.kodeDokter = kodeDokter;
  }

  public void ambilNomor(String nomor, String nama, String namaDokter, String jenisDokter) {
    Patient pasien = new Patient(nomor, nama, namaDokter, jenisDokter);
    antrian.add(pasien);
    System.out.println("Anda adalah pasien " + jenisDokter);
    System.out.println("Anda menunggu " + (antrian.size() - 1) + " orang lagi");
  }

  public void panggilanKlinik() {
    if (!antrian.isEmpty()) {
      Patient pasien = antrian.remove();
      System.out.println("Nomor " + pasien.getNomor() + " dengan nama " + pasien.getNama() + " untuk dokter "
          + pasien.getNamaDokter() + ", pasien " + pasien.getJenisDokter() + " silahkan ke ruang periksa");
    }
  }

  public String getJenisDokter() {
    return jenisDokter;
  }

  public String getKodeDokter() {
    return kodeDokter;
  }
}
