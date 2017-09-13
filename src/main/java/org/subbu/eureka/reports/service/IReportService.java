package org.subbu.eureka.reports.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface IReportService {

    @RequestMapping(value = "/report/{name}", method = RequestMethod.GET, produces = "application/json")
    Report getReportDetails(@PathVariable("name") String name);
}