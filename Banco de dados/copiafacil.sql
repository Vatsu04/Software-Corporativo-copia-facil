-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307:3307
-- Generation Time: Jul 22, 2023 at 07:39 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `copiafacil`
--

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `Id_Cliente` int(11) NOT NULL,
  `Nome` varchar(200) NOT NULL,
  `Telefone` varchar(40) NOT NULL,
  `CPF` varchar(50) NOT NULL,
  `Senha` varchar(100) NOT NULL,
  `Email` varchar(140) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`Id_Cliente`, `Nome`, `Telefone`, `CPF`, `Senha`, `Email`) VALUES
(1, 'Julia', '(21) 98581-9889', '134.234.564-34', '12345', 'juju@gmail.com'),
(2, 'Geraldo', '(21) 98345-1235', '345.123.345-32', '12345', 'smirnoff@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `funcionario`
--

CREATE TABLE `funcionario` (
  `Id_Funcionario` int(11) NOT NULL,
  `Nome` varchar(200) NOT NULL,
  `Cargo` varchar(30) NOT NULL,
  `Telefone` varchar(40) NOT NULL,
  `CPF` varchar(50) NOT NULL,
  `Senha` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `funcionario`
--

INSERT INTO `funcionario` (`Id_Funcionario`, `Nome`, `Cargo`, `Telefone`, `CPF`, `Senha`, `Email`) VALUES
(1, 'Admin', 'Administrador', '(21) 98581-9889', '235.234.523-42', '12345', 'admin@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `pedidos_requisitados`
--

CREATE TABLE `pedidos_requisitados` (
  `Id_Requisito` int(11) NOT NULL,
  `Relatorio` varchar(255) NOT NULL,
  `Id_Cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pedidos_requisitados`
--

INSERT INTO `pedidos_requisitados` (`Id_Requisito`, `Relatorio`, `Id_Cliente`) VALUES
(1, 'oi', 2),
(2, 'asdasd', 2);

-- --------------------------------------------------------

--
-- Table structure for table `pedido_cadastrado`
--

CREATE TABLE `pedido_cadastrado` (
  `Id_Pedido` int(11) NOT NULL,
  `Descricao` varchar(255) NOT NULL,
  `Prazo` varchar(200) NOT NULL,
  `Quantidade` int(11) NOT NULL,
  `Id_Cliente` int(11) NOT NULL,
  `Preco_Unitario` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pedido_cadastrado`
--

INSERT INTO `pedido_cadastrado` (`Id_Pedido`, `Descricao`, `Prazo`, `Quantidade`, `Id_Cliente`, `Preco_Unitario`) VALUES
(1, 'Descrição', 'Prazo', 4, 2, 2.43),
(2, 'Descrição', 'Prazo', 3, 1, 24.56);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`Id_Cliente`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`Id_Funcionario`);

--
-- Indexes for table `pedidos_requisitados`
--
ALTER TABLE `pedidos_requisitados`
  ADD PRIMARY KEY (`Id_Requisito`),
  ADD KEY `Id_Cliente` (`Id_Cliente`);

--
-- Indexes for table `pedido_cadastrado`
--
ALTER TABLE `pedido_cadastrado`
  ADD PRIMARY KEY (`Id_Pedido`),
  ADD KEY `Id_Cliente` (`Id_Cliente`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `Id_Cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `Id_Funcionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pedidos_requisitados`
--
ALTER TABLE `pedidos_requisitados`
  MODIFY `Id_Requisito` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `pedido_cadastrado`
--
ALTER TABLE `pedido_cadastrado`
  MODIFY `Id_Pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pedidos_requisitados`
--
ALTER TABLE `pedidos_requisitados`
  ADD CONSTRAINT `pedidos_requisitados_ibfk_1` FOREIGN KEY (`Id_Cliente`) REFERENCES `cliente` (`Id_Cliente`);

--
-- Constraints for table `pedido_cadastrado`
--
ALTER TABLE `pedido_cadastrado`
  ADD CONSTRAINT `pedido_cadastrado_ibfk_1` FOREIGN KEY (`Id_Cliente`) REFERENCES `cliente` (`Id_Cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
