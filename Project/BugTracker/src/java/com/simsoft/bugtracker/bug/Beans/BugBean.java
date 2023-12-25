package com.simsoft.bugtracker.bug.Beans;

import java.io.Serializable;

public class BugBean implements Serializable {
    private int bugId;
    private String title;
    private String description;
    private String status;
    private String priority;
    // Add more attributes as needed

    // Constructors
    public BugBean() {
        // Default constructor
    }

    public BugBean(int bugId, String title, String description, String status) {
        this.bugId = bugId;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    // Getters and Setters
    public int getBugId() {
        return bugId;
    }

    public void setBugId(int bugId) {
        this.bugId = bugId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    // Other methods as per requirement
}
