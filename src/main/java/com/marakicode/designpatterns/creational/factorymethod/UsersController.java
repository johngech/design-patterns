package com.marakicode.designpatterns.creational.factorymethod;

import com.marakicode.designpatterns.creational.factorymethod.matach.Controller;

import java.util.HashMap;
import java.util.Map;

public class UsersController extends Controller {
    public void showUsers() {
        Map<String, Object> users = new HashMap<>();// get users from a database
        super.render("users.html", users);
    }
}
