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
public class Bus2 {
    public double penumpang;
    public double maxpenumpang;
    public double counter;
    public double penumpangBaru;
    
    public Bus2(double maxpenumpang)
    {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    public void addPenumpang(int penumpang) {
        int temp;
        temp = penumpang+penumpang;
        if (temp > maxpenumpang) {
            System.out.println("Penumpang melebihi kuota");
        }
        else {
            this.penumpang = temp;
        }
    }
    public void getPenumpang(int password) {
        if (password==24) {
            System.out.println("Password Benar");
        }
        else {
            System.out.println("Password Salah");
        }
    }
    public void getAverage()
    {
        double Avg;
        double BBPenumpangLama;
        double BBPenumpangBaru;
        double jmlh;
        int BBLama = 40;
        int BBBaru = 45;
        BBPenumpangLama = penumpang*BBLama;
        BBPenumpangBaru = penumpangBaru*BBBaru;
        jmlh = this.penumpang+penumpang;
        Avg = BBPenumpangLama + BBPenumpangBaru/jmlh;
        System.out.println("Rata-rata berat penumpang adalah :  " +Avg+ " dari : "+penumpang);
    }
    public void cetakpenumpang() {
        System.out.println("Penumpang Bus Sekarang = "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = "+maxpenumpang);
    }
}
