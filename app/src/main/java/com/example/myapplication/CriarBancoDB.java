package com.example.myapplication;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriarBancoDB {
    public static Connection conectar(Teste_conexaoDB testeConexaoDB){
        Connection conn = null;
        try{
            StrictMode.ThreadPolicy politica;
            politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:jtds:sqlserver://172.25.224.1;"+
                    "databaseName=bd_padaria3_fk;user=sa;passaword=@ITB123456");
        }
        catch(SQLException e){
            e.getMessage();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return conn;
    }



}

