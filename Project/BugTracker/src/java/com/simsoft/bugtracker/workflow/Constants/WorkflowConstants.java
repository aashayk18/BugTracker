package com.simsoft.bugtracker.workflow.Constants;

public class WorkflowConstants {
    // Workflow Status Constants
    public static final String STATUS_NEW = "New";
    public static final String STATUS_IN_PROGRESS = "In Progress";
    public static final String STATUS_ON_HOLD = "On Hold";
    public static final String STATUS_COMPLETED = "Completed";
    public static final String STATUS_CANCELLED = "Cancelled";

    // Workflow Type Constants
    public static final String TYPE_BUG = "Bug Workflow";
    public static final String TYPE_TASK = "Task Workflow";
    public static final String TYPE_FEATURE = "Feature Workflow";

    // Workflow Transition Constants
    public static final String TRANSITION_START = "Start Workflow";
    public static final String TRANSITION_FINISH = "Finish Workflow";

    // Other Workflow Constants
    public static final String DEFAULT_ASSIGNEE = "Unassigned";
    
}
