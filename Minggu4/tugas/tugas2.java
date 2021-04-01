/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Khoirunnisa
 */
public class tugas2 {
    public static void main(String[] args){
        int number = 1;
        int data = 0;
        
        System.out.println("                                                                Do_While");
        System.out.println("                                                         Bilangan Dikali 2 (1-100)");
        System.out.println("====================================================================================================================================================");
        
        System.out.print("                                                              " + number + " ");
        do {
            number *= 2;
            System.out.print(number + " ");
        } while (number < 100 - number);
        System.out.println(" \n");
        
        System.out.println("                                                        Bilangan Kelipatan 2 (0-100)");
        System.out.println("====================================================================================================================================================");
        System.out.print(data + " ");
        while(data <= 100 - 2){
            data += 2;
            System.out.print(data + " ");
        }
        System.out.println("");
    }
}
