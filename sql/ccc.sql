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

 Date: 27/07/2019 13:57:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ccc
-- ----------------------------
DROP TABLE IF EXISTS `ccc`;
CREATE TABLE `ccc`  (
  `test_id` int(11) NOT NULL AUTO_INCREMENT,
  `test_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT '',
  PRIMARY KEY (`test_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ccc
-- ----------------------------
INSERT INTO `ccc` VALUES (1, 'ccc');
INSERT INTO `ccc` VALUES (2, 'ccc0.8395597209476784');
INSERT INTO `ccc` VALUES (3, 'ccc0.8542198125285312');
INSERT INTO `ccc` VALUES (4, 'ccc0.533237973062582');

SET FOREIGN_KEY_CHECKS = 1;
