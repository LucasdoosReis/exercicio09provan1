/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Menu;

import java.util.Scanner; // importando bibliioteca de leitura
import cafe.Cafe; // importando packote cafe, classe Café
/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 31/03/24
 * @brief class Menu
 */
public class Menu {
    public static void main(String[] args) {  // função principal
        Scanner sc = new Scanner(System.in);
        Cafe cafes = new Cafe();
      
          while(true){                                            /// laço de repetição do menu
             System.out.println("######CAFETEIRIA ##########");
             System.out.println("1: ADICIONAR CAFÉ");
             System.out.println("2: EXCLUIR CAFÉ");
             System.out.println("3: PAGAR CONTA PARCIAL");
             System.out.println("4: PAGAR CONTA TOTAL");
             
             int opcao = sc.nextInt();            // ler variavel opcao
             
              switch (opcao) { // swite case opcao do menu chamando os metados da classe Cafe
                  case 1:
                 System.out.println("Deseja adicionar qual tipo?");
                 System.out.println("1:CAFÉ EXPRESSO"+ "\n"+ "2:CAPUCCINO"+ "\n" + "3:CAFE COM LEITE"+"\n" + "4:CAFE CASEIRO" );
                      int opc1 = sc.nextInt();
                      if(opc1  == 1){
                         cafes.addexpresso();
                      }
                       if(opc1  == 2){
                         cafes.addcapuccino();
                      }
                        if(opc1  == 3){
                         cafes.addcafecomleite();
                      }
                      
                      break;
                  case 2:
                  {
                      System.out.println("Deseja remover qual tipo?");
                 System.out.println("1:CAFÉ EXPRESSO"+ "\n"+ "2:CAPUCCINO"+ "\n" + "3:CAFE COM LEITE"+"\n" + "4:CAFE CASEIRO" );
                      int opc2 = sc.nextInt();
                      if(opc2  == 1){
                         cafes.removeexpresso();
                      }
                       if(opc2  == 2){
                         cafes.removecapuccino();
                      }
                        if(opc2  == 3){
                         cafes.removecafecomleite();
                      }
                        break;  
                  }
                  
                  
                  case 3:
                      System.out.println("Deseja fazer o pagamento parcial?" + " 1:realizar pagamento  2: voltar ao menu");
                      int opc3 = sc.nextInt();
                      if(opc3==1){
                      cafes.realizarPagamentoParcial();
                      }
                      else
                          System.out.println("escolha seu pedido");
                      
                      break;
                  case 4:
                      cafes.imprimirconta();  
                      sc.close(); // sair do laço de repetição
                      return;
                      
                      
                              
                 
                      
              } 
              }
          }
    
  
    }

   

 
