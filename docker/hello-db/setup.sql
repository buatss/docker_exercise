CREATE DATABASE testdb;
USE testdb;
CREATE TABLE hello(
id INT AUTO_INCREMENT PRIMARY KEY,
message VARCHAR(255)
);
INSERT INTO hello (message) VALUES ('Hello from dockerized mysql db');
