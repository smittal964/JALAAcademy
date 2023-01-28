CREATE TABLE SALESPEOPLE(
snum NUMBER(5) PRIMARY KEY,  
sname CHAR(10),  
city CHAR(20),  
comm DECIMAL(8,3));

INSERT INTO SALESPEOPLE VALUES (1001, 'Peel', 'London',0.12); 
INSERT INTO SALESPEOPLE VALUES(1002, 'Serres','San Jose',0.13);
INSERT INTO SALESPEOPLE VALUES(1004,'Motika','London',0.11);
INSERT INTO SALESPEOPLE VALUES(1007,'Rafkin','Barcelona',0.15);
INSERT INTO SALESPEOPLE VALUES(1003,'Axelrod','New York',0.1);

CREATE TABLE CUST(cnum NUMBER(5) PRIMARY KEY,  cname CHAR(20),  city CHAR(20), rating NUMBER(3),snum NUMBER(4));

INSERT INTO CUST VALUES (2001, 'Hoffman', 'London',100,1001); 
INSERT INTO CUST VALUES (2002, 'Giovanne', 'Rome',200,1003); 
INSERT INTO CUST VALUES (2003, 'Liu', 'San Jose',300,1002); 
INSERT INTO CUST VALUES (2004,	'Grass','Brelin',100,1002);
INSERT INTO CUST VALUES (2006,'Clemens','London',300,1007);
INSERT INTO CUST VALUES (2007,'Pereia','Rome',100,1004);


CREATE TABLE ORDERS(onum NUMBER(5) PRIMARY KEY,  amt NUMBER(5,2), odate Date, cnum NUMBER(4),snum NUMBER(4));

INSERT INTO ORDERS VALUES (3001,18.69,'03-OCT-94',2008,1007); 
INSERT INTO ORDERS VALUES (3003,767.19,'03-OCT-94',2001,1001);
INSERT INTO ORDERS VALUES (3002,1900.10,'03-OCT-94',2007,1004);
INSERT INTO ORDERS VALUES (3005,5160.45,'03-OCT-94',2003,1002);
INSERT INTO ORDERS VALUES (3006,1098.16,'04-OCT-94',2008,1007);
INSERT INTO ORDERS VALUES (3009,1713.23,'04-OCT-94',2002,1003);
INSERT INTO ORDERS VALUES (3007,75.75,'05-OCT-94',2006,1002);
INSERT INTO ORDERS VALUES (3008,4723.00,'05-OCT-94',2006,1001);
INSERT INTO ORDERS VALUES (3010,1309.95,'06-OCT-94',2004,1002);
INSERT INTO ORDERS VALUES (3011,9891.88,'06-OCT-94',2006,1001);

--Queries to Execute

Select snum, sname, city, comm from SALESPEOPLE;
Select distinct snum from ORDERS;
Select sname,comm from SALESPEOPLE where city = 'London';
Select cname from CUST where rating = 100;
Select onum, amt, odate from ORDERS;
Select cname from CUST where rating > 200;
Select cname from CUST where city = 'San Jose' or rating > 200;
Select *  from ORDERS where amt > 1000;
Select sname, city from SALESPEOPLE where comm > 0.10 and city = 'London';
Select cname from CUST where rating <= 100 or city = 'Rome';
Select sname, city from SALESPEOPLE where city in ('Barcelona','London'); 
Select sname, comm from SALESPEOPLE where comm > 0.10 and comm < 0.12; 
Select cname from CUST where city is null;
Select * from orders where odate in ('03-OCT-94','04-OCT-94');
Select cname from CUST,ORDERS where ORDERS.cnum = CUST.cnum and ORDERS.snum in ( select snum from SALESPEOPLE where sname in ('Peel','Motika'));
Select * from CUST where cname like 'A%'or 'B%';
Select onum from orders where amt != 0 or amt is not null;
Select count(distinct snum) from orders; 
Select odate, snum, max(amt) from orders group by odate, snum order by odate,snum; 
Select odate, snum, max(amt) from orders where amt > 3000 group by odate, snum order by odate,snum; 
Select odate, amt, snum, cnum from orders where amt = (select max(amt)  from orders);
Select count(*) from orders where odate = '03-OCT-94';
Select count(distinct city) from cust;
Select cnum, min(amt) from orders group by cnum; 
Select min(cname) from cust where cname like 'G%'; 
Select 'For ' || (odate) || ' there are '||  count(*) || ' Orders' from orders group by odate;
Select onum, snum, amt, amt * 0.12 from orders order by snum; 
Select 'For the city (' || city || '), the highest rating is : (' ||  max(rating) || ')' from cust group by city;
Select odate, count(onum) from orders group by odate order by count(onum); 
Select sname, cname from salespeople, cust where salespeople.city = cust.city; 
Select cname, sname from cust, salespeople where cust.snum = salespeople.snum;
Select onum, cname from orders, cust where orders.cnum = cust.cnum;
Select onum, sname, cname from orders, cust, salespeople where orders.cnum = cust.cnum and orders.snum = salespeople.snum;
Select cname, sname, comm from cust, salespeople where comm > 0.12 and cust.snum = salespeople.snum; 
Select sname, amt * comm from orders, cust, salespeople where rating > 100 and salespeople.snum = cust.snum and salespeople.snum = orders.snum and cust.cnum = orders.cnum; 
Select a.cname, b.cname,a.rating from cust a, cust b where a.rating = b.rating and a.cnum != b.cnum; 
Select a.cname, b.cname,a.rating from cust a, cust b where a.rating = b.rating and a.cnum != b.cnum and a.cnum <= b.cnum; 
Select cname, sname from salespeople, cust where sname in  ( select sname  from salespeople) order by cname; 
Select cname from cust where city = (select city from cust, salespeople where cust.snum = salespeople.snum and sname = 'Serres');
Select cname  from cust where city in ( select city from cust, orders where cust.cnum = orders.cnum and orders.snum in ( select snum  from salespeople where sname = 'Serres')); 
Select cname from cust where snum in (select snum from cust group by snum having count(snum) > 1); 
Select distinct a.cname from cust a ,cust b where a.snum = b.snum and a.rowid != b.rowid; 
Select cname, city from cust where rating = (select rating from cust where cname = 'Hoffman') and cname != 'Hoffman';
Select onum from orders	where snum = ( select snum from salespeople where sname = 'Motika'); 
Select onum, sname, cname, amt from orders a, salespeople b, cust c where a.snum = b.snum and a.cnum = c.cnum and a.snum = ( select snum from orders where cnum = ( select cnum from cust where cname = 'Hoffman')); 
Select *  from orders where amt > ( select avg(amt)  from orders where odate = '03-OCT-94'); 
Select avg(comm) from salespeople where city = 'London'; 
Select snum, cnum  from orders where cnum in (select cnum  from cust where city = 'London'); 
Select comm from salespeople where snum in (select snum from cust where city = 'London');
Select cnum, cname from cust where cnum > ( select snum+1000  from salespeople where sname = 'Serres');
Select cnum, rating from cust where rating > ( select avg(rating)  from cust where city = 'San Jose'); 




