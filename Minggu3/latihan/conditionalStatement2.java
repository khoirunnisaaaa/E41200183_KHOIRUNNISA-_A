/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.util.Scanner;

/**
 *
 * @author Khoirunnisa
 */
public class conditionalStatement2 {
    public static void main(String[] args){
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Inputkan nama warna: ");
        lampu = scan.nextLine();
        
        switch (lampu){
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna lampu salah!");
        }
    }
}
