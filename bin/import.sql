insert into category(ID, NAME, REG_DATE) values(1, 'spring', CURRENT_TIMESTAMP());
insert into category(ID, NAME, REG_DATE) values(2, 'java', CURRENT_TIMESTAMP());

insert into post(ID, TITLE, SUBTITLE, CODE, CONTENT, STATUS, REG_DATE, CATEGORY_ID) values(1, 'Title', 'subtitle', '���� �������� �׽�Ʈ ������ �Դϴ�.', '���� �������� �׽�Ʈ ������ �Դϴ�.', 'Y',CURRENT_TIMESTAMP(), 1);
insert into post(ID, TITLE, SUBTITLE, CODE, CONTENT, STATUS, REG_DATE, CATEGORY_ID) values(2, 'Title2', 'subtitle2', '���� �������� �׽�Ʈ ������2 �Դϴ�.', '���� �������� �׽�Ʈ ������2 �Դϴ�.', 'Y',CURRENT_TIMESTAMP(), 2);