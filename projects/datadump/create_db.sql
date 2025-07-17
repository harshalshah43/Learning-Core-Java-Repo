create database bank2;

use bank;

CREATE TABLE customers (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    balance DOUBLE
);

CREATE TABLE transactions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    type VARCHAR(20),
    amount DOUBLE,
    date TIMESTAMP,
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);

CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    password VARCHAR(100) NOT NULL
);

-- drop database bank;

-- Employee Data (2 records)

-- Inserting two employees
INSERT INTO employee (id, name, password) 
VALUES (1, 'John Doe', 'password123');

INSERT INTO employee (id, name, password) 
VALUES (2, 'Jane Smith', 'password456');


-- Customer Data (5 records)

-- Inserting five customers
INSERT INTO customers (id, name, balance) 
VALUES (1, 'Alice Johnson', 1500.75);

INSERT INTO customers (id, name, balance) 
VALUES (2, 'Bob Brown', 2500.50);

INSERT INTO customers (id, name, balance) 
VALUES (3, 'Charlie Davis', 3200.30);

INSERT INTO customers (id, name, balance) 
VALUES (4, 'David Evans', 1000.10);

INSERT INTO customers (id, name, balance) 
VALUES (5, 'Emma Wilson', 1800.40);

select * from customers;

update customers set balance = balance + 1000 where id = 1;

select * from employee;

select * from transactions where customer_id = 1 order by date desc limit 5;

select balance from customers where id = 1;

sle

