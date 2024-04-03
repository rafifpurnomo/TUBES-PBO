package Model;

public class etalaseBarang {
    private etalaseBarang[] etalaseBarang;
    private Barang barang;

    public etalaseBarang(){}
    
    public etalaseBarang(Barang barang){
        this.barang = barang;
    }
           
    public etalaseBarang[] getEtalaseBarang() {
        return etalaseBarang;
    }

    public void setEtalaseBarang(etalaseBarang[] etalaseBarang) {
        this.etalaseBarang = etalaseBarang;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }
    
    
}
