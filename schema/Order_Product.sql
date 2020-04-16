create table if not exists Order_Product
(
	order_id int not null,
	product_id int not null,
	constraint Order_Product_Order_id_fk
		foreign key (order_id) references `Order` (id),
	constraint Order_Product_Product_id_fk
		foreign key (product_id) references Product (id)
);

