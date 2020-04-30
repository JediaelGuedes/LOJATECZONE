package DAO;

import bean.JG_Gerentee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JG_GerenteDAO {
    
   

public static void adicionar(JG_Gerentee Gerente){
        
        String sql = "INSERT INTO produto (nome, usuário, senha, setor, salário) VALUES (?, ?, ?, ?, ?)";
        
        try{
            Connection conexao = ConexãoDB.getconnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Gerente.getJG_nome());
            stmt.setString(2, Gerente.getJG_usuário());
            stmt.setInt(3, Gerente.getJG_senha());
            stmt.setString(4, Gerente.getJG_setor());
            stmt.setDouble(5, Gerente.getJG_salário());
            stmt.execute();
        }catch(Exception e){

        }    
    }
    

}
    
