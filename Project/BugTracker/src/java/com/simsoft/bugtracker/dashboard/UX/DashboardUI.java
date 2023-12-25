package com.simsoft.bugtracker.dashboard.UX;


import java.util.Map;

public class DashboardUI {
    public void displayMetrics(Map<String, Object> metricsData) {
        System.out.println("---- Dashboard Metrics ----");
        for (Map.Entry<String, Object> entry : metricsData.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---------------------------");
    }

    public void displayCharts(Map<String, Object> chartData) {
        System.out.println("---- Dashboard Charts ----");
        for (Map.Entry<String, Object> entry : chartData.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---------------------------");
    }

    public void showSummary(Map<String, Object> summaryData) {
        System.out.println("---- Dashboard Summary ----");
        for (Map.Entry<String, Object> entry : summaryData.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---------------------------");
    }

    // Other UI-related methods as needed
}
