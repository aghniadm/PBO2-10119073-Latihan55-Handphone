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

public class PBO210119073Latihan55Handphone {

    public static void main(String[] args) {
        Android android = new Android("Samsung", "Android", "Grand", 3000000); 
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : "+android.getKeyStore());
        System.out.println("");
        
        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000); 
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        System.out.println("");
        
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000); 
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore());
        
    }
    
}
