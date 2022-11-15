CREATE DATABASE Jaegers;
CREATE TABLE jaeger (
    id serial primary key,
    modelName text not null,
    mark character(8) not null,
    height double precision not null,
    weight double precision not null,
    status text,
    origin text,
    kaijuKill integer not null
);