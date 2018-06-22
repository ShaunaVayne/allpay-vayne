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

 Date: 22/06/2018 14:39:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for coupon_rules
-- ----------------------------
DROP TABLE IF EXISTS `coupon_rules`;
CREATE TABLE `coupon_rules` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `proprietor` varchar(80) CHARACTER SET utf8 NOT NULL COMMENT '运营商：CONTINENTAL 马牌',
  `coupon_name` varchar(80) CHARACTER SET utf8 NOT NULL COMMENT '券名称',
  `coupon_nick_name` varchar(80) CHARACTER SET utf8 DEFAULT NULL COMMENT '券显示名称',
  `coupon_nominal` bigint(16) NOT NULL COMMENT '券面额，单位：分',
  `fit_amount` bigint(16) DEFAULT NULL COMMENT '适用金额',
  `coupon_discount` float(8,4) DEFAULT NULL COMMENT '折扣率，如10表示优惠10%. 单位百分之一',
  `coupon_type` enum('PRODUCT_COUPON','ORDER_COUPON') CHARACTER SET utf8 NOT NULL COMMENT '券类型（productCoupon-商品券，orderCoupon-订单券）',
  `total_nums` int(10) NOT NULL COMMENT '发行量',
  `obtain_nums` int(10) DEFAULT '0' COMMENT '已领取量',
  `effective_type` enum('RELATIVELY','ABSOLUTE') CHARACTER SET utf8 NOT NULL COMMENT '券有效期类型（relatively-相对时间，absolute-绝对时间）',
  `effective_start_date` datetime DEFAULT NULL COMMENT '券有效开始日期',
  `effective_end_date` datetime DEFAULT NULL COMMENT '券有效结束日期',
  `effective_days` int(4) DEFAULT NULL COMMENT '领取后有效天数',
  `obtain_start_date` datetime DEFAULT NULL COMMENT '开始领取时间',
  `obtain_end_date` datetime DEFAULT NULL COMMENT '结束领取时间',
  `user_limit_nums` int(10) NOT NULL COMMENT '用户限领次数',
  `promotion_type` enum('REDUCTION','DISCOUNT') CHARACTER SET utf8 NOT NULL COMMENT '优惠方式(reduction-满减券，discount-折扣券)',
  `obtain_type` enum('FREE','GIVEN') CHARACTER SET utf8 NOT NULL DEFAULT 'FREE' COMMENT '获得方式(free-用户免费领取、given赠送)',
  `is_need_check` char(1) CHARACTER SET utf8 NOT NULL DEFAULT 'N' COMMENT '是否需要审核才生效(''N''-不需要，''Y''-需要)',
  `rules_status` enum('ACTIVATED','CLOSED','APPLYING') CHARACTER SET utf8 NOT NULL COMMENT '券状态（applying 申请中，activated-激活，closed-关闭）',
  `is_fit_group` char(1) CHARACTER SET utf8 DEFAULT 'N' COMMENT '拼团是否可用(''N''-不可用,''Y''-可用)',
  `apply_channel` varchar(200) CHARACTER SET utf8 DEFAULT NULL COMMENT '适用渠道:马牌微信小程序 CONTINENTAL_WECHAT_MINI_PROGRAM',
  `max_discount_amount` bigint(16) DEFAULT NULL COMMENT '单次优惠最大金额',
  `is_dispaly` char(1) CHARACTER SET utf8 DEFAULT 'Y' COMMENT '是否可见',
  `land_url` varchar(1024) CHARACTER SET utf8 DEFAULT NULL COMMENT '优惠券着陆页',
  `addition` varchar(1024) CHARACTER SET utf8 DEFAULT NULL COMMENT '扩展信息',
  `remark` varchar(256) CHARACTER SET utf8 DEFAULT NULL COMMENT '备注',
  `is_deleted` char(1) CHARACTER SET utf8 NOT NULL DEFAULT 'N' COMMENT '是否删除（''Y''-是，''N''-否）',
  `created_time` datetime NOT NULL COMMENT '创建时间',
  `updated_time` datetime NOT NULL COMMENT '修改时间',
  `creator` varchar(40) CHARACTER SET utf8 NOT NULL COMMENT '创建者',
  `modifier` varchar(40) CHARACTER SET utf8 NOT NULL COMMENT '修改者',
  PRIMARY KEY (`id`),
  KEY `pk_coupon_rule_proprietor` (`proprietor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='优惠券规则';

-- ----------------------------
-- Records of coupon_rules
-- ----------------------------
BEGIN;
INSERT INTO `coupon_rules` VALUES (1, 'CONTINENTAL', '满399减99', '满减券', 9900, 39900, NULL, 'PRODUCT_COUPON', 100, 2, 'ABSOLUTE', '2018-05-23 00:00:00', '2018-05-31 00:00:00', NULL, '2018-05-01 00:00:00', '2018-05-31 00:00:00', 5, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'N', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 9900, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-05-23 17:27:12', '2018-06-08 16:40:01', 'WZF', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (2, 'CONTINENTAL', '满699减199', '满减券', 19900, 69900, NULL, 'PRODUCT_COUPON', 50, 5, 'RELATIVELY', NULL, NULL, 7, '2018-05-01 00:00:00', '2018-06-28 16:29:49', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'N', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 19900, 'Y', NULL, NULL, '优惠券呀优惠券', 'N', '2018-05-23 17:27:12', '2018-06-15 15:42:07', 'WZF', 'WZF');
INSERT INTO `coupon_rules` VALUES (11, 'CONTINENTAL', '满399减99', '满减券', 9900, 39900, NULL, 'PRODUCT_COUPON', 500, 1, 'ABSOLUTE', '2018-06-10 12:00:00', '2018-06-30 12:00:00', NULL, '2018-06-10 12:00:00', '2018-06-28 13:00:00', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'N', 'CONTINENTAL_WECHAT_MINI_PROGRAM', NULL, 'Y', NULL, NULL, '优惠券呀优惠券', 'N', '2018-06-11 14:14:30', '2018-06-11 14:14:30', 'wangc', 'wangc');
INSERT INTO `coupon_rules` VALUES (12, 'CONTINENTAL', '满299减69', '满减券', 6900, 29900, NULL, 'PRODUCT_COUPON', 500, 1, 'ABSOLUTE', '2018-06-10 12:00:00', '2018-06-30 12:00:00', NULL, '2018-06-10 12:00:00', '2018-06-28 13:00:00', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'N', 'CONTINENTAL_WECHAT_MINI_PROGRAM', NULL, 'Y', NULL, NULL, '优惠券呀优惠券', 'N', '2018-06-11 14:41:19', '2018-06-11 14:41:19', 'wangc', 'wangc');
INSERT INTO `coupon_rules` VALUES (13, 'CONTINENTAL', '满399减129', '满减券', 12900, 39900, NULL, 'PRODUCT_COUPON', 500, 2, 'ABSOLUTE', '2018-06-10 12:00:00', '2018-06-30 12:00:00', NULL, '2018-06-10 12:00:00', '2018-06-22 12:00:00', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'N', 'CONTINENTAL_WECHAT_MINI_PROGRAM', NULL, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-12 14:03:06', '2018-06-22 12:00:00', 'wangc', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (14, 'CONTINENTAL', '满350减69', '满减券', 6900, 35000, NULL, 'PRODUCT_COUPON', 500, 2, 'ABSOLUTE', '2018-06-10 12:00:00', '2018-06-30 12:00:00', NULL, '2018-06-10 12:00:00', '2018-06-22 12:00:00', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'N', 'CONTINENTAL_WECHAT_MINI_PROGRAM', NULL, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-12 14:12:22', '2018-06-22 12:00:00', 'wangc', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10070, 'CONTINENTAL', '满50减2', '满50减2', 2, 50, NULL, 'PRODUCT_COUPON', 99999999, NULL, 'ABSOLUTE', '2018-06-11 20:02:08', '2018-06-21 20:02:08', NULL, '2018-06-11 20:02:08', '2018-06-21 20:02:08', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', NULL, 2, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-11 20:02:08', '2018-06-21 20:10:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10080, 'CONTINENTAL', '满50减5', '满50减5', 5, 50, NULL, 'PRODUCT_COUPON', 99999999, 7, 'ABSOLUTE', '2018-06-11 20:09:25', '2018-06-21 20:09:25', NULL, '2018-06-11 20:09:25', '2018-06-21 20:09:25', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', NULL, 5, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-11 20:09:25', '2018-06-21 20:10:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10090, 'CONTINENTAL', '满100减10', '满100减10', 10, 100, NULL, 'PRODUCT_COUPON', 99999999, 7, 'ABSOLUTE', '2018-06-11 20:11:37', '2018-06-21 20:11:37', NULL, '2018-06-11 20:11:37', '2018-06-21 20:11:37', 3, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', NULL, 10, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-11 20:11:37', '2018-06-21 20:20:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10100, 'CONTINENTAL', '满100减10', '满100减10', 10, 100, NULL, 'PRODUCT_COUPON', 99999999, 1, 'ABSOLUTE', '2018-06-12 09:53:02', '2018-06-22 09:53:02', NULL, '2018-06-12 09:53:02', '2018-06-22 09:53:02', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', NULL, 10, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-12 09:53:02', '2018-06-22 10:00:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10101, 'CONTINENTAL', '满500减30', '满500减30', 30, 500, NULL, 'PRODUCT_COUPON', 99999999, 4, 'RELATIVELY', NULL, NULL, 30, '2018-06-12 09:53:02', '2018-06-22 09:53:02', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', NULL, 30, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-12 09:53:02', '2018-06-22 10:00:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10130, 'CONTINENTAL', '满1000减200', '满1000减200', 200, 1000, 0.2000, 'PRODUCT_COUPON', 99999999, 15, 'RELATIVELY', NULL, NULL, 1, '2018-06-12 11:48:48', '2018-06-22 11:48:48', 8, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', NULL, 200, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-12 11:49:17', '2018-06-22 11:50:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10140, 'CONTINENTAL', '满500减50', '满500减50', 50, 500, 0.1000, 'PRODUCT_COUPON', 99999999, 2, 'ABSOLUTE', '2018-06-12 11:51:38', '2018-06-22 11:51:38', NULL, '2018-06-12 11:51:38', '2018-06-22 11:51:38', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', NULL, 50, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-12 11:51:38', '2018-06-21 17:30:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10141, 'CONTINENTAL', '满10000减200', '满10000减200', 200, 10000, 0.0200, 'PRODUCT_COUPON', 99999999, 8, 'RELATIVELY', NULL, NULL, 30, '2018-06-12 11:51:38', '2018-06-22 11:51:38', 4, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', NULL, 200, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-12 11:51:38', '2018-06-22 12:00:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10150, 'CONTINENTAL', '满100000减200', '满100000减200', 200, 100000, 0.0020, 'PRODUCT_COUPON', 99999999, 10, 'RELATIVELY', NULL, NULL, 30, '2018-06-12 14:12:59', '2018-08-22 14:12:59', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 200, 'Y', NULL, NULL, '优惠券呀优惠券', 'N', '2018-06-12 14:12:59', '2018-06-22 11:01:34', 'system', 'system');
INSERT INTO `coupon_rules` VALUES (10160, 'CONTINENTAL', '满3000减300', NULL, 30000, 300000, 0.1000, 'PRODUCT_COUPON', 999, 3, 'ABSOLUTE', '2018-06-13 11:48:11', '2018-10-13 11:48:11', NULL, '2018-06-13 11:48:11', '2018-06-20 11:48:11', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 30000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 14:00:00', '2018-06-20 15:10:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10161, 'CONTINENTAL', '满30000减30', '满减', 30000, 300000, 0.1000, 'PRODUCT_COUPON', 999, 4, 'ABSOLUTE', '2018-06-13 11:48:11', '2018-10-13 11:48:11', NULL, '2018-06-13 11:48:11', '2018-06-20 11:48:11', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 30000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 14:03:57', '2018-06-20 15:10:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10170, 'CONTINENTAL', '满40000减400', '满减', 30000, 4000000, 0.0075, 'PRODUCT_COUPON', 999, 4, 'ABSOLUTE', '2018-06-13 11:48:11', '2018-10-13 11:48:11', NULL, '2018-06-13 11:48:11', '2018-06-20 11:48:11', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 30000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 15:12:29', '2018-06-20 15:10:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10171, 'CONTINENTAL', '满50000减500', '满减', 50000, 5000000, 0.0100, 'PRODUCT_COUPON', 999, 11, 'ABSOLUTE', '2018-06-13 11:48:11', '2018-10-13 11:48:11', NULL, '2018-06-13 11:48:11', '2018-09-20 11:48:11', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 50000, 'Y', NULL, NULL, '优惠券呀优惠券', 'N', '2018-06-13 15:13:19', '2018-06-22 14:11:16', 'system', 'system');
INSERT INTO `coupon_rules` VALUES (10201, '1', 'test1', 'zm1', 10000, 20000, 0.5000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 15:31:05', '2018-06-13 15:40:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10202, '1', 'test1', 'zm1', 10000, 20000, 0.5000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 15:33:40', '2018-06-13 15:40:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10210, 'CONTINENTAL', 'test1', 'zm1', 10000, 20000, 0.5000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 15:38:56', '2018-06-13 15:40:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10220, 'CONTINENTAL', 'test1', 'zm1', 10000, 20000, 0.5000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 15:42:57', '2018-06-13 15:50:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10221, 'CONTINENTAL', 'test1', 'zm1', 10000, 20000, 0.5000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 15:46:45', '2018-06-13 15:50:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10222, 'CONTINENTAL', 'test1', 'zm1', 10000, 20000, 0.5000, 'PRODUCT_COUPON', 3, 0, 'ABSOLUTE', NULL, NULL, NULL, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 15:48:00', '2018-06-13 15:50:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10223, 'CONTINENTAL', '1111111111111111111111111111', 'zm1', 10000, 20000, 0.5000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 1, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 15:59:34', '2018-06-13 16:00:05', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10224, 'CONTINENTAL', 'test1', 'zm1', 10000, 20000, 0.5000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 16:00:08', '2018-06-13 16:10:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10225, 'CONTINENTAL', 'test1', 'zm1', 10000, 500, 20.0000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 16:00:57', '2018-06-13 16:10:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10226, 'CONTINENTAL', 'test1', 'zm1', 10000, 500, 20.0000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 16:00:58', '2018-06-13 16:10:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10227, 'CONTINENTAL', 'test1', 'zm1', 10000, 500, 20.0000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 16:04:15', '2018-06-13 16:10:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10228, 'CONTINENTAL', 'test1', 'zm1', 10000, 500, 20.0000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-12 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 16:04:22', '2018-06-13 16:10:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10229, 'CONTINENTAL', 'test1', 'zm1', 10000, 500, 20.0000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-12 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 16:04:23', '2018-06-13 16:10:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10230, 'CONTINENTAL', 'test1', 'zm1', 10000, 500, 20.0000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-12 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 16:04:23', '2018-06-13 16:10:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10231, 'CONTINENTAL', 'test1', 'zm1', 10000, 500, 20.0000, 'PRODUCT_COUPON', 3, 3, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-08-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'N', '2018-06-13 16:04:30', '2018-06-19 11:19:21', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10232, 'CONTINENTAL', 'test1', 'zm1', 10000, 20000, 0.5000, 'PRODUCT_COUPON', 3, 0, 'ABSOLUTE', '2018-06-13 11:00:00', NULL, NULL, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 111, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, '优惠券呀优惠券', 'Y', '2018-06-13 16:24:23', '2018-06-13 16:30:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10240, 'CONTINENTAL', '满50000减500', '满减', 50000, 5000000, 0.0100, 'PRODUCT_COUPON', 999, 2, 'ABSOLUTE', '2018-06-13 11:48:11', '2018-10-13 11:48:11', NULL, '2018-06-13 11:48:11', '2018-06-20 11:48:11', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 50000, 'Y', NULL, NULL, NULL, 'Y', '2018-06-19 14:14:52', '2018-06-20 15:10:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10250, 'CONTINENTAL', 'test1', 'zm1', 10000, 500, 20.0000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, NULL, 'Y', '2018-06-19 14:22:12', '2018-06-19 14:30:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10260, 'CONTINENTAL', 'test1', 'zm1', 10000, 50000, 0.2000, 'PRODUCT_COUPON', 3, 1, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-08-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, NULL, 'N', '2018-06-19 15:49:27', '2018-06-22 11:01:26', 'system', 'system');
INSERT INTO `coupon_rules` VALUES (10261, 'CONTINENTAL', 'test11', 'zm1', 10000, 50000, 0.2000, 'PRODUCT_COUPON', 3, 3, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-08-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, NULL, 'N', '2018-06-19 15:58:40', '2018-06-22 11:04:44', 'system', 'system');
INSERT INTO `coupon_rules` VALUES (10262, 'CONTINENTAL', 'test1', 'zm1', 10000, 50000, 0.2000, 'PRODUCT_COUPON', 3, 2, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-08-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, NULL, 'N', '2018-06-19 15:59:39', '2018-06-19 16:00:34', 'system', 'system');
INSERT INTO `coupon_rules` VALUES (10263, 'CONTINENTAL', 'test1', 'zm1', 10000, 50000, 0.2000, 'PRODUCT_COUPON', 3, 1, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-08-13 12:00:00', -1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10000, 'Y', NULL, NULL, NULL, 'N', '2018-06-19 16:02:20', '2018-06-19 16:03:08', 'system', 'system');
INSERT INTO `coupon_rules` VALUES (10264, 'CONTINENTAL', 'test1', 'zm1', 10, 50, 0.2000, 'PRODUCT_COUPON', 3, 1, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-08-13 12:00:00', -1, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10, 'Y', NULL, NULL, NULL, 'N', '2018-06-19 16:27:53', '2018-06-19 16:29:41', 'system', 'system');
INSERT INTO `coupon_rules` VALUES (10270, 'CONTINENTAL', 'test1', 'zm1', 10, 50, 0.2000, 'PRODUCT_COUPON', 3, 3, 'RELATIVELY', NULL, NULL, 1, '2018-06-13 11:00:00', '2018-08-13 12:00:00', 4, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10, 'Y', NULL, NULL, NULL, 'N', '2018-06-19 16:52:23', '2018-06-19 17:38:40', 'system', 'system');
INSERT INTO `coupon_rules` VALUES (10271, 'CONTINENTAL', 'test1', 'zm1', 10, 50, 0.2000, 'PRODUCT_COUPON', 3, 3, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-08-13 12:00:00', 4, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10, 'Y', NULL, NULL, NULL, 'N', '2018-06-19 17:41:26', '2018-06-19 17:44:17', 'system', 'system');
INSERT INTO `coupon_rules` VALUES (10272, 'CONTINENTAL', 'test1', 'zm1', 10, 20, 0.5000, 'PRODUCT_COUPON', 3, 3, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-08-13 12:00:00', 4, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10, 'Y', NULL, NULL, NULL, 'N', '2018-06-20 14:19:23', '2018-06-21 16:25:12', 'system', 'system');
INSERT INTO `coupon_rules` VALUES (10273, 'CONTINENTAL', 'test1', 'zm1', 10, 20, 0.5000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-08-13 12:00:00', 4, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 10, 'Y', NULL, NULL, NULL, 'N', '2018-06-20 14:19:23', '2018-06-20 14:19:23', 'system', 'system');
INSERT INTO `coupon_rules` VALUES (10280, 'CONTINENTAL', 'test1', 'zm1', 100, 500, 0.2000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 100, 'Y', NULL, NULL, NULL, 'Y', '2018-06-21 16:12:49', '2018-06-21 16:20:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10281, 'CONTINENTAL', 'test1', 'zm1', 100, 500, 0.2000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 100, 'Y', NULL, NULL, NULL, 'Y', '2018-06-21 16:15:31', '2018-06-21 16:20:00', 'system', 'DeleteOverDueJob');
INSERT INTO `coupon_rules` VALUES (10290, 'CONTINENTAL', 'test1', 'zm1', 100, 500, 0.2000, 'PRODUCT_COUPON', 3, 0, 'RELATIVELY', NULL, NULL, 3, '2018-06-13 11:00:00', '2018-06-13 12:00:00', 2, 'REDUCTION', 'FREE', 'N', 'ACTIVATED', 'Y', 'CONTINENTAL_WECHAT_MINI_PROGRAM', 100, 'Y', NULL, NULL, NULL, 'Y', '2018-06-22 10:36:15', '2018-06-22 10:40:00', 'system', 'DeleteOverDueJob');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
