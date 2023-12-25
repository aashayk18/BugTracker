package com.simsoft.bugtracker.workflow.UX;

import com.simsoft.bugtracker.workflow.Beans.WorkflowBean;
import java.util.List;
import java.util.Scanner;

public class WorkflowUI {
    private Scanner scanner;

    public WorkflowUI() {
        scanner = new Scanner(System.in);
    }

    public void displayWorkflowList(List<WorkflowBean> workflows) {
        System.out.println("---- Workflows ----");
        for (WorkflowBean workflow : workflows) {
            System.out.println("Workflow ID: " + workflow.getWorkflowId() + ", Name: " + workflow.getName());
            // Display other relevant information
        }
        System.out.println("-------------------");
    }

    public void displayWorkflowDetails(WorkflowBean workflow) {
        System.out.println("---- Workflow Details ----");
        System.out.println("Workflow ID: " + workflow.getWorkflowId());
        System.out.println("Name: " + workflow.getName());
        // Display other detailed information of the workflow
        System.out.println("--------------------------");
    }

    public void showWorkflowCreationForm() {
        System.out.println("---- Create New Workflow ----");
        System.out.println("Enter Workflow Name:");
        String name = scanner.nextLine();
        // Get other necessary information for creating a workflow

        // Create and save the new workflow
        System.out.println("Workflow '" + name + "' created successfully!");
        System.out.println("-----------------------------");
    }

    public void showWorkflowUpdateForm(WorkflowBean workflow) {
        System.out.println("---- Update Workflow ----");
        System.out.println("Enter New Workflow Name:");
        String name = scanner.nextLine();
        workflow.setName(name);
        // Update other attributes as needed for the existing workflow

        // Update and save the modified workflow
        System.out.println("Workflow updated successfully!");
        System.out.println("---------------------------");
    }

    // Other UI-related methods as needed
}
