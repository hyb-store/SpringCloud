/*
 Navicat Premium Data Transfer

 Source Server         : 本地数据库1
 Source Server Type    : MySQL
 Source Server Version : 50737
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50737
 File Encoding         : 65001

 Date: 19/08/2022 09:07:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` bigint(20) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `create_time` datetime NOT NULL,
  `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `param1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, '张三', 'admin@123', '2022-07-07 11:27:12', 'admin', '修改成功');
INSERT INTO `tb_user` VALUES (2, '李四', 'admin@123', '2022-07-26 11:27:12', 'admin', '新建');
INSERT INTO `tb_user` VALUES (3, '33', 'admin@123', '2022-07-07 15:34:06', 'admin', '3');
INSERT INTO `tb_user` VALUES (4, '44', 'admin@123', '2022-07-07 15:34:55', 'admin', '4');

SET FOREIGN_KEY_CHECKS = 1;
