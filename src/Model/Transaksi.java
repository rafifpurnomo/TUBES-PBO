package Model;

public class Transaksi {
    private int id_transaksi;
    private int id_akun;
    private String namaMakanan;
    private int totalPesanan; 
    private double harga;
    private String StatusPesanan;

    public Transaksi(int id_transaksi, int id_akun, String namaMakanan, int totalPesanan, double harga, String StatusPesanan) {
        this.id_transaksi = id_transaksi;
        this.id_akun = id_akun;
        this.namaMakanan = namaMakanan;
        this.totalPesanan = totalPesanan;
        this.harga = harga;
        this.StatusPesanan = StatusPesanan;
    }
    
    

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public int getId_akun() {
        return id_akun;
    }

    public void setId_akun(int id_akun) {
        this.id_akun = id_akun;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public int getTotalPesanan() {
        return totalPesanan;
    }

    public void setTotalPesanan(int totalPesanan) {
        this.totalPesanan = totalPesanan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getStatusPesanan() {
        return StatusPesanan;
    }

    public void setStatusPesanan(String StatusPesanan) {
        this.StatusPesanan = StatusPesanan;
    }
    
    
}
