create table user
(
    id int(11) unsigned auto_increment primary key,
    account_id   varchar(100)    null,
    name         varchar(50)     null,
    token        char(36)        null,
    gmt_create   bigint unsigned null,
    gmt_modified bigint unsigned null
);