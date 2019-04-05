/*
Navicat MySQL Data Transfer

Source Server         : wulis.mysql-MySQL
Source Server Version : 50514
Source Host           : wulis.mysql:3306
Source Database       : wulicloud_member

Target Server Type    : MYSQL
Target Server Version : 50514
File Encoding         : 65001

Date: 2019-04-05 21:18:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for member_account
-- ----------------------------
DROP TABLE IF EXISTS `member_account`;
CREATE TABLE `member_account` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `input_time` varchar(64) NOT NULL DEFAULT '' COMMENT '插入时间',
  `update_time` varchar(64) DEFAULT NULL COMMENT '更新时间',
  `account` varchar(255) NOT NULL COMMENT '账号',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `is_enable` varchar(8) DEFAULT '0' COMMENT '是否启用：0启用，1禁用',
  `operator_by` varchar(64) DEFAULT '0' COMMENT '操作人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20190331 DEFAULT CHARSET=utf8 COMMENT='会员账号表';

-- ----------------------------
-- Records of member_account
-- ----------------------------
INSERT INTO `member_account` VALUES ('20190328', '2019-01-17 09:39:10', null, 'wulibao', '$2a$10$rxQx/I0NZfA7lBOoXcJpT.ovae/LWxdSH5iBsrKyevUThkwEzzWBW', '0', '0');
INSERT INTO `member_account` VALUES ('20190329', '2019-01-17 09:39:10', null, 'admin', '$2a$10$KG4p8h0sBAXAw5pU0AeGweYgM484CrgOPVAfGZUX8KsFhkGo.plb2', '0', '0');
INSERT INTO `member_account` VALUES ('20190330', '2019-01-17 09:39:10', null, 'user', '$2a$10$E5N1eXxeWGazEg6MTMU0JOh0RiJV0bcQagrA4AHFtNmoK8F1R1Y9y', '0', '0');

-- ----------------------------
-- Table structure for member_acco_auth
-- ----------------------------
DROP TABLE IF EXISTS `member_acco_auth`;
CREATE TABLE `member_acco_auth` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `input_time` varchar(64) NOT NULL DEFAULT '' COMMENT '插入时间',
  `update_time` varchar(64) DEFAULT NULL COMMENT '更新时间',
  `account_id` int(20) NOT NULL COMMENT '权限等级表id',
  `authoritie_id` int(20) NOT NULL COMMENT '权限等级表id',
  `is_enable` varchar(8) DEFAULT '0' COMMENT '是否启用：0启用，1禁用',
  `operator_by` varchar(64) DEFAULT '0' COMMENT '操作人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20190405 DEFAULT CHARSET=utf8 COMMENT='账号权限中间表';

-- ----------------------------
-- Records of member_acco_auth
-- ----------------------------
INSERT INTO `member_acco_auth` VALUES ('20190401', '2019-04-01 16:07:53', null, '20190328', '20190402', '0', '0');
INSERT INTO `member_acco_auth` VALUES ('20190402', '2019-04-01 16:07:53', null, '20190329', '20190402', '0', '0');
INSERT INTO `member_acco_auth` VALUES ('20190403', '2019-04-01 16:07:53', null, '20190328', '20190401', '0', '0');
INSERT INTO `member_acco_auth` VALUES ('20190404', '2019-04-01 16:07:53', null, '20190330', '20190401', '0', '0');

-- ----------------------------
-- Table structure for member_authoritie
-- ----------------------------
DROP TABLE IF EXISTS `member_authoritie`;
CREATE TABLE `member_authoritie` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `input_time` varchar(64) NOT NULL DEFAULT '' COMMENT '插入时间',
  `update_time` varchar(64) DEFAULT NULL COMMENT '更新时间',
  `authority` varchar(255) NOT NULL DEFAULT 'ROLE_USER' COMMENT '权限等级',
  `is_enable` varchar(8) DEFAULT '0' COMMENT '是否启用：0启用，1禁用',
  `operator_by` varchar(64) DEFAULT '0' COMMENT '操作人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20190403 DEFAULT CHARSET=utf8 COMMENT='权限等级表';

-- ----------------------------
-- Records of member_authoritie
-- ----------------------------
INSERT INTO `member_authoritie` VALUES ('20190401', '2019-04-01 16:07:53', null, 'ROLE_USER', '0', '0');
INSERT INTO `member_authoritie` VALUES ('20190402', '2019-04-01 16:07:53', null, 'ROLE_ADMIN', '0', '0');
