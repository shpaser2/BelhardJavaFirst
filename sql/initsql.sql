create database bh18db;
use bh18db;

create table employees(
	id int auto_increment primary key,
    name varchar(56) unique not null,
    age int default 20 check (age > 0),
    `sex` boolean,
    `birthday` date default '2019-02-15',
    specialty varchar(56)
);

-- drop table employees;
-- truncate table emplyees;
-- delete from employees;

insert into employees (id, name, age, sex, birthday, specialty)
	value (5, 'Vasily', 19, true, '2000-01-05', 'Stolyar');
insert into employees (id, name, age, sex, birthday, specialty)
	values (4, 'Mihail', 29, true, '1990-11-05', 'Stolyar')
			,(null, 'Olga', 49, false, '1970-06-25', 'Buhgalter');
insert into employees value (null, 'Igor', 5, true, null, null);
insert into employees (name, sex) value ('Ivan', '1');

select * from employees;
select id as 'Nomer', name as 'Imya', specialty from employees;

select * from employees where id > 7;
select * from employees where birthday > '1995-01-01' && age > 20;

select e.id, e.name, e.birthday from employees e;

select * from employees;
update employees set sex=false where name = 'Vasily';

delete from employees where age <= 0;