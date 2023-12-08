/*

Joins
	- Inner Join
		-- Common amonst joined tables
    - Outer Join
		- Left
			-- only stuff from the first table
        - Right
			-- only stuff from the right table
        - Full
			-- all stuff from both the tables

*/

use madhav;

CREATE TABLE staff (
    id INT PRIMARY KEY,
    name VARCHAR(30),
    course_id INT
);

CREATE TABLE courses (
    id INT PRIMARY KEY,
    course_name VARCHAR(100)
);

desc staff;
desc courses;

insert into staff values
	(1, "Manan", 101),
	(2, "Kaushal", 102),
	(3, "Sumit", 103),
	(4, "Dolly", 104),
	(5, "Arpit", 105)
;

insert into courses values
	(102, "JPC"),
	(103, "NALR"),
	(104, "VES"),
	(105, "WDMS"),
    (106, "DSAC")
;

SELECT 
    *
FROM
    staff;
    
SELECT 
    *
FROM
    courses;


-- JOINING WIHTOUT CONDITIONS
SELECT 
    *
FROM
    staff
        JOIN
    courses;

-- INNER JOIN
SELECT 
    *
FROM
    staff
        INNER JOIN
    courses
on
    staff.course_id = courses.id;


-- OUTER JOINS

-- 1. LEFT JOIN
SELECT 
    *
FROM
    staff
        LEFT JOIN
    courses
on
    staff.course_id = courses.id;

-- 2. RIGHT JOIN
SELECT 
    *
FROM
    staff
        RIGHT JOIN
    courses
on
    staff.course_id = courses.id;
    
-- FLIPPING JOIN AND SEQUENCE OF TABLES
SELECT 
    *
FROM
    courses
        LEFT JOIN
    staff
on
    staff.course_id = courses.id;
    
-- FLIPPING JOIN CONDITION
SELECT 
    *
FROM
    staff
        RIGHT JOIN
    courses
on
    courses.id = staff.course_id;
    
    
-- 3. FULL JOIN
-- doesn't exist directly in MySQL
-- but FULL JOIN result can be obtained by combining results from LEFT JOIN and RIGHT JOIN
SELECT 
    *
FROM
    staff
        LEFT JOIN
    courses
		ON 
			staff.course_id = courses.id
UNION
SELECT 
    *
FROM
    staff
        RIGHT JOIN
    courses
		ON 
			staff.course_id = courses.id;
    
    
-- CROSS PRODUCT OF TABLES
-- JOIN and FULL JOIN do the same thing here
-- 1. USING JOIN
SELECT 
    *
FROM
    staff
        JOIN
    courses;
-- 2. USING FULL JOIN
SELECT 
    *
FROM
    staff
        FULL JOIN
    courses;

    
    
-- ALIASES
-- 1. TABLE NAME ALIAS
SELECT 
    *
FROM
    staff as s
        LEFT JOIN
    courses as c
on
    s.course_id = c.id;
    
-- 2. COLUMN NAME ALIAS
SELECT 
    staff.id AS staff_id,
    staff.name AS staff_name,
    courses.id AS course_id,
    courses.name AS course_name
FROM
    staff
        JOIN
    courses
on
    staff.course_id = courses.id;
    
    
    
-- UNION
-- conditions: same columns - same number of columns, same order of columns, same names and datatypes of columns
SELECT 
    *
FROM
    staff
        LEFT JOIN
    courses ON staff.course_id = courses.id 
UNION SELECT 
    *
FROM
    staff
        RIGHT JOIN
    courses ON staff.course_id = courses.id;
    
   
-- FLIPPING RESULTS
SELECT 
    *
FROM
    staff
        RIGHT JOIN
    courses ON staff.course_id = courses.id 
UNION SELECT 
    *
FROM
    staff
        LEFT JOIN
    courses ON staff.course_id = courses.id;
    

-- EXCLUSIVE JOINS
-- 1. LEFT EXCLUSIVE JOIN
SELECT 
    *
FROM
    staff
        LEFT JOIN
    courses
on
    staff.course_id = courses.id
    WHERE
    courses.id is null;
    
-- 2. RIGHT EXCLUSIVE JOIN
SELECT 
    *
FROM
    staff
        RIGHT JOIN
    courses
on
    staff.course_id = courses.id
    WHERE
    staff.id is null;
    

-- 3.2 FULL EXCLUSIVE JOIN with UNION
SELECT 
    *
FROM
    staff
        LEFT JOIN
    courses ON staff.course_id = courses.id
WHERE
    courses.id IS NULL 
UNION SELECT 
    *
FROM
    staff
        RIGHT JOIN
    courses ON staff.course_id = courses.id
WHERE
    staff.id IS NULL;



-- SELF JOIN
-- used to get better representation of related info from the same table
CREATE TABLE Neighbor (
    name VARCHAR(20),
    id INT,
    neighbor VARCHAR(20)
);

desc neighbor;

insert into Neighbor values 
("Gurjot", 101, "Aayush"), 
("Aayush", 102, "Anshika"), 
("Anshika", 103, "Madhav"), 
("Madhav", 104, "Jasmine");

select * from neighbor;

SELECT 
    n1.neighbor as "Left Neighbor", n1.name as "Student", n2.name as "Right Neighbor"
FROM
    neighbor AS n1
        INNER JOIN
    neighbor AS n2 ON n1.name = n2.neighbor;
    
    
