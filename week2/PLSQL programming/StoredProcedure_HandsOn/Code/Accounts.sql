CREATE TABLE Accounts (
    account_id     NUMBER PRIMARY KEY,
    customer_name  VARCHAR2(50),
    account_type   VARCHAR2(20), -- e.g., ''Savings'', ''Current''
    balance        NUMBER(10,2)
);
