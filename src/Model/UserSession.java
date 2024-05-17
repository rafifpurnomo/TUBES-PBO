package Model;

public class UserSession {
    private static int id;
    private static String username;
    private static String password;
    private static String nama;
    private static String role;
    private static String noTelpon;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        UserSession.id = id;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserSession.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserSession.password = password;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        UserSession.nama = nama;
    }

    public static String getRole() {
        return role;
    }

    public static void setRole(String role) {
        UserSession.role = role;
    }

    public static String getNoTelpon() {
        return noTelpon;
    }

    public static void setNoTelpon(String noTelpon) {
        UserSession.noTelpon = noTelpon;
    }

    public static void clearSession() {
        id = 0;
        username = null;
        password = null;
        nama = null;
        role = null;
        noTelpon = null;
    }
}


