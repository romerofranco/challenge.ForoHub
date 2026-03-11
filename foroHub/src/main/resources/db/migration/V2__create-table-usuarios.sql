CREATE TABLE usuarios (
                          id BIGSERIAL PRIMARY KEY,
                          login VARCHAR(255) NOT NULL UNIQUE,
                          contrasena VARCHAR(255) NOT NULL
);