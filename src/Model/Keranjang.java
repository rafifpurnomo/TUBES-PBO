package Model;

import Model.Pembeli;

public class Keranjang{
    private Keranjang[] keranjang;
    private Barang barang;
    
    public Keranjang(){}

    public Keranjang(Barang barang) {
        this.barang = barang;
    }
    
    public Keranjang[] getKeranjang() {
        return keranjang;
    }

    public void setKeranjang(Keranjang[] keranjang) {
        this.keranjang = keranjang;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }
}
