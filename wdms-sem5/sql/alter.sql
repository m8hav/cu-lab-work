use madhav;

SELECT * from student;

-- column names are case insensitive

-- ADD COLUMN
ALTER table student
add column age int default 20;

ALTER table student
add column AGE int default 20;


-- RENAME COLUMNS
alter table student
rename column hosteller to hosteller,
rename column roll_no to roll_no;
-- using same names doesn't matter here.
-- It will work even if the names are exactly same


-- CHANGE

-- changing int to boolean actually changes it to small int instead of boolean
-- that leads it to retain all values
alter table student
change age AGE int;

desc student;

-- alter datatype from int to char or varchar and vice versa
-- work as long as the length limits are satisfied

alter table student
change age AGE varchar(2);

select * from student;


-- boolean is stored as tinyint(1) i.e. integer of 1 byte with values from -128 to 127
create table sample (one boolean);
desc sample;
insert into sample values (20);
insert into sample values (400);
insert into sample values (-20);
insert into sample values (-129);
insert into sample values (128);
select * from sample;


-- COMMANDS TO CHANGE THINGS;
	-- rename - RENAME TO
	-- change datatype / constraint - MODIFY
		-- replaces the compelte fingerprint of the column
	-- change everything - CHANGE TO

-- modify - altering only datatype
-- modify required you to mention datatype
alter table student
-- modify column age int;
modify age int;

-- modifying column works with and without COLUMN keyword before the column name


alter table student
modify age int not null;

desc student;

select * from student;


-- select / delete all rows where marks less than 80%

-- declare variables
set @maxMarks = 100;

select * from student
where marks > @maxMarks * 0.8;

set sql_safe_updates = 1;


delete from sample;
select * from sample;


-- CREATE TABLE AS COPY FROM OLD TABLE
create table student_copy as select * from student;
truncate student_copy;
select * from student_copy;
select * from student;

-- COPY DATA FROM OLD TABLE TO NEW TABLE WITH SAME SCHEMA
select *
from student
into student_copy;