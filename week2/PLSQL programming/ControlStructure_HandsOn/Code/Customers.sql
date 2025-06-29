CREATE TABLE Customers (
    CustomerID      NUMBER PRIMARY KEY,
    Name            VARCHAR2(50),
    Age             NUMBER,
    Balance         NUMBER(10,2),
    IsVIP           CHAR(1), -- 'Y' or 'N'
    LoanInterest    NUMBER(5,2) -- e.g., 8.5%
);
