--create table topic
--(
--	topic_id integer not null auto_increment,
--	name varchar(32) not null,
--	content varchar(4096) not null,
--	create_date timestamp not null,
--	primary key (topic_id)
--)

INSERT INTO TOPIC (TOPIC_ID, NAME, CONTENT, CREATE_DATE) VALUES(10001,  'Jordan', 'I have a question on Spring ...XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX',sysdate());
INSERT INTO TOPIC (TOPIC_ID, NAME, CONTENT, CREATE_DATE) VALUES(10002,  'James', 'I have a question on Spring MVC....XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX',sysdate());
INSERT INTO TOPIC (TOPIC_ID, NAME, CONTENT, CREATE_DATE) VALUES(10003,  'Bryant', 'I have a question on Spring AOP ...XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX',sysdate());
INSERT INTO TOPIC (TOPIC_ID, NAME, CONTENT, CREATE_DATE) VALUES(10005,  'McGrady', 'I have a question on Spring JPA ...XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX',sysdate());
INSERT INTO TOPIC (NAME, CONTENT, CREATE_DATE) VALUES('Oneal', 'I have a question on Hibernate ...XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX',sysdate());



--create table response
--(
--	response_id integer not null auto_increment,
--	topic_id integer not null,
--	name varchar(32) not null,
--	content varchar(4096) not null,
--	create_date timestamp not null,
--	primary key (response_id)
--)

INSERT INTO REPLY (RESPONSE_ID, TOPIC_ID, NAME, CONTENT, CREATE_DATE) VALUES(1, 10001,  '10001reply_A', 'You can find the answer for Spring on StackOverFlow ...A',sysdate());
INSERT INTO REPLY (RESPONSE_ID, TOPIC_ID, NAME, CONTENT, CREATE_DATE) VALUES(2, 10001,  '10001reply_B', 'You can find the answer for Spring on StackOverFlow ...B',sysdate());
INSERT INTO REPLY (RESPONSE_ID, TOPIC_ID, NAME, CONTENT, CREATE_DATE) VALUES(3, 10001,  '10001reply_C', 'You can find the answer for Spring on StackOverFlow ...C',sysdate());
INSERT INTO REPLY (TOPIC_ID, NAME, CONTENT, CREATE_DATE) VALUES(10002,  '10002reply_A', 'You can find the answer for Spring MVC on StackOverFlow ...A',sysdate());
INSERT INTO REPLY (TOPIC_ID, NAME, CONTENT, CREATE_DATE) VALUES(10002,  '10002reply_B', 'You can find the answer for Spring MVC on StackOverFlow ...B',sysdate());
INSERT INTO REPLY (TOPIC_ID, NAME, CONTENT, CREATE_DATE) VALUES(10003,  '10003reply_A', 'You can find the answer for Spring AOP on StackOverFlow ...A',sysdate());
INSERT INTO REPLY (TOPIC_ID, NAME, CONTENT, CREATE_DATE) VALUES(10005,  '10004reply_A', 'You can find the answer for Spring JPA on StackOverFlow ...A',sysdate());
INSERT INTO REPLY (TOPIC_ID, NAME, CONTENT, CREATE_DATE) VALUES(10006,  '10006reply_A', 'You can find the answer for Hibernate on StackOverFlow ...A',sysdate());
INSERT INTO REPLY (TOPIC_ID, NAME, CONTENT, CREATE_DATE) VALUES(10006,  '10006reply_B', 'You can find the answer for Hibernate on StackOverFlow ...B',sysdate());

