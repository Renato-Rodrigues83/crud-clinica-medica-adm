CREATE TABLE IF NOT EXISTS usuarios
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario VARCHAR(50) NOT NULL,
    senha_acesso TEXT  NOT NULL,
    cadastro_funcionario BOOLEAN NOT NULL,
    cadastro_usuario BOOLEAN NOT NULL,
    cadastro_paciente BOOLEAN NOT NULL,
    cadastro_especialidade BOOLEAN NOT NULL,
    cadastro_medico BOOLEAN NOT NULL,
    cadastro_convenio BOOLEAN NOT NULL,
    agendamento_consulta BOOLEAN NOT NULL,
    cancelamento_consulta BOOLEAN NOT NULL,
    modulo_administrativo BOOLEAN NOT NULL,
    modulo_agendamento BOOLEAN NOT NULL,
    modulo_atendimento BOOLEAN NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_swedish_ci;