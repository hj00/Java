
/* Drop Tables */

DROP TABLE t_board CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE seq_board;




/* Create Sequences */

CREATE SEQUENCE seq_board;



/* Create Tables */

CREATE TABLE t_board
(
	no number NOT NULL,
	name varchar2(20) NOT NULL,
	title varchar2(100) NOT NULL,
	content varchar2(4000) NOT NULL,
	pwd varchar2(128) NOT NULL,
	lagdate date DEFAULT sysdate NOT NULL,
	view_count number DEFAULT 0 NOT NULL,
	PRIMARY KEY (no)
);
select *
from t_board
order by no desc;

select no, name, title, lagdate, view_count
from t_board
order by no desc;

select no, name, title, lagdate, view_count, pwd
from t_board
where no = 1;

delete t_board
where no=1 and name = 'hhhh';

delete t_board
where no in (2,3,4);




select B.*
from (select rownum as rnum, A.*
      from (select no, title, name, lagdate, view_count
            from t_board
            order by no desc) A) B
where rnum between 11 and 20;

select count(*)
from t_board;

