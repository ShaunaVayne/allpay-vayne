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

 Date: 22/06/2018 14:40:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_service_reservation
-- ----------------------------
DROP TABLE IF EXISTS `order_service_reservation`;
CREATE TABLE `order_service_reservation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `service_id` bigint(20) NOT NULL COMMENT '服务单主键id',
  `reserve_user_id` bigint(20) DEFAULT NULL COMMENT '预约用户id',
  `reserve_user_name` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '预约用户名称',
  `reserve_user_mobile` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '预约用户手机号',
  `reserve_time` varchar(20) DEFAULT NULL COMMENT '预约时间',
  `remark` varchar(128) DEFAULT NULL,
  `addition` varchar(512) DEFAULT NULL,
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `updated_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `creator` varchar(32) NOT NULL DEFAULT 'SYSTEM',
  `modifier` varchar(32) NOT NULL DEFAULT 'SYSTEM',
  `is_deleted` char(1) NOT NULL DEFAULT 'N',
  PRIMARY KEY (`id`),
  KEY `idx_service_id` (`service_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 COMMENT='服务单预约记录';

-- ----------------------------
-- Records of order_service_reservation
-- ----------------------------
BEGIN;
INSERT INTO `order_service_reservation` VALUES (1, 2, 1234, 'wanyang', NULL, '2018-06-12', NULL, NULL, '2018-06-12 11:35:51', '2018-06-12 11:35:51', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (2, 2, 1234, 'wanyang', NULL, '2018-06-12', NULL, NULL, '2018-06-12 13:53:09', '2018-06-12 13:53:09', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (3, 2, 1234, 'wanyang', NULL, '2018-06-12', NULL, NULL, '2018-06-12 14:12:21', '2018-06-12 14:12:21', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (4, 2, 1234, 'wanyang', NULL, '2018-06-12', NULL, NULL, '2018-06-12 14:12:42', '2018-06-12 14:12:42', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (11, 7, NULL, NULL, NULL, '2018-06-12', NULL, NULL, '2018-06-13 14:59:28', '2018-06-13 14:59:28', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (12, 11, NULL, NULL, NULL, '2018-06-19', NULL, NULL, '2018-06-19 18:22:37', '2018-06-19 18:22:37', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (13, 12, NULL, NULL, NULL, '2018-06-19', NULL, NULL, '2018-06-19 18:41:54', '2018-06-19 18:41:54', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (14, 14, NULL, NULL, NULL, '2018-06-19', NULL, NULL, '2018-06-19 18:47:35', '2018-06-19 18:47:35', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (20, 24, NULL, NULL, NULL, '2018-06-21', NULL, NULL, '2018-06-21 16:34:38', '2018-06-21 16:34:38', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (21, 25, NULL, NULL, NULL, '2018-06-21', NULL, NULL, '2018-06-21 16:36:21', '2018-06-21 16:36:21', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (22, 28, NULL, NULL, NULL, '2018-06-21', NULL, NULL, '2018-06-21 16:53:01', '2018-06-21 16:53:01', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (23, 29, NULL, NULL, NULL, '2018-06-21', NULL, NULL, '2018-06-21 17:08:44', '2018-06-21 17:08:44', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (24, 33, NULL, NULL, NULL, '2018-06-21', NULL, NULL, '2018-06-21 17:31:17', '2018-06-21 17:31:17', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (27, 43, NULL, NULL, NULL, '2018-06-21', NULL, NULL, '2018-06-21 19:14:17', '2018-06-21 19:14:17', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (28, 44, NULL, NULL, NULL, '2018-06-21', NULL, NULL, '2018-06-21 19:14:22', '2018-06-21 19:14:22', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (29, 45, NULL, NULL, NULL, '2018-06-21', NULL, NULL, '2018-06-21 19:14:28', '2018-06-21 19:14:28', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (30, 9, NULL, NULL, NULL, '2018-06-21', NULL, NULL, '2018-06-21 19:34:41', '2018-06-21 19:34:41', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (31, 47, NULL, NULL, NULL, '2018-06-22', NULL, NULL, '2018-06-22 09:29:57', '2018-06-22 09:29:57', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (32, 48, NULL, NULL, NULL, '2018-06-22', NULL, NULL, '2018-06-22 09:30:03', '2018-06-22 09:30:03', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (33, 50, NULL, NULL, NULL, '2018-06-22', NULL, NULL, '2018-06-22 09:32:51', '2018-06-22 09:32:51', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (34, 51, NULL, NULL, NULL, '2018-06-22', NULL, NULL, '2018-06-22 09:32:57', '2018-06-22 09:32:57', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (35, 52, NULL, NULL, NULL, '2018-06-22', NULL, NULL, '2018-06-22 09:33:03', '2018-06-22 09:33:03', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (36, 38, NULL, NULL, NULL, '2018-06-21', NULL, NULL, '2018-06-22 10:35:24', '2018-06-22 10:35:24', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (37, 54, NULL, NULL, NULL, '2018-06-22', NULL, NULL, '2018-06-22 11:47:08', '2018-06-22 11:47:08', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (38, 55, NULL, NULL, NULL, '2018-06-22', NULL, NULL, '2018-06-22 11:47:22', '2018-06-22 11:47:22', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_reservation` VALUES (39, 56, NULL, NULL, NULL, '2018-06-22', NULL, NULL, '2018-06-22 11:53:35', '2018-06-22 11:53:35', 'SYSTEM', 'SYSTEM', 'N');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
