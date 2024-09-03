-- --------------------------------------------------------
-- 호스트:                          Localhost
-- 서버 버전:                        9.0.0 - MySQL Community Server - GPL
-- 서버 OS:                        Linux
-- HeidiSQL 버전:                  12.8.0.6908
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- 테이블 aaa.member 구조 내보내기
CREATE TABLE IF NOT EXISTS `member` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `name` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `age` int DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `regdate` datetime DEFAULT NULL,
  PRIMARY KEY (`idx`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 aaa.member:~8 rows (대략적) 내보내기
DELETE FROM `member`;
INSERT INTO `member` (`idx`, `name`, `age`, `email`, `password`, `regdate`) VALUES
	(1, '고길동', 100, NULL, NULL, NULL),
	(3, '임예서', 1, NULL, NULL, NULL),
	(7, NULL, NULL, 'qwe', 'asd', NULL),
	(8, NULL, NULL, 'qwe@nate.com', 'asdf', NULL),
	(9, NULL, NULL, 'qwe@nate.com', 'asd', NULL),
	(10, NULL, NULL, 'qwe@nate.com', 'asd', NULL),
	(11, NULL, NULL, 'qwe@nate.com', 'asd', NULL),
	(12, NULL, NULL, 'qwe@nate.com', 'asd', NULL);

-- 테이블 aaa.student 구조 내보내기
CREATE TABLE IF NOT EXISTS `student` (
  `이름` varchar(50) DEFAULT NULL,
  `국어` int DEFAULT NULL,
  `영어` int DEFAULT NULL,
  `수학` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 aaa.student:~4 rows (대략적) 내보내기
DELETE FROM `student`;
INSERT INTO `student` (`이름`, `국어`, `영어`, `수학`) VALUES
	('홍길동', 100, 80, 70),
	('박길동', 20, 50, 60),
	('홍상수', 100, 90, 80),
	('홍상수', 100, 90, 80),
	('김길동', 100, 100, 100);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
