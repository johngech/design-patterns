package com.marakicode.designpatterns.architectural.interceptingfilter;

public class TestInterceptingFilter {
    public static void test(){
        var target = new TargetController();
        var filterManger = new FilterManager(target);

        filterManger.addFilter(new LoggingFilter());
        filterManger.addFilter(new AuthenticationFilter());
        filterManger.addFilter(new CompressionFilter());

        var frontController = new FrontController(filterManger);
        frontController.handleRequest(new Request("/users",null));
        frontController.handleRequest(new Request("/products","#@$DAG#%"));
    }
}
