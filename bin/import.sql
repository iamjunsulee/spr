insert into category(ID, NAME, REG_DATE) values(1, 'spring', CURRENT_TIMESTAMP());
insert into category(ID, NAME, REG_DATE) values(2, 'java', CURRENT_TIMESTAMP());

insert into post(ID, TITLE, CODE, CONTENT, STATUS, REG_DATE, CATEGORY_ID) values(1, '테스트', '지금 포스팅은 테스트 포스팅 입니다.', '지금 포스팅은 테스트 포스팅 입니다.', 'Y',CURRENT_TIMESTAMP(), 1);
insert into post(ID, TITLE, CODE, CONTENT, STATUS, REG_DATE, CATEGORY_ID) values(2, '테스트 두번째', '지금 포스팅은 테스트 포스팅2 입니다.', '지금 포스팅은 테스트 포스팅2 입니다.', 'Y',CURRENT_TIMESTAMP(), 2);