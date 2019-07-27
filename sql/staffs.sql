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

 Date: 27/07/2019 13:58:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for staffs
-- ----------------------------
DROP TABLE IF EXISTS `staffs`;
CREATE TABLE `staffs`  (
  `staff_id` int(11) NOT NULL,
  `company_id` int(11) NULL DEFAULT NULL,
  `staff_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`staff_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of staffs
-- ----------------------------
INSERT INTO `staffs` VALUES (1, 1, 'bna');
INSERT INTO `staffs` VALUES (2, 3, 'agge');
INSERT INTO `staffs` VALUES (3, 1, 'hhhh');
INSERT INTO `staffs` VALUES (4, 2, 'gdfw1222');
INSERT INTO `staffs` VALUES (5, 2, '5');

SET FOREIGN_KEY_CHECKS = 1;
