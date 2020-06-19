INSERT INTO ADDRESS (address_Id, addressLOne, addressLTwo,city,state,country,zipCode) VALUES
(1,'vardhman','sector10','sonipat','haryana','india',131001),
(2,'ace_city','sector1','noida','Uttar_pardesh','india',201306),
(3,'braham_colony','old_DC','sonipat','haryana','india',131001);

INSERT INTO PRODUCT(product_Id,product_name,company,rate,tax_rate,tax_status) VALUES
(1,'milk','amul',25,1.2,'active'),
(2,'buscuit','parle',30,5,'open'),
(3,'oreo','britania',50,4,'active');

INSERT INTO BILL(bill_Id,country,product_Id,customer_Id,rate,tax_rate,price,quantity) VALUES
(1,'india',1,1,25,1.2,55,2),
(2,'india',3,1,50,4,170,3);

INSERT INTO CUSTOMER(customer_Id,customerName,bill_Id,address_Id) VALUES
(1,'manisha',1,1);

