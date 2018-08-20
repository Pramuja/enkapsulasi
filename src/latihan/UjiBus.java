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
public class UjiBus {
    private int penumpang;
    private int maxpenumpang;
    public UjiBus(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    public void addpenumpang(int penumpang) {
        int temp;
        temp = this.penumpang+penumpang;
        if (temp >= maxpenumpang) {
            System.out.println("Penumpang melebihi kuota");
        }
        else {
            this.penumpang = temp;
        }
    }
    public void cetak() {
        System.out.println("Penumpang bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxpenumpang);
    }
    public static void main(String[] args) {
        UjiBus Busbesar = new UjiBus(40);
        Busbesar.cetak();
        Busbesar.addpenumpang(15);
        Busbesar.cetak();
        Busbesar.addpenumpang(5);
        Busbesar.cetak();
        Busbesar.addpenumpang(26);
        Busbesar.cetak();
    }
}
