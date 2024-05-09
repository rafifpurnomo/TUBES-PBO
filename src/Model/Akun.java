package Model;

public class Akun {
    private String nama;
    private String Username;
    private String password;
    private String role;
    private String noTelpon;

    public Akun(String nama, String Username, String password, String role, String noTelpon) {
        this.nama = nama;
        this.Username = Username;
        this.password = password;
        this.role = role;
        this.noTelpon = noTelpon;
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
        this.role = role;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }
}
