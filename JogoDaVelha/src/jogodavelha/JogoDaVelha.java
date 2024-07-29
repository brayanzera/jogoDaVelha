/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import javax.swing.JOptionPane;

/**
 *
 * @author z0ne
 */
public class JogoDaVelha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] tabela2;
        String[][] tabela;
        String resultado = "";
        int cont = 0, jogadas = 0, jogadorX = 0, jogadorO = 0, ganhou = 0, vitoria = 0;
        boolean b = false, num = false;
        
        tabela = new String[3][3];
        tabela2 = new int[3][3];
        
        for(int x = 0; x < tabela.length; x++)
        {
            for(int y = 0; y < tabela.length; y++)
            {
                tabela[x][y] = "□";
            }
        }
        
        for(int x = 0; x < tabela.length; x++)
        {
            for(int y = 0; y < tabela.length; y++)
            {
                tabela2[x][y] = cont;
                cont++;
            }
        }
        
        while(jogadas < 9)
        {
            b = false;
            while(!b)
            {
                jogadorX = Integer.parseInt(JOptionPane.showInputDialog(null, "[JOGADOR X] Digite uma posição de 0 a 8"));
                
                num = false;
                if(jogadorX > 8 || jogadorX < 0)
                {
                    while(!num)
                    {
                        jogadorX = Integer.parseInt(JOptionPane.showInputDialog(null, "[JOGADOR X] NÚMERO INVÁLIDO, DIGITE UM NÚMERO DE 0 A 8"));
                        if(jogadorX <= 8 && jogadorX >= 0)
                        {
                            num = true;
                        }
                    }
                }
                
                for(int x = 0; x < tabela.length; x++)
                {
                    for(int y = 0; y < tabela.length; y++)
                    {
                        if(jogadorX == tabela2[x][y]) 
                        {
                            if(!tabela[x][y].equals("X") && !tabela[x][y].equals("O"))
                            {
                                tabela[x][y] = "X";
                                b = true;
                            }
                            else
                            {
                                b = false;
                                JOptionPane.showMessageDialog(null, "POSIÇÃO JÁ ESCOLHIDA, ESCOLHA UMA NOVA POSIÇÃO DE 0 A 8");
                            }
                        }
                    }
                }
                
            }
     
            jogadas++;
            
            resultado = "";
            
            for(int x = 0; x < tabela.length; x++)
            {
                for(int y = 0; y < tabela.length; y++)
                {
                    resultado = resultado + " "+tabela[x][y];
                }
                resultado = resultado + "\n";
            }
            
            JOptionPane.showMessageDialog(null, resultado);
            
            for(int x = 0; x < 3; x++)
            {
                ganhou = 0;
                for(int y = 0; y < 3; y++)
                {
                    if(tabela[x][y].equals("X"))
                    {
                        ganhou++;
                    }
                    
                    if(ganhou == 3)
                    {
                        JOptionPane.showMessageDialog(null, "JOGADOR X VENCEU");
                        vitoria = 1;
                        jogadas = 9;
                    }
                }
            }
            
            ganhou = 0;
            
            for(int x = 0; x < 3; x++)
            {
                ganhou = 0;
                for(int y = 0; y < 3; y++)
                {
                    if(tabela[y][x].equals("X"))
                    {
                        ganhou++;
                    }
                    
                    if(ganhou == 3)
                    {
                        JOptionPane.showMessageDialog(null, "JOGADOR 'X' VENCEU");
                        vitoria = 1;
                        jogadas = 9;
                    }
                }
            }
            
            ganhou = 0;
            
            for(int x = 0; x < 3; x++)
            {
                if(tabela[x][x].equals("X"))
                {
                    ganhou++;
                }
            }
            
            if(ganhou == 3)
            {
                JOptionPane.showMessageDialog(null, "JOGADOR 'X' VENCEU");
                vitoria = 1;
                jogadas = 9;
            }
            
            ganhou = 0;
            
            for(int x = 0; x < 3; x++)
            {
                if(tabela[x][2-x].equals("X"))
                {
                    ganhou++;
                }
            }
            
            if(ganhou == 3)
            {
                JOptionPane.showMessageDialog(null, "JOGADOR 'X' VENCEU");
                vitoria = 1;
                jogadas = 9;
            }
            
            ganhou = 0;
            
            if(jogadas >= 9)
            {
                break;
            }
            
            b = false;
            while(!b)
            {
                jogadorO = Integer.parseInt(JOptionPane.showInputDialog(null, "[JOGADOR O] Digite uma posição de 0 a 8"));
                
                num = false;
                if(jogadorO > 8 || jogadorO < 0)
                {
                    while(!num)
                    {
                        jogadorO = Integer.parseInt(JOptionPane.showInputDialog(null, "[JOGADOR O] NÚMERO INVÁLIDO, DIGITE UM NÚMERO DE 0 A 8"));
                        if(jogadorO <= 8 && jogadorO >= 0)
                        {
                            num = true;
                        }
                    }
                }
                
                for(int x = 0; x < tabela.length; x++)
                {
                    for(int y = 0; y < tabela.length; y++)
                    {
                        if(jogadorO == tabela2[x][y]) 
                        {
                            if(!tabela[x][y].equals("X") && !tabela[x][y].equals("O"))
                            {
                                tabela[x][y] = "O";
                                b = true;
                            }
                            else
                            {
                                b = false;
                                JOptionPane.showMessageDialog(null, "POSIÇÃO JÁ ESCOLHIDA, ESCOLHA UMA NOVA POSIÇÃO DE 0 A 8");
                            }
                        }
                    }
                }
                
            }
            
            jogadas++;
            
            resultado = "";
            
            for(int x = 0; x < tabela.length; x++)
            {
                for(int y = 0; y < tabela.length; y++)
                {
                    resultado = resultado + " "+tabela[x][y];
                }
                resultado = resultado + "\n";
            }
            
            JOptionPane.showMessageDialog(null, resultado);
            
            for(int x = 0; x < 3; x++)
            {
                ganhou = 0;
                for(int y = 0; y < 3; y++)
                {
                    if(tabela[x][y].equals("O"))
                    {
                        ganhou++;
                    }
                    
                    if(ganhou == 3)
                    {
                        JOptionPane.showMessageDialog(null, "JOGADOR O VENCEU");
                        vitoria = 1;
                        jogadas = 9;
                    }
                }
            }
            
            ganhou = 0;
            
            for(int x = 0; x < 3; x++)
            {
                ganhou = 0;
                for(int y = 0; y < 3; y++)
                {
                    if(tabela[y][x].equals("O"))
                    {
                        ganhou++;
                    }
                    
                    if(ganhou == 3)
                    {
                        JOptionPane.showMessageDialog(null, "JOGADOR 'O' VENCEU");
                        vitoria = 1;
                        jogadas = 9;
                    }
                }
            }
            
            ganhou = 0;
            
            for(int x = 0; x < 3; x++)
            {
                if(tabela[x][x].equals("O"))
                {
                    ganhou++;
                }
            }
            
            if(ganhou == 3)
            {
                JOptionPane.showMessageDialog(null, "JOGADOR 'O' VENCEU");
                vitoria = 1;
                jogadas = 9;
            }
            
            ganhou = 0;
            
            for(int x = 0; x < 3; x++)
            {
                if(tabela[x][2-x].equals("O"))
                {
                    ganhou++;
                }
            }
            
            if(ganhou == 3)
            {
                JOptionPane.showMessageDialog(null, "JOGADOR 'O' VENCEU");
                vitoria = 1;
                jogadas = 9;
            }
            
            ganhou = 0;
        }
        
        if(vitoria == 0)
        {
            JOptionPane.showMessageDialog(null, "O JOGO EMPATOU\nPARABÉNS! MEU AMIGO CHARLIE BROWN");
        }
    }
    
}
