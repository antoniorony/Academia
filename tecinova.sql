-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 26-Abr-2019 às 19:54
-- Versão do servidor: 5.7.24
-- versão do PHP: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tecinova`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(75) NOT NULL,
  `apelido` varchar(30) NOT NULL,
  `cpf` varchar(15) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `logradouro` text NOT NULL,
  `numero` int(11) NOT NULL,
  `bairro` varchar(75) NOT NULL,
  `cidade` varchar(75) NOT NULL,
  `estado` varchar(25) NOT NULL,
  `dataNascimento` date NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`idCliente`, `nome`, `apelido`, `cpf`, `telefone`, `logradouro`, `numero`, `bairro`, `cidade`, `estado`, `dataNascimento`) VALUES
(1, 'Antonio Rony Marcelino Andrade', 'Rony', '057.702.063-30', '(88)9.9210-0782', 'Vila Palmeira', 57, 'Buritizinho', 'MAURITI', 'CEARA', '1995-06-07'),
(2, 'rodrigo marcelino', 'rpdrigp', '000.000.000-00', '(88)3.5521-6622', 'vila palmeira', 57, 'nuritizinho', 'MAURITI', 'CEARA', '1998-05-04'),
(3, 'teste', 'teste', '222.222.222-22', '(00)0.0000-0000', 'vila das testas', 57, 'butithas', 'MAURITI', 'CEARA', '2018-12-20'),
(4, 'rosa maria dos santos andrade', 'rosa', '041.502.020-21', '(88)3.5521-662 ', 'vila palmeira ', 57, 'buritizinho', 'MAURITI', 'CEARA', '1989-04-21');

-- --------------------------------------------------------

--
-- Estrutura da tabela `ficha`
--

DROP TABLE IF EXISTS `ficha`;
CREATE TABLE IF NOT EXISTS `ficha` (
  `idficha` int(11) NOT NULL AUTO_INCREMENT,
  `dataEntrada` date NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `peso` float NOT NULL,
  `medicacao` varchar(80) NOT NULL,
  `acompanhamento` varchar(15) NOT NULL,
  `problemaSaude` varchar(30) NOT NULL,
  `altura` float NOT NULL,
  `objetivo` text NOT NULL,
  `profissao` varchar(30) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `frequenciacardrep` float NOT NULL,
  `frequenciacardMax` float NOT NULL,
  `calculoFCM` float NOT NULL,
  `idade` int(11) NOT NULL,
  PRIMARY KEY (`idficha`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `ficha`
--

INSERT INTO `ficha` (`idficha`, `dataEntrada`, `sexo`, `peso`, `medicacao`, `acompanhamento`, `problemaSaude`, `altura`, `objetivo`, `profissao`, `idCliente`, `frequenciacardrep`, `frequenciacardMax`, `calculoFCM`, `idade`) VALUES
(1, '2019-02-10', 'MASCULINO', 93.5, 'diovan', 'NÇO ', 'pressao alta', 1.66, 'perder 10 quilos', 'analista de sistemas', 1, 0, 0, 0, 0),
(2, '2019-01-20', 'MASCULINO', 93, 'DIOVAN', 'NÇO ', 'HIPERTENCAO', 1.69, 'PERDER 10 QUILOS EM 2 MESES', 'ANALISTA DE SISEMAS', 1, 0, 0, 0, 0),
(3, '2019-02-08', 'MASCULINO', 93, 'DIOVAN', 'NÇO ', 'HIPERTEN€ÇO', 1.68, 'PERDER 10 QUILOS ', 'ANALISTA DE SISTEMAS', 1, 180, 194.289, 0, 0),
(4, '2019-02-08', 'MASCULINO', 30, 'DIOVAN', 'NÇO ', 'HIPERTEN€ÇO', 1.67, 'PERDER 10 QUILOS ', 'EENGENHEIRO DE SOFTWARE', 1, 180, 193.573, 0, 0),
(5, '2019-02-10', 'MASCULINO', 93, 'DIOVAN', 'NÇO ', 'HIPERTEN€ÇO', 1.69, 'PERDER 10 QUILOS', 'ANALISTA DE SISTEMAS', 1, 180, 193.573, 0, 0),
(6, '2020-02-21', 'FEMININO', 50, 'nao		', 'NÃO ', ' nao', 1.6, 'ganhar massa', 'tecnica em enfermagem', 4, 89, 185.153, 0, 0),
(7, '2020-02-21', 'FEMININO', 50.1, 'sad', 'NÃO ', 'nao', 1.6, 'asd', 'tec infermagem', 4, 89, 89, 0, 0),
(8, '2019-04-30', 'FEMININO', 50.1, 'sad', 'SELECIONE', 'nao', 1.6, 'asd', 'tec infermagem', 4, 89, 209.273, 0, 30),
(9, '2019-04-30', 'Selecione', 50.1, 'sad', 'SELECIONE', 'nao', 1.6, 'asd', 'tec infermagem', 4, 89, 209.273, 0, 30);

-- --------------------------------------------------------

--
-- Estrutura da tabela `financeiro`
--

DROP TABLE IF EXISTS `financeiro`;
CREATE TABLE IF NOT EXISTS `financeiro` (
  `idFinanceiro` int(11) NOT NULL AUTO_INCREMENT,
  `mesReferencia` varchar(10) NOT NULL,
  `idMensalidade` int(11) NOT NULL,
  `dataPagamento` date NOT NULL,
  `idCliente` int(11) NOT NULL,
  `valorPagamento` float NOT NULL,
  PRIMARY KEY (`idFinanceiro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mensalidade`
--

DROP TABLE IF EXISTS `mensalidade`;
CREATE TABLE IF NOT EXISTS `mensalidade` (
  `idmensalidade` int(11) NOT NULL AUTO_INCREMENT,
  `dataEntrada` date NOT NULL,
  `idCliente` int(11) NOT NULL,
  `valor` float NOT NULL,
  `ano` varchar(4) NOT NULL,
  `m1` int(11) NOT NULL,
  `m2` int(11) NOT NULL,
  `m3` int(11) NOT NULL,
  `m4` int(11) NOT NULL,
  `m5` int(11) NOT NULL,
  `m6` int(11) NOT NULL,
  `m7` int(11) NOT NULL,
  `m8` int(11) NOT NULL,
  `m9` int(11) NOT NULL,
  `m10` int(11) NOT NULL,
  `m11` int(11) NOT NULL,
  `m12` int(11) NOT NULL,
  PRIMARY KEY (`idmensalidade`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `mensalidade`
--

INSERT INTO `mensalidade` (`idmensalidade`, `dataEntrada`, `idCliente`, `valor`, `ano`, `m1`, `m2`, `m3`, `m4`, `m5`, `m6`, `m7`, `m8`, `m9`, `m10`, `m11`, `m12`) VALUES
(1, '2019-02-19', 3, 50, '2019', 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0),
(2, '2020-02-21', 4, 50, '2019', 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `senha` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `usuario`, `senha`) VALUES
(1, 'Administrador', 'admin', 'admin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
