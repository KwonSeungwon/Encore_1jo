create table post_board(
p_type number not null,
title varchar2(50) not null,
title_number number not null,
user_number number not null,
post_number number primary key,
post_title varchar2(50) not null,
post_contents varchar2(4000) not null,
registration_date varchar2(50) not null,
views number default 0 not null,
path varchar2(4000),
constraint postboard_usernumber_fk foreign key(user_number) references member on delete cascade,
constraint postboard_p_type_fk foreign key(p_type) references post_type on delete cascade
);

 


insert into post_board(p_type,title,title_number,user_number,post_number,post_title,post_contents,registration_date,views)
values(1,'�ı�Խ���',1,6,postboard_seq.nextval,'����1','�ı�Խ���test',sysdate,1);

insert into post_board(p_type,title,title_number,user_number,post_number,post_title,post_contents,registration_date,views,path)
values(2,'�����Խ���',2,25,postboard_seq.nextval,'�Ҷ���','�����Խ���test',sysdate,0,'c://img..');

-------------------------
create table post_type(
p_type number,
p_title  varchar2(100) not null,
constraint post_type_p_type_pk primary key(p_type)
);
insert into post_type values(1,'����+��۰Խ���');
insert into post_type values(2,'��۰Խ���');
-------------------------------------
create table reply(
post_number number not null,
r_number number primary key,
user_number number not null, 
r_comment varchar2(4000) NOT NULL,
r_date varchar2(50) not null ,
constraint reply_post_number_fk foreign key(post_number) references post_board on delete cascade,
constraint reply_user_number_fk foreign key(user_number) references member on delete cascade
);




create sequence postboard_seq
increment by 1 start with 1;

create sequence reply_seq increment by 1 start with 1;


select * from post_type;
select * from post_board;
select * from member;

drop sequence postboard_seq;
drop sequence reply_seq;
drop table reply;
drop table post_board;
drop table post_type;
drop table member_type;
drop table member;



commit




---ȸ�� ����
create  table member_type(
rating number ,
rating_name varchar2(50) not null unique,
constraint member_type_rating_pk primary key(rating)
);

insert into member_type values(1,'���ఴ');
insert into member_type values(2,'���̵�');
insert into member_type values(3,'������');
---ȸ��
create table member(
user_number number,
rating number not null,
name varchar2(100) not null,
id varchar2(50) not null unique ,
pw varchar2(50) not null,
sex varchar2(10) not null,
phone varchar2(50) not null,
address varchar2(4000) not null,
email varchar2(100) not null ,
join_date varchar2(100) not null,
birth varchar2(100) not null,
job varchar2(70) not null,
profile varchar2(4000),
place varchar2(4000),
constraint member_rating_fk  foreign key(rating)  references member_type on delete cascade
,constraint member_usernumber_pk primary key(user_number)
);

create sequence member_seq 
increment by 1 start with 1;

insert into member values(member_seq.nextval,2,'�־�','man','b','b', '111-11-2211', '�λ�� ����', 
'ChungRyulGongPa63Deson@neogeosajang.ncd', '2018-07-17','1998-01-09','�ݰǴ�','���� ���� ��õ�� ����?','�λ�');
insert into member(user_number,rating,name,sex,id,pw,phone,address,email,join_date,birth,job) values(member_seq.nextval,1,'����','man','E','EE', '010-000-0011', '��⵵ ������', 'gl@vvv.zz', sysdate,'1998-01-09','���α׷���');
insert into member(user_number,rating,name,sex,id,pw,phone,address,email,join_date,birth,job) values(member_seq.nextval,1,'ȫ��','man','Q','QQ', '010-000-0012', '����� ���', 'kl@vvv.zz', sysdate,'1998-02-09','DBA');
insert into member(user_number,rating,name,sex,id,pw,phone,address,email,join_date,birth,job) values(member_seq.nextval,3,'����','man','J','JJ', '010-000-0013', '����� ���빮', 'bl@vvv.zz', sysdate,'1990-02-09','����');







