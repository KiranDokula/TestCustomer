create database projectdb

use projectdb

create table customertab(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(100),
email varchar(100)
)

select * from customertab

drop table studenttab