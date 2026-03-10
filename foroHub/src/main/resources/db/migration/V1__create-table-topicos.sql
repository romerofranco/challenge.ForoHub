CREATE TABLE topicos (
                         id BIGSERIAL PRIMARY KEY,
                         titulo VARCHAR(255) NOT NULL,
                         mensaje TEXT NOT NULL,
                         fecha_creacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                         status VARCHAR(50) NOT NULL,
                         autor VARCHAR(255) NOT NULL,
                         curso VARCHAR(255) NOT NULL
);