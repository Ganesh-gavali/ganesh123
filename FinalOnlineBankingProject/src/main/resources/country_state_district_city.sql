--Insert query for Country.If application will restart then not getting duplicate error by using REPLACE 

REPLACE into bankmanagement.country (country_id, country_name, country_code) values (1,'India','+91')
REPLACE into bankmanagement.country (country_id, country_name, country_code) values (2,'USA','+1')

--State Insert 

REPLACE into bankmanagement.state (state_id, state_name,country_id) values (1,'Maharashtra',1)
REPLACE into bankmanagement.state (state_id, state_name,country_id) values (2,'Gujrat',1)


REPLACE into bankmanagement.state (state_id, state_name,country_id) values (3,'california',2)
REPLACE into bankmanagement.state (state_id, state_name,country_id) values (4,'Newyork',2)


-- District Insert

REPLACE into bankmanagement.district (district_id, district_name,state_id) values (1,'Ahmednagar' ,1)
REPLACE into bankmanagement.district (district_id, district_name,state_id) values (2,'Pune' ,1)

REPLACE into bankmanagement.district (district_id, district_name,state_id) values (3,'surat' ,2)
REPLACE into bankmanagement.district (district_id, district_name,state_id) values (4,'Ahmadabad' ,2)

REPLACE into bankmanagement.district (district_id, district_name,state_id) values (5,'sangose' ,3)
REPLACE into bankmanagement.district (district_id, district_name,state_id) values (6,'losangeles' ,3)

REPLACE into bankmanagement.district (district_id, district_name,state_id) values (7,'greece' ,4)
REPLACE into bankmanagement.district (district_id, district_name,state_id) values (8,'colonie Town' ,4)


--City Insert

REPLACE into bankmanagement.city (city_id, city_name,district_id) values (1,'shevagaon',1)
REPLACE into bankmanagement.city (city_id, city_name,district_id) values (2,'Pathardi',1)

REPLACE into bankmanagement.city (city_id, city_name,district_id) values (3,'chakan',2)
REPLACE into bankmanagement.city (city_id, city_name,district_id) values (4,'jejuri',2)

REPLACE into bankmanagement.city (city_id, city_name,district_id) values (5,'suratCity1',3)
REPLACE into bankmanagement.city (city_id, city_name,district_id) values (6,'suratCity2',3)

REPLACE into bankmanagement.city (city_id, city_name,district_id) values (7,'AhmadabadCity1',4)
REPLACE into bankmanagement.city (city_id, city_name,district_id) values (8,'AhmadabadCity2',4)

REPLACE into bankmanagement.city (city_id, city_name,district_id) values (9,'SangoseCity1',5)
REPLACE into bankmanagement.city (city_id, city_name,district_id) values (10,'SangoseCity2',5)

REPLACE into bankmanagement.city (city_id, city_name,district_id) values (11,'losangelesCity1',6)
REPLACE into bankmanagement.city (city_id, city_name,district_id) values (12,'losangelesCity2',6)

REPLACE into bankmanagement.city (city_id, city_name,district_id) values (13,'greeceCity1',7)
REPLACE into bankmanagement.city (city_id, city_name,district_id) values (14,'greeceCity2',7)

REPLACE into bankmanagement.city (city_id, city_name,district_id) values (15,'colonie Town1',8)
REPLACE into bankmanagement.city (city_id, city_name,district_id) values (16,'colonie Town2',8)