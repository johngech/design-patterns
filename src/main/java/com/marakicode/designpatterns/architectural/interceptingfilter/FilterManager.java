package com.marakicode.designpatterns.architectural.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Use InterceptingFilter pattern when
 * => pre-processing and post-processing operations on request and response
 * => needs to add cross-cutting concerns(Logging,Auth,Cache,Rate Limiting,...)
 */
public class FilterManager {
    private final List<Filter> filters = new ArrayList<>();
    private final TargetController controller;

    public FilterManager(TargetController controller) {
        this.controller = controller;
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void handleRequest(Request request) {
        for (var filter : filters) {
            // execute each filters one by one and
            // if one of them fails stop filtering right there
            if (!filter.shouldFilter(request))
                return;
        }

        // forward the request to the target controller
        controller.handleRequest(request);
    }
}
