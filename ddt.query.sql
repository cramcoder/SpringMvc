create table tblSpringBoard(
	b_seq int primary key AUTO_INCREMENT,
	b_title varchar(50),
	b_content varchar(50),
	b_writer varchar(50),
	b_regdate  datetime,
	b_hitcount int,
	b_password varchar(10)
);

insert into tblspringboard(b_title, b_content, b_writer, b_regdate, b_hitcount, b_password) 
values('첫번째 글', 'aaa', '홍길동', now(), 0, '1111');

create table spring4fs.member(
	id int auto_increment primary key,
	email	varchar(255),
	password	varchar(100),
	name		varchar(100),
	regdate		datetime()
);