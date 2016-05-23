-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tempo de Geração: 
-- Versão do Servidor: 5.5.27
-- Versão do PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `qualitibanco`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_cliente`
--

CREATE TABLE IF NOT EXISTS `tb_cliente` (
  `cpf` char(11) NOT NULL DEFAULT '',
  `nome` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_cliente`
--

INSERT INTO `tb_cliente` (`cpf`, `nome`) VALUES
('12312341234', 'Dilermando4'),
('1234', 'Otaviano');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_conta`
--

CREATE TABLE IF NOT EXISTS `tb_conta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tb_cliente_cpf` char(11) DEFAULT NULL,
  `numero` varchar(10) DEFAULT NULL,
  `saldo` decimal(16,4) DEFAULT NULL,
  `tipo` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tb_cliente_cpf` (`tb_cliente_cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_endereco`
--

CREATE TABLE IF NOT EXISTS `tb_endereco` (
  `tb_cliente_cpf` char(11) NOT NULL DEFAULT '',
  `cep` char(8) DEFAULT NULL,
  `numero` char(5) DEFAULT NULL,
  `complemento` char(100) DEFAULT NULL,
  PRIMARY KEY (`tb_cliente_cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_gerente`
--

CREATE TABLE IF NOT EXISTS `tb_gerente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `fone` char(12) DEFAULT NULL,
  `celular` char(12) DEFAULT NULL,
  `email` char(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_gerentes_cliente`
--

CREATE TABLE IF NOT EXISTS `tb_gerentes_cliente` (
  `tb_gerente_id` int(11) DEFAULT NULL,
  `tb_cliente_cpf` char(11) DEFAULT NULL,
  KEY `tb_gerente_id` (`tb_gerente_id`),
  KEY `tb_cliente_cpf` (`tb_cliente_cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restrições para as tabelas dumpadas
--

--
-- Restrições para a tabela `tb_conta`
--
ALTER TABLE `tb_conta`
  ADD CONSTRAINT `tb_conta_ibfk_1` FOREIGN KEY (`tb_cliente_cpf`) REFERENCES `tb_cliente` (`cpf`);

--
-- Restrições para a tabela `tb_endereco`
--
ALTER TABLE `tb_endereco`
  ADD CONSTRAINT `tb_endereco_ibfk_1` FOREIGN KEY (`tb_cliente_cpf`) REFERENCES `tb_cliente` (`cpf`);

--
-- Restrições para a tabela `tb_gerentes_cliente`
--
ALTER TABLE `tb_gerentes_cliente`
  ADD CONSTRAINT `tb_gerentes_cliente_ibfk_1` FOREIGN KEY (`tb_gerente_id`) REFERENCES `tb_gerente` (`id`),
  ADD CONSTRAINT `tb_gerentes_cliente_ibfk_2` FOREIGN KEY (`tb_cliente_cpf`) REFERENCES `tb_cliente` (`cpf`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
