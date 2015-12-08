INSERT INTO bus_stop(bus_stop_id, name, latitude, longitude)VALUES (1, 'IX Wiekow Kielc UW', 50.87482, 20.62842);
INSERT INTO bus_stop(bus_stop_id, name, latitude, longitude)VALUES (2, 'IX Wiekow Kielc Kosciol', 50.87358, 20.63567);
INSERT INTO bus_stop(bus_stop_id, name, latitude, longitude)VALUES (3, 'Warszawska Galeria Korona', 50.87504, 20.63383);
INSERT INTO bus_stop(bus_stop_id, name, latitude, longitude)VALUES (4, 'Warszawska Politechnika', 50.87986, 20.63717);
INSERT INTO bus_stop(bus_stop_id, name, latitude, longitude)VALUES (5, 'Warszawska Lukoil', 50.88154, 20.63906);
INSERT INTO bus_stop(bus_stop_id, name, latitude, longitude)VALUES (6, 'Sandomierska Zrodlowa', 50.87082, 20.6443);
INSERT INTO bus_stop(bus_stop_id, name, latitude, longitude)VALUES (7, 'Sandomierska Slaska', 50.86979, 20.64962);

INSERT INTO bus_line(bus_line_id, "number", bus_stop_from, bus_stop_to)VALUES (1, '5', 1, 5);
INSERT INTO bus_line(bus_line_id, "number", bus_stop_from, bus_stop_to)VALUES (2, '15', 1, 7);

INSERT INTO bus_stop_connection(bus_stop_connection_id, distance, bus_stop_from, bus_stop_to)VALUES (1, 100, 1, 2);
INSERT INTO bus_stop_connection(bus_stop_connection_id, distance, bus_stop_from, bus_stop_to)VALUES (2, 100, 1, 3);
INSERT INTO bus_stop_connection(bus_stop_connection_id, distance, bus_stop_from, bus_stop_to)VALUES (3, 100, 3, 4);
INSERT INTO bus_stop_connection(bus_stop_connection_id, distance, bus_stop_from, bus_stop_to)VALUES (4, 100, 4, 5);
INSERT INTO bus_stop_connection(bus_stop_connection_id, distance, bus_stop_from, bus_stop_to)VALUES (5, 100, 2, 6);
INSERT INTO bus_stop_connection(bus_stop_connection_id, distance, bus_stop_from, bus_stop_to)VALUES (6, 100, 6, 7);


INSERT INTO bus_line_connection(bus_line_connection_id, bus_line, bus_stop_connection, bus_line_order)VALUES (1, 1, 2, 1);
INSERT INTO bus_line_connection(bus_line_connection_id, bus_line, bus_stop_connection, bus_line_order)VALUES (2, 1, 3, 2);
INSERT INTO bus_line_connection(bus_line_connection_id, bus_line, bus_stop_connection, bus_line_order)VALUES (3, 1, 4, 3);
INSERT INTO bus_line_connection(bus_line_connection_id, bus_line, bus_stop_connection, bus_line_order)VALUES (4, 2, 1, 1);
INSERT INTO bus_line_connection(bus_line_connection_id, bus_line, bus_stop_connection, bus_line_order)VALUES (5, 2, 5, 2);
INSERT INTO bus_line_connection(bus_line_connection_id, bus_line, bus_stop_connection, bus_line_order)VALUES (6, 2, 6, 3);

INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (1, 1);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (1, 3);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (1, 4);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (1, 5);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (2, 1);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (2, 2);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (2, 6);
INSERT INTO bus_line_bus_stop(bus_line, bus_stop)VALUES (2, 7);
