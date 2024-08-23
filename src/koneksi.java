/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
  
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class koneksi {
   Connection con;
    
    public void config(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
            con.createStatement();
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
    
}
 

