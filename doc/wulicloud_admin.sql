/*
Navicat MySQL Data Transfer

Source Server         : wulis.mysql-MySQL
Source Server Version : 50514
Source Host           : wulis.mysql:3306
Source Database       : wulicloud_admin

Target Server Type    : MYSQL
Target Server Version : 50514
File Encoding         : 65001

Date: 2019-04-05 21:18:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin_dictionary_item
-- ----------------------------
DROP TABLE IF EXISTS `admin_dictionary_item`;
CREATE TABLE `admin_dictionary_item` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `dic_id` int(20) NOT NULL COMMENT '字典类型id',
  `input_time` varchar(64) NOT NULL DEFAULT '' COMMENT '插入时间',
  `update_time` varchar(64) DEFAULT NULL COMMENT '更新时间',
  `item_name` varchar(255) DEFAULT NULL COMMENT '字典名称',
  `item_value` varchar(255) DEFAULT '' COMMENT '值',
  `text` varchar(255) DEFAULT '' COMMENT '描述',
  `sort` int(11) DEFAULT '0' COMMENT '排序',
  `is_enable` varchar(8) DEFAULT '0' COMMENT '是否启用：0启用，1禁用',
  `operator_by` varchar(64) NOT NULL DEFAULT '0' COMMENT '操作人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20190145 DEFAULT CHARSET=utf8 COMMENT='数据字典类型条目表';

-- ----------------------------
-- Records of admin_dictionary_item
-- ----------------------------
INSERT INTO `admin_dictionary_item` VALUES ('20190119', '20190118', '2019-02-25 15:00:28', null, '第一季度', 'Q1', '统计季度', '1', '0', '0');
INSERT INTO `admin_dictionary_item` VALUES ('20190120', '20190118', '2019-02-25 15:00:42', null, '第二季度', 'Q2', '统计季度', '2', '0', '0');
INSERT INTO `admin_dictionary_item` VALUES ('20190121', '20190118', '2019-02-25 15:00:57', null, '第三季度', 'Q3', '统计季度', '3', '0', '0');
INSERT INTO `admin_dictionary_item` VALUES ('20190122', '20190118', '2019-02-25 15:01:10', null, '第四季度', 'Q4', '统计季度', '4', '0', '0');

-- ----------------------------
-- Table structure for admin_dictionary_type
-- ----------------------------
DROP TABLE IF EXISTS `admin_dictionary_type`;
CREATE TABLE `admin_dictionary_type` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `input_time` varchar(64) NOT NULL DEFAULT '' COMMENT '插入时间',
  `update_time` varchar(64) DEFAULT NULL COMMENT '更新时间',
  `dic_name` varchar(255) DEFAULT '' COMMENT '字典类型名称',
  `text` varchar(255) DEFAULT '' COMMENT '描述',
  `is_enable` varchar(8) DEFAULT '0' COMMENT '是否启用：0启用，1禁用',
  `operator_by` varchar(64) NOT NULL DEFAULT '0' COMMENT '操作人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20190120 DEFAULT CHARSET=utf8 COMMENT='数据字典类型表';

-- ----------------------------
-- Records of admin_dictionary_type
-- ----------------------------
INSERT INTO `admin_dictionary_type` VALUES ('20190118', '2019-02-25 14:59:20', null, '统计季度', '基础表涉及统计季度', '0', '0');

-- ----------------------------
-- Table structure for admin_notice_information
-- ----------------------------
DROP TABLE IF EXISTS `admin_notice_information`;
CREATE TABLE `admin_notice_information` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `input_time` varchar(64) NOT NULL DEFAULT '' COMMENT '插入时间',
  `update_time` varchar(64) DEFAULT NULL COMMENT '更新时间',
  `release_time` varchar(64) NOT NULL DEFAULT '' COMMENT '发布时间',
  `title` varchar(255) NOT NULL DEFAULT '' COMMENT '标题',
  `content` text NOT NULL COMMENT '描述',
  `publisher_id` varchar(64) NOT NULL DEFAULT '' COMMENT '发布人ID',
  `sort` int(20) DEFAULT '0' COMMENT '排序',
  `is_enable` varchar(8) DEFAULT '0' COMMENT '是否启用：0启用,1禁用',
  `operator_by` varchar(64) DEFAULT '' COMMENT '操作人',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=20180028 DEFAULT CHARSET=utf8 COMMENT='公告信息表';

-- ----------------------------
-- Records of admin_notice_information
-- ----------------------------
INSERT INTO `admin_notice_information` VALUES ('20180021', '2018-12-27 15:57:22', null, '2018-12-27', '系统架构集成WebSocket', '1.较少的控制开销。在连接创建后，服务器和客户端之间交换数据时，用于协议控制的数据包头部相对较小。在不包含扩展的情况下，对于服务器到客户端的内容，此头部大小只有2至10字节（和数据包长度有关）；对于客户端到服务器的内容，此头部还需要加上额外的4字节的掩码。相对于HTTP请求每次都要携带完整的头部，此项开销显著减少了。\n    2.更强的实时性。由于协议是全双工的，所以服务器可以随时主动给客户端下发数据。相对于HTTP请求需要等待客户端发起请求服务端才能响应，延迟明显更少；即使是和Comet等类似的长轮询比较，其也能在短时间内更多次地传递数据。\n    3.保持连接状态。与HTTP不同的是，Websocket需要先创建连接，这就使得其成为一种有状态的协议，之后通信时可以省略部分状态信息。而HTTP请求可能需要在每个请求都携带状态信息（如身份认证等）。\n    4.更好的二进制支持。Websocket定义了二进制帧，相对HTTP，可以更轻松地处理二进制内容。\n    5.可以支持扩展。Websocket定义了扩展，用户可以扩展协议、实现部分自定义的子协议。如部分浏览器支持压缩等。\n    6.更好的压缩效果。相对于HTTP压缩，Websocket在适当的扩展支持下，可以沿用之前内容的上下文，在传递类似的数据时，可以显著地提高压缩率。', '温程宝', '0', '0', '0');

-- ----------------------------
-- Table structure for admin_sys_operation_log
-- ----------------------------
DROP TABLE IF EXISTS `admin_sys_operation_log`;
CREATE TABLE `admin_sys_operation_log` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `input_time` varchar(64) NOT NULL DEFAULT '' COMMENT '插入时间',
  `update_time` varchar(64) DEFAULT NULL COMMENT '更新时间',
  `operation_name` varchar(128) NOT NULL DEFAULT '' COMMENT '操作名称',
  `description` varchar(255) NOT NULL DEFAULT '' COMMENT '描述',
  `operation_type` varchar(8) NOT NULL DEFAULT '' COMMENT '操作类型',
  `operation_result` varchar(8) NOT NULL DEFAULT '' COMMENT '操作结果:0成功，1失败',
  `interface_add` varchar(128) NOT NULL DEFAULT '' COMMENT '接口地址',
  `request_param` text NOT NULL COMMENT '请求参数',
  `return_param` text NOT NULL COMMENT '返回参数',
  `ip_add` varchar(128) NOT NULL DEFAULT '' COMMENT 'ip地址',
  `execution_start_time` varchar(64) NOT NULL DEFAULT '' COMMENT '执行开始时间',
  `execution_end_time` varchar(64) NOT NULL DEFAULT '' COMMENT '执行结束时间',
  `is_del` varchar(8) NOT NULL DEFAULT '0' COMMENT '是否删除：0未删除 ，1已删除',
  `is_enable` varchar(8) NOT NULL DEFAULT '0' COMMENT '是否启用：0启用，1禁用',
  `operator_by` varchar(64) NOT NULL DEFAULT '0' COMMENT '操作人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统操作日志表';

-- ----------------------------
-- Records of admin_sys_operation_log
-- ----------------------------
