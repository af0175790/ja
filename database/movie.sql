create database c1236;
use c1236;
create table movie(
Cust_id varchar(5) primary key not null,
FName varchar(15) not null,
LName varchar(15),
Area varchar(5) not null,
Phone bigint(10)
);
alter table movie add foreign key(Cust_id) references customer(Cust_id);
#5
select Title from movie where Price > 100 and Price < 200;
#6
select Cust_id from movie where Star in ('JC','TC','MC');
#7
select * from customer where Area like '%A%';
#8
select Title from movie where length(Title)= 6  and Price < 180;
#9
select Title,Price,Price + (Price * 10/100) as 'incremented price' from movie;
#10
select Fname,Lname,Area,Phone from customer where Cust_id = 'A01';
#11
alter table customer modify Lname varchar(45) not null;
#12
select Fname from customer where Phone is null;
#14
select distinct Cust_id from movie;
#16
delete from customer where Cust_id = 'A02';
#17
delete from movie where Cust_id = 'A02';
#20
alter table movie drop foreign key movie_ibfk_1;