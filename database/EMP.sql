create database EMP;
use Emp;
create table emp1(
ID numeric(2),
ID_Name varchar(10),
Basic numeric(6,2),
Designation varchar(10),
Age numeric(2)
);
alter table emp1 modify Basic integer(6);
alter table emp1 modify ID_Name varchar(15);
create table emp_trainee(
Emp_id numeric(2),
ID_Name varchar(10),
Basic numeric(6,2),
Designation varchar(10),
Age numeric(2)
);
insert into emp1 values
(1,'Rohit',6700,'Manager',24),
(2,'Sunil',6200,'Engineer',27),
(3,'Payal',6300,'Engineer',25),
(4,'Kunal',6700,'Trainee',28),
(5,'Sunita',6230,'Trainee',26),
(6,'Bimal',7000,'Trainee',25);
insert into emp_trainee select * from emp1;
select * from emp1,emp_trainee;
alter table emp1 add Skills varchar(15) after age;
alter table emp1 add DOJ date after Skills;
update emp1 set Skills = 'java' where ID = 1;
update emp1 set Skills = 'Python' where ID = 2;
update emp1 set Skills = 'C++' where ID = 3;
update emp1 set Skills = 'SQL' where ID = 4;
update emp1 set Skills = 'java' where ID = 5;
update emp1 set Skills = 'Selenium' where ID = 6;

update emp1 set DOJ = '2022-02-05' where ID = 1;
update emp1 set DOJ = '2022-02-10' where ID = 2;
update emp1 set DOJ = '2022-02-15' where ID = 3;
update emp1 set DOJ = '2022-02-20' where ID = 4;
update emp1 set DOJ = '2022-02-22' where ID = 5;
update emp1 set DOJ = '2022-02-23' where ID = 6;
alter table emp_trainee modify Designation varchar(30);
update emp_trainee set Designation = 'Programmer_Trainee';
update emp1 set Skills = 'Python' where Designation = 'Trainee';
alter table emp1 modify ID varchar(5);
select * from emp1,emp_trainee;
alter table emp1 rename column Age to Age_in_Years;
delete from emp1 where Designation = 'Trainee'; 
alter table emp_trainee DROP COLUMN Age;