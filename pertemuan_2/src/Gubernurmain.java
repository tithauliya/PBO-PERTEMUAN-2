/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */

class Gubernur extends Provinsi implements ContentCreator,IbuRumahTangga,PekerjaanGubernur {

    private String namaGubernur;
    private String jenisKelamin;

    // Constructor
    public Gubernur(String namaProvinsi, int jumlahPenduduk, String namaGubernur, String jenisKelamin) {
        super(namaProvinsi, jumlahPenduduk);
        this.namaGubernur = namaGubernur;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNamaGubernur() {
        return namaGubernur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    // Implementasi interface ContentCreator
    public void membuatKonten() {
        System.out.println(namaGubernur + " sebagai content creator yang senang membuat konten di TikTok");
    }

    public void liveStreaming() {
        System.out.print( "melakukan live streaming ");
    }

    public void mendapatkanEndorse() {
        System.out.println ( "dan tentunya mendapatkan endorse produk");
    }

    // Implementasi interface IbuRumahTangga
    public void memasak() {
        System.out.println(namaGubernur + " adalah seorang ibu rumah tangga yang biasanya memasak untuk keluarga, ");
    }

    public void mengurusAnak() {
        System.out.print ( "mengurus anaknya dengan kasih sayang");
    }

    public void membersihkanRumah() {
        System.out.println( " dan sebagai ibu rumah tangga yang senang membersihkan rumah");
    }

    // Implementasi interface PekerjaanGubernur
    public void memimpin() {
        System.out.print(namaGubernur + " sedang memimpin rapat besar");
    }

    public void membuatKebijakan() {
        System.out.println("membuat kebijakan baru untuk peraturan sekolah");
    }

    public void mengawasi() {
        System.out.println(  "dan selain itu bekerja mengawasi program kerja yang telah ada");
    }
}

public class Gubernurmain {

    public static void main(String[] args) {
        Gubernur khofifah = new Gubernur(
                "Jawa Timur",
                42000000,
                "Khofifah Indar Parawansa",
                "Perempuan"
        );

        System.out.println("Nama Provinsi: " + khofifah.getNamaProvinsi());
        System.out.println("Jumlah Penduduk: " + khofifah.getJumlahPenduduk());
        System.out.println("Nama Gubernur: " + khofifah.getNamaGubernur());
        System.out.println("Jenis Kelamin: " + khofifah.getJenisKelamin());
        System.out.println("");

        // Panggil method interface
        khofifah.memimpin();
        khofifah.membuatKebijakan();
        khofifah.mengawasi();

        khofifah.membuatKonten();
        khofifah.liveStreaming();
        khofifah.mendapatkanEndorse();

        khofifah.memasak();
        khofifah.mengurusAnak();
        khofifah.membersihkanRumah();
    }
}
