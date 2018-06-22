/*
 Navicat Premium Data Transfer

 Source Server         : tuhu_test
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : 172.16.20.70:3306
 Source Schema         : saas

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 22/06/2018 14:41:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for proprietor
-- ----------------------------
DROP TABLE IF EXISTS `proprietor`;
CREATE TABLE `proprietor` (
  `id` varchar(20) NOT NULL,
  `proprietor_name` varchar(32) NOT NULL,
  `company` varchar(64) DEFAULT NULL,
  `logo` varchar(128) DEFAULT NULL,
  `remark` varchar(128) DEFAULT NULL,
  `addition` varchar(512) DEFAULT NULL,
  `created_time` datetime(3) NOT NULL,
  `updated_time` datetime(3) NOT NULL,
  `creator` varchar(32) NOT NULL DEFAULT 'SYSTEM',
  `modifier` varchar(32) NOT NULL DEFAULT 'SYSTEM',
  `is_deleted` char(1) NOT NULL DEFAULT 'N',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='运营商';

-- ----------------------------
-- Records of proprietor
-- ----------------------------
BEGIN;
INSERT INTO `proprietor` VALUES ('CONTINENTAL', '马牌', '马牌公司', NULL, NULL, NULL, '2018-05-24 10:51:23.000', '2018-05-24 10:51:25.000', 'wzf', 'wzf', 'N');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
