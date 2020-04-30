/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import static principal.JG_LojaTecZone.centro;
import Views.JG_Clientes;
import Views.JG_Compras;
import Views.JG_Funcionário;
import Views.JG_Gerente;
import Views.JG_Vendas;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Wallison
 */
public class JG_Topo extends JPanel{
    public JG_Topo(){
        setLayout (new GridLayout());
         
       
       JButton botao1 = new JButton("CLIENTES");
       JButton botao2 = new JButton("FUNCIONÁRIO");
       JButton botao3 = new JButton("GERENTE");
       JButton botao4 = new JButton("COMPRAS");
       JButton botao5 = new JButton("VENDAS");
       
       botao1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                centro.removeAll();
                centro.add(new JG_Clientes());
                centro.repaint();
                centro.validate();
                
            }
        });
            botao2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                centro.removeAll();
                centro.add(new JG_Funcionário());
                centro.repaint();
                centro.validate();            }
        });
            botao3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                centro.removeAll();
                centro.add(new JG_Gerente());
                centro.repaint();
                centro.validate();            }
        });
            botao4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                centro.removeAll();
                centro.add(new JG_Compras());
                centro.repaint();
                centro.validate(); 
            }
        } );
            botao5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                centro.removeAll();
                centro.add(new JG_Vendas());
                centro.repaint();
                centro.validate();   
            }
        } );
        
        
       setLayout(new GridLayout());
       add(botao1);
       add(botao2);
       add(botao3);
       add(botao4);
       add(botao5);
}
}