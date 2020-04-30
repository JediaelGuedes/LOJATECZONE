package DAO;

import bean.JG_Funcionários;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JG_FuncionárioDAO {
    
   

public static void adicionar(JG_Funcionários Funcionário){
        
        String sql = "INSERT INTO produto (nome, meses_trabalhados, horas_trabalhadas, horas_extras, custo_hora) VALUES (?, ?, ?, ?, ?)";
        
        try{
            Connection conexao = ConexãoDB.getconnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Funcionário.getJG_nome());
            stmt.setInt(2, Funcionário.getJG_MesesTrabalhados());
            stmt.setInt(3, Funcionário.getJG_HorasTrabalhadas());
            stmt.setInt(4, Funcionário.getJG_HorasExtras());
            stmt.setDouble(5, Funcionário.getJG_CustoHora());
            stmt.execute();
        }catch(Exception e){

        }    
    }
    

}
    
