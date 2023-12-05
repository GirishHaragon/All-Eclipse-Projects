use crudoperation
create table student
(
	id int primary key auto_increment,
    name varchar(45),
    course varchar(45),
    fee int
)
select * from student