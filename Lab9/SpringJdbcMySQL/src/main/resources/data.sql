create table if not exists masini
(
    nr_inm  char(7)     not null primary key,
    marca   varchar(40) not null,
    an      int         not null,
    culoare varchar(10) not null,
    nr_km   int         not null
);

insert into masini (nr_inm, marca, an, culoare, nr_km)
values ('TM12ABC', 'Opel', 2008, 'rosu', 190000);
insert into masini (nr_inm, marca, an, culoare, nr_km)
values ('TM13ABD', 'Vw', 2022, 'verde', 19000);
insert into masini (nr_inm, marca, an, culoare, nr_km)
values ('TM12SBC', 'Bmw', 2003, 'gri', 290000);
insert into masini (nr_inm, marca, an, culoare, nr_km)
values ('TM06AFC', 'Ford', 2019, 'roz', 110000);
