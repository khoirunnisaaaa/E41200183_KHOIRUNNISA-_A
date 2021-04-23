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
public class User {
     public static void main(String[] args) {
        String[] Channel = {"RCTI", "SCTV", "INDOSIAR", "LA TV", "METRO TV", "TRANS TV", "TPI", "TV 7"};
        
        //comment line 17-26 if you want run TelevisiModern
        TVTradisional tv = new TVTradisional("Samsung TV 24 inch", 10);
        
        tv.getDeskripsi();
        tv.getChannel();
        tv.setChannels(Channel);
        
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(2);
        tv.setChannelAktif(1);
        
        //uncomment line 29-50 if you want run TelevisiModern
//        TelevisiModern user = new TelevisiModern("TV Acina", 10);
//        
//        user.getDeskripsi();
//        user.getChannel();
//        user.setChannels(Channel);
//        
//        user.setChannelAktif(2);
//        user.setVolume(100);
//        user.setChannelAktif(1);
//        user.setChannelAktif(10);
//        
//        // teletext con
//        user.setModusTampilan(TelevisiModern.TELETEXT);
//        user.getModusTampilan();
//        user.setHalamanTeletext(250);
//        user.setModusTampilan(TelevisiModern.TV);
//        user.getModusTampilan();
//        
//        // CD
//        user.playCD();
//        user.setDiscTray("Titanic");
//        user.playCD();
        
    }
}
