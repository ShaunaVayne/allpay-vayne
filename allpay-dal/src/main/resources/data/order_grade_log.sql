/*
 Navicat Premium Data Transfer

 Source Server         : myself_data
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : saas

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 15/08/2018 15:11:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_grade_log
-- ----------------------------
DROP TABLE IF EXISTS `order_grade_log`;
CREATE TABLE `order_grade_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '业绩表id',
  `shop_id` bigint(20) NOT NULL COMMENT '门店id',
  `order_amount` bigint(20) DEFAULT NULL COMMENT '营业额',
  `order_num` bigint(20) DEFAULT NULL COMMENT '订单总数',
  `order_time` datetime(3) DEFAULT NULL COMMENT '订单时间戳',
  `create_time` datetime(3) DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(3) DEFAULT NULL COMMENT '更新时间',
  `creator` varchar(20) DEFAULT NULL COMMENT '创建人',
  `modifier` varchar(20) DEFAULT NULL COMMENT '更新人',
  `remark` varchar(20) DEFAULT NULL COMMENT '备注',
  `is_deleted` char(1) NOT NULL DEFAULT 'N' COMMENT '是否删除',
  `proprietor_id` varchar(32) DEFAULT NULL COMMENT '运营商id',
  PRIMARY KEY (`id`),
  KEY `ix_shop_id` (`shop_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=102804 DEFAULT CHARSET=utf8 COMMENT='经营结算表';

SET FOREIGN_KEY_CHECKS = 1;
