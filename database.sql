CREATE DATABASE  IF NOT EXISTS `bluni` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bluni`;

-- CREATE USER

CREATE USER IF NOT EXISTS 'bluni'@'localhost'  IDENTIFIED BY 'bluni';
GRANT ALL PRIVILEGES ON *.* TO 'bluni'@'localhost';
FLUSH PRIVILEGES;

-- CREATE TABLE users

CREATE TABLE `users` (
                         `id` int(11) NOT NULL AUTO_INCREMENT,
                         `username` varchar(45) NOT NULL,
                         `password` varchar(60) NOT NULL,
                         `enabled` tinyint(1) NOT NULL DEFAULT '1',
                         PRIMARY KEY (`id`),
                         UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB

-- CREATE TABLE roles
CREATE TABLE `roles` (
                         `id` int(11) NOT NULL AUTO_INCREMENT,
                         `user_id` int(11) NOT NULL,
                         `rol` varchar(45) NOT NULL,
                         PRIMARY KEY (`id`),
                         UNIQUE KEY `user_id_rol_unique` (`user_id`,`rol`) /*!80000 INVISIBLE */,
                         CONSTRAINT `fk_rol_user` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB

-- INSERTS

insert into users(username, password, enabled) values('user','',1);
insert into users(username, password, enabled) values('admin','',1);
insert into roles(user_id, rol) values(1, 'ROLE_USER');
insert into roles(user_id, rol) values(2, 'ROLE_USER');
insert into roles(user_id, rol) values(2, 'ROLE_ADMIN');