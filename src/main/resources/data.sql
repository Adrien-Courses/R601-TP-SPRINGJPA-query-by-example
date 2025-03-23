-- Universités
INSERT INTO university (university_id, name) VALUES (1, 'Harvard University');
INSERT INTO university (university_id, name) VALUES (2, 'MIT');
INSERT INTO university (university_id, name) VALUES (3, 'MITPlus');

-- Étudiants
INSERT INTO student (student_id, first_name, last_name, year, gpa, city, university_id) VALUES
(1, 'Alice', 'Brown', 10, 3.8, 'New York', 1),
(2, 'Alice', 'Brown', 10, 3.8, 'New York', 2),
(2, 'Alice', 'Browned', 10, 3.8, 'New York', 3),
(3, 'Charlie', 'Davis', 12, 3.9, 'Chicago', 2),
(4, 'Diana', 'Baker', 10, 2.9, 'Chicago', 1);