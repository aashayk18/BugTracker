package com.simsoft.bugtracker.bug.ActionClasses;

import com.simsoft.bugtracker.bug.Beans.BugBean;
import com.simsoft.bugtracker.database.DBConnection;
import com.simsoft.bugtracker.database.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BugAction {
    // Method to retrieve all bugs
    public List<BugBean> getAllBugs() {
        List<BugBean> bugs = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DBConnection.getConnection();
            String query = "SELECT * FROM bugs";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int bugId = resultSet.getInt("bug_id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String status = resultSet.getString("status");

                BugBean bug = new BugBean(bugId, title, description, status);
                bugs.add(bug);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions
        } finally {
            DBUtil.closeResultSet(resultSet);
            DBUtil.closeStatement(statement);
            DBUtil.closeConnection(connection);
        }
        return bugs;
    }

    // Method to create a new bug
    public boolean createBug(BugBean bug) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DBConnection.getConnection();
            String query = "INSERT INTO bugs (title, description, status) VALUES (?, ?, ?)";
            statement = connection.prepareStatement(query);
            statement.setString(1, bug.getTitle());
            statement.setString(2, bug.getDescription());
            statement.setString(3, bug.getStatus());

            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions
            return false;
        } finally {
            DBUtil.closeStatement(statement);
            DBUtil.closeConnection(connection);
        }
    }

    // Method to update a bug
    public boolean updateBug(BugBean bug) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DBConnection.getConnection();
            String query = "UPDATE bugs SET title = ?, description = ?, status = ? WHERE bug_id = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, bug.getTitle());
            statement.setString(2, bug.getDescription());
            statement.setString(3, bug.getStatus());
            statement.setInt(4, bug.getBugId());

            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions
            return false;
        } finally {
            DBUtil.closeStatement(statement);
            DBUtil.closeConnection(connection);
        }
    }

    // Method to delete a bug
    public boolean deleteBug(int bugId) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DBConnection.getConnection();
            String query = "DELETE FROM bugs WHERE bug_id = ?";
            statement = connection.prepareStatement(query);
            statement.setInt(1, bugId);

            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions
            return false;
        } finally {
            DBUtil.closeStatement(statement);
            DBUtil.closeConnection(connection);
        }
    }
}
