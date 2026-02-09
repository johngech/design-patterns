package com.marakicode.designpatterns.creational.abstractfactory.exercise1;

public class TestWeightLossApp {
    public static void test(){
        var home = new HomePage();
        home.setGoal(new BuildMuscleFactory());
        home.setGoal(new WeightLossFactory());
        home.setGoal(new StrengthTrainingFactory());
    }
}
