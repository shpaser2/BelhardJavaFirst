create database bh18db;
use bh18db;

create table events (
					 id int auto_increment primary key,
					 title varchar(90),
					 eventDescription varchar(200),
					 startTime datetime,
					 endTime datetime
);

create table eventSteps (
                           step_id int ,
                           stepDescription varchar(200),
                           done boolean,
                           event_id int,
                           next_step_id int
);