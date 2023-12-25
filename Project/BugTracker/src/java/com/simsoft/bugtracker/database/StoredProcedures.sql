-- Bug-related stored procedures
DELIMITER $$

CREATE PROCEDURE CreateBugProcedure(
    IN bugTitle VARCHAR(255),
    IN bugDescription TEXT,
    IN bugStatus VARCHAR(50)
)
BEGIN
    INSERT INTO Bugs (title, description, status)
    VALUES (bugTitle, bugDescription, bugStatus);
END $$

CREATE PROCEDURE UpdateBugProcedure(
    IN bugId INT,
    IN bugTitle VARCHAR(255),
    IN bugDescription TEXT,
    IN bugStatus VARCHAR(50)
)
BEGIN
    UPDATE Bugs
    SET title = bugTitle, description = bugDescription, status = bugStatus
    WHERE bug_id = bugId;
END $$

CREATE PROCEDURE DeleteBugProcedure(
    IN bugId INT
)
BEGIN
    DELETE FROM Bugs
    WHERE bug_id = bugId;
END $$

CREATE PROCEDURE GetAllBugsProcedure()
BEGIN
    SELECT * FROM Bugs;
END $$

-- Dashboard-related stored procedures

-- Procedure to retrieve metrics data for the dashboard
CREATE PROCEDURE DashboardMetricsProcedure()
BEGIN
    SELECT * FROM MetricsTable;
    -- Replace 'MetricsTable' with the appropriate table and columns for your metrics data
END $$

-- Procedure to retrieve chart data for the dashboard
CREATE PROCEDURE DashboardChartsProcedure()
BEGIN
    SELECT * FROM ChartDataTable;
    -- Replace 'ChartDataTable' with the appropriate table and columns for your chart data
END $$

-- Procedure to retrieve summarized data for the dashboard
CREATE PROCEDURE DashboardSummaryProcedure()
BEGIN
    SELECT * FROM SummaryDataTable;
    -- Replace 'SummaryDataTable' with the appropriate table and columns for your summarized data
END $$



-- Workflow-related stored procedures

-- Procedure to retrieve all workflows
CREATE PROCEDURE GetAllWorkflowsProcedure()
BEGIN
    SELECT * FROM Workflows;
    -- Replace 'Workflows' with the actual table name containing your workflow data
END $$

-- Procedure to create a new workflow
CREATE PROCEDURE CreateWorkflowProcedure(
    IN workflowName VARCHAR(255), -- Parameters for creating a workflow
    -- Add other parameters as required
)
BEGIN
    -- Sample logic to create a new workflow
    INSERT INTO Workflows (name, ...) -- Replace 'Workflows' and column names accordingly
    VALUES (workflowName, ...); -- Replace 'workflowName' with actual parameter names
    -- Adjust the INSERT statement based on your table structure and required parameters
END $$

-- Procedure to update an existing workflow
CREATE PROCEDURE UpdateWorkflowProcedure(
    IN workflowId INT, -- Parameters for updating a workflow
    IN updatedName VARCHAR(255),
    -- Add other parameters as required
)
BEGIN
    -- Sample logic to update an existing workflow
    UPDATE Workflows -- Replace 'Workflows' with the actual table name
    SET name = updatedName -- Adjust columns to update based on your requirements
    WHERE workflow_id = workflowId; -- Replace 'workflow_id' with your actual ID column
END $$

-- Procedure to delete a workflow
CREATE PROCEDURE DeleteWorkflowProcedure(
    IN workflowId INT -- Parameter for deleting a workflow
)
BEGIN
    DELETE FROM Workflows
    WHERE workflow_id = workflowId; -- Replace 'workflow_id' with your actual ID column
END $$

DELIMITER ;

