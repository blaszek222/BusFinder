DROP TABLE IF EXISTS bus_stop CASCADE;
CREATE TABLE bus_stop (
	bus_stop_id SERIAL PRIMARY KEY,
	name VARCHAR(2048) NOT NULL
);

DROP TABLE IF EXISTS bus_line CASCADE;
CREATE TABLE bus_line (
	bus_line_id SERIAL PRIMARY KEY,
	number VARCHAR(2048) NOT NULL,
        bus_stop_from INTEGER REFERENCES bus_stop(bus_stop_id),
        bus_stop_to INTEGER REFERENCES bus_stop(bus_stop_id)

);

DROP TABLE IF EXISTS bus_stop_connection CASCADE;
CREATE TABLE bus_stop_connection (
	bus_stop_connection_id SERIAL PRIMARY KEY,
        distance INTEGER NOT NULL,
        bus_stop_from INTEGER REFERENCES bus_stop(bus_stop_id),
        bus_stop_to INTEGER REFERENCES bus_stop(bus_stop_id)
);

DROP TABLE IF EXISTS bus_line_connection CASCADE;
CREATE TABLE bus_line_connection(
	bus_line_connection_id SERIAL PRIMARY KEY,
        bus_line INTEGER REFERENCES bus_line(bus_line_id),
	bus_stop_connection INTEGER REFERENCES bus_stop_connection(bus_stop_connection_id),
        bus_line_order INTEGER NOT NULL
);

DROP TABLE IF EXISTS bus_line_bus_stop CASCADE;
CREATE TABLE bus_line_bus_stop (
	bus_line INTEGER REFERENCES bus_line(bus_line_id) ON DELETE CASCADE,
	bus_stop INTEGER REFERENCES bus_stop(bus_stop_id) ON DELETE CASCADE,
        PRIMARY KEY (bus_line, bus_stop)
);

DROP TABLE IF EXISTS timetable CASCADE;
CREATE TABLE timetable (
	timetable_id SERIAL PRIMARY KEY,
	bus_line INTEGER REFERENCES bus_line(bus_line_id),
	bus_stop INTEGER REFERENCES bus_stop(bus_stop_id),
        time TIME NOT NULL
);