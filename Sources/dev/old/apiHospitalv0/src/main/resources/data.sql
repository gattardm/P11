DROP TABLE IF EXISTS hospitals;
 DROP TABLE IF EXISTS employees;

  CREATE TABLE employees (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    last_name VARCHAR(250) NOT NULL,
    first_name VARCHAR(250) NOT NULL,
    mail VARCHAR(250) NOT NULL,
    password VARCHAR(250) NOT NULL
  );

CREATE TABLE hospitals (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  beds_available VARCHAR(5) NOT NULL,
  beds_quantity VARCHAR(5) NOT NULL,
  latitude VARCHAR(5) NOT NULL,
  longitude VARCHAR(5) NOT NULL,
  name VARCHAR(250) NOT NULL,
  speciality VARCHAR(250) NOT NULL
);

INSERT INTO hospitals (beds_available, beds_quantity, latitude, longitude, name, speciality) VALUES
  ( '100', '1000', '10', '10', 'Hopital 1', 'Anaesthetics'),
  ( '200', '2000', '10', '-10', 'Hopital 2', 'Intensive care medicine'),
  ( '300', '3000', '-10', '-10', 'Hopital 3', 'Additional dental specialities'),
  ( '400', '4000', '-10', '10', 'Hopital 4', 'Oral and maxillofacial surgery');



  INSERT INTO employees (last_name, first_name, mail, password) VALUES
    ('GINA', 'Laurent', 'laurentgina@mail.com', 'laurent'),
    ('Sophie', 'FONCEK', 'sophiefoncek@mail.com', 'sophie'),
    ('Agathe', 'FEELING', 'agathefeeling@mail.com', 'agathe');