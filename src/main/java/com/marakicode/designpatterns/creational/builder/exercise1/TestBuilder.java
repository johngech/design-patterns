package com.marakicode.designpatterns.creational.builder.exercise1;

public class TestBuilder {
    public static void test() {
        var hero = new Hero.Builder(Profession.MAGE, "John")
                .withHairType(HairType.CURLY)
                .withHairColor(HairColor.BLACK)
                .withArmor(Armor.LEATHER)
                .withWeapon(Weapon.DAGGER)
                .build();
        System.out.println(hero);
        System.out.println("Profession: " + hero.getProfession());
    }
}
