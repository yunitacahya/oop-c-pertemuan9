package pertemuan901;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Yunita Cahya
 * TGL 17 MEI 2025
 */
public class Pertemuan901 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        dbkoneksi dbk = new dbkoneksi();
        Statement st = dbk.koneksi().createStatement();
        
        String sql = "SELECT * FROM mhs;";
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
            
            System.out.println("Nama :"+rs.getString("NAMA"));
            System.out.println("Nim :"+rs.getString("NIM"));
            System.out.println("Jurusan :"+rs.getString("JURUSAN"));
            System.out.println("Alamat :"+rs.getString("ALAMAT"));
        }
        
    }
    
}
