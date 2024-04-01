/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cafe;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 30/03/24
 * @brief class Cafe
 */
public class Cafe {
private final double precocafexpresso = 0.75;  /// atribuido valores as vareaveis 
private final double precocapuccino = 1.75;
private final double precocafecomleite = 2.0;

private int qtdexpresso = 0;
private int qtdcapuccino= 0 ;
private int qtdcafecomleite = 0;
    public void addexpresso(){ // metado para soma o valor de quantidade de qtd expresso
        qtdexpresso++;
        System.out.println("expresse acidionado"+precocafexpresso);
    }
       public void removeexpresso(){ // metado para diminuir falor de qtdecpresso
        qtdexpresso--;
        System.out.println("expresse removido"+precocafexpresso);
    }
       
          public void addcapuccino(){
          qtdcapuccino ++;
        System.out.println("capuccino acidionado"+ precocapuccino);
    }
       public void removecapuccino(){
     qtdcapuccino --;
        System.out.println("capuccino removido"+precocafexpresso);
    }
       
     public void addcafecomleite(){
       qtdcafecomleite++;
      System.out.println("cafe com leite  acidionado"+ precocafecomleite);
    }
       public void removecafecomleite(){
      qtdcafecomleite --;
        System.out.println("cafe com leite  removido"+precocafexpresso);
    }
       
           public void realizarPagamentoParcial() { // metado de pagamento parcial
        System.out.println("Pagamento parcial realizado: R$ " + String.format("%.2f", totalconta()));
        // Zerando os valores apos o pagamento
        qtdexpresso = 0;
        qtdcapuccino = 0;
        qtdcafecomleite = 0;
    }
           
           public void imprimirconta() { // metado de pagamento total da conta
        System.out.println("Resumo do pedido:");
        System.out.println("cafe expresso " + qtdexpresso + " x R$ " + String.format("%.2f", precocafexpresso) + " = R$ " + String.format("%.2f", subtotalexpresso()));
        System.out.println("Capuccino: " + qtdcapuccino + " x R$ " + String.format("%.2f", precocapuccino) + " = R$ " + String.format("%.2f", subtotalcapuccino()));
        System.out.println("Café com Leite: " + qtdcafecomleite + " x R$ " + String.format("%.2f", precocafecomleite) + " = R$ " + String.format("%.2f", subtotalcafecomleite()));
        System.out.println("Total a pagar: R$ " + String.format("%.2f", totalconta()));
        System.out.println("Pagemento Realizado!");

                    // Zerar as quantidades após o pagamento total
                    qtdexpresso = 0;
                    qtdcapuccino = 0;
                    qtdcafecomleite = 0;
    }
           
                private double subtotalexpresso(){
                    return qtdexpresso * precocafexpresso;
                }
                
                  private double subtotalcapuccino(){
                    return qtdcapuccino * precocapuccino;
                }
                  
                   private double subtotalcafecomleite(){
                    return qtdcafecomleite * precocafecomleite;
                }
                private double totalconta(){
                    return subtotalexpresso()+subtotalcapuccino()+subtotalcafecomleite();
                }
                  

}
