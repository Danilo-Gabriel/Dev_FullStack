package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {


    public Connection recuperarConexao(){
         try{

            return DriverManager
                    .getConnection("jdbc:mysql://172.17.0.3:3306/byte_bank?user=root&password=admin");

        }catch (SQLException e){

          throw new RuntimeException(e);
        }
    }

}
