
package parcialfinal_brian_duarte_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ParcialFinal_Brian_Duarte_java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int cantidad; 
      int codigo;
      double subtotal = 0;
      double descuento;
      int monto=500;
      double total;
      
      for(int i=0;i<3;i++){
          
          System.out.print("\ningrese el codigo: ");
          codigo=in.nextInt();
          System.out.print("cantidad de litros: ");
          cantidad=in.nextInt();
          switch(codigo){
              case  101: subtotal=subtotal+cantidad*40;
                        break;
              case 102: subtotal=subtotal+cantidad*54.99;
                        break;
              case 103: subtotal=subtotal+cantidad*72.80;
                        break;
              case  104: subtotal=subtotal+cantidad*73;
                         break;
              
                         
              
                  
          }}
            if(subtotal>monto){
                DecimalFormat df= new DecimalFormat("#.00");
                descuento=subtotal*0.15;
                total=subtotal-descuento;
                System.out.println("\nSUBTOTAL: "+subtotal);
                System.out.println("DESCUENTO: "+df.format(descuento));
                System.out.println("          --------");
                System.out.println("   TOTAL:  "+df.format(total));
                
            }else{
                DecimalFormat df= new DecimalFormat("#.00");
                descuento=0;
                
                System.out.println("\nSUBTOTAL: "+df.format(subtotal));
                System.out.println("DESCUENTO: "+df.format(descuento));
                System.out.println("          --------");
                System.out.println("   TOTAL:  "+df.format(subtotal));
            }
          
      }
        
            
    
       


    }
    

