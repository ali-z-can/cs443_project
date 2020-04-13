create table link (id bigint not null, long_url varchar(255), number_of_clicks integer not null, port integer not null, short_url varchar(255), user_id bigint, primary key (id));
create table user (id bigint not null, password varchar(255), username varchar(255), primary key (id));
