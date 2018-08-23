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
public class TestBiodata {
    public static void main(String[] args) {
        MohamadAnggaSetyoPramuja biodata = new MohamadAnggaSetyoPramuja();
        biodata.setNamaAyah("Listiawan");
        biodata.setNamaIbu("Ngatsriatun");
        biodata.setNamaSendiri("Angga");
        biodata.setNamaSaudara("Zefril");
        biodata.setAlamat("Jln. Danau Kerinci V");
        biodata.setHobi("Berenang");
        biodata.setCita("Front End Developer");
        biodata.setUmur(17);
        
        System.out.println("Nama Ayah    : " + biodata.getNamaAyah());
        System.out.println("Nama Ibu     : " + biodata.getNamaIbu());
        System.out.println("Nama Sendiri : " + biodata.getNamaSendiri());
        System.out.println("Nama Saudara : " + biodata.getNamaSaudara());
        System.out.println("Alamat       : " + biodata.getAlamat());
        System.out.println("Hobi         : " + biodata.getHobi());
        System.out.println("Cita-cita    : " + biodata.getCita());
        System.out.println("Umur         : " + biodata.getUmur());
    }
}
