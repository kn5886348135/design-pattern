-- 创建数据库
-- DROP DATABASE IF EXISTS test;
-- CREATE DATABASE `test` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */

--建表
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test`  (
  `id` int NOT NULL,
  `user_name` varchar(255) NULL,
  `phone` varchar(255) NULL,
  `address` varchar(255) NULL,
  PRIMARY KEY (`id`)
);