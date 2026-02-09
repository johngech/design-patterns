package com.marakicode.designpatterns.creational.abstractfactory.exercise1;

public class WeightLossFactory implements GoalFactory{
    @Override
    public MealPlan createMealPlan() {
        return new WeightLossMeal();
    }

    @Override
    public WorkoutRoutine createWorkoutRoutine() {
        return new WeightLossWorkout();
    }
}
