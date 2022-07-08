create database student;
use student;
create table Student(
id int primary key auto_increment,
sname varchar(20) not null,
sphone bigint(11) not null unique,
semail varchar(30) not null unique,
saddr varchar(50),
squalification varchar(10) not null,
sfees double,
sdob date,
sdept varchar(20)
);
# add new column
alter table Student ADD age int after sdob;
# modify datatype size
alter table Student MODIFY squalification varchar(20) not null;
#modify constraint
alter table Student MODIFY sfees double not null;
# drop column
alter table Student DROP COLUMN sdept;
# change column name
alter table Student CHANGE COLUMN age sage int;
# rename table name
alter table Student RENAME TO student_details;
# insert single row
insert into student_details values
(1,'Mamta',834822288,'mamta@gmail.com','mumbai,maharashtra','MCA',1000.3,'1988-09-01',27);
# insert multiple rows
insert into student_details values
(2,'Ram',831122288,'ram@gmail.com','chennai','MCA',1000.3,'1988-10-01',27),
(3,'Priya',822822288,'priya@gmail.com','kolkata','BE',1000.3,'1988-08-02',29),
(4,'Ganesh',834332288,'ganesh@gmail.com','delhi','B Tech',1000.3,'1997-07-03',23),
(5,'John',834772288,'john@gmail.com','pune','MCA',1000.3,'1998-06-04',25),
(6,'Vishal',834888288,'vishal@gmail.com','mumbai','BE',1000.3,'2000-05-05',29),
(7,'Jayanth',834992288,'jayanth@gmail.com','goa','B Tech',1000.3,'1990-04-06',28),
(8,'Vijay',834821188,'vijay@gmail.com','darjeeling','MSc',1000.3,'1988-03-07',26),
(9,'Ajith',834824488,'ajith@gmail.com','jammu and kashmir','BE',1000.3,'1988-02-08',33),
(10,'Kamal',834800288,'kamal@gmail.com','chennai','BSc',1000.3,'1979-12-09',40);
#select
select * from student_details where squalification = 'BE';
#and
select * from student_details where saddr = 'chennai' and sfees = '1000.3';
#or
select * from student_details where saddr = 'chennai' or sfees = '1000.3';
#not
select * from student_details where squalification != 'BE';
#in
select * from student_details where saddr in('mumbai','chennai');
#starts with
select * from student_details where sname like 'M%';
#ends with
select * from student_details where sname like '%a';
#both starts and ends with
select * from student_details where sname like '%M%';
#missing letter
select * from student_details where saddr like 'che__ai';
select * from student_details where squalification = 'B_';
