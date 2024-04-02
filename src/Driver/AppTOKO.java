
package Driver;

import Model.Barang;
import Model.etalaseBarang;
import Model.Keranjang;
import Model.Toko;
import Model.Pembeli;
import Model.Penjual;
import java.util.Scanner;

public class AppTOKO {
    private Scanner Scan;
    private Toko toko;
    private Pembeli pembeli;
    private Keranjang keranjang;
    private Barang barang;
    private etalaseBarang etalaseBarang;
    private Penjual penjual;
    private String tmpUser; 
    
    public AppTOKO(){
        this.pembeli = new Pembeli();
        this.penjual = new Penjual();
        this.barang = new Barang();
        this.keranjang = new Keranjang();
        this.toko = new Toko();
        this.etalaseBarang = new etalaseBarang();
        
        
        this.barang.setBarang(new Barang[100]);
        this.penjual.setDaftarPenjual(new Penjual[10]);
        this.pembeli.setDaftarPembeli(new Pembeli[10]);
        
        Penjual Penjual01 = new Penjual("rafif@gmail.com", "rafif001", "Rafif_Purnomo", "081234567", "rafifRacing");
        Barang dagangan01 = new Barang("001", "knalpot_racing", "motor", 100000, 10);
        Penjual01.setEtalaseBarang(new etalaseBarang[10]);
        this.penjual.addUserPenjual(Penjual01);
        penjual.addEtalaseBarang(dagangan01);
        
        Penjual Penjual02 = new Penjual("belva@gmail.com", "belva001", "Ghazivelda_Belva", "081235267", "BelvaExhaust");
        this.penjual.addUserPenjual(Penjual02);
        
        Penjual Penjual03 = new Penjual("Dana@gmail.com", "Dana001", "Reihan_Ramadhana", "081236728", "danaFood");
        this.penjual.addUserPenjual(Penjual03);
                
        Pembeli pembeli01 = new Pembeli("irji@gmail.com", "irji001", "Irji_Syahrull", "0812563821");
        Barang barang01 = new Barang("001", "knalpot_racing", "motor", 100000, 1);
        pembeli01.setKeranjangBarang(new Keranjang[10]);
        this.pembeli.addUserPembeli(pembeli01);
        pembeli.tambahKeranjang(barang01);
        System.out.println(barang01);
        
        Pembeli pembeli02 = new Pembeli("Rakean@gmail.com", "rakean001", "Rakean_Jati", "081273827");
        this.pembeli.addUserPembeli(pembeli02);
        
        
            
        // penjual.PrintPenjual();
        // pembeli.printUserPembeli();
    }
    
    public void mainMenu(){
        Scanner input = new Scanner(System.in);
        this.Scan = input;
        int out = 0;
        
        do{
            try {
                System.out.println("");
                System.out.println("SELAMAT DATANG DI PBO-SHOP");
                System.out.println("1. Login");
                System.out.println("2. Exit");
                System.out.println("Input Menu: ");
                out = Scan.nextInt();
                
                switch(out){
                    case 1:
                        this.menuLogin();
                    case 2:
                        System.out.println("TERIMA KASIH");
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("inputan harus angka");
            } finally {
                Scanner scan = new Scanner(System.in);
                this.Scan = scan;
            }
        }while(out != 21);
    }
    
    public void menuLogin(){
        Scanner input = new Scanner(System.in);
        this.Scan = input;
        System.out.println();
        System.out.println("Login");
        System.out.println("1. Login Pembeli");
        System.out.println("2. Login Penjual");
        System.out.println("3. Back");
        System.out.print("Input Menu : ");
        int out = Scan.nextInt();
        switch(out){
            case 1:
            this.loginPembeli();
            case 2:
            this.loginPenjual();
            case 3:
            this.mainMenu();
            default:
            System.out.println("Inputan salah");
        }
    }
        
    public void loginPembeli(){
        Scanner input = new Scanner(System.in);
        String yesNo;
        
        System.out.println("");
        System.out.println("LOGIN PEMBELI");
        
        this.Scan = input;
        System.out.println("masukan username: ");
        String username = Scan.next();
        tmpUser = username;
        System.out.println("masukan password: ");
        String password = Scan.next();
        
        boolean status = pembeli.validateUser(username, password);
        if (status == true) {
            System.out.println("login sukses");
            System.out.println("");
            this.menuPembeli();
        } else {
            System.out.println("Usernmae atau Password salah");
            System.out.println("Coba lagi ? [Y/N]");
            yesNo = Scan.next();
            if (yesNo.equals("Y") || yesNo.equals("y")) {
                this.loginPembeli();
            } else if(yesNo.equals("N") || yesNo.equals("n")){
                this.menuLogin();
            } else {
                System.out.println("Masukan tidak tepat");
                this.mainMenu();
            }
        }
        
    }
    
    public void menuPembeli(){
        Scanner input = new Scanner(System.in);
        this.pembeli.getPembeli(tmpUser);
        
        System.out.println("selamat datang: " + this.pembeli.getDaftarPembeli(this.pembeli.index).getNama());
        System.out.println("1. Lihat Keranjang");
        System.out.println("2. Cari toko");
        System.out.println("3. Cari Barang");
        System.out.println(". Log out");
        int out = Scan.nextInt();
        switch(out){
            case 1:
            this.lihatKeranjang();
            case 2:
            this.loginPenjual();
            case 3:
            this.mainMenu();
            default:
            System.out.println("Inputan salah");
        }
    }
    
    public void lihatKeranjang(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        pembeli.printKeranjang();
        
        System.out.println("1. Checkout");
        System.out.println("2. Kembali");
        int out = Scan.nextInt();
        
        switch(out){
            case 1:
                this.Checkout();
            case 2:
                this.menuPembeli();
        }
    }
    
    public void tambahKeranjanng(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Masukan nama barang yang ingin anda cari");
        String seacrh = Scan.next();
        
        if (pembeli.cariBarangBynama(seacrh) == true) {
            pembeli.tambahKeranjang(barang);
        } else {
            System.out.println("barang tidak di temukan");
        }
        
        System.out.println("1. Cari lagi");
        System.out.println("2. Kembali");
        int out = Scan.nextInt();
        switch(out){
            case 1:
                this.tambahKeranjanng();
            case 2:
                this.menuPembeli();
        }
    }
    
    public void Checkout(){

    }
    
      
    public void loginPenjual(){
        
    }
}   
