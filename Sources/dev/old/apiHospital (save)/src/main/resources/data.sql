DROP TABLE IF EXISTS hospitals;

CREATE TABLE hospitals(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  longitude INT NOT NULL,
  latitude INT NOT NULL,
  bedsQuantity INT NOT NULL,
  bedsAvailable INT,
  speciality VARCHAR(250) NOT NULL
);

INSERT INTO hospitals (name, longitude, latitude, bedsQuantity, bedsAvailable, speciality) VALUES
  ('Hopital 1', '-10', '10', '1000', '100', 'Anaesthetics'),
  ('Hopital 2', '10', '10',  '2000', '200', 'Intensive care medicine'),
  ('Hopital 3', '10', '-10',  '3000', '300', 'Additional dental specialities'),
  ('Hopital 4', '-10', '-10',  '4000', '400', 'Oral and maxillofacial surgery');