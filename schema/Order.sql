create table if not exists `Order`
(
	id int auto_increment
		primary key,
	client_id int null,
	status varchar(255) default 'active' null,
	constraint Order_Client_id_fk
		foreign key (client_id) references Client (id)
);

