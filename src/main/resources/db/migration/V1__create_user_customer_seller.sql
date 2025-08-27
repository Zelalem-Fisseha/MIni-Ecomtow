CREATE TABLE users(
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE ,
    email VARCHAR(100) NOT NULL UNIQUE ,
    password VARCHAR NOT NULL
);

CREATE TABLE customers(
    id BIGINT PRIMARY KEY ,
    shipping_address VARCHAR(200),
    phone_number VARCHAR(50),
    CONSTRAINT fk_customer_user FOREIGN KEY (id) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE sellers(
    id BIGSERIAL PRIMARY KEY,
    store_name VARCHAR(100),
    business_license VARCHAR(100),
    CONSTRAINT fk_seller_user FOREIGN KEY (id) REFERENCES users(id) ON DELETE CASCADE
);
