CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_pct  IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET salary = salary + (salary * (p_bonus_pct / 100))
    WHERE department = p_department;
    
    DBMS_OUTPUT.PUT_LINE('Bonus applied to ' || p_department || ' department.');
END;
