package Model;

public class Barang {
   private Barang[] barang;
   private String idBarang;
   private String namaBarang;
   private String jenisBarang;
   private String namaToko;
   private int harga;
   private int stokBarang;
   
   public Barang(){}

    public Barang(String idBarang, String namaBarang, String jenisBarang, int harga, int stokBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.harga = harga;
        this.stokBarang = stokBarang;
    }

    public Barang[] getBarang() {
        return barang;
    }

    public void setBarang(Barang[] barang) {
        this.barang = barang;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }   
    
    public String toString() {
        return "ID: " + idBarang+ ", Nama: " + namaBarang + ", Jenis: " + jenisBarang + ", Harga: " + harga;
    }
}
