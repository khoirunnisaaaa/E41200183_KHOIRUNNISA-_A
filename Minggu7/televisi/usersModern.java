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
public class usersModern {
    public static void main(String[] args) {
        
        TelevisiModern user = new TelevisiModern("Samsung TV 24 inch", 10);
 
        String[] Channel = {
          "RCTI", "SCTV", "INDOSIAR", "LA TV", "METRO TV", "TRANS TV", "TPI", "TV 7", "Spacetoon", "GTV"
        };
        
        user.getDeskripsi();
        user.getChannel();
        user.setChannels(Channel);
        
        user.setChannelAktif(3);
        user.setVolume(10);
        user.setChannelAktif(2);
        user.setChannelAktif(1);
        user.setModusTampilan(TelevisiModern.teletext);
        user.setHalamanTeletext(250);
        user.setModusTampilan(TelevisiModern.televisi);
        user.getModusTampilan();
        user.playCD();
        user.setDiscTray("The Matrix");
        user.playCD();
    }
}
