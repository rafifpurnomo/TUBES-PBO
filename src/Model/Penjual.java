package Model;

import Model.User;

public class Penjual extends User {
    private String username;
    private String password;
    private String nama;
    private String noTelpon; 
    private final String role = "Penjual";
    private String namaToko;
    private int jumlahUserPenjual, jumlahProduk, MAXbarang;
    private Barang[] barang;
    private Penjual[] daftarPenjual;
    private etalaseBarang[] etalaseBarang;
    
    
    public Penjual(){}
    public Penjual(String username, String password, String nama, String noTelpon, String namaToko) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.noTelpon = noTelpon;
        this.namaToko = namaToko;
        this.MAXbarang = 10;
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

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public int getJumlahPenjual() {
        return jumlahUserPenjual;
    }

    public void setJumlahPenjual(int jumlahUserPenjual) {
        this.jumlahUserPenjual = jumlahUserPenjual;
    }

    public Barang[] getBarang() {
        return barang;
    }

    public void setBarang(Barang[] barang) {
        this.barang = barang;
    }

    public Penjual[] getDaftarPenjual() {
        return daftarPenjual;
    }

    public void setDaftarPenjual(Penjual[] daftarPenjual) {
        this.daftarPenjual = daftarPenjual;
    }

    public etalaseBarang getEtalaseBarang(int X) {
        return etalaseBarang[X];
    }

    public void setEtalaseBarang(etalaseBarang[] etalaseBarang) {
        this.etalaseBarang = etalaseBarang;
    }
    
    public void addUserPenjual(Penjual newPenjual){
        if (getJumlahPenjual() < daftarPenjual.length) {
            daftarPenjual[getJumlahPenjual()] = newPenjual;
            setJumlahPenjual(getJumlahPenjual() + 1);
        } else {
            System.out.println("kuota penjual sudah terpenuhi");
        }
         
    }
    
    public void addEtalaseBarang(Barang newBarang){
        for (int i = 0; i < MAXbarang; i++) {
            if (etalaseBarang[i] == null) {
                etalaseBarang[i] = new etalaseBarang(newBarang);
                jumlahProduk++;
                System.out.println("barang berhasil di tambahkan ke etalase");
            } else {
                System.out.println("eror");
            }
        }
    }
    
//    riset lagi
    public void tambahStok(Barang[] barang, String namaBarang, int newStok){
        for (int i = 1; i <= barang.length; i++) {
            if (namaBarang == barang[i].getNamaBarang()) {
                System.out.println("Stok barang sekarang: " + barang[i].getStokBarang());
                int finalStok = barang[i].getStokBarang() + newStok;
                barang[i].setStokBarang(finalStok);
            } else {
                System.out.println("Barang belum ada di toko anda");
            }
        }
    }
    
    public void kuranginStok(Barang[] barang, String namaBarang, int newStok){
        for (int i = 1; i <= barang.length; i++) {
            if (namaBarang == barang[i].getNamaBarang()) {
                System.out.println("Stok barang sekarang: " + barang[i].getStokBarang());
                int finalStok = barang[i].getStokBarang() + newStok;
                barang[i].setStokBarang(finalStok);
            } else {
                System.out.println("Barang belum ada di toko anda");
            }         
        }
    }
    
    public void PrintPenjual(){
        for (int i = 0; i < jumlahUserPenjual; i++) {
            System.out.println("penjual ke: " + i);
            System.out.println("nama penjual: " + daftarPenjual[i].getNama());
            System.out.println("nama toko: " + daftarPenjual[i].getNamaToko());
            System.out.println("nomor telpon: " + daftarPenjual[i].getNoTelpon());
            System.out.println("nomor role: " + daftarPenjual[i].role);
            
            System.out.println("");
        }
    }
}
