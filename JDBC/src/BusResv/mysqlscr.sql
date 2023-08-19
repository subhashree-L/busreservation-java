create database busresv;

use busresv;
CREATE TABLE bus (
   id INT PRIMARY KEY,
   ac BOOLEAN,
   capacity INT
);

INSERT INTO bus VALUES (1, 1, 6);
INSERT INTO bus VALUES (2, 0, 40);
INSERT INTO bus VALUES (3, 1, 30);

SELECT * FROM bus;

CREATE TABLE booking (
   passenger_name VARCHAR(50),
   bus_no INT,
   travel_date DATE,
   location VARCHAR(50)
);

SELECT * FROM booking;




