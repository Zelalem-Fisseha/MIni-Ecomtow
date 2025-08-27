CREATE TABLE products(
                         id BIGINT PRIMARY KEY,
                         product_name VARCHAR(100),
                         product_description VARCHAR (150),
                         product_price VARCHAR(100),
                         quantity VARCHAR(100),
                         seller_id BIGINT NOT NULL,
                         CONSTRAINT fk_product_seller FOREIGN KEY (seller_id) REFERENCES sellers(id)
);