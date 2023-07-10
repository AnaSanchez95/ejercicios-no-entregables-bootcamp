package Clase13.Ejercicio2;

import java.util.List;

public abstract class Personaje {
    protected String name;
    protected int level;
    protected int experience;
    protected  int hp;
    protected int defense;
    protected int totalDefense;
    protected int attack;
    protected int totalAttack;
    protected List<Armor> armors;
    protected List<Weapon> weapons;
    protected List<Item> items;
    public Personaje() {
    }

    public Personaje(String name) {
        this.name = name;
        this.level = 0;
        this.experience = 0;
        this.hp = 100;
        this.defense = 70;
        this.attack = 90;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getTotalDefense() {
        return totalDefense;
    }

    public void setTotalDefense() {
        int extraDefense = 0;
        for (Armor armor: armors)
            extraDefense += armor.getDefense();
        totalDefense += extraDefense;
    }

    public int getAttack() {
        return attack;
    }

    public int getTotalAttack() {
        return totalAttack;
    }

    public void setTotalAttack() {
        int extraAttack = 0;
        for (Weapon weapon : weapons)
            extraAttack = weapon.getAttack();
        totalAttack += extraAttack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    public abstract void attack();
    public void getDamage(int damage){
        if(!isAlive()){
            System.out.println("Dead");
        }
        else {
            hp -= damage;
        }
    }
    public void heal(int heal) {
        if (hp + heal >= 100){
            hp = 100;
        } else
            hp += heal;
    }
    public  void gainExperience( int exp){
        if (experience + exp >= 1000) {
            experience = (experience + exp) - 1000;
            level += 1;
        } else
            experience += exp;
    }
    public boolean isAlive(){
        return hp > 0;
    }

}
