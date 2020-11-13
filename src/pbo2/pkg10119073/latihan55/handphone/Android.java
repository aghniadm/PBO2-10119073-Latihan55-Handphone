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

public class Android extends Handphone {
    private String keyStore;
    
    public Android(String man, String os, String model, int harga){
        super (man, os, model, harga);
    }
    
    public String getKeyStore(){
        return keyStore;
    }
    
    public void setKeyStore(String keyStore){
        this.keyStore = keyStore;
    }
}
