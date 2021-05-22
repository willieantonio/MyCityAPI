*My City API*

Sobre

>Projeto para concluir o Bootcamp da DIO. Criar uma API REST das cidades do Brazil
> São Listados Paises, Estados do Brasil e suas Cidades. Podem ser feitos buscas por Paises e estados brasileiros.

_Tecnologias_

Linux

Git

Java 8

Docker

IntelliJ Community

Heroku CLI

Muita vontade de Aprender e desenvolver novas habilidades...

>Informações do GitHub da Aula:
> https://github.com/andrelugomes/digital-innovation-one/blob/master/cities-api

DataBase

Postgres

>Postgres Docker Hub // Container Docker do Postgres
> 
>docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
Populate
data
cd ~/workspace/sql-paises-estados-cidades/PostgreSQL

Dados para as tabelas

https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL

Comando para popular as tabelas:

>docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash
>
>psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
>psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
>psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql
>
>psql -h localhost -U postgres_user_city cities


>CREATE EXTENSION cube;
> 
>CREATE EXTENSION earthdistance;

Access
>docker exec -it cities-db /bin/bash
>
>psql -U postgres_user_city cities

Query Earth Distance
>Point
>
> select ((select lat_lon from cidade where id = 4929) <@> (select lat_lon from cidade where id=5254)) as distance;

>Cube
>select earth_distance(
>ll_to_earth(-21.95840072631836,-47.98820114135742),
>ll_to_earth(-22.01740074157715,-47.88600158691406)
>) as distance;

Spring Boot
> Link: https://start.spring.io/
> 
> Dependencies
> 
>Java 8
> 
>Gradle Project
> 
>Jar
> 
>Spring Web
> 
>Spring Data JPA
> 
>PostgreSQL Driver
