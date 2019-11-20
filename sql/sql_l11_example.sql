create database bh18db;
use bh18db;

create table employees(
	id int auto_increment primary key,
    name varchar(56) unique not null,
    age int default 20 check (age > 0),
    sex boolean,
    birthday date default '2019-02-15',
    specialty varchar(56)
);
-- delete table 
-- drop table employees;
truncate table employees;
-- delete from employees;

insert into employees(id, name, age, sex, birthday, specialty)
	value(5, 'Vasily', 19, true, '2000-01-05', 'Stolyar');
    
insert into employees(id, name, age, sex, birthday, specialty)
	values(4, 'Michail', 29, true, '1990-11-05', 'Stolyar')
		,(null, 'Olga', 49, false, '1970-06-25', 'Buhgalter');

insert into employees(id, name, age, sex, birthday, specialty)
	value(null, 'Igor', 5, true, null, null);
    
insert into employees(name, age, sex)
	value('Ivan', 24, '1');

insert into employees(id, name, age, sex, birthday, specialty)
	value(null, 'Vasily2', -19, true, '2000-01-05', 'Stolyar');    

-- чтение
select * from employees;	-- * - все поля, из-за отсутствия уточнения - все колонки.
select id as 'Nomer', name as 'Imya', specialty from employees;

select * from employees where id > 7;
select * from employees where birthday > '1995-01-01' && specialty = 'Stolyar';

-- alies example
select id, name, birthday from employees e;
select e.id, e.name, e.birthday from employees e;

update employees set sex=false; -- for all, not works
update employees set sex=false where name = 'Vasily';

delete from employees where age <= 0;	-- make reconnect if not works