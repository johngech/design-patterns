package com.marakicode.designpatterns.creational.factorymethod.adey;

import com.marakicode.designpatterns.creational.factorymethod.matach.Controller;
import com.marakicode.designpatterns.creational.factorymethod.matach.ViewEngine;

public class AdeyController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new AdeyViewEngine();
    }
}
