create table if not exists carti
(
    isbn char(10) not null primary key,
    titlul varchar(70) not null,
    autorul varchar(40) not null
);

insert into carti (ISBN, Titlul, Autorul)
values ('ISBN1', 'Scurta istorie a omenirii', 'Yuval Noah Harari');

insert into carti (ISBN, Titlul, Autorul)
values ('ISBN2', 'Homo deus - Scurta istorie a viitorului', 'Yuval Noah Harari');

insert into carti (ISBN, Titlul, Autorul)
values ('ISBN3', 'De veghe in lanul de secara', 'J.D. SALINGER');