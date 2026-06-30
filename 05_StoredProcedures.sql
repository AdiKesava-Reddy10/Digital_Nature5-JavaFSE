DELIMITER //
CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
UPDATE Accounts
SET Balance=Balance+(Balance*0.01)
WHERE AccountType='Savings';
END//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE UpdateEmployeeBonus(IN dept VARCHAR(50),IN bonus DECIMAL(5,2))
BEGIN
UPDATE Employees
SET Salary=Salary+(Salary*bonus/100)
WHERE Department=dept;
END//
DELIMITER ;
