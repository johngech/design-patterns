package com.marakicode.designpatterns.creational.businessdelegate;

public class BusinessDelegate {
    private final BusinessLookup lookup;

    public BusinessDelegate(BusinessLookup lookup) {
        this.lookup = lookup;
    }

    public void doTask(String taskName) {
        var service = lookup.getService(taskName);
        service.doProcessing();
    }

}
