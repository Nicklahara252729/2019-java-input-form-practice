/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.*;

/**
 *
 * @author nicolahara
 */

public class ClassDB {
    private static Connection koneksi;
    public static Connection getKoneksi(){
     if (koneksi == null){
      try {
          String url = "jdbc:mysql://192.168.64.2/test_java"; // nama databasenya login
          String user="nico"; // username mysql root
          String pass=""; //passwordnya kosong

          DriverManager.registerDriver(new com.mysql.jdbc.Driver());
          koneksi = DriverManager.getConnection(url , user, pass);

        } 
      catch(SQLException t){
        System.out.print("Gagal melakukan koneksi ke database");
    }
   }

   return koneksi;
   }
}
