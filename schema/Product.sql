create table if not exists Product
(
	id int auto_increment
		primary key,
	name varchar(255) not null,
	category_id int null,
	price double null,
	constraint Product_Category_id_fk
		foreign key (category_id) references Category (id)
);

