create table profiles
(
    id             bigint primary key,
    bio            text null,
    phone_number   varchar(15)  null,
    date_of_birth  date          null,
    loyalty_points int unsigned default 0,
    foreign key (id) references users (id)
);

create table tags
(
    id		   int auto_increment primary key,
    name varchar(255) not null
);

create table user_tags(
                          user_id bigint not null,
                          tag_id int not null,
                          primary key (user_id, tag_id),
                          foreign key (user_id) references users (id) on delete cascade,
                          foreign key (tag_id) references tags (id) on delete cascade
);
