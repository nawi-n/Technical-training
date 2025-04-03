use database employer;

create table employees (
id int auto_increment primary key,
name varchar(50) not null,
age int,
salary decimal(10,2)
);


insert into employees (name,age,salary) values
('sam',31,100000);

INSERT INTO employees (name, age, salary) VALUES
('sam', 31, 100000.00);



create table departments(
dept_id int primary key,
dept_name varchar(100) unique not null
);

alter table employees add column email varchar(100);

alter table employees modify salary decimal(12,2);

alter table employees rename column name to full_name;

alter table employees alter column age set default 25;

alter table employees drop column age;

drop table departments;

drop table if exists departments;

truncate employees;

ALTER TABLE employees AUTO_INCREMENT = 1;

rename table employees to staff;
rename table departments to company_departments;

/*
rename table staff to employees;
rename table company_departments to departments;
*/

# alter table employees add column dept_id int foreign key;

ALTER TABLE employees 
ADD COLUMN dept_id INT,
ADD CONSTRAINT fk_dept
    FOREIGN KEY (dept_id)
    REFERENCES departments(dept_id);

create table projects (
project_id int primary key,
project_name varchar(100),
dept_id int,
foreign key (dept_id) references departments(dept_id));

alter table employees
add constraint unique_EMAIL
unique(email);

alter table employees
drop constraint unique_EMAIL;


create index idx_salary on employees(salary);

show indexes from employees;


select * from employees;
desc employees;
desc departments;
desc projects;






