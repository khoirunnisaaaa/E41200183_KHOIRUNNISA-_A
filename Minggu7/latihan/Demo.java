/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Khoirunnisa
 */
public class Demo {
    public static void main(String[] args){
        A superOb = new A();
        B subOb = new B();
        
        System.out.println("Superclass");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TampilkanNilaiXY();
        
        System.out.println("SubClass");
        subOb.x = 5;
        subOb.y = 4;
        subOb.TampilkanNilaiXY();
        
        subOb.z = 50;
        subOb.TampilkanJumlah();
        
        //B extends A memiliki arti
        //Seluruh program yg ada di clas A
        //akan dimiliki B juga.
    }
}
