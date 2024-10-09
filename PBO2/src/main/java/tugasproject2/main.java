/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasproject2;

/**
 *
 * @author VICTUS
 */
public class main {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        Ferrari ferrari = new Ferrari();
        McLaren mclaren = new McLaren();
        Mercedes mercedes = new Mercedes();
        RedBull redbull = new RedBull();

        // Mengatur jumlah medali
        ferrari.setGold(3);
        ferrari.setSilver(2);
        ferrari.setBronze(1);
        ferrari.hitungPoin();
        ferrari.tampilkanPoin();

        mclaren.setGold(2);
        mclaren.setSilver(3);
        mclaren.setBronze(1);
        mclaren.setFirstWin(1);
        mclaren.hitungPoin();
        mclaren.tampilkanPoin();
        mclaren.tampilkanFirstWin();

        mercedes.setGold(1);
        mercedes.setSilver(2);
        mercedes.setBronze(3);
        mercedes.hitungPoin();
        mercedes.tampilkanPoin();

        redbull.setGold(4);
        redbull.setSilver(1);
        redbull.setBronze(2);
        redbull.hitungPoin();
        redbull.tampilkanPoin();
    }
}
