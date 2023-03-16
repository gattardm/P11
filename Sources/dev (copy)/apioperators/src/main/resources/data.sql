DROP TABLE IF EXISTS operators;

CREATE TABLE operators(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  available VARCHAR(5) NOT NULL
);

INSERT INTO operators (name, available) VALUES
  ('Operator 1', 'true'),
  ('Operator 2', 'true'),
  ('Operator 3', 'true'),
  ('Operator 4', 'true');