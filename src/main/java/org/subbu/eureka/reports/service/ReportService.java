package org.subbu.eureka.reports.service;

import org.subbu.eureka.reports.service.Report;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
public class ReportService implements IReportService {

    private static Logger logger = LoggerFactory.getLogger(ReportService.class);

    private List<Report> reports;

    public ReportService() {
        reports = new LinkedList<>();
        reports.add(new Report("This is a contribution report.", "Contribution"));
        reports.add(new Report("This is a distribution report", "Distribution"));
    }

    public Report getReportDetails(@PathVariable String name) {

        Optional<Report> report = reports.stream().filter(r -> r.getReportName() == name).findFirst();

        return report.get();

    }

}