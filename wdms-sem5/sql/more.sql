-- NESTED / SUBQUERY / INNER QUERY

use madhav;

select * from student;

select avg(marks) from student;

select * from student
where marks > (select avg(marks) from student);


-- find number of students in each city with city's maximum marks greater than 80%
select count(roll_no), city from student
group by city
having max(marks) > 80;

-- without group by
