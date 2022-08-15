/*
 Navicat Premium Data Transfer

 Source Server         : 本地数据库1
 Source Server Type    : MySQL
 Source Server Version : 50737
 Source Host           : localhost:3306
 Source Schema         : springcloud

 Target Server Type    : MySQL
 Target Server Version : 50737
 File Encoding         : 65001

 Date: 15/08/2022 14:01:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `serial` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付流水号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 56 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '支付表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of payment
-- ----------------------------
INSERT INTO `payment` VALUES (31, '尚硅谷111');
INSERT INTO `payment` VALUES (32, 'atguigu002');
INSERT INTO `payment` VALUES (34, 'atguigu002');
INSERT INTO `payment` VALUES (35, 'atguigu002');
INSERT INTO `payment` VALUES (36, NULL);
INSERT INTO `payment` VALUES (37, NULL);
INSERT INTO `payment` VALUES (38, NULL);
INSERT INTO `payment` VALUES (39, '尚硅谷111');
INSERT INTO `payment` VALUES (40, '尚硅谷111');
INSERT INTO `payment` VALUES (42, '尚硅谷111');
INSERT INTO `payment` VALUES (43, '尚硅谷111');
INSERT INTO `payment` VALUES (44, '尚硅谷111');
INSERT INTO `payment` VALUES (45, '尚硅谷111');
INSERT INTO `payment` VALUES (46, '尚硅谷111');
INSERT INTO `payment` VALUES (47, '尚硅谷111');
INSERT INTO `payment` VALUES (48, '尚硅谷111');
INSERT INTO `payment` VALUES (49, '尚硅谷111');
INSERT INTO `payment` VALUES (50, '尚硅谷111');
INSERT INTO `payment` VALUES (51, 'ttttaaaa');
INSERT INTO `payment` VALUES (52, NULL);
INSERT INTO `payment` VALUES (53, 'dasdas');
INSERT INTO `payment` VALUES (54, 'consumer');
INSERT INTO `payment` VALUES (55, 'consumer');

SET FOREIGN_KEY_CHECKS = 1;
