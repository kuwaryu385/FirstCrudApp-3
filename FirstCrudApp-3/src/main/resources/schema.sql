CREATE DATABASE IF NOT EXISTS `mylibrary`;
USE `mylibrary`;

DROP TABLE IF EXISTS `my_books`;
CREATE TABLE `my_books` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(255) NOT NULL DEFAULT '',
    `author` VARCHAR(50) NOT NULL DEFAULT '',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB;
