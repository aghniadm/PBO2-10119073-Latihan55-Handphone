package pbo2.pkg10119073.latihan55.handphone;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan spesifikasi handphone
 * dengan konsep pewarisan class
 *
 */

public class WindowsPhone extends Handphone{
    private String wpKeyStore;
    
    public WindowsPhone(String man, String os, String model, int harga){
        super (man, os, model, harga);
    }
    
    public String getWpKeyStore(){
        return wpKeyStore;
    }
   
    public void setWpKeyStore(String wpKeyStore){
        this.wpKeyStore =  wpKeyStore;
    }
}
