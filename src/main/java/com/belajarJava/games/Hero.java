package com.belajarJava.games;

public class Hero {
    private String name;
    private int mana;
    private int blood;
    private int xPosition = 0;
    private int yPosition = 0;
    private Skill skill;

    Hero(String name, int mana, int blood, Skill skill) {
        this.name = name;
        this.mana = mana;
        this.blood = blood;
        this.skill = skill;
    }

    void run(int xPosition, int yPosition) {
        this.xPosition += xPosition;
        this.yPosition += yPosition;
    }

    void hit(int decrementValue) {
        blood -= decrementValue;
    }

    void decreaseMana(int decrease) {
        mana -= decrease;
    }

    void attack(int code, Hero target) {
        if (code == 1) {
            // Gunakan skill 1
            if (mana >= skill.getSkill1()) {
                target.damage(target, skill.getSkill1());
                decreaseMana(skill.getSkill1());
            } else {
                System.out.println(name + ": Mana does not enough to use Skill 1.");
            }
        } else if (code == 2) {
            // Gunakan skill 2
            if (mana >= skill.getSkill2()) {
                target.damage(target, skill.getSkill2());
                decreaseMana(skill.getSkill2());
            } else {
                System.out.println(name + ": Mana does not enough to use Skill 2.");
            }
        } else if (code == 3) {
            // Gunakan skill 3, hanya jika mana >= 30
            if (mana >= 30) {
                target.damage(target, skill.getSkill3());
                decreaseMana(skill.getSkill3());
            } else {
                System.out.println(name + ": Mana does not enough to use Skill 3.");
            }
        } else {
            System.out.println("Invalid skill code.");
        }
    }

    void damage(Hero target, int hitDamage) {
        target.hit(hitDamage);
    }

    public int getBlood() {
        return blood;
    }

    public int getMana() {
        return mana;
    }
}