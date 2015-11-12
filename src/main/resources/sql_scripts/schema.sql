-- Po zainstalowaniu postgres należy odpalić SQL Shell, 
-- zalogować się do bazy, następnie przekopiować zawartość skryptu i odpalić

DROP DATABASE bfdatabase;
CREATE DATABASE bfdatabase WITH OWNER = postgres;
\c bfdatabase