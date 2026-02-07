package com.marakicode.designpatterns.structural.composite.exercise1;

public class TestTeam {
    public static void test() {
        var team1 = new Team();
        team1.add(new Human());
        team1.add(new Human());
        team1.add(new Truck());

        var team2 = new Team();
        team2.add(new Human());
        team2.add(new Truck());

        var team = new Team();
        team.add(team1);
        team.add(team2);
        team.move();
    }
}
