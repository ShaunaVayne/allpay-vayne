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

 Date: 22/06/2018 14:41:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_service_trace
-- ----------------------------
DROP TABLE IF EXISTS `order_service_trace`;
CREATE TABLE `order_service_trace` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `service_id` bigint(20) NOT NULL COMMENT '服务单id',
  `before_service_status` int(3) DEFAULT NULL COMMENT '服务单变更前状态',
  `after_service_status` int(3) DEFAULT NULL COMMENT '服务单变更后状态',
  `remark` varchar(128) DEFAULT NULL,
  `addition` varchar(512) DEFAULT NULL,
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `updated_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `creator` varchar(32) NOT NULL DEFAULT 'SYSTEM',
  `modifier` varchar(32) NOT NULL DEFAULT 'SYSTEM',
  `is_deleted` char(1) NOT NULL DEFAULT 'N',
  PRIMARY KEY (`id`),
  KEY `index_service_id` (`service_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=94 DEFAULT CHARSET=utf8 COMMENT='服务单轨迹';

-- ----------------------------
-- Records of order_service_trace
-- ----------------------------
BEGIN;
INSERT INTO `order_service_trace` VALUES (1, 7, 100, 120, NULL, NULL, '2018-06-13 14:50:05', '2018-06-13 14:50:05', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (2, 7, 100, 120, NULL, NULL, '2018-06-13 14:59:28', '2018-06-13 14:59:28', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (3, 9, 100, 150, NULL, NULL, '2018-06-14 19:44:19', '2018-06-14 19:44:19', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (4, 10, 100, 150, NULL, NULL, '2018-06-15 09:33:30', '2018-06-15 09:33:30', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (5, 11, 100, 110, NULL, NULL, '2018-06-19 18:22:37', '2018-06-19 18:22:37', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (6, 11, 110, 120, NULL, NULL, '2018-06-19 18:22:37', '2018-06-19 18:22:37', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (7, 11, 120, 130, NULL, NULL, '2018-06-19 18:22:42', '2018-06-19 18:22:42', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (8, 12, 100, 110, NULL, NULL, '2018-06-19 18:41:54', '2018-06-19 18:41:54', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (9, 12, 110, 120, NULL, NULL, '2018-06-19 18:41:55', '2018-06-19 18:41:55', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (10, 12, 120, 130, NULL, NULL, '2018-06-19 18:42:00', '2018-06-19 18:42:00', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (11, 14, 100, 110, NULL, NULL, '2018-06-19 18:47:35', '2018-06-19 18:47:35', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (12, 14, 110, 120, NULL, NULL, '2018-06-19 18:47:35', '2018-06-19 18:47:35', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (13, 14, 120, 130, NULL, NULL, '2018-06-19 18:47:40', '2018-06-19 18:47:40', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (14, 15, 100, 150, NULL, NULL, '2018-06-20 09:53:18', '2018-06-20 09:53:18', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (15, 13, 100, 130, NULL, NULL, '2018-06-21 10:58:06', '2018-06-21 10:58:06', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (16, 13, 100, 130, NULL, NULL, '2018-06-21 11:01:18', '2018-06-21 11:01:18', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (32, 24, 100, 110, NULL, NULL, '2018-06-21 16:34:38', '2018-06-21 16:34:38', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (33, 24, 110, 120, NULL, NULL, '2018-06-21 16:34:38', '2018-06-21 16:34:38', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (34, 24, 120, 130, NULL, NULL, '2018-06-21 16:34:43', '2018-06-21 16:34:43', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (35, 25, 100, 110, NULL, NULL, '2018-06-21 16:36:21', '2018-06-21 16:36:21', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (36, 25, 110, 120, NULL, NULL, '2018-06-21 16:36:21', '2018-06-21 16:36:21', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (37, 25, 120, 130, NULL, NULL, '2018-06-21 16:36:26', '2018-06-21 16:36:26', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (38, 26, 100, 150, NULL, NULL, '2018-06-21 16:49:00', '2018-06-21 16:49:00', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (39, 27, 100, 150, NULL, NULL, '2018-06-21 16:50:07', '2018-06-21 16:50:07', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (40, 28, 100, 110, NULL, NULL, '2018-06-21 16:53:01', '2018-06-21 16:53:01', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (41, 28, 110, 120, NULL, NULL, '2018-06-21 16:53:01', '2018-06-21 16:53:01', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (42, 28, 120, 130, NULL, NULL, '2018-06-21 16:53:06', '2018-06-21 16:53:06', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (43, 29, 100, 110, NULL, NULL, '2018-06-21 17:08:44', '2018-06-21 17:08:44', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (44, 29, 110, 120, NULL, NULL, '2018-06-21 17:08:44', '2018-06-21 17:08:44', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (45, 29, 120, 130, NULL, NULL, '2018-06-21 17:08:49', '2018-06-21 17:08:49', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (46, 33, 100, 110, NULL, NULL, '2018-06-21 17:31:17', '2018-06-21 17:31:17', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (47, 33, 110, 120, NULL, NULL, '2018-06-21 17:31:17', '2018-06-21 17:31:17', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (48, 33, 120, 130, NULL, NULL, '2018-06-21 17:31:22', '2018-06-21 17:31:22', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (49, 36, 100, 150, NULL, NULL, '2018-06-21 18:19:00', '2018-06-21 18:19:00', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (50, 38, 110, 120, NULL, NULL, '2018-06-21 18:59:35', '2018-06-21 18:59:35', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (51, 39, 100, 150, NULL, NULL, '2018-06-21 19:08:22', '2018-06-21 19:08:22', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (52, 40, 100, 150, NULL, NULL, '2018-06-21 19:09:27', '2018-06-21 19:09:27', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (53, 41, 100, 150, NULL, NULL, '2018-06-21 19:10:50', '2018-06-21 19:10:50', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (54, 42, 100, 150, NULL, NULL, '2018-06-21 19:12:54', '2018-06-21 19:12:54', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (55, 43, 100, 110, NULL, NULL, '2018-06-21 19:14:17', '2018-06-21 19:14:17', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (56, 43, 110, 120, NULL, NULL, '2018-06-21 19:14:17', '2018-06-21 19:14:17', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (57, 43, 120, 130, NULL, NULL, '2018-06-21 19:14:22', '2018-06-21 19:14:22', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (58, 44, 100, 110, NULL, NULL, '2018-06-21 19:14:22', '2018-06-21 19:14:22', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (59, 44, 110, 120, NULL, NULL, '2018-06-21 19:14:22', '2018-06-21 19:14:22', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (60, 44, 120, 130, NULL, NULL, '2018-06-21 19:14:27', '2018-06-21 19:14:27', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (61, 45, 100, 110, NULL, NULL, '2018-06-21 19:14:28', '2018-06-21 19:14:28', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (62, 45, 110, 120, NULL, NULL, '2018-06-21 19:14:28', '2018-06-21 19:14:28', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (63, 45, 120, 130, NULL, NULL, '2018-06-21 19:14:33', '2018-06-21 19:14:33', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (64, 46, 100, 150, NULL, NULL, '2018-06-21 19:21:14', '2018-06-21 19:21:14', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (65, 9, 110, 120, NULL, NULL, '2018-06-21 19:34:42', '2018-06-21 19:34:42', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (66, 47, 100, 110, NULL, NULL, '2018-06-22 09:29:57', '2018-06-22 09:29:57', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (67, 47, 110, 120, NULL, NULL, '2018-06-22 09:29:57', '2018-06-22 09:29:57', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (68, 47, 120, 130, NULL, NULL, '2018-06-22 09:30:02', '2018-06-22 09:30:02', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (69, 48, 100, 110, NULL, NULL, '2018-06-22 09:30:03', '2018-06-22 09:30:03', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (70, 48, 110, 120, NULL, NULL, '2018-06-22 09:30:03', '2018-06-22 09:30:03', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (71, 48, 120, 130, NULL, NULL, '2018-06-22 09:30:08', '2018-06-22 09:30:08', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (72, 50, 100, 110, NULL, NULL, '2018-06-22 09:32:51', '2018-06-22 09:32:51', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (73, 50, 110, 120, NULL, NULL, '2018-06-22 09:32:51', '2018-06-22 09:32:51', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (74, 50, 120, 130, NULL, NULL, '2018-06-22 09:32:56', '2018-06-22 09:32:56', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (75, 51, 100, 110, NULL, NULL, '2018-06-22 09:32:57', '2018-06-22 09:32:57', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (76, 51, 110, 120, NULL, NULL, '2018-06-22 09:32:57', '2018-06-22 09:32:57', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (77, 51, 120, 130, NULL, NULL, '2018-06-22 09:33:02', '2018-06-22 09:33:02', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (78, 52, 100, 110, NULL, NULL, '2018-06-22 09:33:03', '2018-06-22 09:33:03', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (79, 52, 110, 120, NULL, NULL, '2018-06-22 09:33:03', '2018-06-22 09:33:03', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (80, 52, 120, 130, NULL, NULL, '2018-06-22 09:33:08', '2018-06-22 09:33:08', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (81, 38, 110, 120, NULL, NULL, '2018-06-22 10:35:24', '2018-06-22 10:35:24', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (82, 53, 100, 150, NULL, NULL, '2018-06-22 11:44:01', '2018-06-22 11:44:01', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (83, 54, 100, 110, NULL, NULL, '2018-06-22 11:47:08', '2018-06-22 11:47:08', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (84, 54, 110, 120, NULL, NULL, '2018-06-22 11:47:08', '2018-06-22 11:47:08', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (85, 54, 120, 130, NULL, NULL, '2018-06-22 11:47:13', '2018-06-22 11:47:13', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (86, 55, 100, 110, NULL, NULL, '2018-06-22 11:47:22', '2018-06-22 11:47:22', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (87, 55, 110, 120, NULL, NULL, '2018-06-22 11:47:22', '2018-06-22 11:47:22', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (88, 55, 120, 130, NULL, NULL, '2018-06-22 11:47:27', '2018-06-22 11:47:27', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (89, 56, 100, 110, NULL, NULL, '2018-06-22 11:53:35', '2018-06-22 11:53:35', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (90, 56, 110, 120, NULL, NULL, '2018-06-22 11:53:35', '2018-06-22 11:53:35', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (91, 56, 120, 130, NULL, NULL, '2018-06-22 11:53:40', '2018-06-22 11:53:40', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (92, 68, 100, 130, NULL, NULL, '2018-06-22 14:32:18', '2018-06-22 14:32:18', 'SYSTEM', 'SYSTEM', 'N');
INSERT INTO `order_service_trace` VALUES (93, 67, 100, 130, NULL, NULL, '2018-06-22 14:34:24', '2018-06-22 14:34:24', 'SYSTEM', 'SYSTEM', 'N');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
