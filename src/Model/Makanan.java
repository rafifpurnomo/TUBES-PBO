package Model;

public class Makanan {
    private int id_toko;
    private String namaBarang;
    private double harga;
    private int stok;

    public Makanan(int id_toko, String namaBarang, int stok, double harga) {
        this.id_toko = id_toko;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }

    public int getId_toko() {
        return id_toko;
    }

    public void setId_toko(int id_toko) {
        this.id_toko = id_toko;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    
    
    
}
