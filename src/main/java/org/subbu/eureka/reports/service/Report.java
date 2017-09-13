package org.subbu.eureka.reports.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Report {

    private String reportData;
    private String reportName;


    public Report() {
    }

    public Report(String reportData, String reportName) {
        this.reportData = reportData;
        this.reportName = reportName;
    }

    public String getReportData() {
        return reportData;
    }

    public String getReportName() {
        return reportName;
    }


    public void setReportData(String reportData) {
        this.reportData = reportData;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

}