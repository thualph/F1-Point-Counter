/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasproject2;

/**
 *
 * @author VICTUS
 */
public class McLaren extends Deklarasi {
    private int firstWin;

    public void setFirstWin(int firstWin) {
        this.firstWin = firstWin;
    }

    @Override
    public void hitungPoin() {
        super.hitungPoin();
        System.out.println("Poin McLaren: " + getPoin());
    }

    public void tampilkanFirstWin() {
        System.out.println("Jumlah first win: " + firstWin);
    }
}
