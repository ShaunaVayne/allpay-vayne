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

 Date: 22/06/2018 14:39:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for coupon_use_record
-- ----------------------------
DROP TABLE IF EXISTS `coupon_use_record`;
CREATE TABLE `coupon_use_record` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `proprietor` varchar(80) DEFAULT NULL COMMENT '运营商',
  `coupon_coupon_id` bigint(20) DEFAULT NULL COMMENT '优惠券记录表ID',
  `order_id` varchar(64) DEFAULT NULL COMMENT '订单号',
  `order_money` bigint(16) DEFAULT NULL COMMENT '订单金额',
  `apply_money` bigint(16) DEFAULT NULL COMMENT '使用金额',
  `apply_type` varchar(40) DEFAULT NULL COMMENT '使用类型 下单 取消 退款 延长期限',
  `addition` varchar(255) DEFAULT NULL COMMENT '扩展字段',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `is_deleted` char(2) NOT NULL DEFAULT 'N' COMMENT '是否删除(''Y''-是，''N''-否)',
  `created_time` datetime NOT NULL COMMENT '创建时间',
  `updated_time` datetime NOT NULL COMMENT '修改时间',
  `creator` varchar(40) NOT NULL COMMENT '创建者',
  `modifier` varchar(40) NOT NULL COMMENT '修改者',
  PRIMARY KEY (`id`),
  KEY `idx_coupon_coupon_id` (`coupon_coupon_id`) USING BTREE,
  KEY `idx_order_id` (`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of coupon_use_record
-- ----------------------------
BEGIN;
INSERT INTO `coupon_use_record` VALUES (1, 'CONTINENTAL', 1, '2001', 59000, 9900, 'ORDER', '{sku_id:1,num:2,price:20000}', '下单使用', 'N', '2018-05-23 17:52:30', '2018-05-23 17:52:32', 'wzf', 'wzf');
INSERT INTO `coupon_use_record` VALUES (10100, NULL, 10450, '111111', 100000000, NULL, NULL, NULL, NULL, 'N', '2018-06-13 20:01:14', '2018-06-13 20:01:14', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10150, NULL, 10450, '111111', 100000000, NULL, NULL, NULL, NULL, 'N', '2018-06-13 20:05:10', '2018-06-13 20:05:10', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10200, NULL, 10300, '101509', 40, NULL, NULL, NULL, NULL, 'N', '2018-06-14 19:31:38', '2018-06-14 19:31:38', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10201, NULL, 10300, '101511', 40, NULL, NULL, NULL, NULL, 'N', '2018-06-14 19:36:10', '2018-06-14 19:36:10', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10202, NULL, 10300, '101513', 40, NULL, NULL, NULL, NULL, 'N', '2018-06-14 19:36:43', '2018-06-14 19:36:43', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10203, NULL, 10300, '101514', 40, NULL, NULL, NULL, NULL, 'N', '2018-06-14 19:40:57', '2018-06-14 19:40:57', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10204, NULL, 10300, '101516', 40, NULL, NULL, NULL, NULL, 'N', '2018-06-15 09:25:26', '2018-06-15 09:25:26', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10205, NULL, 10300, '101518', 40, NULL, NULL, NULL, NULL, 'N', '2018-06-15 09:57:09', '2018-06-15 09:57:09', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10250, NULL, 10300, '101520', 40, NULL, NULL, NULL, NULL, 'N', '2018-06-15 14:24:45', '2018-06-15 14:24:45', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10300, NULL, 10300, '101522', 40, NULL, NULL, NULL, NULL, 'N', '2018-06-15 14:31:59', '2018-06-15 14:31:59', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10350, NULL, 10300, '101532', 30, NULL, NULL, NULL, NULL, 'N', '2018-06-15 15:32:16', '2018-06-15 15:32:16', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10400, NULL, 10300, '101534', 30, NULL, NULL, NULL, NULL, 'N', '2018-06-15 15:33:18', '2018-06-15 15:33:18', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10450, NULL, 10300, '101535', 30, NULL, NULL, NULL, NULL, 'N', '2018-06-15 15:34:30', '2018-06-15 15:34:30', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10500, NULL, 10350, '101536', 30, NULL, NULL, NULL, NULL, 'N', '2018-06-15 15:38:55', '2018-06-15 15:38:55', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10550, NULL, 10400, '101537', 30, NULL, NULL, NULL, NULL, 'N', '2018-06-15 15:47:58', '2018-06-15 15:47:58', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10600, NULL, 10500, '101542', 30, NULL, NULL, NULL, NULL, 'N', '2018-06-15 16:00:58', '2018-06-15 16:00:58', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10650, NULL, 10750, '101551', 30, NULL, NULL, NULL, NULL, 'N', '2018-06-15 16:38:17', '2018-06-15 16:38:17', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10700, NULL, 10754, '101560', 40, NULL, NULL, NULL, NULL, 'N', '2018-06-15 17:20:20', '2018-06-15 17:20:20', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10750, NULL, 10755, '101561', 40, NULL, NULL, NULL, NULL, 'N', '2018-06-15 17:27:30', '2018-06-15 17:27:30', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10800, NULL, 10756, '101562', 40, NULL, NULL, NULL, NULL, 'N', '2018-06-15 17:37:20', '2018-06-15 17:37:20', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10801, NULL, 10757, '101563', 40, NULL, NULL, NULL, NULL, 'N', '2018-06-15 17:38:41', '2018-06-15 17:38:41', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10850, NULL, 10758, '101570', 60, NULL, NULL, NULL, NULL, 'N', '2018-06-15 18:06:19', '2018-06-15 18:06:19', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10900, NULL, 10758, '101574', 60, NULL, NULL, NULL, NULL, 'N', '2018-06-19 14:54:24', '2018-06-19 14:54:24', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10901, NULL, 10758, '101576', 60, NULL, NULL, NULL, NULL, 'N', '2018-06-19 14:55:20', '2018-06-19 14:55:20', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10902, NULL, 10758, '101577', 60, NULL, NULL, NULL, NULL, 'N', '2018-06-19 14:55:34', '2018-06-19 14:55:34', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10903, NULL, 10758, '101586', 60, NULL, NULL, NULL, NULL, 'N', '2018-06-19 15:04:57', '2018-06-19 15:04:57', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10904, NULL, 11052, '101626', 6000, NULL, NULL, NULL, NULL, 'N', '2018-06-19 16:23:54', '2018-06-19 16:23:54', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10905, NULL, 11052, '101629', 2000000000, NULL, NULL, NULL, NULL, 'N', '2018-06-19 16:25:54', '2018-06-19 16:25:54', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10906, NULL, 11053, '101632', 2000, NULL, NULL, NULL, NULL, 'N', '2018-06-19 16:30:27', '2018-06-19 16:30:27', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10950, NULL, 11051, '101640', 20, NULL, NULL, NULL, NULL, 'N', '2018-06-19 16:56:36', '2018-06-19 16:56:36', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10951, NULL, 11100, '101647', 200000, NULL, NULL, NULL, NULL, 'N', '2018-06-19 16:58:52', '2018-06-19 16:58:52', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10952, NULL, 10758, '101660', 60, NULL, NULL, NULL, NULL, 'N', '2018-06-19 18:31:29', '2018-06-19 18:31:29', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10953, NULL, 10758, '101663', 60, NULL, NULL, NULL, NULL, 'N', '2018-06-19 18:38:12', '2018-06-19 18:38:12', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10954, NULL, 10758, '101666', 60, NULL, NULL, NULL, NULL, 'N', '2018-06-19 18:39:38', '2018-06-19 18:39:38', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10955, NULL, 11105, '101671', 20000, NULL, NULL, NULL, NULL, 'N', '2018-06-19 18:44:49', '2018-06-19 18:44:49', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10956, NULL, 11104, '101673', 20000, NULL, NULL, NULL, NULL, 'N', '2018-06-19 18:45:17', '2018-06-19 18:45:17', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10957, NULL, 11103, '101674', 20000, NULL, NULL, NULL, NULL, 'N', '2018-06-19 18:46:06', '2018-06-19 18:46:06', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10958, NULL, 10758, '101677', 60, NULL, NULL, NULL, NULL, 'N', '2018-06-19 19:11:36', '2018-06-19 19:11:36', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10959, NULL, 10758, '101684', 60, NULL, NULL, NULL, NULL, 'N', '2018-06-19 19:33:39', '2018-06-19 19:33:39', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10960, NULL, 10758, '101686', 60, NULL, NULL, NULL, NULL, 'N', '2018-06-19 19:34:32', '2018-06-19 19:34:32', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (10961, NULL, 10758, '101689', 60, NULL, NULL, NULL, NULL, 'N', '2018-06-19 19:37:49', '2018-06-19 19:37:49', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (11000, NULL, 10758, '101693', 60, NULL, NULL, NULL, NULL, 'N', '2018-06-20 18:47:44', '2018-06-20 18:47:44', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (11050, NULL, 10750, '101732', 938, NULL, NULL, NULL, NULL, 'N', '2018-06-21 15:58:59', '2018-06-21 15:58:59', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (11051, NULL, 11204, '101765', 4000, NULL, NULL, NULL, NULL, 'N', '2018-06-21 18:04:59', '2018-06-21 18:04:59', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (11052, NULL, 11116, '101772', 4000, NULL, NULL, NULL, NULL, 'N', '2018-06-21 18:43:55', '2018-06-21 18:43:55', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (11053, NULL, 11150, '101777', 4000, NULL, NULL, NULL, NULL, 'N', '2018-06-21 18:48:37', '2018-06-21 18:48:37', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (11100, NULL, 10900, '102720', 4000, NULL, NULL, NULL, NULL, 'N', '2018-06-22 12:01:55', '2018-06-22 12:01:55', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (11101, NULL, 10900, '102723', 4000, NULL, NULL, NULL, NULL, 'N', '2018-06-22 12:05:25', '2018-06-22 12:05:25', 'system', 'system');
INSERT INTO `coupon_use_record` VALUES (11102, NULL, 10900, '103006', 4000, NULL, NULL, NULL, NULL, 'N', '2018-06-22 12:11:02', '2018-06-22 12:11:02', 'system', 'system');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
