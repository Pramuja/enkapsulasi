/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.lang.Math;
/**
 *
 * @author USER
 */
public class Bola {
    private double jari_jari = 14;
    private double diameter;
    private double luas;
    private double volume;
    
    public void setJari(double jari_jari) {
        this. jari_jari = jari_jari;
    }
    public void showDiameter() {
        this.diameter = 2*jari_jari;
    }
    public void showLuas() {
        this.luas = 4*Math.PI*jari_jari*jari_jari;
    }
    public void showVolume() {
        this.volume = (4*Math.PI*jari_jari*jari_jari*jari_jari)/3;
    }
    public void cetak() {
        System.out.println("Jari-jari :" +jari_jari+" cm ");
        System.out.println("---------------------------------");
        System.out.println("Diameter :" +diameter+" cm ");
        System.out.println("Luas :" +luas+" cm2 ");
        System.out.println("Volume :" +volume+" cm3 ");
    }
}
    
