insert into category(ID, NAME, REG_DATE) values(1, 'spring', CURRENT_TIMESTAMP());
insert into category(ID, NAME, REG_DATE) values(2, 'java', CURRENT_TIMESTAMP());

insert into post(ID, TITLE, SUBTITLE, CODE, CONTENT, STATUS, REG_DATE, CATEGORY_ID) values(1, 'Title', 'subtitle', '지금 포스팅은 테스트 포스팅 입니다.', '지금 포스팅은 테스트 포스팅 입니다.', 'Y',CURRENT_TIMESTAMP(), 1);
insert into post(ID, TITLE, SUBTITLE, CODE, CONTENT, STATUS, REG_DATE, CATEGORY_ID) values(2, 'Title2', 'subtitle2', '지금 포스팅은 테스트 포스팅2 입니다.', '지금 포스팅은 테스트 포스팅2 입니다.', 'Y',CURRENT_TIMESTAMP(), 2);
insert into post(ID, TITLE, SUBTITLE, CODE, CONTENT, STATUS, REG_DATE, CATEGORY_ID) values(3, 'Title3', 'subtitle3', '지금 포스팅은 테스트 포스팅3 입니다.', '지금 포스팅은 테스트 포스팅3 입니다.', 'Y',CURRENT_TIMESTAMP(), 1);
insert into post(ID, TITLE, SUBTITLE, CODE, CONTENT, STATUS, REG_DATE, CATEGORY_ID) values(4, 'Title4', 'subtitle4', '지금 포스팅은 테스트 포스팅4 입니다.', '지금 포스팅은 테스트 포스팅4 입니다.', 'Y',CURRENT_TIMESTAMP(), 2);
insert into post(ID, TITLE, SUBTITLE, CODE, CONTENT, STATUS, REG_DATE, CATEGORY_ID) values(5, 'Title5', 'subtitle5', '지금 포스팅은 테스트 포스팅5 입니다.', '지금 포스팅은 테스트 포스팅5 입니다.', 'Y',CURRENT_TIMESTAMP(), 1);