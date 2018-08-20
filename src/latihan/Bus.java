/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author USER
 */
public class Bus {
    public int penumpang;
    public int maxpenumpang;
    
    public void cetak() {
        System.out.println("Penumpang bus sekarang adalah : " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah : " + maxpenumpang);
    }
    public static void main(String[] args) {
        Bus Busmini = new Bus();
        Busmini.penumpang = 5;
        Busmini.maxpenumpang = 15;
        Busmini.cetak();
        Busmini.penumpang = Busmini.penumpang + 5;
        Busmini.cetak();
        Busmini.penumpang = Busmini.penumpang - 2;
        Busmini.cetak();
        Busmini.penumpang = Busmini.penumpang + 8;
        Busmini.cetak();
    }
}
