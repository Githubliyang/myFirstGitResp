-- MySQL dump 10.13  Distrib 5.6.41, for macos10.13 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	5.6.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `sex` int(1) DEFAULT NULL,
  `register_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'89921218@qq.com','1ee04e0b1cb5af7367c80c22e42efd8b','土豆',1,'2017-06-23 14:24:23'),(2,'2@qq.com','1ee04e0b1cb5af7367c80c22e42efd8b','土豆-2',1,'2017-06-23 14:24:23'),(3,'3@qq.com','1ee04e0b1cb5af7367c80c22e42efd8b','土豆-3',1,'2017-06-23 14:24:23'),(4,'4@qq.com','1ee04e0b1cb5af7367c80c22e42efd8b','土豆-4',1,'2017-06-23 14:24:23'),(5,'5@qq.com','1ee04e0b1cb5af7367c80c22e42efd8b','土豆-5',1,'2017-06-23 14:24:23'),(6,'6@qq.com','1ee04e0b1cb5af7367c80c22e42efd8b','土豆-6',1,'2017-06-23 14:24:23'),(7,'7@qq.com','1ee04e0b1cb5af7367c80c22e42efd8b','土豆-7',1,'2017-06-23 14:24:23'),(8,'8@qq.com','1ee04e0b1cb5af7367c80c22e42efd8b','土豆-8',1,'2017-06-23 14:24:23'),(9,'9@qq.com','1ee04e0b1cb5af7367c80c22e42efd8b','土豆-9',1,'2017-06-23 14:24:23'),(10,'10@qq.com','1ee04e0b1cb5af7367c80c22e42efd8b','土豆-10',1,'2017-06-23 14:24:23');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-25 16:18:17
