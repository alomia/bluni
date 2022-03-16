CREATE DATABASE  IF NOT EXISTS `bluni` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bluni`;

-- CREATE USER

CREATE USER IF NOT EXISTS 'bluni'@'localhost'  IDENTIFIED BY 'bluni';
GRANT ALL PRIVILEGES ON *.* TO 'bluni'@'localhost';
FLUSH PRIVILEGES;


