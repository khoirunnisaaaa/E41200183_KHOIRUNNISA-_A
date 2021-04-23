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
public class TVTradisional {
    String Deskripsi;
    int lengthChannel;
    String[] Channels = new String[lengthChannel];
    int channelAktif;
    
    
    TVTradisional(final String Deskripsi, final int lengthChannel) {
        this.Deskripsi = Deskripsi;
        this.lengthChannel = lengthChannel;
    }
    
    // create getter for Deskripsi & Channel to get value of that atribut
    public void getDeskripsi() { 
        System.out.println("Khoirunnisa' membeli " + Deskripsi);
    }
    
    public void getChannel() {
        if(this.Channels.length == 0) {
            System.out.println("Belum ada channel yang di-set!");
        } 
    }
    
    // set create setter for Channels, channelAktif, Volume
    public void setChannels(String[] Channels) {
        if (Channels.length > 10) {
            System.out.println("maaf Tv ini hanya dapat menampung 10 channel");
        } 
        else {
            this.Channels = Channels;
            System.out.println("informasi channel berhasil di-update!");
        }
    }
    public void setChannelAktif(int indexChannel) {
        this.channelAktif = indexChannel;
        int finalIndex = indexChannel - 1;
        System.out.println("Pindah ke channel : " + this.Channels[finalIndex]);
    }
    
    // setter volume 
    public void setVolume(int Volume) {
        System.out.println("Intensitas volume sekarang : " + Volume + " from 100");
    }
    
    
}
