create database customer;

create table customer 
(
id int primary key,
name varchar(50),
city varchar(50),
address varchar(255),
country varchar(50)
);

INSERT INTO customer (id, name, city, address, country)  
VALUES  
(1, 'Ram', 'Chennai', '10th Street, Ram Nagar', 'India'),  
(2, 'John', 'New York', '5th Avenue, Manhattan', 'USA'),  
(3, 'Emma', 'Los Angeles', 'Sunset Boulevard', 'USA'),  
(4, 'Raj', 'Mumbai', 'Marine Drive, South Mumbai', 'India'),  
(5, 'Sophia', 'Manchester', 'Oxford Road', 'UK'),  
(6, 'David', 'London', 'Baker Street', 'UK'),  
(7, 'Ali', 'Dubai', 'Sheikh Zayed Road', 'UAE'),  
(8, 'Chen', 'Beijing', 'Chang’an Avenue', 'China'),  
(9, 'Maria', 'Madrid', 'Gran Via', 'Spain'),  
(10, 'Pierre', 'Paris', 'Champs-Élysées', 'France'),  
(11, 'Hans', 'Berlin', 'Unter den Linden', 'Germany'),  
(12, 'Luigi', 'Rome', 'Via del Corso', 'Italy'),
(13, 'sam', 'Chennai', '10th Street, Ram Nagar', 'India');  

select * from customer 
where country="USA";

select * from customer
order by city;

select city,count(city) from customer
group by city; 

select country,count(country) from customer
group by country
order by count(country) desc; 

select distinct(city) from customer;

select country,city,count(city) from customer
where country="USA"
group by city; 

update customer set city="Manchester" 
where id=3;

delete from customer where id = 5;

select country,count(country) from customer
group by country
having count(country)>2;

select name from customer
where city in (
select city from customer
group by city
having count(city) > 1
);

select city, count(city) from customer 
group by city
order by count(city) desc
limit 1;

select address, length(address) from customer 
group by address
order by length(address) desc
limit 1;

select country, count(country) 
from customer
group by country;

select country, count(country) 
from customer
group by country
limit 1
offset 1;


SELECT country, COUNT(*) AS customer_count
FROM customer
WHERE country IN (
    SELECT country
    FROM customer
    GROUP BY country
    HAVING COUNT(DISTINCT city) > 1  
)
GROUP BY country;

select * from customer
where name like '%o%o%';

select *
from customer
where address regexp '[0-9]';




select * from customer;
drop table customer;