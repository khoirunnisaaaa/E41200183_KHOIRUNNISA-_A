/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisi;

/**
 *
 * @author Khoirunnisa
 */
public class TelevisiModern extends TVTradisional{
    public TelevisiModern(String Deskripsi, int lengthChannel) {
        super(Deskripsi, lengthChannel);
    }
    
    static String teletext = "Teletext";
    static String televisi = "Televisi";
    String cd;
    
    public void setModusTampilan(String inTampilan){
        this.teletext = inTampilan;
    }
    
    public void setHalamanTeletext(int inHal){
        System.out.println("Berpindah ke halaman teletext " + inHal);
    }
    
    
    public void setDiscTray(String inData){
        this.cd = inData;
    }
    
    
    public void getModusTampilan(){
        System.out.println("Modus tampilan : " + teletext);
    }
    
    public void playCD(){
        if (cd == null){
            System.out.println("Tidak ada CD di dalam disc tray!");
        } else {
            System.out.println("Memutar film " + cd);
        }
    }
    
}

