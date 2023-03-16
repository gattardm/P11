DROP TABLE IF EXISTS hospitals;

CREATE TABLE hospitals(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  bedsQuantity INTEGER NOT NULL,
  bedsAvailable INTEGER,
  speciality VARCHAR(250) NOT NULL
);

INSERT INTO employees (name, bedsQuantity, bedsAvailable, speciality) VALUES
  ('Hopital 1', '1000', '100', 'Anaesthetics'),
  ('Hopital 2', '2000', '200', 'Anaesthetics, Intensive care medicine'),
  ('Hopital 3', '3000', '300', 'Clinical oncology, Additional dental specialities'),
  ('Hopital 4', '4000', '400', 'Endodontics, Oral and maxillofacial surgery');