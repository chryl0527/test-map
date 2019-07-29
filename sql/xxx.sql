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

 Date: 27/07/2019 13:59:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for xxx
-- ----------------------------
DROP TABLE IF EXISTS `xxx`;
CREATE TABLE `xxx`  (
  `maa` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `sadf` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `wrsa` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `sfds` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`maa`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xxx
-- ----------------------------
INSERT INTO `xxx` VALUES ('123', '345', '456', '997');
INSERT INTO `xxx` VALUES ('124', '345', '456', '985');
INSERT INTO `xxx` VALUES ('125', '345', '456', '917');
INSERT INTO `xxx` VALUES ('126', '345', '456', '987');
INSERT INTO `xxx` VALUES ('127', '345', '456', '47');
INSERT INTO `xxx` VALUES ('128', '345', '456', '977');
INSERT INTO `xxx` VALUES ('129', '345', '456', '937');
INSERT INTO `xxx` VALUES ('130', '345', '78', '76');

SET FOREIGN_KEY_CHECKS = 1;
