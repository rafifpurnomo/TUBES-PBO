//package Helper;
//
//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class KoneksiDB {
//    static Connection Koneksi;
//    
//    public static Connection getConnection(){
//        if (Koneksi == null) {
//            MysqlDataSource data = new MysqlDataSource();
//            data.setDatabaseName("db_tubes_pbo");
//            data.setUser("root");
//            data.setPassword("");
//            
//            try {
//                data.getConnection();
//                System.out.println("Koneksi Berhasil");
//            } catch (SQLException e) {
//                System.out.println("Koneksi Gagal");
//            }
//        }
//        return Koneksi;
//    }
//}
