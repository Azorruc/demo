insert into person (id,email, name) values (1,'thatsanemail@gmail.com', 'A Person');
insert into person (id,email, name) values (2,'thatsanemail2@gmail.com', 'A Person2');
insert into person (id,email, name) values (3,'thatsanemail3@gmail.com', 'A Person3');
insert into person (id,email, name) values (4,'thatsanemail4@gmail.com', 'A Person4');

insert into project (id,name,description,status) values(1,'ALPHA ONE','Europena Database','Active');
insert into project (id,name,description,status) values(2,'ALADIN','Logistic Car Sales','Active');
insert into project (id,name,description,status) values(3,'SCAMBIO DOCUMENTALE','Italian UBI BANK','Active');

insert into person_projects (person_id,projects_id) values(1,1);
insert into person_projects (person_id,projects_id) values(1,2);
insert into person_projects (person_id,projects_id) values(1,3);

insert into Author (id,first_name, last_name) values (1,'Donald', 'Knuth');
insert into Author (id,first_name, last_name) values (2,'Raoul-Gabriel', 'Urma');
insert into Author (id,first_name, last_name) values (3,'Eric', 'Evans');

insert into book (id,title,isbn,page_Count) values (1,'Modern Java in Action', '0095811773',340);
insert into book (id,title,isbn,page_Count) values (2,'Domain-driven Design', '1112325773',130);
insert into book (id,title,isbn,page_Count) values (3,'The Art of Computer Programming: Fundamental Algorithms', '2215885773',890);

insert into author_books (author_id,books_id) values(1,1);
