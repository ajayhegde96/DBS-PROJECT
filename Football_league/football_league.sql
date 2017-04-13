-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 13, 2017 at 07:42 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `football_league`
--

-- --------------------------------------------------------

--
-- Table structure for table `clubs`
--

CREATE TABLE `clubs` (
  `CLUB_ID` varchar(5) NOT NULL,
  `NAME` varchar(15) NOT NULL,
  `CITY` varchar(15) NOT NULL,
  `STADIUM_NAME` varchar(15) NOT NULL,
  `POSITION` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clubs`
--

INSERT INTO `clubs` (`CLUB_ID`, `NAME`, `CITY`, `STADIUM_NAME`, `POSITION`) VALUES
('1000', 'SOUTHHALL FC', 'LONDON', 'TRAFALGAR PARK', 2),
('1001', 'DORTMUND FC', 'BERLIN', 'HANS ARENA', 2),
('1002', 'JUVENTUS', 'MILAN', 'EZIO ARENA', 2),
('1003', 'LA GALAXY', 'LOS ANGELES', 'STAPLES CENTRE', 2),
('1004', 'LIVERPOOL FC', 'LIVERPOOL', 'STEINSGATE', 2),
('1005', 'CRYSTAL PALACE', 'NORWOOD', 'SELHIRST PARK', 2),
('1006', 'BLACKBURN FC', 'BLACK FREURS', 'KENGSTON', 2),
('1007', 'WELLINGTON FC', 'NEW HAMPSHIRE', 'REDMUND PARK', 2),
('1008', 'GONZAGA UNITED', 'SPOKANE', 'CASTLE ARENA', 2),
('1009', 'COMPTON UNITED', 'COMPTON', 'MADISON PARK', 2);

-- --------------------------------------------------------

--
-- Table structure for table `league`
--

CREATE TABLE `league` (
  `POSITION` int(2) NOT NULL,
  `CLUB_NAME` varchar(15) NOT NULL,
  `WON` int(2) NOT NULL,
  `LOST` int(2) NOT NULL,
  `DRAW` int(2) NOT NULL,
  `GOALS_FOR` int(2) NOT NULL,
  `GOALS_AGAINST` int(2) NOT NULL,
  `POINTS` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `league`
--

INSERT INTO `league` (`POSITION`, `CLUB_NAME`, `WON`, `LOST`, `DRAW`, `GOALS_FOR`, `GOALS_AGAINST`, `POINTS`) VALUES
(7, 'BLACKBURN FC', 5, 3, 2, 24, 19, 17),
(10, 'COMPTON UNITED', 2, 6, 2, 18, 24, 8),
(6, 'CRYSTAL PALACE', 5, 2, 3, 25, 17, 18),
(2, 'DORTMUND FC', 8, 1, 1, 32, 15, 25),
(9, 'GONZAGA UNITED', 3, 6, 1, 20, 22, 10),
(3, 'JUVENTUS', 8, 2, 0, 31, 16, 24),
(4, 'LA GALAXY', 7, 2, 1, 29, 16, 22),
(5, 'LIVERPOOL FC', 6, 2, 2, 27, 18, 20),
(1, 'SOUTHHALL FC', 9, 1, 1, 34, 14, 27),
(8, 'WELLINGTON FC', 4, 2, 4, 22, 18, 16);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` varchar(4) NOT NULL,
  `USERNAME` varchar(10) NOT NULL,
  `PASSWORD` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `USERNAME`, `PASSWORD`) VALUES
('1000', 'ajayhegde', 'root'),
('1001', 'shashank', 'root'),
('1002', 'admin', 'root');

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `LICENSE_ID` varchar(5) NOT NULL,
  `NAME` varchar(10) NOT NULL,
  `COUNTRY` varchar(10) NOT NULL,
  `CLUB_NAME` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`LICENSE_ID`, `NAME`, `COUNTRY`, `CLUB_NAME`) VALUES
('1000', 'EDWARD', 'AMERICA', 'SOUTHHALL FC'),
('1001', 'ROBERTSON', 'ENGLAND', 'DORTMUND FC'),
('1002', 'MOURINHOn', 'SPAIN', 'JUVENTUS'),
('1003', 'FERGUSAN', 'SCOTLAND', 'LA GALAXY'),
('1004', 'RIVERS', 'ITALY', 'LIVERPOOL FC'),
('1005', 'KERR', 'FRANCE', 'CRYSTAL PALACE'),
('1006', 'KLOPP', 'GERMANY', 'BLACKBURN FC'),
('1007', 'RASHID', 'DUBAI', 'WELLINGTON FC'),
('1008', 'GOLOVKIN', 'TURKEY', 'GONZAGA UNITED'),
('1009', 'MCGREGOR', 'IRELAND', 'COMPTON UNITED');

-- --------------------------------------------------------

--
-- Table structure for table `stadium`
--

CREATE TABLE `stadium` (
  `CLUB_NAME` varchar(15) NOT NULL,
  `NAME` varchar(15) NOT NULL,
  `CAPACITY` int(6) NOT NULL,
  `CITY` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stadium`
--

INSERT INTO `stadium` (`CLUB_NAME`, `NAME`, `CAPACITY`, `CITY`) VALUES
('GONZAGA UNITED', 'CASTLE ARENA', 52000, 'SPOKANE'),
('JUVENTUS', 'EZIO ARENA', 70000, 'MILAN'),
('DORTMUND FC', 'HANS ARENA', 72000, 'BERLIN'),
('BLACKBURN FC', 'KENGSTON', 58000, 'BLACK FREURS'),
('COMPTON UNITED', 'MADISON PARK', 48000, 'COMPTON'),
('WELLINGTON FC', 'REDMUND PARK', 55000, 'NEW HAMPSHIRE'),
('CRYSTAL PALACE', 'SELHIRST PARK', 62000, 'NORWOOD'),
('LA GALAXY', 'STAPLES CENTRE', 65000, 'LOS ANGELES'),
('LIVERPOOL FC', 'STEINSGATE', 66000, 'LIVERPOOL'),
('SOUTHHALL FC', 'TRAFALGAR PARK', 68000, 'LONDON');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clubs`
--
ALTER TABLE `clubs`
  ADD PRIMARY KEY (`CLUB_ID`),
  ADD KEY `NAME` (`NAME`),
  ADD KEY `POSITION` (`POSITION`),
  ADD KEY `STADIUM_NAME` (`STADIUM_NAME`),
  ADD KEY `CITY` (`CITY`);

--
-- Indexes for table `league`
--
ALTER TABLE `league`
  ADD PRIMARY KEY (`CLUB_NAME`),
  ADD KEY `POSITION` (`POSITION`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`LICENSE_ID`),
  ADD KEY `CLUB_NAME` (`CLUB_NAME`);

--
-- Indexes for table `stadium`
--
ALTER TABLE `stadium`
  ADD PRIMARY KEY (`NAME`),
  ADD KEY `CLUB_NAME` (`CLUB_NAME`),
  ADD KEY `CITY` (`CITY`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `clubs`
--
ALTER TABLE `clubs`
  ADD CONSTRAINT `fk2` FOREIGN KEY (`NAME`) REFERENCES `league` (`CLUB_NAME`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk3` FOREIGN KEY (`POSITION`) REFERENCES `league` (`POSITION`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk4` FOREIGN KEY (`CITY`) REFERENCES `stadium` (`CITY`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk5` FOREIGN KEY (`STADIUM_NAME`) REFERENCES `stadium` (`NAME`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `stadium`
--
ALTER TABLE `stadium`
  ADD CONSTRAINT `FK1` FOREIGN KEY (`CLUB_NAME`) REFERENCES `league` (`CLUB_NAME`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
