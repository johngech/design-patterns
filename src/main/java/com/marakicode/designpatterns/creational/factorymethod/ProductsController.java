package com.marakicode.designpatterns.creational.factorymethod;

import com.marakicode.designpatterns.creational.factorymethod.adey.AdeyController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends AdeyController {
    public void showProducts() {
        Map<String, Object> products = new HashMap<>();
        render("products.html", products);
    }
}
