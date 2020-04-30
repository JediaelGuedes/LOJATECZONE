package DAO;

import bean.JG_Comprass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JG_ComprasDAO {
    
   

public static void adicionar(JG_Comprass compras){
        
        String sql = "INSERT INTO produto (produto, armazenadas, perdidas, avarias, código) VALUES (?, ?, ?, ?, ?)";
        
        try{
            Connection conexao = ConexãoDB.getconnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, compras.getJG_produto());
            stmt.setInt(2, compras.getJG_armazenadas());
            stmt.setInt(3, compras.getJG_perdidas());
            stmt.setInt(4, compras.getJG_avarias());
            stmt.setInt(5, compras.getJG_código());
            stmt.execute();
        }catch(Exception e){

        }    
    }
    

}
    
