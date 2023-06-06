FROM mysql:8.0.33

RUN echo "Copying setup.sql to /docker-entrypoint-initdb.d/"

COPY setup.sql /docker-entrypoint-initdb.d/
