-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-03-2022 a las 04:57:53
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bluni`
--

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`id`, `user_id`, `rol`) VALUES
                                                 (1, 1, 'ROLE_USER'),
                                                 (3, 2, 'ROLE_ADMIN'),
                                                 (2, 2, 'ROLE_USER');

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `enabled`) VALUES
                                                                  (1, 'user', '$2a$10$KKN/gjZ/eKQTvlkUrxTBYOUdqjHn/if2lx585Hpb94jXDQFfTmkVm', 1),
                                                                  (2, 'admin', '$2a$10$ftbHEG1WT0bTSrRMxVI6tOKvT0WakVPiaUTbVXGoDsJn8hFqgwqlO', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
