CREATE TABLE user
(
    username VARCHAR(30) PRIMARY KEY NOT NULL,
    password VARCHAR(45) NOT NULL
);
CREATE UNIQUE INDEX username_UNIQUE ON user (username);
