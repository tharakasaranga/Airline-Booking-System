-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2024 at 12:48 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airline`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `FlightNumber` varchar(10) NOT NULL,
  `Classname` varchar(20) NOT NULL,
  `TicketId` varchar(10) NOT NULL,
  `CustomerId` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`FlightNumber`, `Classname`, `TicketId`, `CustomerId`) VALUES
('A2068', 'First Class', 'A4332', '995683205V'),
('A2068', 'First Class', 'A7704', '986531205V'),
('A3031', 'Economy Class', 'A31', '200466982065'),
('A3031', 'Bussiness Class', 'A3251', '986532659V'),
('A3031', 'Economy Class', 'A6744', '695365204V'),
('A3032', 'First Class', 'A2391', '992365986V'),
('A4031', 'First Class', 'A1007', '65956465X'),
('A4031', 'First Class', 'A1430', '20015699836'),
('A4031', 'Bussiness Class', 'A1946', '985965802V'),
('A4031', 'Bussiness Class', 'A3937', '20006539899'),
('A4031', 'Bussiness Class', 'A7701', '20036599503'),
('A4035', 'First Class', 'A19', '746871503V'),
('A5037', 'Bussiness Class', 'A1671', '786598632V');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `PhoneNumber` varchar(20) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `IdNumber` varchar(15) NOT NULL,
  `Sex` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`FirstName`, `LastName`, `Email`, `PhoneNumber`, `Address`, `IdNumber`, `Sex`) VALUES
('Nipun', 'Sanjana', 'nipun745@gmail.com', '+94776269855', 'Kandy', '20006539899', 'Male'),
('Sachini', 'Vidushima', 'sachinividushima19@gmail.com', '+94707566988', 'Mirigama', '20015699836', 'Female'),
('Vinu', 'Kumaran', 'vinukumaran569@gmail.com', '+94726533699', 'Jaffna', '20036599503', 'Male'),
('Nishu', 'Kumara', 'nishu567@gmail.com', '+94776926548', 'Colombo', '200466982065', 'Male'),
('A.M', 'Rathnapala', '-', '+94726599533', 'Gampaha', '695365204V', 'Male'),
('Pushpamali', 'Sriyakanthi', 'pushpa98@gmail.com', '+94717233844', 'Veyangoda', '746871503V', 'Female'),
('Yamuna', 'Gangani', 'yamunagangani700@gmail.com', '+94719865346', 'Galle', '786598632V', 'Female'),
('Ishani', 'Sanjana', 'ishani78@gmail.com', '+94717966569', 'Matara', '985965802V', 'Female'),
('Kanchana', 'Sampath', 'kanchsam679@gmail.com', '+94716986322', 'Anuradhapura', '986531205V', 'Male'),
('Nimna', 'Sahan', 'Sahan78@gmail.com', '+94784566988', 'Polonnaruwa', '986532659V', 'Male'),
('Kasun', 'Kumara', 'kasun78@gmail.com', '+94750698365', 'Kandy', '992365986V', 'Male'),
('Amali', 'Fonseka', 'amali67@gmail.com', '+94717699533', 'Rambukkana', '995683205V', 'Female');

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE `flight` (
  `FlightNumber` varchar(10) NOT NULL,
  `Arrival_time` varchar(10) NOT NULL,
  `Departure_time` varchar(10) NOT NULL,
  `Destination` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`FlightNumber`, `Arrival_time`, `Departure_time`, `Destination`) VALUES
('A2068', '4.30 a.m', '6.00 a.m', 'Canada'),
('A3031', '8:00 AM', '10:00 AM', 'India'),
('A3032', '2:00 AM', '4:00 AM', 'India'),
('A4031', '3:00 AM', '3:30 AM', 'USA'),
('A4032', '11.00 a.m', '1.00 p.m', 'Australia'),
('A4035', '11.30 a.m', '2.00 p.m', 'Australia'),
('A5037', '1.30 a.m', '2.00 a.m', 'Canada');

-- --------------------------------------------------------

--
-- Table structure for table `flightclass`
--

CREATE TABLE `flightclass` (
  `ClassName` varchar(10) NOT NULL,
  `BasePrice` double(10,2) NOT NULL,
  `NumberOfSeats` int(11) NOT NULL,
  `FlightNumber` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `flightclass`
--

INSERT INTO `flightclass` (`ClassName`, `BasePrice`, `NumberOfSeats`, `FlightNumber`) VALUES
('Bussiness ', 115000.00, 90, 'A2068'),
('Economy Cl', 135000.00, 70, 'A2068'),
('First Clas', 105000.00, 120, 'A2068'),
('Bussiness ', 150000.00, 100, 'A3031'),
('Economy Cl', 130000.00, 150, 'A3031'),
('First Clas', 100000.00, 120, 'A3031'),
('Bussiness ', 150000.00, 100, 'A3032'),
('Economy Cl', 130000.00, 115, 'A3032'),
('First Clas', 100000.00, 110, 'A3032'),
('Bussiness ', 140000.00, 90, 'A4031'),
('Economy Cl', 125000.00, 125, 'A4031'),
('First Clas', 110000.00, 110, 'A4031'),
('Bussiness ', 125000.00, 80, 'A4032'),
('Economy Cl', 135000.00, 70, 'A4032'),
('First Clas', 115000.00, 120, 'A4032'),
('Bussiness ', 125000.00, 80, 'A4035'),
('Economy Cl', 135000.00, 70, 'A4035'),
('First Clas', 115000.00, 120, 'A4035'),
('Bussiness ', 125000.00, 80, 'A5037'),
('Economy Cl', 135000.00, 70, 'A5037'),
('First Clas', 115000.00, 120, 'A5037');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `CustomerId` varchar(15) NOT NULL,
  `TicketId` varchar(10) NOT NULL,
  `PayementMethod` varchar(30) NOT NULL,
  `paidAmount` varchar(30) NOT NULL,
  `payementStatus` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`CustomerId`, `TicketId`, `PayementMethod`, `paidAmount`, `payementStatus`) VALUES
('20006539899', 'A3937', 'VISA Credit/Debit card', 'Rs.175000.0', 'Paid'),
('20015699836', 'A1430', 'Cash', 'Rs.145000.0', 'Paid'),
('20036599503', 'A7701', 'Cash', 'Rs.175000.0', 'Paid'),
('200466982065', 'A31', 'VISA Credit/Debit card', 'Rs.165000.0', 'Paid'),
('65956465X', 'A1007', 'VISA Credit/Debit card', 'Rs.145000.0', 'Paid'),
('695365204V', 'A6744', 'Cash', 'Rs.165000.0', 'Paid'),
('746871503V', 'A19', 'Cash', 'Rs.150000.0', 'Paid'),
('786598632V', 'A1671', 'VISA Credit/Debit card', 'Rs.160000.0', 'Paid'),
('985965802V', 'A1946', 'VISA Credit/Debit card', 'Rs.175000.0', 'Paid'),
('986531205V', 'A7704', 'Cash', 'Rs.140000.0', 'Paid'),
('986532659V', 'A3251', 'VISA Credit/Debit card', 'Rs.185000.0', 'Paid'),
('992365986V', 'A2391', 'Cash', 'Rs.135000.0', 'Paid'),
('995683205V', 'A4332', 'Cash', 'Rs.140000.0', 'Paid');

-- --------------------------------------------------------

--
-- Table structure for table `ticket`
--

CREATE TABLE `ticket` (
  `TicketId` varchar(10) NOT NULL,
  `IDNumber` varchar(15) NOT NULL,
  `FlightNumber` varchar(10) NOT NULL,
  `Destination` varchar(30) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ticket`
--

INSERT INTO `ticket` (`TicketId`, `IDNumber`, `FlightNumber`, `Destination`, `status`) VALUES
('A1007', '65956465X', 'A4031', 'USA', 'Ticket is Issued'),
('A1430', '20015699836', 'A4031', 'USA', 'Ticket is Issued'),
('A1671', '786598632V', 'A5037', 'Canada', 'Ticket is Issued'),
('A19', '746871503V', 'A4035', 'Australia', 'Ticket is Issued'),
('A1946', '985965802V', 'A4031', 'USA', 'Ticket is Issued'),
('A2391', '992365986V', 'A3032', 'India', 'Ticket is Issued'),
('A31', '200466982065', 'A3031', 'India', 'Ticket is Issued'),
('A3251', '986532659V', 'A3031', 'India', 'Ticket is Issued'),
('A3937', '20006539899', 'A4031', 'USA', 'Ticket is Issued'),
('A4332', '995683205V', 'A2068', 'Canada', 'Ticket is Issued'),
('A6744', '695365204V', 'A3031', 'India', 'Ticket is Issued'),
('A7701', '20036599503', 'A4031', 'USA', 'Ticket is Issued'),
('A7704', '986531205V', 'A2068', 'Canada', 'Ticket is Issued');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `EmployeeId` varchar(6) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `Registered_by` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`EmployeeId`, `Name`, `username`, `password`, `Registered_by`) VALUES
('776487', 'Tharaka Saranga', 'tharakasaranga', 'Thara2001@', 'Manage'),
('776488', 'Sachini Vidushima', 'sachinividushima', 'Sachini2001#', '776487'),
('776489', 'Savindi Sathsarani', 'savindi', 'Savi2001#', '776487'),
('776490', 'Sanjeewa Prasad', 'sanjeewa', 'Prasad1969@', '776487');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`FlightNumber`,`TicketId`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`IdNumber`);

--
-- Indexes for table `flight`
--
ALTER TABLE `flight`
  ADD PRIMARY KEY (`FlightNumber`);

--
-- Indexes for table `flightclass`
--
ALTER TABLE `flightclass`
  ADD PRIMARY KEY (`FlightNumber`,`ClassName`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`CustomerId`,`TicketId`);

--
-- Indexes for table `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`TicketId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
