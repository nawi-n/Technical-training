create schema customer1;
use customer1;

SET SQL_SAFE_UPDATES = 0;

create table customer (
customer_id int primary key,
name varchar(50),
city varchar(50),
age int,
purchase decimal(10,2)
);

insert into customer(customer_id, name, city, age, purchase)
values
(1,'Alice','New York',25,500.5),
(2,'Bob','Chicago',30,300.75),
(3,'Charlie','New York',28,1000),
(4,'David','Miami',35,700.2),
(5,'Eve','Chicago',27,200.6),
(6,'Frank','Miami',40,1500.8),
(7,'Grace','Chicago',22,800.3),
(8,'Ali','tokyo',25,500.5);

select sum(purchase) from customer;

select count(*) from customer;

select avg(purchase) from customer;

select max(purchase) from customer;

select min(purchase) from customer;

select city,count(city) from customer
group by city;

select city,count(city),sum(purchase) from customer
group by city;


select city,count(city),avg(purchase) from customer
group by city;

select count(*) from customer
where age>30;

select city,sum(purchase) from customer
group by city
having sum(purchase)>2000;

select city from customer
group by city
having count(city)=1;

select avg(age) from customer;



select * from customer 
where age < (select avg(age) from customer);

select * from customer 
order by age
limit 1;

select * from customer 
order by age desc
limit 1;

select sum(purchase) from customer
where age<30; 

select sum(purchase) from customer
where age>30; 

select city,sum(purchase) as total from customer 
group by city
order by total desc
limit 1;

select city,sum(purchase) as total from customer 
group by city
order by total 
limit 1;

select * from customer 
where purchase > 500; 

select city,max(purchase) as high from customer 
group by city;

select city,min(purchase) as high from customer 
group by city;

select count(*) 
from customer
where name like 'A%';

select count(*) 
from customer
where name like '%E';

select count(*) from customer
where purchase between 300 and 1000;





delete from customer where customer_id=1;

select * from customer;
