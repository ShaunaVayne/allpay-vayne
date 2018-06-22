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

 Date: 22/06/2018 14:40:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_items_sku
-- ----------------------------
DROP TABLE IF EXISTS `order_items_sku`;
CREATE TABLE `order_items_sku` (
  `id` bigint(20) NOT NULL,
  `order_id` bigint(20) NOT NULL COMMENT '订单id',
  `item_id` bigint(20) NOT NULL COMMENT '商品id',
  `physics_id` bigint(20) DEFAULT NULL COMMENT '商品信息返回的物理id',
  `sku_id` bigint(20) DEFAULT NULL,
  `sku_name` varchar(512) DEFAULT NULL,
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `created_time` datetime(3) DEFAULT NULL COMMENT '创建时间',
  `updated_time` datetime(3) DEFAULT NULL COMMENT '更新时间',
  `creator` varchar(20) NOT NULL COMMENT '创建人',
  `modifier` varchar(20) NOT NULL COMMENT '更新人',
  `addition` varchar(512) DEFAULT NULL COMMENT '扩展字段',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `index_order_id` (`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_items_sku
-- ----------------------------
BEGIN;
INSERT INTO `order_items_sku` VALUES (100000, 101406, 1, NULL, 20, NULL, 1, '2018-06-10 14:24:28.919', '2018-06-10 14:24:28.919', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100001, 101406, 1, NULL, 20, NULL, 1, '2018-06-10 14:24:28.940', '2018-06-10 14:24:28.940', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100002, 101407, 1, NULL, 20, NULL, 1, '2018-06-10 14:28:56.847', '2018-06-10 14:28:56.847', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100003, 101407, 2, NULL, 30, NULL, 1, '2018-06-10 14:28:56.872', '2018-06-10 14:28:56.872', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100060, 101457, 1, NULL, 20, 'A-轮胎', 1, '2018-06-12 16:04:58.721', '2018-06-12 16:04:58.721', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100061, 101457, 2, NULL, 30, 'B-打气筒', 1, '2018-06-12 16:04:58.753', '2018-06-12 16:04:58.753', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100062, 101458, 1, NULL, 20, 'A-轮胎', 1, '2018-06-12 16:06:56.444', '2018-06-12 16:06:56.444', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100063, 101458, 2, NULL, 30, 'B-打气筒', 1, '2018-06-12 16:06:56.464', '2018-06-12 16:06:56.464', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100064, 101459, 10001, NULL, 20, 'A-轮胎', 1, '2018-06-12 16:09:39.596', '2018-06-12 16:09:39.596', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100065, 101459, 10002, NULL, 30, 'B-打气筒', 1, '2018-06-12 16:09:39.658', '2018-06-12 16:09:39.658', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100066, 101460, 10001, NULL, 20, 'A-轮胎', 1, '2018-06-12 16:18:02.969', '2018-06-12 16:18:02.969', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100067, 101460, 10002, NULL, 30, 'B-打气筒', 1, '2018-06-12 16:18:03.022', '2018-06-12 16:18:03.022', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100068, 101462, 10001, NULL, 10001, 'mock用例sku0', 1, '2018-06-13 09:26:37.588', '2018-06-13 09:26:37.588', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100069, 101462, 10001, NULL, 10002, 'mock用例sku1', 1, '2018-06-13 09:26:37.623', '2018-06-13 09:26:37.623', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100070, 101462, 10001, NULL, 10003, 'mock用例sku2', 1, '2018-06-13 09:26:37.670', '2018-06-13 09:26:37.670', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100071, 101462, 10002, NULL, 10002, 'mock用例sku0', 1, '2018-06-13 09:26:37.710', '2018-06-13 09:26:37.710', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100072, 101462, 10002, NULL, 10003, 'mock用例sku1', 1, '2018-06-13 09:26:37.751', '2018-06-13 09:26:37.751', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100073, 101493, 10001, NULL, 20, 'A-轮胎', 1, '2018-06-14 11:56:00.285', '2018-06-14 11:56:00.285', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100074, 101493, 10002, NULL, 30, 'B-打气筒', 1, '2018-06-14 11:56:00.359', '2018-06-14 11:56:00.359', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100077, 101495, 10001, NULL, 20, 'A-轮胎', 1, '2018-06-14 11:59:17.745', '2018-06-14 11:59:17.745', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100078, 101495, 10002, NULL, 30, 'B-打气筒', 1, '2018-06-14 11:59:17.803', '2018-06-14 11:59:17.803', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100085, 101514, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-14 19:40:56.793', '2018-06-14 19:40:56.793', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100086, 101514, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-14 19:40:56.816', '2018-06-14 19:40:56.816', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100087, 101516, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-15 09:25:26.297', '2018-06-15 09:25:26.297', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100088, 101516, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-15 09:25:26.320', '2018-06-15 09:25:26.320', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100089, 101518, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-15 09:57:08.979', '2018-06-15 09:57:08.979', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100090, 101518, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-15 09:57:09.036', '2018-06-15 09:57:09.036', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100091, 101520, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-15 14:24:45.497', '2018-06-15 14:24:45.497', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100092, 101520, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-15 14:24:45.537', '2018-06-15 14:24:45.537', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100093, 101522, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-15 14:34:56.100', '2018-06-15 14:34:56.100', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100094, 101522, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-15 14:34:56.135', '2018-06-15 14:34:56.135', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100095, 101525, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-15 14:56:57.342', '2018-06-15 14:56:57.342', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100096, 101525, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-15 14:56:57.379', '2018-06-15 14:56:57.379', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100097, 101532, 10001, NULL, 20, 'A-轮胎', 999, '2018-06-15 15:32:29.826', '2018-06-15 15:32:29.826', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100098, 101532, 10002, NULL, 30, 'B-打气筒', 999, '2018-06-15 15:32:29.876', '2018-06-15 15:32:29.876', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100099, 101534, 10001, NULL, 20, 'A-轮胎', 999, '2018-06-15 15:33:18.809', '2018-06-15 15:33:18.809', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100100, 101534, 10002, NULL, 30, 'B-打气筒', 999, '2018-06-15 15:33:18.834', '2018-06-15 15:33:18.834', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100101, 101538, 10001, NULL, 20, 'A-轮胎', 999, '2018-06-15 15:52:15.342', '2018-06-15 15:52:15.342', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100102, 101538, 10002, NULL, 30, 'B-打气筒', 999, '2018-06-15 15:52:15.391', '2018-06-15 15:52:15.391', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100103, 101541, 10001, NULL, 20, 'A-轮胎', 999, '2018-06-15 15:59:29.160', '2018-06-15 15:59:29.160', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100104, 101541, 10002, NULL, 30, 'B-打气筒', 999, '2018-06-15 15:59:29.192', '2018-06-15 15:59:29.192', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100105, 101543, 10001, NULL, 20, 'A-轮胎', 999, '2018-06-15 16:02:41.629', '2018-06-15 16:02:41.629', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100106, 101543, 10002, NULL, 30, 'B-打气筒', 999, '2018-06-15 16:02:41.698', '2018-06-15 16:02:41.698', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100107, 101544, 10001, NULL, 20, 'A-轮胎', 999, '2018-06-15 16:07:07.592', '2018-06-15 16:07:07.592', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100108, 101544, 10002, NULL, 30, 'B-打气筒', 999, '2018-06-15 16:07:07.636', '2018-06-15 16:07:07.636', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100109, 101548, 10001, NULL, 20, 'A-轮胎', 999, '2018-06-15 16:29:33.720', '2018-06-15 16:29:33.720', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100110, 101548, 10002, NULL, 30, 'B-打气筒', 999, '2018-06-15 16:29:33.768', '2018-06-15 16:29:33.768', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100111, 101549, 10001, NULL, 20, 'A-轮胎', 999, '2018-06-15 16:33:47.264', '2018-06-15 16:33:47.264', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100112, 101549, 10002, NULL, 30, 'B-打气筒', 999, '2018-06-15 16:33:47.308', '2018-06-15 16:33:47.308', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100113, 101550, 10001, NULL, 20, 'A-轮胎', 999, '2018-06-15 16:34:57.255', '2018-06-15 16:34:57.255', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100114, 101550, 10002, NULL, 30, 'B-打气筒', 999, '2018-06-15 16:34:57.306', '2018-06-15 16:34:57.306', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100115, 101560, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-15 17:21:45.094', '2018-06-15 17:21:45.094', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100116, 101561, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-15 17:27:30.085', '2018-06-15 17:27:30.085', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100117, 101563, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-15 17:38:41.060', '2018-06-15 17:38:41.060', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100118, 101570, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-15 18:06:19.515', '2018-06-15 18:06:19.515', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100119, 101570, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-15 18:06:19.583', '2018-06-15 18:06:19.583', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100120, 101574, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 14:54:24.529', '2018-06-19 14:54:24.529', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100121, 101574, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 14:54:24.565', '2018-06-19 14:54:24.565', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100122, 101576, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 14:55:20.399', '2018-06-19 14:55:20.399', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100123, 101576, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 14:55:20.447', '2018-06-19 14:55:20.447', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100124, 101577, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 14:55:33.762', '2018-06-19 14:55:33.762', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100125, 101577, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 14:55:33.790', '2018-06-19 14:55:33.790', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100126, 101586, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:04:57.593', '2018-06-19 15:04:57.593', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100127, 101586, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:04:57.651', '2018-06-19 15:04:57.651', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100128, 101601, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:42:05.169', '2018-06-19 15:42:05.169', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100129, 101601, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:42:05.202', '2018-06-19 15:42:05.202', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100130, 101602, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:42:17.708', '2018-06-19 15:42:17.708', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100131, 101602, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:42:17.755', '2018-06-19 15:42:17.755', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100132, 101603, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:42:18.861', '2018-06-19 15:42:18.861', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100133, 101603, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:42:18.911', '2018-06-19 15:42:18.911', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100134, 101604, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:42:25.766', '2018-06-19 15:42:25.766', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100135, 101604, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:42:25.808', '2018-06-19 15:42:25.808', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100136, 101605, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:42:30.381', '2018-06-19 15:42:30.381', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100137, 101605, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:42:30.422', '2018-06-19 15:42:30.422', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100138, 101606, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:47:32.140', '2018-06-19 15:47:32.140', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100139, 101606, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:47:32.176', '2018-06-19 15:47:32.176', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100140, 101607, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:48:46.946', '2018-06-19 15:48:46.946', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100141, 101607, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:48:46.971', '2018-06-19 15:48:46.971', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100142, 101608, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:48:48.977', '2018-06-19 15:48:48.977', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100143, 101608, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:48:49.032', '2018-06-19 15:48:49.032', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100144, 101609, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:48:49.652', '2018-06-19 15:48:49.652', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100145, 101609, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:48:49.705', '2018-06-19 15:48:49.705', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100146, 101610, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:49:11.561', '2018-06-19 15:49:11.561', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100147, 101610, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:49:11.584', '2018-06-19 15:49:11.584', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100148, 101611, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:49:13.949', '2018-06-19 15:49:13.949', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100149, 101611, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:49:13.972', '2018-06-19 15:49:13.972', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100150, 101612, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:49:15.348', '2018-06-19 15:49:15.348', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100151, 101612, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:49:15.371', '2018-06-19 15:49:15.371', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100152, 101613, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:49:17.065', '2018-06-19 15:49:17.065', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100153, 101613, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:49:17.085', '2018-06-19 15:49:17.085', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100154, 101614, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 15:51:15.813', '2018-06-19 15:51:15.813', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100155, 101614, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 15:51:15.833', '2018-06-19 15:51:15.833', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100156, 101632, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-19 16:30:26.904', '2018-06-19 16:30:26.904', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100157, 101633, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 16:34:02.267', '2018-06-19 16:34:02.267', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100158, 101633, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 16:34:02.292', '2018-06-19 16:34:02.292', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100159, 101634, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 16:34:06.254', '2018-06-19 16:34:06.254', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100160, 101634, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 16:34:06.312', '2018-06-19 16:34:06.312', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100161, 101635, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 16:36:28.021', '2018-06-19 16:36:28.021', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100162, 101635, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 16:36:28.045', '2018-06-19 16:36:28.045', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100163, 101636, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 16:37:06.646', '2018-06-19 16:37:06.646', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100164, 101636, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 16:37:06.683', '2018-06-19 16:37:06.683', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100165, 101647, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-19 16:59:23.233', '2018-06-19 16:59:23.233', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100166, 101658, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-19 18:22:21.486', '2018-06-19 18:22:21.486', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100167, 101658, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-19 18:22:21.519', '2018-06-19 18:22:21.519', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100168, 101660, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 18:31:29.085', '2018-06-19 18:31:29.085', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100169, 101660, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 18:31:29.126', '2018-06-19 18:31:29.126', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100170, 101663, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 18:38:27.260', '2018-06-19 18:38:27.260', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100171, 101663, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 18:38:27.301', '2018-06-19 18:38:27.301', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100172, 101666, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 18:40:09.554', '2018-06-19 18:40:09.554', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100173, 101666, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 18:40:09.599', '2018-06-19 18:40:09.599', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100174, 101670, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-19 18:41:54.204', '2018-06-19 18:41:54.204', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100175, 101670, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-19 18:41:54.264', '2018-06-19 18:41:54.264', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100176, 101671, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-19 18:44:52.222', '2018-06-19 18:44:52.222', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100177, 101673, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-19 18:45:24.581', '2018-06-19 18:45:24.581', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100178, 101674, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-19 18:46:12.434', '2018-06-19 18:46:12.434', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100179, 101675, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-19 18:47:35.031', '2018-06-19 18:47:35.031', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100180, 101675, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-19 18:47:35.054', '2018-06-19 18:47:35.054', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100181, 101677, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 19:11:36.122', '2018-06-19 19:11:36.122', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100182, 101677, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 19:11:36.143', '2018-06-19 19:11:36.143', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100183, 101679, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 19:18:40.950', '2018-06-19 19:18:40.950', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100184, 101679, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 19:18:40.970', '2018-06-19 19:18:40.970', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100185, 101680, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 19:21:09.211', '2018-06-19 19:21:09.211', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100186, 101680, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 19:21:09.234', '2018-06-19 19:21:09.234', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100187, 101681, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 19:21:10.945', '2018-06-19 19:21:10.945', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100188, 101681, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 19:21:10.969', '2018-06-19 19:21:10.969', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100189, 101682, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 19:21:11.959', '2018-06-19 19:21:11.959', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100190, 101682, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 19:21:11.988', '2018-06-19 19:21:11.988', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100191, 101689, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-19 19:38:00.455', '2018-06-19 19:38:00.455', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100192, 101689, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-19 19:38:00.478', '2018-06-19 19:38:00.478', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100193, 101693, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-20 18:47:43.832', '2018-06-20 18:47:43.832', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100194, 101693, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 68, '2018-06-20 18:47:43.852', '2018-06-20 18:47:43.852', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100195, 101695, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-20 18:47:51.250', '2018-06-20 18:47:51.250', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100196, 101695, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 68, '2018-06-20 18:47:51.293', '2018-06-20 18:47:51.293', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100197, 101696, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-20 18:50:47.691', '2018-06-20 18:50:47.691', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100198, 101696, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 68, '2018-06-20 18:50:47.715', '2018-06-20 18:50:47.715', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100199, 101697, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-20 19:14:24.410', '2018-06-20 19:14:24.410', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100200, 101697, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 68, '2018-06-20 19:14:24.416', '2018-06-20 19:14:24.416', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100201, 101698, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 13:51:05.888', '2018-06-21 13:51:05.888', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100202, 101698, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 13:51:05.902', '2018-06-21 13:51:05.902', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100203, 101699, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 13:51:24.918', '2018-06-21 13:51:24.918', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100204, 101699, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 13:51:24.940', '2018-06-21 13:51:24.940', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100205, 101700, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 13:57:22.017', '2018-06-21 13:57:22.017', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100206, 101700, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 13:57:22.080', '2018-06-21 13:57:22.080', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100207, 101701, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 14:10:20.235', '2018-06-21 14:10:20.235', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100208, 101701, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 14:10:20.290', '2018-06-21 14:10:20.290', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100209, 101702, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 14:16:49.165', '2018-06-21 14:16:49.165', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100210, 101702, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 14:16:49.190', '2018-06-21 14:16:49.190', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100211, 101703, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 14:19:23.593', '2018-06-21 14:19:23.593', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100212, 101703, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 14:19:23.635', '2018-06-21 14:19:23.635', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100213, 101704, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 14:31:31.991', '2018-06-21 14:31:31.991', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100214, 101704, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 14:31:32.041', '2018-06-21 14:31:32.041', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100215, 101707, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 14:52:37.202', '2018-06-21 14:52:37.202', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100216, 101707, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 14:52:37.228', '2018-06-21 14:52:37.228', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100217, 101712, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 15:06:03.720', '2018-06-21 15:06:03.720', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100218, 101712, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 15:06:03.743', '2018-06-21 15:06:03.743', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100219, 101713, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:12:49.333', '2018-06-21 15:12:49.333', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100220, 101713, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:12:49.354', '2018-06-21 15:12:49.354', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100221, 101714, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:14:18.327', '2018-06-21 15:14:18.327', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100222, 101714, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:14:18.351', '2018-06-21 15:14:18.351', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100223, 101715, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:17:01.355', '2018-06-21 15:17:01.355', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100224, 101715, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:17:01.388', '2018-06-21 15:17:01.388', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100225, 101716, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:18:16.693', '2018-06-21 15:18:16.693', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100226, 101716, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:18:16.721', '2018-06-21 15:18:16.721', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100227, 101717, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:20:15.680', '2018-06-21 15:20:15.680', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100228, 101717, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:20:15.748', '2018-06-21 15:20:15.748', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100229, 101718, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:22:16.947', '2018-06-21 15:22:16.947', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100230, 101718, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:22:16.990', '2018-06-21 15:22:16.990', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100231, 101719, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 15:23:44.043', '2018-06-21 15:23:44.043', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100232, 101719, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 15:23:44.105', '2018-06-21 15:23:44.105', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100233, 101720, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:24:35.328', '2018-06-21 15:24:35.328', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100234, 101720, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:24:35.373', '2018-06-21 15:24:35.373', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100237, 101724, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 15:27:13.581', '2018-06-21 15:27:13.581', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100238, 101724, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 15:27:13.602', '2018-06-21 15:27:13.602', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100239, 101725, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 15:30:13.547', '2018-06-21 15:30:13.547', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100240, 101725, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 15:30:13.595', '2018-06-21 15:30:13.595', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100241, 101726, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:31:23.950', '2018-06-21 15:31:23.950', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100242, 101726, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:31:24.015', '2018-06-21 15:31:24.015', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100243, 101727, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:37:18.247', '2018-06-21 15:37:18.247', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100244, 101727, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:37:18.296', '2018-06-21 15:37:18.296', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100245, 101728, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:38:56.930', '2018-06-21 15:38:56.930', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100246, 101728, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:38:56.986', '2018-06-21 15:38:56.986', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100247, 101729, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:48:38.101', '2018-06-21 15:48:38.101', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100248, 101729, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:48:38.133', '2018-06-21 15:48:38.133', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100249, 101730, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:55:24.294', '2018-06-21 15:55:24.294', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100250, 101730, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:55:24.313', '2018-06-21 15:55:24.313', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100251, 101731, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:57:24.191', '2018-06-21 15:57:24.191', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100252, 101731, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 15:57:24.239', '2018-06-21 15:57:24.239', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100253, 101732, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 15:58:59.485', '2018-06-21 15:58:59.485', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100254, 101732, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 15:58:59.510', '2018-06-21 15:58:59.510', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100255, 101733, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:05:06.254', '2018-06-21 16:05:06.254', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100256, 101733, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:05:06.282', '2018-06-21 16:05:06.282', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100267, 101740, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:34:37.871', '2018-06-21 16:34:37.871', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100268, 101740, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:34:37.895', '2018-06-21 16:34:37.895', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100269, 101741, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:36:20.652', '2018-06-21 16:36:20.652', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100270, 101741, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:36:20.712', '2018-06-21 16:36:20.712', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100271, 101742, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:39:03.853', '2018-06-21 16:39:03.853', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100272, 101742, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:39:03.900', '2018-06-21 16:39:03.900', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100273, 101743, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:40:30.582', '2018-06-21 16:40:30.582', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100274, 101743, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:40:30.650', '2018-06-21 16:40:30.650', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100275, 101744, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:44:04.939', '2018-06-21 16:44:04.939', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100276, 101744, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:44:04.987', '2018-06-21 16:44:04.987', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100277, 101745, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:45:47.290', '2018-06-21 16:45:47.290', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100278, 101745, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:45:47.310', '2018-06-21 16:45:47.310', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100279, 101746, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:47:02.752', '2018-06-21 16:47:02.752', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100280, 101746, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:47:02.805', '2018-06-21 16:47:02.805', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100281, 101747, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:48:00.073', '2018-06-21 16:48:00.073', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100282, 101747, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:48:00.098', '2018-06-21 16:48:00.098', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100283, 101748, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:48:59.749', '2018-06-21 16:48:59.749', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100284, 101748, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:48:59.824', '2018-06-21 16:48:59.824', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100285, 101749, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:50:06.586', '2018-06-21 16:50:06.586', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100286, 101749, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:50:06.649', '2018-06-21 16:50:06.649', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100287, 101750, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:53:00.709', '2018-06-21 16:53:00.709', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100288, 101750, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 16:53:00.756', '2018-06-21 16:53:00.756', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100289, 101751, 10004, NULL, 1, '马牌轮胎', 999, '2018-06-21 17:08:43.356', '2018-06-21 17:08:43.356', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100290, 101751, 10005, NULL, 1, '马牌轮胎', 999, '2018-06-21 17:08:43.408', '2018-06-21 17:08:43.408', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100291, 101753, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 17:16:59.550', '2018-06-21 17:16:59.550', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100292, 101753, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 17:16:59.572', '2018-06-21 17:16:59.572', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100293, 101754, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 17:26:10.393', '2018-06-21 17:26:10.393', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100294, 101754, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 17:26:10.443', '2018-06-21 17:26:10.443', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100295, 101755, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 17:30:34.068', '2018-06-21 17:30:34.068', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100296, 101755, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 17:30:34.109', '2018-06-21 17:30:34.109', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100297, 101756, 10004, NULL, 1, '马牌轮胎', 999, '2018-06-21 17:31:16.979', '2018-06-21 17:31:16.979', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100298, 101756, 10005, NULL, 1, '马牌轮胎', 999, '2018-06-21 17:31:17.007', '2018-06-21 17:31:17.007', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100299, 101757, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 17:37:53.274', '2018-06-21 17:37:53.274', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100300, 101757, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 17:37:53.302', '2018-06-21 17:37:53.302', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100301, 101758, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 17:41:44.270', '2018-06-21 17:41:44.270', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100302, 101758, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 17:41:44.303', '2018-06-21 17:41:44.303', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100303, 101759, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 17:52:51.755', '2018-06-21 17:52:51.755', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100304, 101759, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 17:52:51.799', '2018-06-21 17:52:51.799', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100305, 101766, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 18:08:52.313', '2018-06-21 18:08:52.313', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100306, 101766, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 18:08:52.361', '2018-06-21 18:08:52.361', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100307, 101770, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 999, '2018-06-21 18:36:20.549', '2018-06-21 18:36:20.549', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100308, 101770, 10002, NULL, 2, '德国马牌ContiCrossContactLX[轻型越野轮胎]Continental轮胎', 999, '2018-06-21 18:36:20.571', '2018-06-21 18:36:20.571', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100309, 101777, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-21 18:48:39.450', '2018-06-21 18:48:39.450', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100310, 101782, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-21 18:54:14.700', '2018-06-21 18:54:14.700', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100311, 101784, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-21 18:59:52.884', '2018-06-21 18:59:52.884', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100312, 101786, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-21 19:01:58.326', '2018-06-21 19:01:58.326', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100313, 101788, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-21 19:02:49.839', '2018-06-21 19:02:49.839', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100314, 101790, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-21 19:08:05.347', '2018-06-21 19:08:05.347', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100315, 101791, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:08:22.316', '2018-06-21 19:08:22.316', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100316, 101791, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:08:22.362', '2018-06-21 19:08:22.362', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100317, 101791, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:08:22.405', '2018-06-21 19:08:22.405', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100318, 101792, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:09:26.902', '2018-06-21 19:09:26.902', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100319, 101792, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:09:26.950', '2018-06-21 19:09:26.950', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100320, 101792, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:09:26.975', '2018-06-21 19:09:26.975', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100321, 101793, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:10:50.228', '2018-06-21 19:10:50.228', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100322, 101793, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:10:50.269', '2018-06-21 19:10:50.269', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100323, 101793, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:10:50.288', '2018-06-21 19:10:50.288', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100324, 101796, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:12:54.184', '2018-06-21 19:12:54.184', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100325, 101796, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:12:54.205', '2018-06-21 19:12:54.205', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100326, 101796, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:12:54.226', '2018-06-21 19:12:54.226', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100327, 101795, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-21 19:13:17.710', '2018-06-21 19:13:17.710', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100328, 101797, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-21 19:13:53.256', '2018-06-21 19:13:53.256', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100329, 101799, 10004, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:14:16.550', '2018-06-21 19:14:16.550', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100330, 101799, 10005, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:14:16.569', '2018-06-21 19:14:16.569', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100331, 101800, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:14:22.657', '2018-06-21 19:14:22.657', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100332, 101800, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:14:22.677', '2018-06-21 19:14:22.677', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100333, 101800, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:14:22.696', '2018-06-21 19:14:22.696', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100334, 101801, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:14:28.199', '2018-06-21 19:14:28.199', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100335, 101801, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:14:28.220', '2018-06-21 19:14:28.220', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100336, 101801, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:14:28.242', '2018-06-21 19:14:28.242', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100337, 101798, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-21 19:15:53.052', '2018-06-21 19:15:53.052', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100338, 101802, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-21 19:17:41.696', '2018-06-21 19:17:41.696', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100339, 101803, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:21:13.960', '2018-06-21 19:21:13.960', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100340, 101803, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:21:13.982', '2018-06-21 19:21:13.982', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100341, 101803, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:21:14.004', '2018-06-21 19:21:14.004', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100342, 101804, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:21:14.745', '2018-06-21 19:21:14.745', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100343, 101804, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:21:14.767', '2018-06-21 19:21:14.767', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100344, 101804, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-21 19:21:14.795', '2018-06-21 19:21:14.795', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100345, 101805, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-21 19:23:25.440', '2018-06-21 19:23:25.440', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100445, 102005, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 09:26:01.811', '2018-06-22 09:26:01.811', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100446, 102006, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 59, '2018-06-22 10:08:09.414', '2018-06-22 10:08:09.414', '59', '59', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100447, 102007, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 59, '2018-06-22 10:51:31.956', '2018-06-22 10:51:31.956', '59', '59', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100545, 102105, 10004, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:29:56.609', '2018-06-22 09:29:56.609', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100546, 102105, 10005, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:29:56.609', '2018-06-22 09:29:56.609', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100547, 102106, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:30:03.100', '2018-06-22 09:30:03.100', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100548, 102106, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:30:03.100', '2018-06-22 09:30:03.100', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100549, 102106, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:30:03.100', '2018-06-22 09:30:03.100', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100550, 102107, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:30:08.636', '2018-06-22 09:30:08.636', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100551, 102107, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:30:08.636', '2018-06-22 09:30:08.636', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100552, 102107, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:30:08.636', '2018-06-22 09:30:08.636', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100645, 102205, 10004, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:32:50.530', '2018-06-22 09:32:50.530', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100646, 102205, 10005, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:32:50.530', '2018-06-22 09:32:50.530', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100647, 102206, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:32:57.010', '2018-06-22 09:32:57.010', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100648, 102206, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:32:57.010', '2018-06-22 09:32:57.010', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100649, 102206, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:32:57.010', '2018-06-22 09:32:57.010', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100650, 102207, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:33:02.616', '2018-06-22 09:33:02.616', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100651, 102207, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:33:02.616', '2018-06-22 09:33:02.616', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100652, 102207, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-22 09:33:02.616', '2018-06-22 09:33:02.616', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100745, 102305, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 10:32:45.031', '2018-06-22 10:32:45.031', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100845, 102405, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 11:00:00.590', '2018-06-22 11:00:00.590', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100846, 102406, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 11:02:52.136', '2018-06-22 11:02:52.136', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100945, 102505, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:44:01.083', '2018-06-22 11:44:01.083', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100946, 102505, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:44:01.083', '2018-06-22 11:44:01.083', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100947, 102505, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:44:01.083', '2018-06-22 11:44:01.083', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100948, 102506, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:44:01.689', '2018-06-22 11:44:01.689', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100949, 102506, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:44:01.689', '2018-06-22 11:44:01.689', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (100950, 102506, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:44:01.689', '2018-06-22 11:44:01.689', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101045, 102805, 10004, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:47:08.055', '2018-06-22 11:47:08.055', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101046, 102805, 10005, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:47:08.055', '2018-06-22 11:47:08.055', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101047, 102806, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:47:08.651', '2018-06-22 11:47:08.651', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101048, 102806, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:47:08.651', '2018-06-22 11:47:08.651', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101049, 102806, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:47:08.651', '2018-06-22 11:47:08.651', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101050, 102807, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:47:22.108', '2018-06-22 11:47:22.108', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101051, 102807, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:47:22.108', '2018-06-22 11:47:22.108', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101052, 102807, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:47:22.108', '2018-06-22 11:47:22.108', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101145, 102706, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 11:50:27.415', '2018-06-22 11:50:27.415', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101146, 102708, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 11:51:56.628', '2018-06-22 11:51:56.628', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101147, 102710, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 11:52:49.908', '2018-06-22 11:52:49.908', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101148, 102711, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 11:54:09.124', '2018-06-22 11:54:09.124', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101149, 102715, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 11:56:04.973', '2018-06-22 11:56:04.973', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101150, 102720, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 12:02:32.070', '2018-06-22 12:02:32.070', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101151, 102723, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 12:06:29.293', '2018-06-22 12:06:29.293', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101245, 102905, 10001, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:53:35.208', '2018-06-22 11:53:35.208', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101246, 102905, 10002, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:53:35.208', '2018-06-22 11:53:35.208', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101247, 102905, 10003, NULL, 1, '马牌轮胎', 999, '2018-06-22 11:53:35.208', '2018-06-22 11:53:35.208', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101345, 103006, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 12:11:04.355', '2018-06-22 12:11:04.355', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101346, 103012, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 12:11:28.583', '2018-06-22 12:11:28.583', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101347, 103013, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 12:12:36.154', '2018-06-22 12:12:36.154', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101445, 103105, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 12:55:12.694', '2018-06-22 12:55:12.694', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101446, 103106, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 12:55:15.189', '2018-06-22 12:55:15.189', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101447, 103107, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 12:55:17.233', '2018-06-22 12:55:17.233', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101545, 103209, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 13:18:13.834', '2018-06-22 13:18:13.834', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101546, 103212, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 13:20:25.393', '2018-06-22 13:20:25.393', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101547, 103213, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 13:20:27.105', '2018-06-22 13:20:27.105', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101548, 103214, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 13:20:40.688', '2018-06-22 13:20:40.688', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101549, 103215, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 68, '2018-06-22 13:20:45.079', '2018-06-22 13:20:45.079', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101550, 103216, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 59, '2018-06-22 13:40:49.016', '2018-06-22 13:40:49.016', '59', '59', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101551, 103217, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 59, '2018-06-22 13:43:50.042', '2018-06-22 13:43:50.042', '59', '59', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101552, 103218, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 59, '2018-06-22 13:45:37.304', '2018-06-22 13:45:37.304', '59', '59', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101553, 103219, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 59, '2018-06-22 13:46:16.653', '2018-06-22 13:46:16.653', '59', '59', NULL, NULL, 'N');
INSERT INTO `order_items_sku` VALUES (101554, 103220, 10001, NULL, 1, '德国马牌轮胎 Conti4x4Contact 315/35R20 ZR FR Continental', 59, '2018-06-22 13:56:30.528', '2018-06-22 13:56:30.528', '59', '59', NULL, NULL, 'N');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
