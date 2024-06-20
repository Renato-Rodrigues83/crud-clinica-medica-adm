CREATE TABLE IF NOT EXISTS medicos
(
     id INT AUTO_INCREMENT PRIMARY KEY,
     nome_medico VARCHAR(150),
     tipo_especialidade VARCHAR(50),
     numero_crm VARCHAR(50)

)ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_swedish_ci;