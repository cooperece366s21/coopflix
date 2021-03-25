create table if not exists users
(
    id           varchar(36) primary key not null,
    name         varchar(256)            not null,
    subscription enum('family_basic', 'family_hd', 'single_basic', 'single_hd')
);

create table if not exists user_preferred_genres
(
    user_id varchar(36) not null,
    genre   enum('comedy', 'horror', 'mystery', 'action', 'drama'),
    primary key (user_id, genre),
    foreign key (user_id) references users (id)
);
