package com.simsoft.bugtracker.workflow.Tags;

import java.util.HashMap;
import java.util.Map;

public class WorkflowTags {
    private Map<String, Integer> workflowTags; // Assuming associating tags with workflow IDs

    public WorkflowTags() {
        this.workflowTags = new HashMap<>();
    }

    public void addTag(int workflowId, String tag) {
        workflowTags.put(tag, workflowId);
    }

    public void removeTag(String tag) {
        workflowTags.remove(tag);
    }

    public boolean hasTag(String tag) {
        return workflowTags.containsKey(tag);
    }

    public Map<String, Integer> getAllTags() {
        return workflowTags;
    }
}
