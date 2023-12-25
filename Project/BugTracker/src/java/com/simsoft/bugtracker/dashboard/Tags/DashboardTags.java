package com.simsoft.bugtracker.dashboard.Tags;

import java.util.ArrayList;
import java.util.List;

public class DashboardTags {
    private List<String> dashboardTags;

    public DashboardTags() {
        this.dashboardTags = new ArrayList<>();
    }

    public void addTag(String tag) {
        dashboardTags.add(tag);
    }

    public void removeTag(String tag) {
        dashboardTags.remove(tag);
    }

    public boolean hasTag(String tag) {
        return dashboardTags.contains(tag);
    }

    public List<String> getAllTags() {
        return dashboardTags;
    }
}
