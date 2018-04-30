CREATE TABLE clientes(
	idClientes INT(2) NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(30) NOT NULL,
	direccion VARCHAR(30) NOT NULL,
	PRIMARY KEY (`idClientes`)
) ENGINE = InnoDB;
CREATE TABLE facturas(
	idFacturas INT(2) NOT NULL AUTO_INCREMENT,
	monto INT(6) NOT NULL,
	PRIMARY KEY (`idFacturas`)
) ENGINE = InnoDB;
CREATE TABLE vehiculos(
	idVehiculos INT(2) NOT NULL AUTO_INCREMENT,
	marca VARCHAR(20) NOT NULL,
	placas VARCHAR(7) NOT NULL,
	modelo VARCHAR(15) NOT NULL,
	PRIMARY KEY (`idVehiculos`)
) ENGINE = InnoDB;
/*CREATE TABLE polizas(
	idPolizas INT(2) NOT NULL AUTO_INCREMENT,
	costo DOUBLE(10,4) NOT NULL,
	valorPrima INT(6) NOT NULL,
	fechaApertura DATE NOT NULL,
	fechaVencimiento DATE NOT NULL,
	PRIMARY KEY (`idPolizas`)
) ENGINE = InnoDB;*/