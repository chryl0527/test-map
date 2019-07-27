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

 Date: 27/07/2019 13:57:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for city_government
-- ----------------------------
DROP TABLE IF EXISTS `city_government`;
CREATE TABLE `city_government`  (
  `id` int(11) NOT NULL,
  `city_government_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `city_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of city_government
-- ----------------------------
INSERT INTO `city_government` VALUES (1, 'yant_governmen', 1);
INSERT INTO `city_government` VALUES (2, 'beijing_governmen', 2);
INSERT INTO `city_government` VALUES (3, 'xinj_governmen', 3);
INSERT INTO `city_government` VALUES (4, 'la_governmen', 4);
INSERT INTO `city_government` VALUES (5, 'r_governmen', 5);
INSERT INTO `city_government` VALUES (6, 'ca_governmen', 6);
INSERT INTO `city_government` VALUES (7, 'genr_governmen', 7);
INSERT INTO `city_government` VALUES (8, 'weif_governmen', 8);
INSERT INTO `city_government` VALUES (9, 'qingd_governmen', 9);
INSERT INTO `city_government` VALUES (10, 'maz_governmen', 10);

SET FOREIGN_KEY_CHECKS = 1;
