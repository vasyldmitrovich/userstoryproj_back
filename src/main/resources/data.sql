INSERT INTO projects (description, name) VALUES ('Description project1', 'Project1');
INSERT INTO projects (description, name) VALUES ('Description project2', 'Project2');
INSERT INTO projects (description, name) VALUES ('Description project3', 'Project3');
INSERT INTO projects (description, name) VALUES ('Description project4', 'Project4');
INSERT INTO projects (description, name) VALUES ('Description project5', 'Project5');
INSERT INTO projects (description, name) VALUES ('Description project6', 'Project6');
INSERT INTO projects (description, name) VALUES ('Description project7', 'Project7');
INSERT INTO projects (description, name) VALUES ('Description project8', 'Project8');
INSERT INTO projects (description, name) VALUES ('Description project9', 'Project9');
INSERT INTO projects (description, name) VALUES ('Description project10', 'Project10');

INSERT INTO users (id, username, password) 
VALUES (1, 'admin', 'password1234');

INSERT INTO user_roles (user_id, role) 
VALUES (1, 'USER'),
       (1, 'ADMIN');
       
INSERT INTO users (id, username, password) 
VALUES (2, 'user', 'password5678');

INSERT INTO user_roles (user_id, role) 
VALUES (2, 'USER');