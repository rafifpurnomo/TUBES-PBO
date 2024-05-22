package Model;

public class Toko {
    private int id_toko;
    private int id_akun;
    private String namaToko;
    private String alamatToko;

    public Toko(int id_toko, int id_akun, String namaToko, String alamatToko) {
        this.id_toko = id_toko;
        this.id_akun = id_akun;
        this.namaToko = namaToko;
        this.alamatToko = alamatToko;
    }

    public int getId_toko() {
        return id_toko;
    }

    public void setId_toko(int id_toko) {
        this.id_toko = id_toko;
    }

    public int getId_akun() {
        return id_akun;
    }

    public void setId_akun(int id_akun) {
        this.id_akun = id_akun;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getAlamatToko() {
        return alamatToko;
    }

    public void setAlamatToko(String alamatToko) {
        this.alamatToko = alamatToko;
    }
}
