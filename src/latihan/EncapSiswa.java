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
public class EncapSiswa {
    private String name;
    private String address;
    private int absen;
    
    public int getAbsen() {
         return absen;
    }
    public String getName() {
         return name;
    }
    public String getAdress() {
         return address;
    }
    public void setAge(int newAbsen) {
        absen = newAbsen;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAge(23);
        siswa.setAddress("Malang");
        
        System.out.println("Name : " + siswa.getName()
        + " Absen : " + siswa.getAbsen() + " Address : " + siswa.getAdress());
    }
}
