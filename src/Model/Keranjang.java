package Model;

public class Keranjang {
    private int id_keranjang;
    private int id_akun;
    private int id_makanan;
    private String nama_makanan;
    private int banyak_makanan;
    private double total_harga;

    public Keranjang(int id_keranjang, int id_akun, int id_makanan, String nama_makanan, int banyak_makanan, double total_harga) {
        this.id_keranjang = id_keranjang;
        this.id_akun = id_akun;
        this.id_makanan = id_makanan;
        this.nama_makanan = nama_makanan;
        this.banyak_makanan = banyak_makanan;
        this.total_harga = total_harga;
    }

    public int getId_keranjang() {
        return id_keranjang;
    }

    public void setId_keranjang(int id_keranjang) {
        this.id_keranjang = id_keranjang;
    }

    public int getId_akun() {
        return id_akun;
    }

    public void setId_akun(int id_akun) {
        this.id_akun = id_akun;
    }

    public int getId_makanan() {
        return id_makanan;
    }

    public void setId_makanan(int id_makanan) {
        this.id_makanan = id_makanan;
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public int getBanyak_makanan() {
        return banyak_makanan;
    }

    public void setBanyak_makanan(int banyak_makanan) {
        this.banyak_makanan = banyak_makanan;
    }

    public double getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(double total_harga) {
        this.total_harga = total_harga;
    }
    
    
}
