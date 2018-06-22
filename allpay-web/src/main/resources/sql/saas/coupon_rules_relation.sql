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

 Date: 22/06/2018 14:39:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for coupon_rules_relation
-- ----------------------------
DROP TABLE IF EXISTS `coupon_rules_relation`;
CREATE TABLE `coupon_rules_relation` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `proprietor` varchar(80) DEFAULT NULL COMMENT '运营商',
  `coupon_rules_id` bigint(20) NOT NULL COMMENT '规则表主键',
  `relation_type` varchar(40) NOT NULL COMMENT '关联数据类型 SKU_LIST BRAND_LIST CATEGORY_LIST',
  `relation_value` varchar(2048) DEFAULT NULL COMMENT '关联值',
  `addition` varchar(1024) DEFAULT NULL COMMENT '扩展字段',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '是否删除（''Y''-是，''N''-否）',
  `created_time` datetime NOT NULL COMMENT '创建时间',
  `updated_time` datetime NOT NULL COMMENT '修改时间',
  `creator` varchar(40) NOT NULL COMMENT '创建者',
  `modifier` varchar(40) NOT NULL COMMENT '修改者',
  PRIMARY KEY (`id`),
  KEY `idx_coupon_rule_relation_proprietor` (`proprietor`),
  KEY `idx_coupon_rule_relation_id` (`coupon_rules_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='优惠券关联商品、用户、门店信息';

-- ----------------------------
-- Records of coupon_rules_relation
-- ----------------------------
BEGIN;
INSERT INTO `coupon_rules_relation` VALUES (1, 'CONTINENTAL', 1, 'ITEM_LIST_AVAILABLE', ',10001,10002,10003,10004,10005', 'item_ID=1,2,3,4适用于该券', 'Y', '2018-05-23 17:56:34', '2018-05-23 17:56:36', 'wzf', 'wzf');
INSERT INTO `coupon_rules_relation` VALUES (2, 'CONTINENTAL', 2, 'ITEM_LIST_ALL_AVAILABLE', 'All', '全商品券', 'N', '2018-05-23 17:57:46', '2018-05-23 17:57:48', 'wzf', 'wzf');
INSERT INTO `coupon_rules_relation` VALUES (22, 'CONTINENTAL', 11, 'ITEM_LIST_AVAILABLE', '10001,10002,10003,10004', NULL, 'N', '2018-06-11 14:14:30', '2018-06-11 14:14:30', 'wangc', 'wangc');
INSERT INTO `coupon_rules_relation` VALUES (23, 'CONTINENTAL', 12, 'ITEM_LIST_AVAILABLE', '10001,10002,10004,10005', NULL, 'N', '2018-06-11 14:41:19', '2018-06-11 14:41:19', 'wangc', 'wangc');
INSERT INTO `coupon_rules_relation` VALUES (24, 'CONTINENTAL', 13, 'ITEM_LIST_AVAILABLE', '10001,10002,10004,10005', NULL, 'Y', '2018-06-12 14:03:06', '2018-06-12 14:03:06', 'wangc', 'wangc');
INSERT INTO `coupon_rules_relation` VALUES (25, 'CONTINENTAL', 14, 'ITEM_LIST_AVAILABLE', '10001,10002,10004,10005', NULL, 'Y', '2018-06-12 14:12:22', '2018-06-12 14:12:22', 'wangc', 'wangc');
INSERT INTO `coupon_rules_relation` VALUES (10040, 'CONTINENTAL', 10070, 'ITEM_LIST_AVAILABLE', '1,2,3,10001,10002,10003,10004', NULL, 'Y', '2018-06-11 20:02:08', '2018-06-11 20:02:08', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10050, 'CONTINENTAL', 10080, 'ITEM_LIST_AVAILABLE', '1,2,3,10001,10002,10003,10004,10005', NULL, 'Y', '2018-06-11 20:09:25', '2018-06-11 20:09:25', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10060, 'CONTINENTAL', 10090, 'ITEM_LIST_AVAILABLE', '1,2,3,10001,10002,10003,10004,10005', NULL, 'Y', '2018-06-11 20:11:37', '2018-06-11 20:11:37', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10070, 'CONTINENTAL', 10100, 'ITEM_LIST_AVAILABLE', '1,2,3,10001,10002,10003,10004,10005', NULL, 'Y', '2018-06-12 09:53:02', '2018-06-12 09:53:02', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10071, 'CONTINENTAL', 10101, 'ITEM_LIST_AVAILABLE', '1,2,3,10001,10002,10003,10004,10005', NULL, 'Y', '2018-06-12 09:53:02', '2018-06-12 09:53:02', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10090, 'CONTINENTAL', 10130, 'ITEM_LIST_AVAILABLE', '1,2,3,10001,10002,10003,10004,10005', NULL, 'Y', '2018-06-12 11:49:17', '2018-06-12 11:49:17', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10100, 'CONTINENTAL', 10140, 'ITEM_LIST_AVAILABLE', '1,2,3,10001,10002,10003,10004,10005', NULL, 'Y', '2018-06-12 11:51:38', '2018-06-12 11:51:38', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10101, 'CONTINENTAL', 10141, 'ITEM_LIST_AVAILABLE', '1,2,3,10001,10002,10003,10004,10005', NULL, 'Y', '2018-06-12 11:51:38', '2018-06-12 11:51:38', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10110, 'CONTINENTAL', 10150, 'ITEM_LIST_AVAILABLE', '1,2,3,10001,10002,10003,10004,10005,999', NULL, 'N', '2018-06-12 14:12:59', '2018-06-12 14:12:59', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10120, 'CONTINENTAL', 10160, 'ITEM_LIST_AVAILABLE', '1,999', NULL, 'Y', '2018-06-13 14:00:00', '2018-06-13 14:00:00', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10121, 'CONTINENTAL', 10161, 'ITEM_LIST_UNAVAILABLE', '1,1000', NULL, 'Y', '2018-06-13 14:03:57', '2018-06-13 14:03:57', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10130, 'CONTINENTAL', 10170, 'ITEM_LIST_UNAVAILABLE', '1,1000', NULL, 'Y', '2018-06-13 15:12:30', '2018-06-13 15:12:30', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10131, 'CONTINENTAL', 10171, 'ITEM_LIST_UNAVAILABLE', '1,1000', NULL, 'N', '2018-06-13 15:13:19', '2018-06-13 15:13:19', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10140, '1', 10201, 'ITEM_LIST_ALL_AVAILABLE', '1', NULL, 'Y', '2018-06-13 15:31:05', '2018-06-13 15:31:05', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10141, '1', 10202, 'ITEM_LIST_ALL_AVAILABLE', '1', NULL, 'Y', '2018-06-13 15:33:40', '2018-06-13 15:33:40', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10150, 'CONTINENTAL', 10210, 'ITEM_LIST_ALL_AVAILABLE', '1', NULL, 'Y', '2018-06-13 15:38:56', '2018-06-13 15:38:56', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10160, 'CONTINENTAL', 10220, 'ITEM_LIST_ALL_AVAILABLE', '1', NULL, 'Y', '2018-06-13 15:42:57', '2018-06-13 15:42:57', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10161, 'CONTINENTAL', 10221, 'ITEM_LIST_ALL_AVAILABLE', '1', NULL, 'Y', '2018-06-13 15:46:45', '2018-06-13 15:46:45', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10162, 'CONTINENTAL', 10222, 'ITEM_LIST_ALL_AVAILABLE', '1', NULL, 'Y', '2018-06-13 15:48:00', '2018-06-13 15:48:00', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10163, 'CONTINENTAL', 10223, 'ITEM_LIST_ALL_AVAILABLE', '1', NULL, 'Y', '2018-06-13 15:59:34', '2018-06-13 15:59:34', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10164, 'CONTINENTAL', 10224, 'ITEM_LIST_ALL_AVAILABLE', '1', NULL, 'Y', '2018-06-13 16:00:08', '2018-06-13 16:00:08', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10165, 'CONTINENTAL', 10225, 'ITEM_LIST_ALL_AVAILABLE', '1', NULL, 'Y', '2018-06-13 16:00:57', '2018-06-13 16:00:57', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10166, 'CONTINENTAL', 10226, 'ITEM_LIST_ALL_AVAILABLE', '1', NULL, 'Y', '2018-06-13 16:00:58', '2018-06-13 16:00:58', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10167, 'CONTINENTAL', 10227, 'ITEM_LIST_AVAILABLE', '1', NULL, 'Y', '2018-06-13 16:04:15', '2018-06-13 16:04:15', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10168, 'CONTINENTAL', 10228, 'ITEM_LIST_AVAILABLE', '1', NULL, 'Y', '2018-06-13 16:04:22', '2018-06-13 16:04:22', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10169, 'CONTINENTAL', 10229, 'ITEM_LIST_AVAILABLE', '1', NULL, 'Y', '2018-06-13 16:04:23', '2018-06-13 16:04:23', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10170, 'CONTINENTAL', 10230, 'ITEM_LIST_AVAILABLE', '1', NULL, 'Y', '2018-06-13 16:04:23', '2018-06-13 16:04:23', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10171, 'CONTINENTAL', 10231, 'ITEM_LIST_AVAILABLE', '9999', NULL, 'N', '2018-06-13 16:04:30', '2018-06-13 16:04:30', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10172, 'CONTINENTAL', 10232, 'ITEM_LIST_ALL_AVAILABLE', '9999', NULL, 'Y', '2018-06-13 16:24:23', '2018-06-13 16:24:23', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10180, 'CONTINENTAL', 10240, 'ITEM_LIST_UNAVAILABLE', '1,1000', NULL, 'Y', '2018-06-19 14:14:52', '2018-06-19 14:14:52', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10190, 'CONTINENTAL', 10250, 'ITEM_LIST_AVAILABLE', '1', NULL, 'Y', '2018-06-19 14:22:13', '2018-06-19 14:22:13', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10200, 'CONTINENTAL', 10260, 'ITEM_LIST_AVAILABLE', '1', NULL, 'N', '2018-06-19 15:49:27', '2018-06-19 15:49:27', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10201, 'CONTINENTAL', 10261, 'ITEM_LIST_AVAILABLE', '1', NULL, 'N', '2018-06-19 15:58:40', '2018-06-19 15:58:40', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10202, 'CONTINENTAL', 10262, 'ITEM_LIST_AVAILABLE', '10005', NULL, 'N', '2018-06-19 15:59:39', '2018-06-19 15:59:39', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10203, 'CONTINENTAL', 10263, 'ITEM_LIST_AVAILABLE', '10001', NULL, 'N', '2018-06-19 16:02:20', '2018-06-19 16:02:20', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10204, 'CONTINENTAL', 10264, 'ITEM_LIST_AVAILABLE', '10001', NULL, 'N', '2018-06-19 16:27:53', '2018-06-19 16:27:53', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10210, 'CONTINENTAL', 10270, 'ITEM_LIST_AVAILABLE', '10001', NULL, 'N', '2018-06-19 16:52:23', '2018-06-19 16:52:23', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10211, 'CONTINENTAL', 10271, 'ITEM_LIST_AVAILABLE', '10001', NULL, 'N', '2018-06-19 17:41:26', '2018-06-19 17:41:26', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10212, 'CONTINENTAL', 10272, 'ITEM_LIST_AVAILABLE', '10001', NULL, 'N', '2018-06-20 14:19:23', '2018-06-20 14:19:23', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10213, 'CONTINENTAL', 10273, 'ITEM_LIST_AVAILABLE', '10001', NULL, 'N', '2018-06-20 14:19:23', '2018-06-20 14:19:23', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10220, 'CONTINENTAL', 10280, 'ITEM_LIST_AVAILABLE', '1', NULL, 'Y', '2018-06-21 16:12:50', '2018-06-21 16:12:50', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10221, 'CONTINENTAL', 10281, 'ITEM_LIST_AVAILABLE', '1', NULL, 'Y', '2018-06-21 16:15:31', '2018-06-21 16:15:31', 'system', 'system');
INSERT INTO `coupon_rules_relation` VALUES (10230, 'CONTINENTAL', 10290, 'IITEM_LIST_UNAVAILABLE', '1', NULL, 'Y', '2018-06-22 10:36:15', '2018-06-22 10:36:15', 'system', 'system');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
