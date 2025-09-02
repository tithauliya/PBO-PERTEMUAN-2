/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2;

/**
 *
 * @author HP
 */
public class Provinsi {
    private String namaProvinsi;
    private int jumlahPenduduk;

    // Constructor
    public Provinsi(String namaProvinsi, int jumlahPenduduk) {
        this.namaProvinsi = namaProvinsi;
        this.jumlahPenduduk = jumlahPenduduk;
    }

    // Getter
    public String getNamaProvinsi() {
        return namaProvinsi;
    }

    public int getJumlahPenduduk() {
        return jumlahPenduduk;
    }
}
