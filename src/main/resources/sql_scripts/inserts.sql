INSERT INTO bus_stop(bus_stop_id, name)VALUES (1, 'Zytnia');
INSERT INTO bus_stop(bus_stop_id, name)VALUES (2, 'Zelazna');
INSERT INTO bus_stop(bus_stop_id, name)VALUES (3, 'Grunwaldzka');
INSERT INTO bus_stop(bus_stop_id, name)VALUES (4, 'Jagiellonska');
INSERT INTO bus_stop(bus_stop_id, name)VALUES (5, 'Warszawska');

INSERT INTO bus_line(bus_line_id, "number", bus_stop_from, bus_stop_to)VALUES (1, '5', 1, 2);
INSERT INTO bus_line(bus_line_id, "number", bus_stop_from, bus_stop_to)VALUES (2, '15', 1, 3);
INSERT INTO bus_line(bus_line_id, "number", bus_stop_from, bus_stop_to)VALUES (3, '25', 1, 5);
INSERT INTO bus_line(bus_line_id, "number", bus_stop_from, bus_stop_to)VALUES (4, '35', 4, 2);
INSERT INTO bus_line(bus_line_id, "number", bus_stop_from, bus_stop_to)VALUES (5, '45', 5, 2);

INSERT INTO bus_stop_connection(bus_stop_connection_id, distance, bus_stop_from, bus_stop_to)VALUES (1, 100, 1, 2);
INSERT INTO bus_stop_connection(bus_stop_connection_id, distance, bus_stop_from, bus_stop_to)VALUES (2, 100, 2, 3);
INSERT INTO bus_stop_connection(bus_stop_connection_id, distance, bus_stop_from, bus_stop_to)VALUES (3, 100, 4, 5);
INSERT INTO bus_stop_connection(bus_stop_connection_id, distance, bus_stop_from, bus_stop_to)VALUES (4, 100, 2, 5);
INSERT INTO bus_stop_connection(bus_stop_connection_id, distance, bus_stop_from, bus_stop_to)VALUES (5, 100, 1, 3);

INSERT INTO bus_line_connection(bus_line_connection_id, bus_line, bus_stop_connection, bus_line_order)VALUES (1, 1, 1, 1);
INSERT INTO bus_line_connection(bus_line_connection_id, bus_line, bus_stop_connection, bus_line_order)VALUES (2, 1, 2, 2);
INSERT INTO bus_line_connection(bus_line_connection_id, bus_line, bus_stop_connection, bus_line_order)VALUES (3, 2, 3, 1);
INSERT INTO bus_line_connection(bus_line_connection_id, bus_line, bus_stop_connection, bus_line_order)VALUES (4, 2, 4, 2);
INSERT INTO bus_line_connection(bus_line_connection_id, bus_line, bus_stop_connection, bus_line_order)VALUES (5, 2, 5, 3);

INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (1, 1);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (2, 1);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (2, 2);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (3, 1);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (3, 2);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (3, 3);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (4, 1);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (4, 2);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (4, 3);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (4, 4);