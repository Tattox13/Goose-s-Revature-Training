--///////////////////////////////////////////////////////////////////////////////////////////////Querying practice
--Select all records from the Employee table.
select * from "Employee";
--Select all records from the Employee table where last name is King.
select * from "Employee" where "LastName" = 'King';
--Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
select * from "Employee" where "FirstName" = 'Andrew' and "ReportsTo" is null; 
--Select all albums in Album table and sort result set in descending order by title.
select * from "Album" order by "Title" desc; 
--Select first name from Customer and sort result set in ascending order by city
select * from "Customer" order by "City" asc;  
--Select all invoices with a billing address like “T%”
select * from "Invoice" where "BillingAddress" like 'T%';
--Select all invoices that have a total between 15 and 50
select * from "Invoice" where "Total"  between 15 and 50;
--Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from "Employee"where "HireDate" between '2003-6-1' and '2004-3-1'; 

--/////////////////////////////////////////////////////////////////////////////////////////////Insert practice
--Insert two new records into Genre table
select * from "Genre";
insert into "Genre" values (26, 'Raggaeton');
insert into "Genre" values (27, 'Ranchera');
--Insert two new records into Employee table
select * from "Employee";
insert into "Employee" ("EmployeeId", "LastName", "FirstName") values (9, 'Sanchez', 'Rick');
insert into "Employee" ("EmployeeId", "LastName", "FirstName") values (10, 'Smith', 'Morty');

--Insert two new records into Customer table
select * from "Customer";
insert into "Customer" ("CustomerId", "FirstName", "LastName", "Email") values (95, 'Finn', 'The Human', 'TheonlyHuman@bubblegumkingdom.com');
insert into "Customer" ("CustomerId", "FirstName", "LastName", "Email") values (100, 'Jake', 'The Dog', 'MagicalDawwgg@bubblegumkingdom.com');
--////////////////////////////////////////////////////////////////////////////////////////////Update Practice
--Update Aaron Mitchell in Customer table to Robert Walter
select * from "Customer";
update "Customer" set "FirstName" = 'Robert', "LastName" = 'Walter' where "FirstName" = 'Aaron' and "LastName" ='Mitchell';
--Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
select * from "Artist" where "Name" like 'C%'; 
update "Artist" set "Name" = 'CCR' where "Name" = 'Creedence Clearwater Revival';






