package com.mycompany.sistem_manajemen_sekolah.Manajemen;
import java.util.ArrayList;
/**
 *
 * @author Acer GK
 */
public class Kelas {
    private String namaKelas;
    private String waliKelas;
    private ArrayList<Siswa> daftarSiswa;

    public Kelas(String namaKelas, String waliKelas) {
        this.namaKelas = namaKelas;
        this.waliKelas = waliKelas;
        this.daftarSiswa = new ArrayList<>(); 
    }

    public void tambahSiswa(Siswa siswa) {
        daftarSiswa.add(siswa);
        System.out.println("Siswa " + siswa.getNama() + " berhasil ditambahkan ke kelas " + this.namaKelas);
    }

    public void tampilkanDaftarSiswa() {
        System.out.println("Daftar siswa di kelas " + this.namaKelas + ":");
        if (daftarSiswa.isEmpty()) {
            System.out.println("Belum ada siswa yang terdaftar.");
        } else {
            for (Siswa siswa : daftarSiswa) {
                siswa.tampilkanInfo();
            }
        }
    }

    public void hapusSiswa(String nis) {
        for (Siswa siswa : daftarSiswa) {
            if (siswa.getNis().equals(nis)) {
                daftarSiswa.remove(siswa);
                Siswa.kurangiTotalSiswa(); // Kurangi total siswa saat dihapus
                System.out.println("Siswa dengan NIS " + nis + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Siswa dengan NIS " + nis + " tidak ditemukan.");
    }

    public void updateSiswa(String nis, String namaBaru, int usiaBaru) {
        for (Siswa siswa : daftarSiswa) {
            if (siswa.getNis().equals(nis)) {
                siswa.setNama(namaBaru);
                siswa.setUsia(usiaBaru);
                System.out.println("Data siswa dengan NIS " + nis + " berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Siswa dengan NIS " + nis + " tidak ditemukan.");
    }
}
