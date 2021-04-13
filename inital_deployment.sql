CREATE database expense_tracker;

USE expense_tracker;

CREATE TABLE User_Information (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    email VARCHAR(100) NOT NULL
);

CREATE TABLE Accounts (
    account_id INT AUTO_INCREMENT PRIMARY KEY,
    account_name VARCHAR(100),
    account_type VARCHAR(100),
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES User_Information(user_id)
);

CREATE TABLE Budgets (
    budget_id INT AUTO_INCREMENT PRIMARY KEY,
    budget_title VARCHAR(100),
    budget_amount DECIMAL (4, 2),
    budget_category VARCHAR(100),
    budget_start_date DATETIME,
    budget_end_date DATETIME
);

CREATE TABLE Transactions (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    transaction_value DECIMAL (4, 2),
    transaction_category VARCHAR(100),
    transaction_date DATETIME,
    is_bill TINYINT(1),
    account_id INT,
    budget_id INT,
    FOREIGN KEY (account_id) REFERENCES Accounts(account_id),
    FOREIGN KEY (budget_id) REFERENCES Budgets(budget_id)
);

CREATE TABLE Bills (
    bill_id INT AUTO_INCREMENT PRIMARY KEY,
    bill_value DECIMAL (4, 2),
    bill_due_date DATETIME,
    transaction_id INT,
    FOREIGN KEY (transaction_id) REFERENCES Transactions(transaction_id)
);

-- TO CREATE A NEW USER

CREATE USER 'username'@'%' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON * . * TO 'username'@'%';
FLUSH PRIVILEGES;