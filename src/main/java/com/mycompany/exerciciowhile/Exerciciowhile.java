package com.mycompany.exerciciowhile;

import java.util.Scanner;

public class Exerciciowhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println(" \n exemplo 1 \n ");
        System.out.println(" \n escreva um numero de 1 a 10");
 int x = teclado.nextInt();
        while (x !=10){
            x = teclado.nextInt();
            
        } 
            System.out.println("numero é :" + x);
            
            System.out.println(" \n exemplo 2 \n ");
         
            Scanner teclado2 = new Scanner (System.in);
 int senha = 0;
        System.out.println("aperte enter para colocar a senha");
        String enter = " ";
        enter = teclado2.nextLine();
        
        System.out.println(" \n coloque a senha ");
        senha =  teclado2.nextInt();
        
        while (senha != 2002){
            System.out.println("acesso negado");
            senha =  teclado2.nextInt();
            
           
        }
           System.out.println("acesso liberado");
          
           
           System.out.println(" \n exemplo3 \n");
         
           Scanner teclado3 = new Scanner (System.in);
        int item = 0;
        int alcol =0;
        int gasolina = 0;
        int disel = 0;
        System.out.println("menu:");
        System.out.println(" alcool pressione 1 \n gasolina pressione 2 \n diesel pressione 3 "
                + "");
        System.out.println(" \n\n digite um numero para saber o combustivel");

         item = teclado3.nextInt();
         
        while (item != 4) {
           
             

            if (item == 1) {
                System.out.println("foi adicionado alcool");
                alcol += 1;
                
            } else {
                if (item == 2) {
                    System.out.println("adicionado gasolina");
                    gasolina += 1;
                } else {
                    if (item == 3) {
                        System.out.println("adicionado diesel");
                        disel += 1;
                        
                        
                    }
                }

                {

                }
            }
             item = teclado.nextInt();
        }
        System.out.printf(" muito obrigado! \n foi abastecido alcool : %d \n gasolina : %d \n disel :%d \n ",alcol,gasolina,disel);
         
        System.out.println(" \n exemplo 4 \n ");
        Scanner teclado4 = new Scanner(System.in);

        System.out.println("hoje é a tabuada do: ");
        int nm1 = teclado4.nextInt();

        while (nm1 != 0) {

            System.out.println(" \n tabuada do ");
            System.out.printf(" %d x 1 = %d \n ", nm1, nm1 * 1);
            System.out.printf("%d x 2 = %d \n ", nm1, nm1 * 2);
            System.out.printf("%d x 3 = %d \n ", nm1, nm1 * 3);
            System.out.printf("%d x 4 = %d \n ", nm1, nm1 * 4);
            System.out.printf("%d x 5 = %d \n ", nm1, nm1 * 5);
            System.out.printf("%d x 6 = %d \n ", nm1, nm1 * 6);
            System.out.printf("%d x 7 = %d \n ", nm1, nm1 * 7);
            System.out.printf("%d x 8 = %d \n ", nm1, nm1 * 8);
            System.out.printf("%d x 9 = %d \n ", nm1, nm1 * 9);
            System.out.printf("%d x 10 = %d \n ", nm1, nm1 * 10);
            break;
        }

    }
}
