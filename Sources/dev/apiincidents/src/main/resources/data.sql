DROP TABLE IF EXISTS incidents;

CREATE TABLE incidents(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  type VARCHAR(250) NOT NULL,
  specialityneeded VARCHAR(250) NOT NULL,
  longitude VARCHAR(10) NOT NULL,
  latitude VARCHAR(10) NOT NULL
);

INSERT INTO incidents (type, specialityneeded, longitude, latitude) VALUES
  ('Accident 1','Anaesthetics', '-20', '20'),
  ('Accident 2','Intensive care medicine', '20', '20'),
  ('Accident 3','Additional dental specialities', '20', '-20'),
  ('Accident 4','Oral and maxillofacial surgery', '-20', '-20');