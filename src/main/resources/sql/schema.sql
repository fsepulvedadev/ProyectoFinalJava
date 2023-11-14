

CREATE TABLE ventas.clientes (
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    dni VARCHAR(30) NOT NULL
);

CREATE TABLE ventas.productos (
    productos_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    descripcion VARCHAR(255) NOT NULL,
    codigo VARCHAR(50) NOT NULL,
    stock INT NOT NULL,
    precio DOUBLE NOT NULL
);

CREATE TABLE ventas.facturas (

    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    clientes_id INT,
    fecha DATETIME,
    total DOUBLE NOT NULL,
    CONSTRAINT fk_clientes_id FOREIGN KEY (clientes_id) REFERENCES clientes(id)
);

CREATE TABLE ventas.detalles_factura (
    id INT PRIMARY KEY AUTO_INCREMENT,
    factura_id INT,
    cantidad INT ,
    producto_id INT ,
    importe FLOAT(5,2),
    CONSTRAINT fk_factura_id FOREIGN KEY (factura_id) REFERENCES facturas(id),
    CONSTRAINT fk_productos_id FOREIGN KEY (producto_id) REFERENCES productos(id)
);

