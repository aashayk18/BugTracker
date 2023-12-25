package com.simsoft.bugtracker.bug.UX;

import com.simsoft.bugtracker.bug.Beans.BugBean;
import java.util.List;
import java.util.Scanner;

public class BugUI {
    private Scanner scanner;

    public BugUI() {
        scanner = new Scanner(System.in);
    }

    public void displayBugList(List<BugBean> bugs) {
        for (BugBean bug : bugs) {
            System.out.println(bug.getBugId() + ": " + bug.getTitle() + " - " + bug.getStatus());
        }
    }

    public void displayBugDetails(BugBean bug) {
        System.out.println("Bug ID: " + bug.getBugId());
        System.out.println("Title: " + bug.getTitle());
        System.out.println("Description: " + bug.getDescription());
        System.out.println("Status: " + bug.getStatus());
        System.out.println("Priority: " + bug.getPriority());
        // Display other bug details as needed
    }

    public BugBean showBugCreationForm() {
        System.out.println("Enter Bug Title:");
        String title = scanner.nextLine();

        System.out.println("Enter Bug Description:");
        String description = scanner.nextLine();

        System.out.println("Enter Bug Status:");
        String status = scanner.nextLine();

        System.out.println("Enter Bug Priority:");
        String priority = scanner.nextLine();

        // Create and return a new BugBean object
        BugBean bug = new BugBean();
        bug.setTitle(title);
        bug.setDescription(description);
        bug.setStatus(status);
        bug.setPriority(priority);

        return bug;
    }

    public void showBugUpdateForm(BugBean bug) {
        System.out.println("Update Bug Title:");
        String title = scanner.nextLine();
        bug.setTitle(title);

        System.out.println("Update Bug Description:");
        String description = scanner.nextLine();
        bug.setDescription(description);

        System.out.println("Update Bug Status:");
        String status = scanner.nextLine();
        bug.setStatus(status);

        System.out.println("Update Bug Priority:");
        String priority = scanner.nextLine();
        bug.setPriority(priority);

        // Update BugBean object directly
    }
}
