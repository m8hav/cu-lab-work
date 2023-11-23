-- ----------
-- November 17, 2023
-- ----------

create database madhav;

use madhav;

CREATE TABLE student (
    roll_no INT AUTO_INCREMENT PRIMARY KEY,
    s_name VARCHAR(30) NOT NULL,
    hosteller BOOLEAN,
    gender CHAR(1) CHECK (gender IN ('M' , 'F')),
    city VARCHAR(30),
    marks INT,
    grade CHAR(1),
    CONSTRAINT grade_check CHECK (grade BETWEEN 'A' AND 'F')
);

desc student;

truncate student;

insert into student values
	(1, "Madhav", false, "M", "Nalagarh", 60, "C"),
    (2, "Gujrot", true, "M", "Nalagarh", 95, "A"),
    (3, "Aayush", False, "M", "Baddi", 10, "F"),
    (4, "Satvik", False, "M", "Kalka", 92, "A"),
    (5, "Anshika", True, "F", "CU", 85, "B"),
	(6, "Bart", false, "M", "Nalagarh", 50, "D"),
    (7, "Chetan", true, "M", "Nalagarh", 85, "B"),
    (8, "Suryam", False, "M", "Jaipur", 20, "F"),
    (9, "Harshit", False, "M", "Kalka", 72, "C"),
    (10, "Jasmeen", True, "F", "CU", 55, "D")
;

SELECT 
    *
FROM
    student;


SELECT 
    roll_no, s_name, marks
FROM
    student
WHERE
    marks > 15
ORDER BY marks DESC
LIMIT 2;


SELECT 
    roll_no, s_name, AVG(marks)
FROM
    student
WHERE
    marks > 15
GROUP BY roll_no
ORDER BY marks DESC;

SELECT 
    AVG(marks)
FROM
    student
WHERE
    marks > 15
ORDER BY marks DESC;

SELECT 
    AVG(marks)
FROM
    student
WHERE
    marks > 15
GROUP BY roll_no
ORDER BY marks DESC;

SELECT 
    hosteller, COUNT(roll_no)
FROM
    student
GROUP BY hosteller
ORDER BY COUNT(roll_no) DESC
;

-- find citywise average marks, in descending order, top 2 cities
SELECT 
    COUNT(roll_no), city, AVG(marks)
FROM
    student
GROUP BY city
ORDER BY AVG(marks) DESC
LIMIT 2
;


-- select city, distinct(city) -- doesn't work
-- select distinct(city), city -- works
-- select count(distinct(city)) -- works
SELECT 
    COUNT(DISTINCT city)
FROM
    student
;


SELECT 
    *
FROM
    student
WHERE
    city <> 'Nalagarh'
;

UPDATE student 
SET 
    city = 'Jaipur'
WHERE
    s_name = 'Suryam';


-- select number of hostelers without using where
SELECT 
    SUM(hosteller = 1)
FROM
    student
;
-- or
SELECT 
    SUM(hosteller)
FROM
    student
;
-- or, advanced method
SELECT 
    SUM(CASE
        WHEN hosteller = 1 THEN 1
        ELSE 0
    END)
FROM
    student
;

SELECT 
    AVG(! hosteller)
FROM
    student
;


-- ask sir why this doesn't work
SELECT 
    COUNT(roll_no), hosteller, AVG(marks)
FROM
    student
WHERE
    marks < 80
GROUP BY hosteller
ORDER BY marks DESC;


SELECT 
    hosteller, count(city), avg(marks), count(*)
FROM
    student
WHERE
    marks < 80
GROUP BY hosteller
ORDER BY marks
;


SELECT 
    city, AVG(marks)
FROM
    student
GROUP BY city
ORDER BY AVG(marks) DESC
LIMIT 2;


SELECT 
    city, MAX(marks), COUNT(*)
FROM
    student
GROUP BY city
HAVING MAX(marks) > 90
ORDER BY MAX(marks) desc;


select city, marks, count(roll_no)
from student
group by city, marks
having max(marks) > 90
order by max(marks) desc, city;


-- won't work because result isn't grouped by gender
-- and table when grouped by city may have tuples with different genders
select city, count(roll_no)
from student
group by city
having max(marks) > 90
order by gender desc;
