BEGIN
  FOR cust_rec IN (SELECT CustomerID, Age FROM Customers) LOOP
    IF cust_rec.Age > 60 THEN
      UPDATE Customers
      SET LoanInterest = LoanInterest - 1
      WHERE CustomerID = cust_rec.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/
