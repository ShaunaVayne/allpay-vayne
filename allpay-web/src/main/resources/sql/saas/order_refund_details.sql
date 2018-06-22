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

 Date: 22/06/2018 14:40:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_refund_details
-- ----------------------------
DROP TABLE IF EXISTS `order_refund_details`;
CREATE TABLE `order_refund_details` (
  `id` bigint(20) NOT NULL COMMENT '退款明细id',
  `refund_id` bigint(20) NOT NULL COMMENT '退款单id',
  `order_items_id` bigint(20) NOT NULL COMMENT '原订单明细id',
  `amount` bigint(20) DEFAULT NULL COMMENT '退款金额',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `created_time` datetime(3) NOT NULL COMMENT '创建时间',
  `updated_time` datetime(3) NOT NULL COMMENT '更新时间',
  `creator` varchar(20) NOT NULL COMMENT '创建人',
  `modifier` varchar(20) NOT NULL COMMENT '更新人',
  `addition` varchar(512) DEFAULT NULL COMMENT '扩展字段',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `ix_refund_id` (`refund_id`) USING BTREE,
  KEY `ix_created_time` (`created_time`) USING BTREE,
  KEY `ix_is_deleted` (`is_deleted`) USING BTREE,
  KEY `ix_user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='退款单明细表';

SET FOREIGN_KEY_CHECKS = 1;
