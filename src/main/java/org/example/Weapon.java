package org.example;

public enum Weapon {
    SWORD;
        private int damage;
        private double attackSpeed;

    public int getDamage() {
        return this.damage;
    }
    public double getAttackSpeed() {
        return this.attackSpeed;
    }
}
