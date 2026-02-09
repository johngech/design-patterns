package com.marakicode.designpatterns.creational.factorymethod;

public class TestFactoryMethod {
    public static void test(){
        new UsersController().showUsers();
        new ProductsController().showProducts();
    }
}
