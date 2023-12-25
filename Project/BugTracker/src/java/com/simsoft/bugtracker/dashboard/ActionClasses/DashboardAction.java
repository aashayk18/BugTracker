package com.simsoft.bugtracker.dashboard.ActionClasses;

import com.simsoft.bugtracker.dashboard.Beans.DashboardBean;
import com.simsoft.bugtracker.database.DBConnection;
import com.simsoft.bugtracker.database.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DashboardAction {
    // Method to retrieve summarized dashboard data
    public DashboardBean getDashboardSummary() {
        DashboardBean dashboardData = new DashboardBean(); // Create a bean to hold dashboard data
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DBConnection.getConnection();
            // Query to retrieve aggregated data (example: total bugs, resolved bugs, etc.)
            String query = "SELECT COUNT(*) AS totalBugs, SUM(CASE WHEN status = 'Resolved' THEN 1 ELSE 0 END) AS resolvedBugs FROM bugs";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int totalBugs = resultSet.getInt("totalBugs");
                int resolvedBugs = resultSet.getInt("resolvedBugs");

                // Set retrieved data to the DashboardData bean
                dashboardData.setTotalBugs(totalBugs);
                dashboardData.setResolvedBugs(resolvedBugs);
                // ... Set more data as needed
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions
        } finally {
            DBUtil.closeResultSet(resultSet);
            DBUtil.closeStatement(statement);
            DBUtil.closeConnection(connection);
        }
        return dashboardData;
    }
}
