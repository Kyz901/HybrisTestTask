
CREATE TABLE orders (
  id int unsigned NOT NULL AUTO_INCREMENT,
  user_id int unsigned DEFAULT NULL AUTO_INCREMENT,
  status varchar(255) DEFAULT NULL,
  created_at varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE products (
  id int unsigned NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  price int unsigned DEFAULT NULL,
  status enum('out_of_stock','in_stock','running_low') DEFAULT 'out_of_stock',
  create_at datetime DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE order_items (
  order_id int unsigned DEFAULT NULL,
  product_id int unsigned DEFAULT NULL,
  quantity int unsigned DEFAULT NULL,
  FOREIGN KEY (order_id) REFERENCES orders (id) ON DELETE RESTRICT ON UPDATE CASCADE,
  FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;