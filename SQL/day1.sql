CREATE DATABASE employer0;

USE employer0;

CREATE TABLE employee (
    emp_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10, 2)
);

INSERT INTO employee (first_name, last_name, salary) VALUES
('John', 'Doe', 50000.00),
('Jane', 'Smith', 60000.00),
('Sam', 'Johnson', 45000.00),
('Emily', 'Davis', 55000.00),
('Michael', 'Brown', 65000.00),
('Sarah', 'Wilson', 47000.00),
('David', 'Moore', 48000.00);	

ALTER TABLE employee DROP COLUMN first_name;

ALTER TABLE employee CHANGE last_name name VARCHAR(50);

ALTER TABLE employee ADD COLUMN department VARCHAR(50);

UPDATE employee SET name = NULL;
