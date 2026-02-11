package com.marakicode.designpatterns.creational.builder.exercise1;

public final class Hero {
    private final Profession profession;
    private final String name;
    private final HairType hairType;
    private final HairColor hairColor;
    private final Armor armor;
    private final Weapon weapon;

    public Hero(Builder builder) {
        profession = builder.getProfession();
        name = builder.getName();
        hairType = builder.getHairType();
        hairColor = builder.getHairColor();
        armor = builder.getArmor();
        weapon = builder.getWeapon();
    }

    public static class Builder {
        private final Profession profession;
        private final String name;
        private HairType hairType;
        private HairColor hairColor;
        private Armor armor;
        private Weapon weapon;

        public Builder(Profession profession, String name) {
            this.profession = profession;
            this.name = name;
        }

        public Builder withHairType(HairType type) {
            this.hairType = type;
            return this;
        }

        public Builder withHairColor(HairColor color) {
            this.hairColor = color;
            return this;
        }

        public Builder withArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }

        public Profession getProfession() {
            return profession;
        }

        public String getName() {
            return name;
        }

        public HairType getHairType() {
            return hairType;
        }

        public HairColor getHairColor() {
            return hairColor;
        }

        public Armor getArmor() {
            return armor;
        }

        public Weapon getWeapon() {
            return weapon;
        }

    }

    public Profession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public HairType getHairType() {
        return hairType;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "Hero(profession: " + profession +
                ", name: " + name +
                ", hairType: " + hairType +
                ", hairColor: " + hairColor +
                ", armor:" + armor +
                ", weapon: " + weapon + ")";
    }
}
