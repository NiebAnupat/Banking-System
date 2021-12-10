-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2021 at 02:21 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `banking system`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `customer_id` varchar(512) NOT NULL,
  `ac_number` int(11) NOT NULL,
  `bank_id` int(11) NOT NULL,
  `ac_name` varchar(512) NOT NULL,
  `ac_balance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`customer_id`, `ac_number`, `bank_id`, `ac_name`, `ac_balance`) VALUES
('6400922', 4197, 1, 'Anupat Kaewmee', 3400),
('6400922', 57197, 3, 'Anupat Kaewmee', 53499);

-- --------------------------------------------------------

--
-- Table structure for table `bank`
--

CREATE TABLE `bank` (
  `bank_id` int(11) NOT NULL,
  `bank_name` varchar(512) NOT NULL,
  `bank_balance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bank`
--

INSERT INTO `bank` (`bank_id`, `bank_name`, `bank_balance`) VALUES
(1, 'Nieb Banking', 3400),
(2, 'Noey Banking', 0),
(3, 'Eng Banking', 53499),
(4, 'Pimuk Banking', 0),
(5, 'Pee Banking', 0),
(6, 'Ice Banking', 0);

-- --------------------------------------------------------

--
-- Table structure for table `banking_type`
--

CREATE TABLE `banking_type` (
  `type_id` int(11) NOT NULL,
  `type_name` varchar(512) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `banking_type`
--

INSERT INTO `banking_type` (`type_id`, `type_name`) VALUES
(1, 'Deposit'),
(2, 'Withdraw'),
(3, 'Transfer');

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `customer_id` varchar(512) NOT NULL,
  `customer_password` varchar(512) NOT NULL,
  `customer_name` varchar(512) NOT NULL,
  `customer_tel` varchar(512) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`customer_id`, `customer_password`, `customer_name`, `customer_tel`) VALUES
('6400922', '6400922', 'Anupat Kaewmee', '0661128806');

-- --------------------------------------------------------

--
-- Table structure for table `moneydeposit`
--

CREATE TABLE `moneydeposit` (
  `dp_id` int(11) NOT NULL,
  `dp_money` double NOT NULL,
  `ac_number` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `moneytransfer`
--

CREATE TABLE `moneytransfer` (
  `tf_id` int(11) NOT NULL,
  `tf_money` double NOT NULL,
  `ac_number_treansferor` int(11) NOT NULL,
  `ac_number_recipiebt` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `moneywithdraw`
--

CREATE TABLE `moneywithdraw` (
  `wd_id` int(11) NOT NULL,
  `wd_money` double NOT NULL,
  `ac_number` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `total_statement`
--

CREATE TABLE `total_statement` (
  `stm_id` int(11) NOT NULL,
  `stm_date` datetime NOT NULL,
  `type_id` int(11) NOT NULL,
  `ac_number` int(11) NOT NULL,
  `banking_id` int(11) NOT NULL,
  `amount` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`ac_number`),
  ADD KEY `customer_id` (`customer_id`),
  ADD KEY `bank_id` (`bank_id`);

--
-- Indexes for table `bank`
--
ALTER TABLE `bank`
  ADD PRIMARY KEY (`bank_id`),
  ADD UNIQUE KEY `bank_id` (`bank_id`);

--
-- Indexes for table `banking_type`
--
ALTER TABLE `banking_type`
  ADD PRIMARY KEY (`type_id`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `moneydeposit`
--
ALTER TABLE `moneydeposit`
  ADD PRIMARY KEY (`dp_id`),
  ADD KEY `ac_number` (`ac_number`);

--
-- Indexes for table `moneytransfer`
--
ALTER TABLE `moneytransfer`
  ADD PRIMARY KEY (`tf_id`),
  ADD KEY `ac_number_transferor` (`ac_number_treansferor`),
  ADD KEY `ac_number_recipient` (`ac_number_recipiebt`);

--
-- Indexes for table `moneywithdraw`
--
ALTER TABLE `moneywithdraw`
  ADD PRIMARY KEY (`wd_id`),
  ADD KEY `ac_number` (`ac_number`);

--
-- Indexes for table `total_statement`
--
ALTER TABLE `total_statement`
  ADD PRIMARY KEY (`stm_id`),
  ADD KEY `type_id` (`type_id`),
  ADD KEY `ac_number` (`ac_number`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `moneydeposit`
--
ALTER TABLE `moneydeposit`
  MODIFY `dp_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `moneytransfer`
--
ALTER TABLE `moneytransfer`
  MODIFY `tf_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `moneywithdraw`
--
ALTER TABLE `moneywithdraw`
  MODIFY `wd_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `total_statement`
--
ALTER TABLE `total_statement`
  MODIFY `stm_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `account`
--
ALTER TABLE `account`
  ADD CONSTRAINT `bank_id` FOREIGN KEY (`bank_id`) REFERENCES `bank` (`bank_id`),
  ADD CONSTRAINT `customer_id` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`);

--
-- Constraints for table `moneydeposit`
--
ALTER TABLE `moneydeposit`
  ADD CONSTRAINT `ac_number` FOREIGN KEY (`ac_number`) REFERENCES `account` (`ac_number`);

--
-- Constraints for table `moneytransfer`
--
ALTER TABLE `moneytransfer`
  ADD CONSTRAINT `ac_number_recipient` FOREIGN KEY (`ac_number_recipiebt`) REFERENCES `account` (`ac_number`),
  ADD CONSTRAINT `ac_number_transferor` FOREIGN KEY (`ac_number_treansferor`) REFERENCES `account` (`ac_number`);

--
-- Constraints for table `moneywithdraw`
--
ALTER TABLE `moneywithdraw`
  ADD CONSTRAINT `moneywithdraw_ibfk_1` FOREIGN KEY (`ac_number`) REFERENCES `account` (`ac_number`);

--
-- Constraints for table `total_statement`
--
ALTER TABLE `total_statement`
  ADD CONSTRAINT `total_statement_ibfk_1` FOREIGN KEY (`ac_number`) REFERENCES `account` (`ac_number`),
  ADD CONSTRAINT `type_id` FOREIGN KEY (`type_id`) REFERENCES `banking_type` (`type_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
