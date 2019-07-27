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

 Date: 27/07/2019 13:59:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for zzz
-- ----------------------------
DROP TABLE IF EXISTS `zzz`;
CREATE TABLE `zzz`  (
  `timsta` timestamp NULL DEFAULT NULL,
  `qwe` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `asd` int(255) NULL DEFAULT NULL,
  `zxc` date NULL DEFAULT NULL,
  `st` datetime NULL DEFAULT NULL,
  `fgh` double(255, 0) NULL DEFAULT NULL,
  `en` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`qwe`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of zzz
-- ----------------------------
INSERT INTO `zzz` VALUES ('2019-05-13 18:21:24', '12', 2, '2019-05-08', '2019-05-22 00:00:00', 3, '2019-05-20 15:19:28');
INSERT INTO `zzz` VALUES ('2019-03-12 18:31:03', '23', 3, '2019-05-15', '2019-05-15 15:24:08', 23, '2019-05-31 15:24:08');
INSERT INTO `zzz` VALUES ('2019-05-10 18:30:57', '2353', 3, '1970-01-14', '1970-01-22 08:00:01', 23, '1970-05-01 08:00:02');
INSERT INTO `zzz` VALUES ('2019-04-28 18:30:54', '263', 12, '1970-01-08', '1970-01-14 08:00:01', 23, '1970-03-13 08:00:01');
INSERT INTO `zzz` VALUES ('2019-05-15 18:31:00', '223', 22, '1970-01-30', '1970-01-20 08:00:01', 23, '1970-03-05 08:00:01');
INSERT INTO `zzz` VALUES ('2019-05-06 18:30:51', '213', 32, '1970-02-04', '1970-02-04 08:00:02', 23, '1970-04-01 08:00:01');
INSERT INTO `zzz` VALUES ('2019-05-13 18:30:47', '2383', 322, '1970-01-13', '1970-01-08 08:00:02', 23, '1970-06-01 08:00:02');
INSERT INTO `zzz` VALUES ('1999-03-03 12:23:33', '2213', 2, '2019-05-15', '2019-05-15 18:27:10', 2, '2019-05-15 18:27:10');
INSERT INTO `zzz` VALUES ('1999-03-03 12:23:33', '21213', 12, '1999-03-03', '1999-03-03 12:23:33', 22, '1999-03-03 12:23:33');

SET FOREIGN_KEY_CHECKS = 1;
