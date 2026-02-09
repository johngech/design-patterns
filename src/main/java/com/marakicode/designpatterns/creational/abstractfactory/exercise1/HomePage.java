package com.marakicode.designpatterns.creational.abstractfactory.exercise1;

public class HomePage {
    public void setGoal(GoalFactory factory){
        factory.createMealPlan().display();
        factory.createWorkoutRoutine().execute();
    }
}
