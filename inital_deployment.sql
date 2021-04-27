CREATE database expense_tracker;

USE expense_tracker;

CREATE TABLE User (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) NOT NULL
);

CREATE TABLE Account (
    account_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    type VARCHAR(100),
    balance DECIMAL (10, 2),
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES User(user_id)
);

CREATE TABLE Budget (
    budget_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    amount DECIMAL (10, 2),
    category VARCHAR(100),
    start_date DATETIME,
    end_date DATETIME,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES User(user_id)
);

CREATE TABLE Loan (
    loan_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    amount DECIMAL (10, 2),
    paid_off DECIMAL (10, 2),
    creation_date DATETIME,
    interest_rate DECIMAL (10, 2),
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES User(user_id)
);


CREATE TABLE Transaction (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    value DECIMAL (10, 2),
    category VARCHAR(100),
    date DATETIME,
    isBill TINYINT(1),
    account_id INT,
    FOREIGN KEY (account_id) REFERENCES Account(account_id)
);

CREATE TABLE Bill (
    bill_id INT AUTO_INCREMENT PRIMARY KEY,
    amount DECIMAL (10, 2),
    due_date DATETIME,
    name VARCHAR(100),
    transaction_id INT,
    FOREIGN KEY (transaction_id) REFERENCES Transaction(transaction_id)
);

-- TO CREATE A NEW USER

CREATE USER 'username'@'%' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON * . * TO 'username'@'%';
FLUSH PRIVILEGES;