create table if not exists prime
(
    id serial
        constraint prime_table_pk primary key,
    value varchar(255) not null,
    creation_datetime timestamp not null
);