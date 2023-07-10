package Clase13.Ejercicio2;

public class Weapon {
    private int attack;
    private int mana;

    public Weapon() {
    }

    public Weapon(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
