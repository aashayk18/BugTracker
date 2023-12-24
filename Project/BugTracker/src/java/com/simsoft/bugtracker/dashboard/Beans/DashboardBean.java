package com.simsoft.bugtracker.dashboard.Beans;

import java.io.Serializable;

public class DashboardBean implements Serializable {
    private int dashboardId;
    private String name;
    private String description;
    // Add more attributes as needed

    // Constructors
    public DashboardBean() {
        // Default constructor
    }

    public DashboardBean(int dashboardId, String name, String description) {
        this.dashboardId = dashboardId;
        this.name = name;
        this.description = description;
    }

    // Getters and Setters
    public int getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(int dashboardId) {
        this.dashboardId = dashboardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Other methods as per requirement
}
