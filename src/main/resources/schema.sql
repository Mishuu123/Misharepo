CREATE TABLE ADDRESS (
  address_Id INT AUTO_INCREMENT  PRIMARY KEY,
  addressLOne VARCHAR(250) NOT NULL,
  addressLTwo VARCHAR(250),
  city VARCHAR(250),
  state VARCHAR(250) NOT NULL,
  country VARCHAR(250)  NOT NULL,
  zipCode INT NOT NULL
);

CREATE TABLE BILL (
  bill_Id INT AUTO_INCREMENT  PRIMARY KEY,
  country VARCHAR(250)  NOT NULL,
  product_Id INT  NOT NULL,
  customer_Id INT NOT NULL,
  rate DOUBLE NOT NULL,
   tax_rate DOUBLE ,
   price DOUBLE NOT NULL,
   quantity INT NOT NULL
);

CREATE TABLE CUSTOMER (
  customer_Id INT AUTO_INCREMENT  PRIMARY KEY,
  customerName VARCHAR(250)  NOT NULL,
  bill_Id INT  NOT NULL,
  address_Id INT 
);

CREATE TABLE PRODUCT (
  product_Id INT AUTO_INCREMENT  PRIMARY KEY,
  product_name VARCHAR(250)  NOT NULL,
  company VARCHAR(250) ,
  rate DOUBLE NOT NULL,
   tax_rate DOUBLE ,
   tax_status VARCHAR(250) NOT NULL,  
);

