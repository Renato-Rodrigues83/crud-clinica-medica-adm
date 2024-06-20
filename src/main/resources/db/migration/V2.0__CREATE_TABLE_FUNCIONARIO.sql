CREATE TABLE IF NOT EXISTS funcionarios
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_funcionario VARCHAR(100) NOT NULL,
    numero_rg VARCHAR(20),
    orgao_emissor VARCHAR(50),
    numero_cpf VARCHAR(20),
    endereco VARCHAR(100),
    numero VARCHAR(10),
    complemento  VARCHAR(100),
    bairro VARCHAR(100),
    cidade VARCHAR(100),
    estado VARCHAR(100),
    telefone  VARCHAR(20),
    celular  VARCHAR(20) NOT NULL,
    numero_ctps VARCHAR(50),
    numero_pis  VARCHAR(50),
    data_nascimento DATE NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_swedish_ci;