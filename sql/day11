use bh18db;

drop table employees;

create table employees (
                           id int auto_increment primary key,
                           name varchar(56) not null unique,
                           date_of_employment datetime default now() not null,
                           specialty_id int,
                           salary int check(salary >= 0),
                           foreign key (specialty_id) references specialties(id)
);

alter table employees add foreign key (specialty_id) references specialties(id);

create table specialties (
                             id int auto_increment primary key,
                             specialty varchar(56) not null unique
);

insert into specialties values
(null, 'Developer'),
(null, 'QA'),
(null, 'PM'),
(null, 'HR');

insert into employees values
(null, 'Vasily', '2019-05-11', 1, 1500),
(null, 'Ivan', '2018-01-13', 2, 1300),
(null, 'Maria', '2016-03-11', 3, 2700),
(null, 'Elizaveta', '2018-01-05', 4, 900),
(null, 'Anton', '2017-06-19', 2, 2000),
(null, 'Grigoriy', '2015-06-29', 1, 3000),
(null, 'Timofey', '2018-01-13', 2, 500);

select * from employees;
select * from specialties;

select name, date_of_employment, salary, specialty
from employees e
         join specialties s
              on (e.specialty_id = s.id)
order by s.id, salary desc
limit 2, 3;

select sum(salary) from employees;
select specialty, avg(salary) from specialties s join employees e on (e.specialty_id = s.id)
group by specialty;

insert into employees value (null, 'Igor', '2013-04-03', 4, 1000);