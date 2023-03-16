DROP TABLE IF EXISTS hospitals;

CREATE TABLE hospitals(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  longitude INTEGER NOT NULL,
  latitude INTEGER NOT NULL,
  bedsQuantity INTEGER NOT NULL,
  bedsAvailable INTEGER,
  speciality VARCHAR(250) NOT NULL
);

INSERT INTO hospitals (name, longitude, latitude, bedsQuantity, bedsAvailable, speciality) VALUES
  ('Hopital 1', '-10', '10', '1000', '100', 'Anaesthetics'),
  ('Hopital 2', '10', '10',  '2000', '200', 'Anaesthetics, Intensive care medicine'),
  ('Hopital 3', '10', '-10',  '3000', '300', 'Clinical oncology, Additional dental specialities'),
  ('Hopital 4', '-10', '-10',  '4000', '400', 'Endodontics, Oral and maxillofacial surgery');

