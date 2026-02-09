package com.marakicode.designpatterns.creational.abstractfactory.exercise1;

public interface GoalFactory {
    MealPlan createMealPlan();

    WorkoutRoutine createWorkoutRoutine();
}
