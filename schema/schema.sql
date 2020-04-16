create schema if not exists store collate utf8mb4_0900_ai_ci;

create table if not exists Category
(
    id int auto_increment
        primary key,
    name varchar(255) not null
);

create table if not exists City
(
    id int auto_increment
        primary key,
    name varchar(255) null
);

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

create table if not exists `Order`
(
    id int auto_increment
        primary key,
    client_id int null,
    status varchar(255) default 'active' null,
    constraint Order_Client_id_fk
        foreign key (client_id) references Client (id)
);

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

create table if not exists Order_Product
(
    order_id int not null,
    product_id int not null,
    constraint Order_Product_Order_id_fk
        foreign key (order_id) references `Order` (id),
    constraint Order_Product_Product_id_fk
        foreign key (product_id) references Product (id)
);

