create table if not exists Client
(
	id int not null
		primary key,
	login varchar(255) null,
	email varchar(255) null,
	city_id int null,
	constraint Client_City_id_fk
		foreign key (city_id) references City (id)
);

