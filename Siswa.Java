public class Siswa {
    private String nis;
    private String nama;
    private int usia;

    private static int totalSiswa = 0;


    public Siswa(String nis, String nama, int usia) {
        this.nis = nis;
        this.nama = nama;
        this.usia = usia;
        totalSiswa++;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void tampilkanInfo() {
        System.out.println("NIS: " + this.nis + ", Nama: " + this.nama + ", Usia: " + this.usia);
    }

    public static int getTotalSiswa() {
        return totalSiswa;
    }

    public static void kurangiTotalSiswa() {
        if (totalSiswa > 0) {
            totalSiswa--;
        }
    }
}
