create database employer1;

use employer1;

SET SQL_SAFE_UPDATES = 0;

create table customer (
CustomerID int auto_increment primary key,
CustomerName varchar(50),
ContactName varchar(50),
Address varchar(50),
City varchar(50),
PostalCode varchar(50),
Country varchar(50)
);

insert into customer( CustomerName, ContactName, Address, City, PostalCode, Country)
values
("Alfred Futterkiste", "Maria Andres", "Obere Str. 57", "Berlin", "12209", "Germany"),
('Ana Trujillo', 'Ana Trujillo', 'Avda. de la Construcción 2222', 'México D.F.', '05021', 'Mexico'),
('Antonio Moreno', 'Antonio Moreno', 'Mataderos 2312', 'México D.F.', '05023', 'Mexico'),
('Bale Trujillo', 'Thomas Hardy', '120 Hanover Sq.', 'London', 'WA1 1DP', 'UK'),
('Berglunds', 'Christina Berglund', 'Berguvsvägen 8', 'Luleå', 'S-958 22', 'Sweden');

select * from customer;

select * from customer where CustomerID=2;

select * from customer where City='México D.F.';

select PostalCode from customer where CustomerID=3 or CustomerID=5;

update customer set Address ='berguvsvagen 7' where CustomerID=5;

delete from customer where City='London';

select count(*) from customer where Country='Mexico';

select count(*) from customer;

select City, count(*) from customer
group by City
having count(*)>1;

select City, count(*) from customer
group by City
having count(*)>=1;

select distinct City from customer;

select count(*) from ( 
select Country
from customer
group by Country
) as uniqueCity;

delete from customers
where

Delete from customer where CustomerID=1;
truncate customer;

select * from customer;
desc customer;