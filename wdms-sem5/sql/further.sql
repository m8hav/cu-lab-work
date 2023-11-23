set sql_safe_updates = 1;

/*
Enable safe updates
	SET sql_safe_updates = 1;

This will result in an error
	UPDATE your_table SET column1 = 'new_value';

This will work because it has a WHERE clause
	UPDATE your_table SET column1 = 'new_value' WHERE id = 1;

Purpose: Ensure safe modification of data by preventing unintentional updates or deletions.
Setting Value: sql_safe_updates = 1
Enforcement: Requires a WHERE clause for UPDATE and DELETE statements.

Prevents Accidents: Reduces the risk of unintended mass updates or deletions.
Note: Part of MySQL SQL mode; behavior influenced by other SQL mode settings.
*/

show databases;
use madhav;

drop table teacher;

CREATE TABLE teacher (
    id CHAR(4) PRIMARY KEY,
    name VARCHAR(50),
    dept CHAR(3),
    FOREIGN KEY (dept)
        REFERENCES dept (id)
        ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE dept (
    id CHAR(3) PRIMARY KEY,
    name CHAR(50)
);

alter table dept
modify column id char(3);

desc dept;
desc teacher;

-- CASCADE PENDING --


