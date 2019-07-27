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

 Date: 27/07/2019 13:57:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`  (
  `id` int(11) NOT NULL,
  `city_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `province_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES (1, 'yant', 1);
INSERT INTO `city` VALUES (2, 'beijing', 2);
INSERT INTO `city` VALUES (3, 'xinj', 3);
INSERT INTO `city` VALUES (4, 'la', 4);
INSERT INTO `city` VALUES (5, 'r', 4);
INSERT INTO `city` VALUES (6, 'ca', 5);
INSERT INTO `city` VALUES (7, 'genr', 6);
INSERT INTO `city` VALUES (8, 'weif', 1);
INSERT INTO `city` VALUES (9, 'qingd', 1);
INSERT INTO `city` VALUES (10, 'maz', 5);

SET FOREIGN_KEY_CHECKS = 1;
