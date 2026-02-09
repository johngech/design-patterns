package com.marakicode.designpatterns.architectural.interceptingfilter;

public interface Filter {
    boolean shouldFilter(Request request);
}
