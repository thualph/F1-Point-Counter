/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO2;

/**
 *
 * @author VICTUS
 */
public class MobilBekerja {
    public static void main(String[] args) {
        Mobil mobilSaya = new Mobil();
        mobilSaya.warna = "Merah";
        mobilSaya.jenisMesin = "V8";
        mobilSaya.jumlahRoda = 4;

        // Perilaku mobil saat metode dijalankan
        mobilSaya.hidupkanMesin(); // Perilaku: Mesin dihidupkan
        mobilSaya.rem();           // Perilaku: Mobil berhenti
        mobilSaya.klakson();       // Perilaku: Klakson dibunyikan
    }
}
