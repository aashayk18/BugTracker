package com.simsoft.bugtracker.workflow.ActionClasses;

import com.simsoft.bugtracker.workflow.Beans.WorkflowBean;
import com.simsoft.bugtracker.database.DBConnection;
import com.simsoft.bugtracker.database.DBUtil;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WorkflowAction {
    // Method to retrieve all workflows using stored procedures
    public List<WorkflowBean> getAllWorkflowsUsingProcedure() {
        List<WorkflowBean> workflows = new ArrayList<>();
        Connection connection = null;
        CallableStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DBConnection.getConnection();
            // Call the stored procedure to retrieve all workflows
            statement = connection.prepareCall("{call GetAllWorkflowsProcedure()}");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int workflowId = resultSet.getInt("workflow_id");
                String name = resultSet.getString("name");
                String status = resultSet.getString("status");

                WorkflowBean workflow = new WorkflowBean(workflowId, name, status);
                workflows.add(workflow);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions
        } finally {
            DBUtil.closeResultSet(resultSet);
            DBUtil.closeStatement(statement);
            DBUtil.closeConnection(connection);
        }
        return workflows;
    }

}
