create table link (id bigint not null, expiration date, long_url varchar(255), number_of_clicks integer not null, port integer not null, short_url varchar(255), user_id bigint, primary key (id));
create table user (user_id bigint not null, number_of_clicks decimal(19,2), number_of_distinct_links decimal(19,2), password varchar(255), username varchar(255), primary key (user_id));

