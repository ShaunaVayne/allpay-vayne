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

 Date: 22/06/2018 14:41:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_trace
-- ----------------------------
DROP TABLE IF EXISTS `order_trace`;
CREATE TABLE `order_trace` (
  `id` bigint(20) NOT NULL,
  `order_id` bigint(20) NOT NULL COMMENT '订单id',
  `change_before_status` varchar(20) DEFAULT NULL COMMENT '变更前订单状态',
  `change_after_status` varchar(20) DEFAULT NULL COMMENT '变更后订单状态',
  `change_before_payment_status` varchar(20) DEFAULT NULL COMMENT '变更前支付状态',
  `change_after_payment_status` varchar(20) DEFAULT NULL COMMENT '变更后支付状态',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `created_time` datetime(3) NOT NULL COMMENT '创建时间',
  `updated_time` datetime(3) NOT NULL COMMENT '更新时间',
  `creator` varchar(20) NOT NULL COMMENT '创建人',
  `modifier` varchar(20) NOT NULL COMMENT '更新人',
  `addition` varchar(512) DEFAULT NULL COMMENT '扩展字段',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `ix_order_id` (`order_id`) USING BTREE,
  KEY `ix_is_deleted` (`is_deleted`) USING BTREE,
  KEY `ix_user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单轨迹表';

-- ----------------------------
-- Records of order_trace
-- ----------------------------
BEGIN;
INSERT INTO `order_trace` VALUES (100011, 101200, 'UNPAID', 'CANCEL', NULL, NULL, 1, '2018-06-11 10:54:42.699', '2018-06-11 10:54:42.699', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100016, 101200, NULL, NULL, 'UNPAID', 'PAID', 1, '2018-06-11 11:11:55.985', '2018-06-11 11:11:55.985', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100021, 101460, 'UNPAID', 'CANCEL', NULL, NULL, 1, '2018-06-12 20:06:39.854', '2018-06-12 20:06:39.854', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100023, 101495, NULL, NULL, 'UNPAID', 'PAID', 1, '2018-06-14 13:24:40.464', '2018-06-14 13:24:40.464', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100025, 101495, 'PAID', 'CANCEL', NULL, NULL, 1, '2018-06-14 13:30:05.223', '2018-06-14 13:30:05.223', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100026, 101446, 'UNPAID', 'UNPAID', NULL, NULL, 1, '2018-06-14 13:54:43.934', '2018-06-14 13:54:43.934', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100027, 101446, 'UNPAID', 'UNPAID', NULL, NULL, 1, '2018-06-14 13:59:39.700', '2018-06-14 13:59:39.700', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100028, 101446, 'FINISHED', 'FINISHED', NULL, NULL, 1, '2018-06-14 14:34:40.912', '2018-06-14 14:34:40.912', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100029, 101446, 'UNPAID', 'UNPAID', NULL, NULL, 1, '2018-06-14 14:47:39.904', '2018-06-14 14:47:39.904', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100030, 101446, 'UNPAID', 'CANCEL', NULL, NULL, 1, '2018-06-14 14:47:42.159', '2018-06-14 14:47:42.159', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100031, 101514, 'UNPAID', 'CANCEL', NULL, NULL, 999, '2018-06-14 19:44:29.207', '2018-06-14 19:44:29.207', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100032, 101514, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-14 19:47:12.989', '2018-06-14 19:47:12.989', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100034, 101514, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-14 19:56:34.526', '2018-06-14 19:56:34.526', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100035, 101514, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-14 19:57:03.203', '2018-06-14 19:57:03.203', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100036, 101514, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-14 19:59:41.963', '2018-06-14 19:59:41.963', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100037, 101514, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-15 09:17:47.660', '2018-06-15 09:17:47.660', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100038, 101514, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-15 09:19:40.062', '2018-06-15 09:19:40.062', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100039, 101516, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-15 09:27:22.682', '2018-06-15 09:27:22.682', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100040, 101516, 'PAID', 'CANCEL', NULL, NULL, 999, '2018-06-15 09:33:30.354', '2018-06-15 09:33:30.354', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100041, 101658, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-19 18:22:37.509', '2018-06-19 18:22:37.509', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100042, 101658, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-19 18:22:42.752', '2018-06-19 18:22:42.752', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100045, 101670, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-19 18:41:54.922', '2018-06-19 18:41:54.922', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100046, 101670, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-19 18:42:00.233', '2018-06-19 18:42:00.233', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100047, 101675, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-19 18:47:35.699', '2018-06-19 18:47:35.699', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100048, 101675, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-19 18:47:40.912', '2018-06-19 18:47:40.912', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100049, 101689, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-20 09:50:28.523', '2018-06-20 09:50:28.523', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100050, 101689, 'PAID', 'CANCEL', NULL, NULL, 999, '2018-06-20 09:53:18.539', '2018-06-20 09:53:18.539', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100051, 101446, 'UNPAID', 'CANCEL', NULL, NULL, 1, '2018-06-20 11:29:06.797', '2018-06-20 11:29:06.797', '1', '1', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100052, 101689, 'UNPAID', 'CANCEL', NULL, NULL, 999, '2018-06-20 15:35:00.182', '2018-06-20 15:35:00.182', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100053, 101689, 'UNPAID', 'CANCEL', NULL, NULL, 999, '2018-06-20 15:35:40.343', '2018-06-20 15:35:40.343', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100054, 101689, 'UNPAID', 'CANCEL', NULL, NULL, 999, '2018-06-20 16:05:13.924', '2018-06-20 16:05:13.924', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100055, 101674, 'UNPAID', 'UNPAID', NULL, NULL, 68, '2018-06-21 10:58:06.400', '2018-06-21 10:58:06.400', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100056, 101674, 'UNPAID', 'UNPAID', NULL, NULL, 68, '2018-06-21 11:01:18.870', '2018-06-21 11:01:18.870', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100057, 101730, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 15:55:54.663', '2018-06-21 15:55:54.663', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100058, 101731, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 15:57:31.779', '2018-06-21 15:57:31.779', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100059, 101733, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 16:05:06.852', '2018-06-21 16:05:06.852', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100070, 101740, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 16:34:38.588', '2018-06-21 16:34:38.588', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100071, 101740, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-21 16:34:43.887', '2018-06-21 16:34:43.887', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100072, 101741, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 16:36:21.106', '2018-06-21 16:36:21.106', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100073, 101741, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-21 16:36:26.410', '2018-06-21 16:36:26.410', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100074, 101742, 'UNPAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 16:39:04.375', '2018-06-21 16:39:04.375', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100075, 101743, 'UNPAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 16:40:31.161', '2018-06-21 16:40:31.161', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100076, 101744, 'UNPAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 16:44:05.507', '2018-06-21 16:44:05.507', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100077, 101745, 'UNPAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 16:45:47.882', '2018-06-21 16:45:47.882', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100078, 101746, 'UNPAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 16:47:03.405', '2018-06-21 16:47:03.405', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100079, 101747, 'UNPAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 16:48:00.596', '2018-06-21 16:48:00.596', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100080, 101748, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 16:49:00.212', '2018-06-21 16:49:00.212', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100081, 101748, 'PAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 16:49:00.722', '2018-06-21 16:49:00.722', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100082, 101749, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 16:50:06.981', '2018-06-21 16:50:06.981', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100083, 101749, 'PAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 16:50:07.475', '2018-06-21 16:50:07.475', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100084, 101750, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 16:53:01.212', '2018-06-21 16:53:01.212', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100085, 101750, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-21 16:53:06.516', '2018-06-21 16:53:06.516', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100086, 101751, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 17:08:44.148', '2018-06-21 17:08:44.148', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100087, 101751, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-21 17:08:49.465', '2018-06-21 17:08:49.465', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100088, 101753, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 17:24:30.537', '2018-06-21 17:24:30.537', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100089, 101754, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 17:28:03.173', '2018-06-21 17:28:03.173', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100090, 101756, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 17:31:17.679', '2018-06-21 17:31:17.679', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100091, 101756, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-21 17:31:22.881', '2018-06-21 17:31:22.881', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100092, 101755, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 17:31:26.509', '2018-06-21 17:31:26.509', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100093, 101757, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 17:39:13.246', '2018-06-21 17:39:13.246', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100094, 101758, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 17:52:34.451', '2018-06-21 17:52:34.451', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100095, 101766, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 18:15:07.517', '2018-06-21 18:15:07.517', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100096, 101766, 'PAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 18:19:00.240', '2018-06-21 18:19:00.240', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100097, 101770, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 18:37:57.526', '2018-06-21 18:37:57.526', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100098, 101791, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 19:08:22.805', '2018-06-21 19:08:22.805', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100099, 101791, 'PAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 19:08:22.974', '2018-06-21 19:08:22.974', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100100, 101792, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 19:09:27.365', '2018-06-21 19:09:27.365', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100101, 101792, 'PAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 19:09:27.547', '2018-06-21 19:09:27.547', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100102, 101793, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 19:10:50.520', '2018-06-21 19:10:50.520', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100103, 101793, 'PAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 19:10:50.667', '2018-06-21 19:10:50.667', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100104, 101796, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 19:12:54.463', '2018-06-21 19:12:54.463', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100105, 101796, 'PAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 19:12:54.568', '2018-06-21 19:12:54.568', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100106, 101799, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 19:14:17.223', '2018-06-21 19:14:17.223', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100107, 101799, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-21 19:14:22.388', '2018-06-21 19:14:22.388', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100108, 101800, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 19:14:22.780', '2018-06-21 19:14:22.780', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100109, 101800, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-21 19:14:27.922', '2018-06-21 19:14:27.922', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100110, 101801, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 19:14:28.383', '2018-06-21 19:14:28.383', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100111, 101801, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-21 19:14:33.530', '2018-06-21 19:14:33.530', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100112, 101803, 'UNPAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 19:21:14.505', '2018-06-21 19:21:14.505', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100113, 101804, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-21 19:21:14.944', '2018-06-21 19:21:14.944', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100114, 101804, 'PAID', 'CANCEL', NULL, NULL, 999, '2018-06-21 19:21:15.025', '2018-06-21 19:21:15.025', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100115, 102105, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-22 09:29:57.678', '2018-06-22 09:29:57.678', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100116, 102105, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-22 09:30:02.906', '2018-06-22 09:30:02.906', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100117, 102106, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-22 09:30:03.250', '2018-06-22 09:30:03.250', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100118, 102106, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-22 09:30:08.503', '2018-06-22 09:30:08.503', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100119, 102107, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-22 09:30:09.126', '2018-06-22 09:30:09.126', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100215, 102205, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-22 09:32:51.521', '2018-06-22 09:32:51.521', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100216, 102205, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-22 09:32:56.793', '2018-06-22 09:32:56.793', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100217, 102206, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-22 09:32:57.167', '2018-06-22 09:32:57.167', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100218, 102206, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-22 09:33:02.401', '2018-06-22 09:33:02.401', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100219, 102207, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-22 09:33:03.081', '2018-06-22 09:33:03.081', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100220, 102207, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-22 09:33:08.309', '2018-06-22 09:33:08.309', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100315, 102505, 'UNPAID', 'CANCEL', NULL, NULL, 999, '2018-06-22 11:44:01.545', '2018-06-22 11:44:01.545', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100316, 102506, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-22 11:44:01.825', '2018-06-22 11:44:01.825', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100317, 102506, 'PAID', 'CANCEL', NULL, NULL, 999, '2018-06-22 11:44:01.894', '2018-06-22 11:44:01.894', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100415, 102806, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-22 11:47:08.864', '2018-06-22 11:47:08.864', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100416, 102806, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-22 11:47:14.001', '2018-06-22 11:47:14.001', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100417, 102807, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-22 11:47:22.276', '2018-06-22 11:47:22.276', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100418, 102807, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-22 11:47:27.495', '2018-06-22 11:47:27.495', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100515, 102905, NULL, NULL, 'UNPAID', 'PAID', 999, '2018-06-22 11:53:35.707', '2018-06-22 11:53:35.707', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100516, 102905, 'PAID', 'PAID', NULL, NULL, 999, '2018-06-22 11:53:40.972', '2018-06-22 11:53:40.972', '999', '999', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100615, 103013, NULL, NULL, 'UNPAID', 'PAID', 68, '2018-06-22 12:34:16.398', '2018-06-22 12:34:16.398', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100715, 103012, NULL, NULL, 'UNPAID', 'PAID', 68, '2018-06-22 12:39:23.796', '2018-06-22 12:39:23.796', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100716, 103006, NULL, NULL, 'UNPAID', 'PAID', 68, '2018-06-22 12:44:42.696', '2018-06-22 12:44:42.696', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100815, 102723, NULL, NULL, 'UNPAID', 'PAID', 68, '2018-06-22 12:45:53.141', '2018-06-22 12:45:53.141', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100816, 102720, NULL, NULL, 'UNPAID', 'PAID', 68, '2018-06-22 12:46:46.363', '2018-06-22 12:46:46.363', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100817, 102715, NULL, NULL, 'UNPAID', 'PAID', 68, '2018-06-22 12:48:04.006', '2018-06-22 12:48:04.006', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100818, 102715, NULL, NULL, 'UNPAID', 'PAID', 68, '2018-06-22 12:49:01.355', '2018-06-22 12:49:01.355', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (100915, 102711, NULL, NULL, 'UNPAID', 'PAID', 68, '2018-06-22 12:51:51.535', '2018-06-22 12:51:51.535', '68', '68', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (101115, 103219, 'UNPAID', 'UNPAID', NULL, NULL, 59, '2018-06-22 14:32:18.648', '2018-06-22 14:32:18.648', '59', '59', NULL, NULL, 'N');
INSERT INTO `order_trace` VALUES (101215, 103217, 'UNPAID', 'UNPAID', NULL, NULL, 59, '2018-06-22 14:34:24.408', '2018-06-22 14:34:24.408', '59', '59', NULL, NULL, 'N');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
