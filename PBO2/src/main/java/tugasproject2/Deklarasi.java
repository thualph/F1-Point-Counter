/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasproject2;

/**
 *
 * @author VICTUS
 */
public abstract class Deklarasi {
    private int gold = 0;
    private int silver = 0;
    private int bronze = 0;
    private int poin = 0;

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    public int getPoin() {
        return poin;
    }

    public void hitungPoin() {
        poin = (gold * 25) + (silver * 18) + (bronze * 15);
    }

    public void tampilkanPoin() {
        System.out.println("Perolehan poin: " + poin);
    }
}

