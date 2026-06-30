UPDATE Loans l
JOIN Customers c ON l.CustomerID=c.CustomerID
SET l.InterestRate=l.InterestRate-1
WHERE TIMESTAMPDIFF(YEAR,c.DOB,CURDATE())>60;

UPDATE Customers
SET IsVIP='TRUE'
WHERE Balance>10000;

SELECT c.Name,l.EndDate
FROM Customers c
JOIN Loans l ON c.CustomerID=l.CustomerID
WHERE l.EndDate<=DATE_ADD(CURDATE(),INTERVAL 30 DAY);
