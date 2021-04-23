/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelajar;

/**
 *
 * @author Khoirunnisa
 */
public class Orang {
    private String nama;    //atribut
    private double tinggi;  //atribut
    private double berat;   //atribut
    
    public Orang (String nama, double tinggi, double berat){
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    public String toString(){
        return ("Nama: " + nama + "\nTinggi : " + tinggi + "\nBerat : " + berat);
                
    }
}
