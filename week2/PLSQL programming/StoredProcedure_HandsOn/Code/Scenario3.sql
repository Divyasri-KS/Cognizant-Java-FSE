CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account IN NUMBER,
    p_to_account   IN NUMBER,
    p_amount       IN NUMBER
) IS
    v_balance NUMBER;
BEGIN
    -- Get source account balance
    SELECT balance INTO v_balance
    FROM Accounts
    WHERE account_id = p_from_account
    FOR UPDATE;

    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    ELSE
        -- Deduct from source
        UPDATE Accounts
        SET balance = balance - p_amount
        WHERE account_id = p_from_account;

        -- Add to destination
        UPDATE Accounts
        SET balance = balance + p_amount
        WHERE account_id = p_to_account;

        DBMS_OUTPUT.PUT_LINE('Transfer successful from ' || p_from_account || ' to ' || p_to_account);
    END IF;
END