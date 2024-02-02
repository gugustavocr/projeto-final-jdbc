package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class GerenciadorBD {

    private String servidor = "127.0.0.1:3306";
    public String banco = "banco_projeto_final";
    private String login = "root";
    private String senha = "";

    public Connection conectar() throws Exception 
    {    
        String textoDeConexao = "jdbc:mysql://" + servidor + "/" + banco;
        
        return DriverManager.getConnection(textoDeConexao, login, senha);
    }
}
