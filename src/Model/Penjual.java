package Model;
public class Penjual extends Akun {
    private String nama;
    private String Username;
    private String password;
    private String role;
    private String noTelpon;
    private Toko toko;

    public Penjual(String nama, String Username, String password, String role, String noTelpon, Toko toko) {
        super(nama, Username, password, role, noTelpon);
        this.toko = toko;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = "Penjual";
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }
}
