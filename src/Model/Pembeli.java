package Model;

import Model.Toko;

public class Pembeli extends User {
    private String username;
    private String password;
    private String nama;
    private String noTelpon;
    private final String role = "pembeli";
    private int jumlahUserPembeli;
    private String penggunaAktif;
    private Keranjang[] keranjangBarang;
    private Barang[] barang;
    private Pembeli[] daftarPembeli;
    private int totalBarang, totalBelanja, MAX_KERANJANG_BARANG;
    public int index;
    
    public Pembeli(){}
    public Pembeli(String username, String password, String nama, String noTelpon) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.noTelpon = noTelpon;
        this.MAX_KERANJANG_BARANG = 10;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNoTelpon() {
        return noTelpon;
    }

    @Override
    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }

    public int getJumlahUserPembeli() {
        return jumlahUserPembeli;
    }

    public void setJumlahUserPembeli(int jumlahUserPembeli) {
        this.jumlahUserPembeli = jumlahUserPembeli;
    }

    public String getPenggunaAktif() {
        return penggunaAktif;
    }

    public void setPenggunaAktif(String penggunaAktif) {
        this.penggunaAktif = penggunaAktif;
    }
    
    public Keranjang[] getKeranjangBarang(int X) {
        return keranjangBarang;
    }

    public void setKeranjangBarang(Keranjang[] keranjangBarang) {
        this.keranjangBarang = keranjangBarang;
    }

    public Barang[] getBarang() {
        return barang;
    }

    public void setBarang(Barang[] barang) {
        this.barang = barang;
    }

    public Pembeli getDaftarPembeli(int X) {
        return daftarPembeli[X];
    }

    public void setDaftarPembeli(Pembeli[] daftarPembeli) {
        this.daftarPembeli = daftarPembeli;
    }
    
    public void addUserPembeli(Pembeli newPembeli){
        if (getJumlahUserPembeli()< daftarPembeli.length) {
            daftarPembeli[getJumlahUserPembeli()] = newPembeli;
            setJumlahUserPembeli(getJumlahUserPembeli()+ 1);
        } else {
            System.out.println("kuota penjual sudah terpenuhi");
        }    
    }
    
    public boolean cariBarangBynama(String cariBarang){
        for (int i = 1; i <= barang.length; i++) {
            if (cariBarang == barang[i].getNamaBarang()) {
                return true;
            }
        }
        return false;
    }
    
    public int totalHarga(Keranjang[] keranjangBarang){
        for (int i = 0; i < totalBarang; i++) {
            totalBelanja = totalBelanja + keranjangBarang[i].getBarang().getHarga();
        }
        return totalBelanja;
    }
    
    public void tambahKeranjang(Barang namaBarang){
        for (int i = 0; i < MAX_KERANJANG_BARANG; i++) {
            if (keranjangBarang[i] == null ) {
                keranjangBarang[i] = new Keranjang(namaBarang);
                System.out.println("Barang " + namaBarang.getNamaBarang() + " telah di tambahkan ke keranjang");
                int stok = namaBarang.getStokBarang();
                namaBarang.setStokBarang(stok - 1);
                totalBarang = totalBarang + 1;
                return;
            } else {
                System.out.println("Barang Sudah Ada di Keranjang");
            }
        }
    }
    
    public void hapusKeranjang(Barang namaBarang){
        for (int i = 0; i < totalBarang; i++) {
        if (keranjangBarang[i] != null && keranjangBarang[i].getBarang().equals(barang)) {
            keranjangBarang[i] = null;
            System.out.println("Barang " + namaBarang.getNamaBarang()+ " telah dihapus dari keranjang.");
            int stok = namaBarang.getStokBarang();
            namaBarang.setStokBarang(stok + 1);
            return; }
    }
    System.out.println("Barang " + namaBarang.getNamaBarang() + " tidak ditemukan di dalam keranjang.");

    }
    
    public void printKeranjang() {
        System.out.println("Keranjang Belanja:");
        System.out.println("==================");
        for (int i = 0; i < totalBarang; i++) {
            if (keranjangBarang[i] != null) {
                System.out.println("Nama Barang: " + keranjangBarang[i].getBarang().getNamaBarang());
                System.out.println("Harga Barang: " + keranjangBarang[i].getBarang().getJenisBarang());
                // Tambahkan informasi lainnya tentang barang jika diperlukan
                System.out.println("------------------");
            } else{
                System.out.println("keranjang kosong");
            }
        }
        System.out.println("Total Belanja: " + totalBelanja);
    }

    
    public void printUserPembeli(){
        for (int i = 0; i < jumlahUserPembeli; i++) {
            System.out.println("penjual ke: " + i);
            System.out.println("nama penjual: " + daftarPembeli[i].getNama());
            System.out.println("nomor telpon: " + daftarPembeli[i].getNoTelpon());
            System.out.println("nomor role: " + daftarPembeli[i].role);
            System.out.println("");
        }
    }
    
    public boolean validateUser(String username, String password){
        for (int i = 0; i < daftarPembeli.length; i++) {
            if (daftarPembeli[i] != null && daftarPembeli[i].getUsername().equals(username) && daftarPembeli[i].getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    
    public void getPembeli(String username){
        for (int i = 0; i < daftarPembeli.length; i++) {
            if (daftarPembeli[i] != null && daftarPembeli[i].getUsername().equals(username)) {
                index = i;
            }
        }
    }
}
