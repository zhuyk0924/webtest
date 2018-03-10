CREATE TABLE users
(id INT PRIMARY KEY AUTO_INCREMENT
,name VARCHAR(30)
,birthday DATE
);

INSERT INTO users(name, birthday)
VALUES ('Tom', DATE'1991-04-07');

INSERT INTO users(name, birthday)
VALUES ('Jerry', DATE'1999-04-07');