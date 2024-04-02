package Model;

public class Toko extends Penjual {
    private String namaToko;
    private String alamat;
    private Barang[] namaBarang;
    
    public Toko(){};

    public Toko(String username, String password, String nama, String noTelpon, String namaToko) {
        super(username, password, nama, noTelpon, namaToko);
    }

    @Override
    public String getNamaToko() {
        return namaToko;
    }

    @Override
    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
