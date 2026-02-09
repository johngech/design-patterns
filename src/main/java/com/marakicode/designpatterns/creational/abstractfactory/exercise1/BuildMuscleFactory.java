package com.marakicode.designpatterns.creational.abstractfactory.exercise1;

public class BuildMuscleFactory implements GoalFactory {
    @Override
    public MealPlan createMealPlan() {
        return new BuildMuscleMeal();
    }

    @Override
    public WorkoutRoutine createWorkoutRoutine() {
        return new BuildMuscleWorkout();
    }
}
