INSERT INTO Customers VALUES
(1,'John Doe','1985-05-15',1000,NOW(),'FALSE'),
(2,'Jane Smith','1990-07-20',15000,NOW(),'FALSE');

INSERT INTO Accounts VALUES
(1,1,'Savings',1000,NOW()),
(2,2,'Checking',1500,NOW());

INSERT INTO Loans VALUES
(1,1,5000,5,CURDATE(),DATE_ADD(CURDATE(),INTERVAL 60 MONTH));

INSERT INTO Employees VALUES
(1,'Alice Johnson','Manager',70000,'HR','2015-06-15'),
(2,'Bob Brown','Developer',60000,'IT','2017-03-20');

INSERT INTO Transactions VALUES
(1,1,NOW(),200,'Deposit'),
(2,2,NOW(),300,'Withdrawal');
