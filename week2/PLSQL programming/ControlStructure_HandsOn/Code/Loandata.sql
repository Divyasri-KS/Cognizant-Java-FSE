BEGIN
  INSERT INTO Loans VALUES (101, 1, SYSDATE + 15);  -- Due in 15 days
  INSERT INTO Loans VALUES (102, 2, SYSDATE + 40);  -- Due in 40 days
  INSERT INTO Loans VALUES (103, 3, SYSDATE + 10);  -- Due in 10 days
  INSERT INTO Loans VALUES (104, 4, SYSDATE - 5);   -- Overdue
  COMMIT;
END;
/
