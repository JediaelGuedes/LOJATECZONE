package DAO;

import bean.JG_Clientess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JG_ClientesDAO {
    
   

public static void adicionar(JG_Clientess clientes){
        
        String sql = "INSERT INTO produto (nome, idade, CPF, CEP, endereço) VALUES (?, ?, ?, ?, ?)";
        
        try{
            Connection conexao = ConexãoDB.getconnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, clientes.getJG_nome());
            stmt.setInt(2, clientes.getJG_Idade());
            stmt.setInt(3, clientes.getJG_cpf());
            stmt.setInt(4, clientes.getJG_cep());
            stmt.setString(5, clientes.getJG_endereço());
            stmt.execute();
        }catch(Exception e){

        }    
    }
    

}
    
