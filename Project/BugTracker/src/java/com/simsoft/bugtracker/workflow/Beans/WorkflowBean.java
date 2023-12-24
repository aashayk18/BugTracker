package com.simsoft.bugtracker.workflow.Beans;

import java.io.Serializable;

public class WorkflowBean implements Serializable {
    private int workflowId;
    private String name;
    private String status;
    // Add more attributes as needed

    // Constructors
    public WorkflowBean() {
        // Default constructor
    }

    public WorkflowBean(int workflowId, String name, String status) {
        this.workflowId = workflowId;
        this.name = name;
        this.status = status;
    }

    // Getters and Setters
    public int getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(int workflowId) {
        this.workflowId = workflowId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Other methods as per requirement
}
