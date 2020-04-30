package DAO;

import bean.JG_Vendass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JG_VendasDAO {
    
   

public static void adicionar(JG_Vendass Vendas){
        
        String sql = "INSERT INTO produto (MÊS, vendas_realizadas, vendas_não_realizadas, prejuízo, lucro) VALUES (?, ?, ?, ?, ?)";
        
        try{
            Connection conexao = ConexãoDB.getconnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Vendas.getJG_Mês());
            stmt.setInt(2, Vendas.getJG_VendasRealizadas());
            stmt.setInt(3, Vendas.getJG_VendasNãoRealizadas());
            stmt.setDouble(4, Vendas.getJG_Prejuízo());
            stmt.setDouble(5, Vendas.getJG_Lucro());
            stmt.execute();
        }catch(Exception e){

        }    
    }
    

}
    
