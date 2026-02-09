package com.marakicode.designpatterns.creational.abstractfactory.exercise1;

public class StrengthTrainingFactory implements GoalFactory {
    @Override
    public MealPlan createMealPlan() {
        return new StrengthTrainingLoosMeal();
    }

    @Override
    public WorkoutRoutine createWorkoutRoutine() {
        return new StrengthTrainingWorkout();
    }
}
