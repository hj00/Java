CREATE TABLE tb_article
(
	no number NOT NULL,
	name varchar2(20) NOT NULL,
	title varchar2(100) NOT NULL,
	content varchar2(4000) NOT NULL,
	pwd varchar2(128) NOT NULL,
	regdate date DEFAULT sysdate NOT NULL,
	viewcount number DEFAULT 0 NOT NULL,
	PRIMARY KEY (no)
);

create sequence seq_article nocache; 

select * from tb_article;

select no, name, title, regdate, viewcount
from tb_article
order by no desc;

delete from TB_ARTICLE where no = 3;

commit

update tb_article set viewcount = 9 where no=5; 

SELECT B.*
FROM (SELECT rownum AS rnum, A.*
      FROM (SELECT no, title, name, regdate, viewcount
            FROM tb_article
            ORDER BY no DESC) A) B
WHERE rnum BETWEEN 11 and 20;
      
DELETE FROM TB_ARTICLE
WHERE no=1022 AND pwd=1234;



