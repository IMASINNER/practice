create table person(
    id int(100) not null primary key,
    name nvarchar(200) default null,
    age int(100)
)
engine =innodb
character set =utf8mb4;


create table userInfo(
    id int(50) not null primary key ,
    name varchar(100) default null,
    age int(10),
    sex int(10),
    hobby varchar(100),
    address varchar(100),
    city varchar(50)
)
engine =innodb
character set =utf8mb4;