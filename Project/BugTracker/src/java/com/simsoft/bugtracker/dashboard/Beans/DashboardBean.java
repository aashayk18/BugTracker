package com.simsoft.bugtracker.dashboard.Beans;

import java.io.Serializable;

public class DashboardBean implements Serializable {
    private int totalBugs;
    private int resolvedBugs;

    // Constructors
    public DashboardBean() {
        // Default constructor
    }

    // Getters and Setters
    public int getTotalBugs() {
        return totalBugs;
    }

    public void setTotalBugs(int totalBugs) {
        this.totalBugs = totalBugs;
    }

    public int getResolvedBugs() {
        return resolvedBugs;
    }

    public void setResolvedBugs(int resolvedBugs) {
        this.resolvedBugs = resolvedBugs;
    }

}
