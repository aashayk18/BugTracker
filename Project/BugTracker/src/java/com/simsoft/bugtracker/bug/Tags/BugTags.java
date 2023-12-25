package com.simsoft.bugtracker.bug.Tags;

import java.util.HashSet;
import java.util.Set;

public class BugTags {
    private Set<String> bugTags;

    public BugTags() {
        this.bugTags = new HashSet<>();
    }

    public void addTag(String tag) {
        bugTags.add(tag);
    }

    public void removeTag(String tag) {
        bugTags.remove(tag);
    }

    public boolean hasTag(String tag) {
        return bugTags.contains(tag);
    }

    public Set<String> getAllTags() {
        return bugTags;
    }
}
