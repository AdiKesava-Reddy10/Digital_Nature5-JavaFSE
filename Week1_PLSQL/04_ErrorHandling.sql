DELIMITER //
CREATE PROCEDURE SafeTransferFunds(IN fromAcc INT,IN toAcc INT,IN amt DECIMAL(10,2))
BEGIN
DECLARE bal DECIMAL(10,2);
START TRANSACTION;
SELECT Balance INTO bal FROM Accounts WHERE AccountID=fromAcc;
IF bal<amt THEN
ROLLBACK;
SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT='Insufficient Funds';
ELSE
UPDATE Accounts SET Balance=Balance-amt WHERE AccountID=fromAcc;
UPDATE Accounts SET Balance=Balance+amt WHERE AccountID=toAcc;
COMMIT;
END IF;
END//
DELIMITER ;
