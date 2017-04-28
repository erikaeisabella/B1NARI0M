-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 29-Abr-2017 às 01:38
-- Versão do servidor: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `binariom`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `chamado`
--

CREATE TABLE `chamado` (
  `bin` int(6) UNSIGNED ZEROFILL NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `status` varchar(45) DEFAULT ' ',
  `prioridade` varchar(45) DEFAULT ' ',
  `localidade` varchar(255) NOT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  `data_abertura` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_resolvido` date DEFAULT NULL,
  `equipamento_etiqueta` int(11) NOT NULL,
  `usuario_matricula` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `chamado_cliente`
--

CREATE TABLE `chamado_cliente` (
  `chamado_bin` int(6) UNSIGNED ZEROFILL NOT NULL,
  `cliente_matricula` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `matricula` varchar(5) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `setor` varchar(45) NOT NULL,
  `telefone` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`matricula`, `nome`, `cpf`, `setor`, `telefone`) VALUES
('CL123', 'A', '122', 'RH', '3333'),
('CL456', 'Pedro', '11122233344', 'D-20', 'telefone');

-- --------------------------------------------------------

--
-- Estrutura da tabela `equipamento`
--

CREATE TABLE `equipamento` (
  `etiqueta` int(3) NOT NULL,
  `marca` varchar(255) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `descricao` varchar(500) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `data_instalacao` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `equipamento`
--

INSERT INTO `equipamento` (`etiqueta`, `marca`, `tipo`, `descricao`, `data_instalacao`) VALUES
(12, 'ASUS', 'Notebook', 'WINDOWS 10 64-BITS\r\n2X MEMORIA RAM 4GB 1333MHz\r\nMONITOR LCD 20'' LG\r\nPROCESSADOR INTEL I3 3,0GHz', '12/12/2012'),
(123, 'Samsung', 'Notebook', 'asdf\r\nfdsa', 'dia 10');

-- --------------------------------------------------------

--
-- Estrutura da tabela `menu`
--

CREATE TABLE `menu` (
  `id` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `link` varchar(255) NOT NULL,
  `id_perfil` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `menu`
--

INSERT INTO `menu` (`id`, `nome`, `link`, `id_perfil`) VALUES
(1, 'Usuario', 'das', 1),
(2, 'Perfil', 'asd', 1),
(3, 'Cliente', 'a', 2),
(4, 'Chamado', 'a', 2),
(5, 'asdf', 'qwer', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `perfil`
--

CREATE TABLE `perfil` (
  `id` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `perfil`
--

INSERT INTO `perfil` (`id`, `nome`, `descricao`) VALUES
(1, 'Admin', 'Perfil destinado ao(s) admin(s) do sistema'),
(2, 'Tecnico', 'Perfil destinado aos tecnicos');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `matricula` varchar(5) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `senha` varchar(7) NOT NULL,
  `id_perfil` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chamado`
--
ALTER TABLE `chamado`
  ADD PRIMARY KEY (`bin`),
  ADD KEY `fk_chamado_equipamento1_idx` (`equipamento_etiqueta`),
  ADD KEY `fk_chamado_usuario1_idx` (`usuario_matricula`);

--
-- Indexes for table `chamado_cliente`
--
ALTER TABLE `chamado_cliente`
  ADD PRIMARY KEY (`chamado_bin`,`cliente_matricula`),
  ADD KEY `fk_chamado_has_cliente_cliente1_idx` (`cliente_matricula`),
  ADD KEY `fk_chamado_has_cliente_chamado1_idx` (`chamado_bin`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`matricula`);

--
-- Indexes for table `equipamento`
--
ALTER TABLE `equipamento`
  ADD PRIMARY KEY (`etiqueta`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_menu_perfil1_idx` (`id_perfil`);

--
-- Indexes for table `perfil`
--
ALTER TABLE `perfil`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`matricula`),
  ADD KEY `fk_usuario_perfil1_idx` (`id_perfil`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chamado`
--
ALTER TABLE `chamado`
  MODIFY `bin` int(6) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `perfil`
--
ALTER TABLE `perfil`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `chamado`
--
ALTER TABLE `chamado`
  ADD CONSTRAINT `fk_chamado_equipamento1` FOREIGN KEY (`equipamento_etiqueta`) REFERENCES `equipamento` (`etiqueta`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_chamado_usuario1` FOREIGN KEY (`usuario_matricula`) REFERENCES `usuario` (`matricula`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `chamado_cliente`
--
ALTER TABLE `chamado_cliente`
  ADD CONSTRAINT `fk_chamado_has_cliente_chamado1` FOREIGN KEY (`chamado_bin`) REFERENCES `chamado` (`bin`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_chamado_has_cliente_cliente1` FOREIGN KEY (`cliente_matricula`) REFERENCES `cliente` (`matricula`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `menu`
--
ALTER TABLE `menu`
  ADD CONSTRAINT `fk_menu_perfil1` FOREIGN KEY (`id_perfil`) REFERENCES `perfil` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_usuario_perfil1` FOREIGN KEY (`id_perfil`) REFERENCES `perfil` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
