/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author USER
 */
public class JG_Funcionários {
    public String JG_nome;
    public int JG_MesesTrabalhados;
    public int JG_HorasTrabalhadas;
    public int JG_HorasExtras;
    public double JG_CustoHora;
    
    public void setJG_nome(String JG_nome){
        this.JG_nome=JG_nome;
    }
    public String getJG_nome(){
        return this.JG_nome;
    }
    public void setJG_MesesTrabalhados(int JG_MesesTrabalhados){
        this.JG_MesesTrabalhados=JG_MesesTrabalhados;
    }
    public int getJG_MesesTrabalhados(){
        return this.JG_MesesTrabalhados;
    }
    
    public void setJG_HorasTrabalhadas(int JG_HorasTrabalhadas){
    this.JG_HorasTrabalhadas=JG_HorasTrabalhadas;
    }
    
    public int getJG_HorasTrabalhadas(){
    return this.JG_HorasTrabalhadas;
    }
    public void setJG_HorasExtras(int JG_HorasExtras){
    this.JG_HorasExtras=JG_HorasExtras;
    }
    public int getJG_HorasExtras(){
        return this.JG_HorasExtras;
    }
    public void setJG_CustoHora(double JG_CustoHora){
        this.JG_CustoHora=JG_CustoHora;
    }
    public double getJG_CustoHora(){
    return this.JG_CustoHora;
    }
       public JG_Funcionários(String JG_nome, int JG_MesesTrabalhados, int JG_HorasTrabalhadas, int JG_HorasExtras, double JG_CustoHora){
          
           this.JG_nome=JG_nome;
           this.JG_MesesTrabalhados=JG_MesesTrabalhados;
           this.JG_HorasTrabalhadas=JG_HorasTrabalhadas;
           this.JG_HorasExtras=JG_HorasExtras;
           this.JG_CustoHora=JG_CustoHora;
           
           
          
    }
}
    

    

