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

 Date: 22/06/2018 14:39:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for coupon_test
-- ----------------------------
DROP TABLE IF EXISTS `coupon_test`;
CREATE TABLE `coupon_test` (
  `id` bigint(20) NOT NULL,
  `content` varchar(100) DEFAULT NULL,
  `create_time` datetime(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of coupon_test
-- ----------------------------
BEGIN;
INSERT INTO `coupon_test` VALUES (1, '恭喜数据库连接成功', NULL);
INSERT INTO `coupon_test` VALUES (2, '11', '2018-06-05 13:57:56.904');
INSERT INTO `coupon_test` VALUES (3, '12', '2018-06-05 13:58:43.425');
INSERT INTO `coupon_test` VALUES (4, '13', '2018-06-07 20:09:24.000');
INSERT INTO `coupon_test` VALUES (5, '134', '2018-06-07 20:09:35.000');
INSERT INTO `coupon_test` VALUES (6, '改过了', '2018-06-07 20:55:54.059');
INSERT INTO `coupon_test` VALUES (7, '改过了', '2018-06-07 20:56:09.734');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
