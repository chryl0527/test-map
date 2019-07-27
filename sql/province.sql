/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3307
 Source Server Type    : MySQL
 Source Server Version : 50540
 Source Host           : localhost:3307
 Source Schema         : testchr

 Target Server Type    : MySQL
 Target Server Version : 50540
 File Encoding         : 65001

 Date: 27/07/2019 13:58:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for province
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province`  (
  `id` int(11) NOT NULL,
  `province_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `country_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of province
-- ----------------------------
INSERT INTO `province` VALUES (7, 'uk_b', 3);
INSERT INTO `province` VALUES (6, 'uk_a', 3);
INSERT INTO `province` VALUES (5, 'usa_b', 2);
INSERT INTO `province` VALUES (4, 'usa_a', 2);
INSERT INTO `province` VALUES (3, 'xj', 1);
INSERT INTO `province` VALUES (2, 'bj', 1);
INSERT INTO `province` VALUES (1, 'sd', 1);

SET FOREIGN_KEY_CHECKS = 1;
