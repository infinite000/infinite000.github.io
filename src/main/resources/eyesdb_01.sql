/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : eyesdb_01

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2021-08-14 16:29:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_diet
-- ----------------------------
DROP TABLE IF EXISTS `tb_diet`;
CREATE TABLE `tb_diet` (
  `f_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标识',
  `f_userid` int(11) DEFAULT NULL COMMENT '用户id',
  `f_platform` varchar(255) DEFAULT NULL COMMENT '平台',
  `f_category` varchar(255) DEFAULT NULL COMMENT '类别(中餐，西餐)',
  `f_meal` varchar(255) DEFAULT NULL COMMENT '菜品',
  `f_time` datetime DEFAULT NULL COMMENT '时间',
  `f_money` decimal(10,0) DEFAULT NULL COMMENT '金额',
  PRIMARY KEY (`f_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of tb_diet
-- ----------------------------
INSERT INTO `tb_diet` VALUES ('1', '1', '美团', '川菜', '白菜', '2021-07-29 19:09:41', '30');
INSERT INTO `tb_diet` VALUES ('2', '1', '饿了么', '咸菜', '茄子', '2021-07-29 19:10:45', '50');
INSERT INTO `tb_diet` VALUES ('3', '1', '美团', '湘菜', '土豆丝', '2021-07-29 19:12:47', '60');
INSERT INTO `tb_diet` VALUES ('4', '1', '美团', '西餐', '冬瓜', '2021-07-30 19:13:36', '100');
INSERT INTO `tb_diet` VALUES ('5', '1', '饿了么', '粤菜', '樱桃', '2021-07-30 19:14:30', '860');
INSERT INTO `tb_diet` VALUES ('6', '1', '美团', '鲁菜', '韭菜', '2021-07-29 19:15:07', '240');
INSERT INTO `tb_diet` VALUES ('7', '2', '饿了么', '川菜', '辣椒', '2021-07-29 12:15:39', '10');
INSERT INTO `tb_diet` VALUES ('8', '2', '美团', '咸菜', '香菜', '2021-07-29 19:16:43', '10');
INSERT INTO `tb_diet` VALUES ('9', '2', '饿了么', '湘菜', '西瓜', '2021-07-22 19:17:27', '10');
INSERT INTO `tb_diet` VALUES ('10', '2', '饿了么', '粤菜', '葡萄', '2021-07-22 19:17:34', '10');
INSERT INTO `tb_diet` VALUES ('11', '1', '饿了么', '湘菜', '冬瓜', '2021-08-14 12:02:41', '30');
INSERT INTO `tb_diet` VALUES ('12', '1', '美团', '川菜', '辣椒', '2021-08-14 12:03:21', '60');
INSERT INTO `tb_diet` VALUES ('36', '1', '美团', '湘菜', '土豆丝', '2021-08-14 12:04:01', '50');

-- ----------------------------
-- Table structure for tb_entertainment
-- ----------------------------
DROP TABLE IF EXISTS `tb_entertainment`;
CREATE TABLE `tb_entertainment` (
  `f_id` int(50) NOT NULL COMMENT '娱乐标识',
  `f_userid` int(50) DEFAULT NULL COMMENT '用户id',
  `f_type` varchar(255) DEFAULT NULL COMMENT '类型',
  `f_contemd` varchar(255) DEFAULT NULL COMMENT '内容',
  `f_time` datetime DEFAULT NULL COMMENT '时间',
  `f_money` varchar(255) DEFAULT NULL COMMENT '金额',
  `f_location` varchar(255) DEFAULT NULL COMMENT '地点',
  PRIMARY KEY (`f_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of tb_entertainment
-- ----------------------------
INSERT INTO `tb_entertainment` VALUES ('1', '1', '悬崖秋千', '悬崖秋千', '2021-07-31 00:10:26', '50', '悬崖');
INSERT INTO `tb_entertainment` VALUES ('2', '2', '彩虹滑道', '彩虹滑道', '2021-07-20 00:12:45', '60', '滑道');
INSERT INTO `tb_entertainment` VALUES ('3', '3', '摇摆桥', '摇摆桥', '2021-07-27 00:13:10', '100', '湖面上');
INSERT INTO `tb_entertainment` VALUES ('4', '4', '玻璃滑道', '玻璃滑道', '2021-07-12 00:13:48', '70', '悬空');
INSERT INTO `tb_entertainment` VALUES ('5', '5', '喊泉', '喊泉', '2021-07-21 00:14:26', '0', '泉');
INSERT INTO `tb_entertainment` VALUES ('6', '6', '丛林穿梭', '丛林穿梭', '2021-06-29 00:14:55', '90', '丛林');
INSERT INTO `tb_entertainment` VALUES ('7', '7', '观光小火车', '观光小火车', '2021-07-19 00:15:30', '30', '观光');
INSERT INTO `tb_entertainment` VALUES ('8', '8', '花海乐园自控飞机', '花海乐园自控飞机', '2021-07-20 00:16:00', '20', '花海乐园');
INSERT INTO `tb_entertainment` VALUES ('9', '9', '魔幻镜宫', '魔幻镜宫', '2021-07-18 00:16:31', '50', '魔宫');
INSERT INTO `tb_entertainment` VALUES ('10', '10', '翻滚飞船', '翻滚飞船', '2021-07-05 00:17:00', '50', '飞船');
INSERT INTO `tb_entertainment` VALUES ('11', '1', '翻滚飞船', '翻滚飞船', '2021-08-12 00:16:34', '200', '飞船');
INSERT INTO `tb_entertainment` VALUES ('12', '1', '彩虹滑道', '彩虹滑道', '2020-01-12 12:24:01', '100', '滑道');
INSERT INTO `tb_entertainment` VALUES ('13', '1', '彩虹滑道', '彩虹滑道', '2019-01-01 12:25:18', '100', '滑道');
INSERT INTO `tb_entertainment` VALUES ('14', '1', '彩虹滑道', '彩虹滑道', '2018-01-12 12:26:01', '100', '滑道');
INSERT INTO `tb_entertainment` VALUES ('15', '1', '彩虹滑道', '彩虹滑道', '2017-01-12 12:26:39', '100', '滑道');
INSERT INTO `tb_entertainment` VALUES ('16', '1', '彩虹滑道', '彩虹滑道', '2016-01-12 12:26:39', '100', '滑道');
INSERT INTO `tb_entertainment` VALUES ('17', '1', '彩虹滑道', '彩虹滑道', '2015-01-12 12:26:39', '100', '滑道');
INSERT INTO `tb_entertainment` VALUES ('18', '1', '彩虹滑道', '彩虹滑道', '2014-01-12 12:26:39', '100', '滑道');

-- ----------------------------
-- Table structure for tb_finance
-- ----------------------------
DROP TABLE IF EXISTS `tb_finance`;
CREATE TABLE `tb_finance` (
  `f_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标识',
  `f_userid` int(11) DEFAULT NULL COMMENT '用户id',
  `f_type` varchar(255) DEFAULT NULL COMMENT '类型：支出、收入',
  `f_flag` varchar(255) DEFAULT NULL COMMENT '标识(工资、房贷、车贷、买房)',
  `f_money` decimal(10,0) DEFAULT NULL COMMENT '金额',
  `f_reason` varchar(255) DEFAULT NULL COMMENT '交易原因',
  `f_time` datetime DEFAULT NULL COMMENT '交易时间',
  `f_object` varchar(255) DEFAULT NULL COMMENT '交易对象',
  PRIMARY KEY (`f_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of tb_finance
-- ----------------------------
INSERT INTO `tb_finance` VALUES ('1', '1', '支出', '房贷', '13000', '房贷', '2021-07-26 19:45:40', '房贷APP');
INSERT INTO `tb_finance` VALUES ('2', '1', '支出', '车贷', '13000', '车贷', '2021-07-26 19:45:50', '车贷APP');
INSERT INTO `tb_finance` VALUES ('3', '1', '收入', '工资', '50000', '工资', '2020-09-26 19:45:56', '老板');
INSERT INTO `tb_finance` VALUES ('4', '1', '支出', '房贷', '10000', '房贷', '2020-07-27 19:46:04', '房贷APP');
INSERT INTO `tb_finance` VALUES ('6', '1', '支出', '车贷', '13000', '车贷', '2020-07-27 19:46:21', '车贷APP');
INSERT INTO `tb_finance` VALUES ('10', '1', '收入', '工资', '70000', '工资', '2021-07-30 19:46:46', '老板');
INSERT INTO `tb_finance` VALUES ('11', '1', '支出', '房贷', '15000', '房贷', '2020-08-12 00:28:57', '房贷APP');
INSERT INTO `tb_finance` VALUES ('12', '1', '支出', '车贷', '20000', '车贷', '2019-08-12 00:33:01', '车贷APP');
INSERT INTO `tb_finance` VALUES ('13', '1', '支出', '房贷', '3000', '房贷', '2018-01-12 10:20:24', '房贷APP');
INSERT INTO `tb_finance` VALUES ('14', '1', '支出', '车贷', '18000', '车贷', '2017-02-12 10:21:05', '车贷APP');
INSERT INTO `tb_finance` VALUES ('15', '1', '支出', '房贷', '19000', '房贷', '2016-03-12 10:21:52', '房贷APP');
INSERT INTO `tb_finance` VALUES ('16', '1', '支出', '车贷', '38230', '车贷', '2015-04-12 10:22:27', '车贷APP');
INSERT INTO `tb_finance` VALUES ('17', '1', '支出', '房贷', '21000', '房贷', '2014-05-12 10:23:03', '房贷APP');
INSERT INTO `tb_finance` VALUES ('18', '1', '收入', '工资', '45000', '工资', '2020-01-01 12:36:13', '老板');
INSERT INTO `tb_finance` VALUES ('19', '1', '收入', '工资', '50000', '工资', '2019-01-01 12:36:13', '老板');
INSERT INTO `tb_finance` VALUES ('20', '1', '支出', '房贷', '10000', '房贷', '2019-01-01 12:36:13', '房贷APP');
INSERT INTO `tb_finance` VALUES ('21', '1', '收入', '工资', '48000', '工资', '2018-01-01 12:36:13', '老板');
INSERT INTO `tb_finance` VALUES ('22', '1', '支出', '房贷', '28000', '房贷', '2018-01-01 12:36:13', '房贷APP');
INSERT INTO `tb_finance` VALUES ('23', '1', '支出', '车贷', '23500', '车贷', '2018-01-01 12:36:13', '车贷APP');
INSERT INTO `tb_finance` VALUES ('24', '1', '收入', '工资', '35000', '工资', '2017-01-12 12:48:07', '老板');
INSERT INTO `tb_finance` VALUES ('25', '1', '支出', '房贷', '38500', '房贷', '2017-01-12 12:48:07', '房贷APP');
INSERT INTO `tb_finance` VALUES ('26', '1', '收入', '工资', '40000', '工资', '2016-01-12 12:48:07', '老板');
INSERT INTO `tb_finance` VALUES ('27', '1', '支出', '车贷', '38000', '车贷', '2016-01-12 12:48:07', '车贷APP');
INSERT INTO `tb_finance` VALUES ('28', '1', '收入', '工资', '30000', '工资', '2015-01-12 12:48:07', '老板');
INSERT INTO `tb_finance` VALUES ('29', '1', '支出', '房贷', '19000', '房贷', '2015-01-12 12:48:07', '房贷APP');
INSERT INTO `tb_finance` VALUES ('30', '1', '收入', '工资', '20000', '工资', '2014-01-12 12:48:07', '老板');
INSERT INTO `tb_finance` VALUES ('31', '1', '支出', '车贷', '24000', '车贷', '2014-01-12 12:48:07', '车贷APP');
INSERT INTO `tb_finance` VALUES ('32', '1', '支出', '房贷', '10000', '房贷', '2021-08-12 16:50:11', '房贷APP');
INSERT INTO `tb_finance` VALUES ('33', '1', '支出', '车贷', '10000', '车贷', '2021-04-12 16:50:11', '车贷APP');
INSERT INTO `tb_finance` VALUES ('34', '1', '支出', '饮食', '12000', '饮食', '2021-06-12 16:50:11', '美团');
INSERT INTO `tb_finance` VALUES ('35', '1', '支出', '娱乐', '20000', '娱乐', '2021-05-12 16:50:11', '公园');
INSERT INTO `tb_finance` VALUES ('36', '1', '支出', '娱乐', '13000', '娱乐', '2021-03-12 16:50:11', '密室逃脱');
INSERT INTO `tb_finance` VALUES ('37', '1', '支出', '车贷', '20000', '车贷', '2021-02-12 16:50:11', '房贷APP');
INSERT INTO `tb_finance` VALUES ('38', '1', '支出', '饮食', '15000', '饮食', '2021-01-12 16:50:11', '烧烤');
INSERT INTO `tb_finance` VALUES ('39', '1', '支出', '饮食', '13500', '饮食', '2020-12-12 16:50:11', '海底捞');
INSERT INTO `tb_finance` VALUES ('40', '1', '支出', '饮食', '22000', '饮食', '2020-11-12 16:50:11', '蜜雪冰城');
INSERT INTO `tb_finance` VALUES ('41', '1', '支出', '娱乐', '17500', '娱乐', '2020-10-12 16:50:11', '过山车');
INSERT INTO `tb_finance` VALUES ('42', '1', '支出', '娱乐', '12000', '娱乐', '2020-09-12 16:50:11', '鬼屋');
INSERT INTO `tb_finance` VALUES ('43', '1', '支出', '饮食', '11000', '饮食', '2020-09-12 16:50:11', '红烧肉');
INSERT INTO `tb_finance` VALUES ('44', '1', '支出', '饮食', '24000', '饮食', '2019-01-01 12:36:13', '吃饭');
INSERT INTO `tb_finance` VALUES ('45', '1', '支出', '娱乐', '36000', '娱乐', '2019-01-01 12:36:13', '旅游');
INSERT INTO `tb_finance` VALUES ('46', '1', '支出', '饮食', '22000', '饮食', '2018-01-01 12:36:13', '红烧肉');
INSERT INTO `tb_finance` VALUES ('47', '1', '支出', '娱乐', '15000', '娱乐', '2018-01-01 12:36:13', '旅游');
INSERT INTO `tb_finance` VALUES ('48', '1', '支出', '饮食', '37000', '饮食', '2017-01-12 12:48:07', '吃饭');
INSERT INTO `tb_finance` VALUES ('49', '1', '支出', '娱乐', '20000', '娱乐', '2017-01-12 12:48:07', '旅游');
INSERT INTO `tb_finance` VALUES ('50', '1', '支出', '饮食', '19000', '饮食', '2016-01-12 12:48:07', '吃饭');
INSERT INTO `tb_finance` VALUES ('51', '1', '支出', '娱乐', '39520', '娱乐', '2016-01-12 12:48:07', '旅游');
INSERT INTO `tb_finance` VALUES ('52', '1', '支出', '饮食', '19230', '饮食', '2015-01-12 12:48:07', '吃饭');
INSERT INTO `tb_finance` VALUES ('53', '1', '支出', '娱乐', '18350', '娱乐', '2015-01-12 12:48:07', '旅游');
INSERT INTO `tb_finance` VALUES ('54', '1', '支出', '饮食', '21000', '饮食', '2014-01-12 12:48:07', '吃饭');
INSERT INTO `tb_finance` VALUES ('55', '1', '支出', '娱乐', '30000', '娱乐', '2014-01-12 12:48:07', '旅游');

-- ----------------------------
-- Table structure for tb_medical
-- ----------------------------
DROP TABLE IF EXISTS `tb_medical`;
CREATE TABLE `tb_medical` (
  `f_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标识',
  `f_userid` int(11) NOT NULL COMMENT '用户标识',
  `f_hospital` varchar(255) DEFAULT NULL COMMENT '医院',
  `f_department` varchar(255) DEFAULT NULL COMMENT '科室',
  `f_describe` varchar(255) DEFAULT NULL COMMENT '患者描述',
  `f_diagnosis` varchar(255) DEFAULT NULL COMMENT '诊断结果',
  `f_time` datetime DEFAULT NULL COMMENT '就诊时间',
  `f_type` varchar(255) DEFAULT NULL COMMENT '医学分类',
  `f_doctor` varchar(100) DEFAULT NULL COMMENT '主治医师',
  PRIMARY KEY (`f_id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tb_medical
-- ----------------------------
INSERT INTO `tb_medical` VALUES ('1', '11', '中国医学科学院北京协和医院', '内科', '心绞痛,会有情绪激动或者劳累时出现胸闷、胸痛', '是', '2021-07-22 13:45:12', '临床医学', 'doctor1');
INSERT INTO `tb_medical` VALUES ('2', '3', '四川大学华西医院', '儿科', '长期不思饮食，厌恶摄食，食量显著少于同龄正常儿童', '是', '2021-07-21 10:54:16', '临床医学', 'doctor2');
INSERT INTO `tb_medical` VALUES ('3', '6', '中国人民解放军总医院', '精神科', '对事情提不起兴趣、思维迟缓，记忆力下降、失眠', '否', '2021-07-12 13:59:42', '基础医学', 'doctor3');
INSERT INTO `tb_medical` VALUES ('4', '13', '复旦大学附属中山医院', '外科', '皮肤烧伤后出现疼痛、红肿', '是', '2021-07-05 14:02:30', '临床医学', 'doctor4');
INSERT INTO `tb_medical` VALUES ('5', '15', '中国医学科学院北京协和医院', '内科', '头晕、头痛。头痛', '否', '2021-07-15 09:05:54', '临床医学', 'doctor5');
INSERT INTO `tb_medical` VALUES ('6', '9', '	\r\n上海市第六人民医院', '外科', '触电', '是', '2021-07-13 14:08:30', '基础医学', 'doctor6');
INSERT INTO `tb_medical` VALUES ('7', '2', '四川大学华西医院', '耳鼻喉科', '耳内有闭塞胀闷，奇痒无比', '否', '2021-07-31 10:12:20', '临床医学', 'doctor7');
INSERT INTO `tb_medical` VALUES ('8', '1', '首都医科大学\r\n宣武医院', '呼吸科', '低热、盗汗、消瘦、乏力', '是', '2021-07-26 13:17:30', '临床医学', 'doctor8');

-- ----------------------------
-- Table structure for tb_resume
-- ----------------------------
DROP TABLE IF EXISTS `tb_resume`;
CREATE TABLE `tb_resume` (
  `f_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '履历表唯一标识',
  `f_userid` int(11) DEFAULT NULL COMMENT '用户id',
  `f_resume` varchar(1000) DEFAULT NULL COMMENT '履历',
  `f_time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_resume
-- ----------------------------
INSERT INTO `tb_resume` VALUES ('1', '5', '863', '2021-07-02 08:49:12');
INSERT INTO `tb_resume` VALUES ('2', '3', '美团', '2021-07-11 08:50:10');
INSERT INTO `tb_resume` VALUES ('3', '9', '滴滴', '2021-07-19 08:50:27');
INSERT INTO `tb_resume` VALUES ('4', '12', '京东', '2021-07-05 08:50:44');
INSERT INTO `tb_resume` VALUES ('5', '15', '字节跳动', '2021-07-13 08:51:08');
INSERT INTO `tb_resume` VALUES ('6', '1', '完美世界', '2021-07-13 08:51:20');
INSERT INTO `tb_resume` VALUES ('7', '11', '阿里', '2021-07-21 08:51:55');
INSERT INTO `tb_resume` VALUES ('8', '18', '腾讯', '2021-07-06 08:53:06');
INSERT INTO `tb_resume` VALUES ('9', '4', '快手', '2021-07-20 08:54:33');
INSERT INTO `tb_resume` VALUES ('10', '13', '网易', '2021-07-13 08:55:30');
INSERT INTO `tb_resume` VALUES ('11', '1', 'Pornhub', '2021-01-01 02:33:33');
INSERT INTO `tb_resume` VALUES ('12', '1', '哔哩哔哩', '2020-09-09 06:06:40');
INSERT INTO `tb_resume` VALUES ('13', '2', '叙利亚雇佣兵', '2003-03-03 03:05:04');
INSERT INTO `tb_resume` VALUES ('14', '2', '泉水指挥官', '2005-03-01 08:09:06');
INSERT INTO `tb_resume` VALUES ('15', '2', '新冠毒王', '2004-09-06 07:08:09');
INSERT INTO `tb_resume` VALUES ('16', '2', '鉴黄师', '2002-01-01 15:50:55');
INSERT INTO `tb_resume` VALUES ('17', '1', 'ACFun', '2021-08-02 08:51:32');
INSERT INTO `tb_resume` VALUES ('18', '1', '大肠刺身试吃员', '2021-08-04 08:53:15');
INSERT INTO `tb_resume` VALUES ('19', '1', '啦啦队领队', '2021-08-15 09:11:05');

-- ----------------------------
-- Table structure for tb_trajectory
-- ----------------------------
DROP TABLE IF EXISTS `tb_trajectory`;
CREATE TABLE `tb_trajectory` (
  `f_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '轨迹id',
  `f_userid` int(11) DEFAULT NULL COMMENT '用户id',
  `f_long` double(10,2) DEFAULT NULL COMMENT '经度',
  `f_lat` double(10,2) DEFAULT NULL COMMENT '纬度',
  `f_z` double(10,2) DEFAULT NULL COMMENT '高程',
  `f_time` datetime DEFAULT NULL COMMENT '采集时间',
  `f_describe` varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`f_id`)
) ENGINE=MyISAM AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_trajectory
-- ----------------------------
INSERT INTO `tb_trajectory` VALUES ('1', '1', '113.75', '34.75', '25.00', '2021-01-30 08:33:37', '郑州图书馆');
INSERT INTO `tb_trajectory` VALUES ('2', '1', '113.67', '34.75', '111.00', '2021-07-31 08:41:41', '郑州二七塔');
INSERT INTO `tb_trajectory` VALUES ('3', '1', '112.96', '34.50', '542.00', '2021-08-02 21:01:26', '嵩山少林景区 ');
INSERT INTO `tb_trajectory` VALUES ('4', '2', '116.40', '39.91', '50.00', '2021-07-15 10:22:07', '故宫博物院');
INSERT INTO `tb_trajectory` VALUES ('5', '2', '116.41', '39.88', '49.00', '2021-07-15 17:23:00', '天坛公园');
INSERT INTO `tb_trajectory` VALUES ('6', '3', '121.50', '31.24', '5.00', '2021-07-22 16:23:40', '东方明珠广播电视塔');
INSERT INTO `tb_trajectory` VALUES ('7', '3', '121.54', '31.22', '18.30', '2021-07-24 13:26:31', '上海科技馆');
INSERT INTO `tb_trajectory` VALUES ('8', '4', '120.62', '31.92', '76.00', '2021-07-24 10:28:54', '苏州园林');
INSERT INTO `tb_trajectory` VALUES ('9', '5', '125.35', '43.91', '15.00', '2021-07-20 11:30:54', '长春伪满皇宫博物馆');
INSERT INTO `tb_trajectory` VALUES ('10', '5', '126.59', '43.85', '1000.00', '2021-07-24 18:32:21', '长白山景区');
INSERT INTO `tb_trajectory` VALUES ('11', '1', '116.40', '39.92', '50.00', '2021-07-15 10:22:07', '故宫博物院');
INSERT INTO `tb_trajectory` VALUES ('12', '1', '116.41', '39.88', '49.00', '2021-07-15 17:23:00', '天坛公园');
INSERT INTO `tb_trajectory` VALUES ('13', '1', '121.50', '31.24', '5.00', '2021-07-22 16:23:40', '东方明珠广播电视塔');
INSERT INTO `tb_trajectory` VALUES ('14', '6', '116.40', '39.92', '50.00', '2021-07-15 10:22:07', '故宫博物院');
INSERT INTO `tb_trajectory` VALUES ('15', '6', '116.41', '39.88', '49.00', '2021-07-15 17:23:00', '天坛公园');
INSERT INTO `tb_trajectory` VALUES ('16', '6', '121.50', '31.24', '5.00', '2021-07-22 16:23:40', '东方明珠广播电视塔');
INSERT INTO `tb_trajectory` VALUES ('17', '7', '116.40', '39.92', '50.00', '2021-07-15 10:22:07', '故宫博物院');
INSERT INTO `tb_trajectory` VALUES ('18', '7', '116.41', '39.88', '49.00', '2021-07-15 17:23:00', '天坛公园');
INSERT INTO `tb_trajectory` VALUES ('19', '7', '121.50', '31.24', '5.00', '2021-07-22 16:23:40', '东方明珠广播电视塔');

-- ----------------------------
-- Table structure for tb_travel
-- ----------------------------
DROP TABLE IF EXISTS `tb_travel`;
CREATE TABLE `tb_travel` (
  `f_id` int(255) NOT NULL COMMENT 'id号',
  `f_userid` int(255) DEFAULT NULL COMMENT '用户id',
  `f_traveltype` varchar(255) DEFAULT NULL COMMENT '出行方式',
  `f_vehicleinfo` varchar(255) DEFAULT NULL COMMENT '车辆信息',
  `f_time` datetime(6) DEFAULT NULL COMMENT '出行时间',
  `f_remark` varchar(255) DEFAULT NULL COMMENT '描述'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tb_travel
-- ----------------------------
INSERT INTO `tb_travel` VALUES ('1', '1', '飞机', '9C6256', '2021-10-01 23:16:00.000000', '这是一段描述1');
INSERT INTO `tb_travel` VALUES ('2', '1', '火车', 'T109', '2021-08-02 03:14:00.000000', '这是一段描述2');
INSERT INTO `tb_travel` VALUES ('3', '1', '飞机', 'NS3219', '2021-06-03 17:10:00.000000', '这是一段描述3');
INSERT INTO `tb_travel` VALUES ('4', '1', '火车', 'D311', '2021-02-04 11:45:00.000000', '这是一段描述4');
INSERT INTO `tb_travel` VALUES ('5', '1', '飞机', 'KN2355', '2021-07-05 08:19:00.000000', '这是一段描述5');
INSERT INTO `tb_travel` VALUES ('6', '1', '火车', 'D313\r\n', '2021-03-06 15:30:00.000000', '这是一段描述6');
INSERT INTO `tb_travel` VALUES ('7', '4', '飞机', '9C6268', '2021-05-07 22:10:00.000000', '这是一段描述7');
INSERT INTO `tb_travel` VALUES ('8', '1', '火车', 'G107', '2021-03-08 14:03:00.000000', '这是一段描述8');
INSERT INTO `tb_travel` VALUES ('9', '2', '飞机', '9C8904', '2021-01-09 21:15:00.000000', '这是一段描述9');
INSERT INTO `tb_travel` VALUES ('10', '3', '火车', 'G133\r\n', '2021-10-10 12:39:00.000000', '这是一段描述10');

-- ----------------------------
-- Table structure for tb_travel_trajectory
-- ----------------------------
DROP TABLE IF EXISTS `tb_travel_trajectory`;
CREATE TABLE `tb_travel_trajectory` (
  `f_id` int(255) NOT NULL COMMENT '轨迹id',
  `f_travelid` int(200) DEFAULT NULL COMMENT '出行id',
  `f_long` double(255,2) DEFAULT NULL COMMENT '经度',
  `f_lat` double(255,2) DEFAULT NULL COMMENT '维度',
  `f_z` double(255,2) DEFAULT NULL COMMENT '高程',
  `f_time` datetime(6) DEFAULT NULL COMMENT '采集时间',
  PRIMARY KEY (`f_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tb_travel_trajectory
-- ----------------------------
INSERT INTO `tb_travel_trajectory` VALUES ('1', '1', '126.59', '43.85', '1000.00', '2021-08-01 00:00:00.000000');
INSERT INTO `tb_travel_trajectory` VALUES ('2', '2', '125.35', '43.91', '15.00', '2021-08-02 00:00:00.000000');
INSERT INTO `tb_travel_trajectory` VALUES ('3', '3', '120.62', '31.92', '76.00', '2021-08-03 00:00:00.000000');
INSERT INTO `tb_travel_trajectory` VALUES ('4', '4', '121.54', '31.22', '18.30', '2021-08-04 00:00:00.000000');
INSERT INTO `tb_travel_trajectory` VALUES ('5', '5', '121.50', '31.24', '468.00', '2021-08-05 00:00:00.000000');
INSERT INTO `tb_travel_trajectory` VALUES ('6', '6', '116.41', '39.88', '38.20', '2021-08-06 00:00:00.000000');
INSERT INTO `tb_travel_trajectory` VALUES ('7', '7', '116.40', '39.91', '35.05', '2021-08-07 00:00:00.000000');
INSERT INTO `tb_travel_trajectory` VALUES ('8', '8', '112.94', '34.50', '1492.00', '2021-08-08 00:00:00.000000');
INSERT INTO `tb_travel_trajectory` VALUES ('9', '9', '113.63', '34.72', '63.00', '2021-08-09 00:00:00.000000');
INSERT INTO `tb_travel_trajectory` VALUES ('10', '10', '113.75', '34.75', '25.00', '2021-08-10 00:00:00.000000');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `f_id` int(50) NOT NULL AUTO_INCREMENT COMMENT '用户唯一标识',
  `faceid` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '人脸唯一标识',
  `f_name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `f_sex` int(2) DEFAULT NULL COMMENT '性别 0男 1女',
  `f_tel` bigint(20) DEFAULT NULL COMMENT '电话号',
  `f_card` varchar(18) DEFAULT NULL COMMENT '身份证号码',
  `f_age` varchar(3) DEFAULT NULL COMMENT '年龄',
  `f_height` double(4,0) DEFAULT NULL COMMENT '身高(cm)',
  `f_weight` double(4,0) DEFAULT NULL COMMENT '体重(kg)',
  `f_bloodtype` varchar(10) DEFAULT NULL COMMENT '血型',
  `f_occupation` varchar(20) DEFAULT NULL COMMENT '职业',
  `f_education` varchar(10) DEFAULT NULL COMMENT '学历',
  `f_address` varchar(100) DEFAULT NULL COMMENT '住址',
  `f_ismarry` int(2) DEFAULT '2' COMMENT '是否结婚 0未婚 1已婚 2未知',
  `f_birthday` datetime(6) DEFAULT NULL COMMENT '生日',
  `f_updatetime` datetime(6) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'ymh_test', '闫明辉', '0', '18345962130', '412321199907013216', '21', '170', '55', 'O', 'java工程师', '大专', '郑州', '2', '2021-07-13 20:08:02.000000', '2021-07-30 20:08:13.000000');
INSERT INTO `tb_user` VALUES ('2', '', '毋国辉', '0', '13342679510', '414356199702153615', '21', '175', '58', 'B', 'java工程师', '本科', '郑州', '2', '2021-07-09 20:15:46.000000', '2021-07-30 20:15:51.000000');
INSERT INTO `tb_user` VALUES ('3', null, '姜龙龙', '0', '13295874631', '415425199805150629', '21', '173', '60', 'A', 'java工程师', '本科', '郑州', '2', '2021-07-13 20:18:01.000000', '2021-07-30 20:18:06.000000');
INSERT INTO `tb_user` VALUES ('4', null, '陈弘毅', '0', '18746230871', '413232199707180212', '21', '179', '68', 'AB', 'java工程师', '大专', '郑州', '2', '2021-07-12 20:19:27.000000', '2021-07-30 20:19:32.000000');
INSERT INTO `tb_user` VALUES ('5', null, '蒋亚茹', '1', '13562479512', '423254199707280012', '21', '168', '65', 'A', 'java工程师', '本科', '郑州', '2', '2021-07-03 20:20:53.000000', '2021-07-30 20:20:57.000000');
INSERT INTO `tb_user` VALUES ('6', '99f214ed25b341d4a2abaa7a22588559', '尹俊朋', '0', '13566472512', '414652199803280112', '21', '170', '60', 'O', 'java工程师', '大专', '郑州', '2', '2021-06-08 20:24:30.000000', '2021-07-30 20:24:41.000000');
INSERT INTO `tb_user` VALUES ('7', 'b0b8aea9f355453dbe80d93d4d013f3e', '陈乾', '0', '13649632586', '43145219970314011x', '21', '172', '62', 'B', 'java工程师', '大专', '郑州', '2', '2021-07-20 20:25:56.000000', '2021-07-30 20:26:00.000000');
INSERT INTO `tb_user` VALUES ('8', null, '卢喆龙', '0', '17712463510', '420251199711251346', '21', '176', '52', 'O', 'java工程师', '本科', '郑州', '2', '2021-07-14 20:29:11.000000', '2021-07-30 20:29:14.000000');
INSERT INTO `tb_user` VALUES ('9', null, '王振宇', '0', '17546931265', '410231199710051326', '21', '173', '55', 'B', 'java工程师', '大专', '郑州', '2', '2021-07-19 20:30:31.000000', '2021-07-30 20:30:36.000000');
INSERT INTO `tb_user` VALUES ('10', null, '刘书杰', '0', '17459684123', '411291199710131946', '21', '175', '60', 'A', 'java工程师', '本科', '郑州', '2', '2021-07-06 20:32:09.000000', '2021-07-30 20:32:12.000000');
INSERT INTO `tb_user` VALUES ('11', null, '季敬斌', '0', '15264786325', '412221199703131842', '21', '173', '58', 'AB', 'java工程师', '本科', '郑州', '2', '2021-07-04 20:33:31.000000', '2021-07-30 20:33:34.000000');
INSERT INTO `tb_user` VALUES ('12', null, '马艺晴', '1', '15811640851', '41326119970120034x', '21', '168', '55', 'A', 'java工程师', '大专', '郑州', '2', '2021-07-10 20:35:28.000000', '2021-07-30 20:35:32.000000');
INSERT INTO `tb_user` VALUES ('13', null, '孙浩', '0', '15963345151', '421251199712022458', '21', '170', '58', 'O', 'java工程师', '大专', '郑州', '2', '2021-07-13 20:36:59.000000', '2021-07-30 20:37:02.000000');
INSERT INTO `tb_user` VALUES ('14', null, '渠鑫', '0', '18362549872', '411231199706136252', '21', '173', '70', 'AB', 'java工程师', '本科', '郑州', '2', '2021-07-04 20:39:18.000000', '2021-07-30 20:39:21.000000');
INSERT INTO `tb_user` VALUES ('15', null, '焦江', '0', '18222549972', '419232199803256858', '21', '170', '55', 'O', 'java工程师', '本科', '郑州', '2', '2021-07-04 20:40:56.000000', '2021-07-30 20:40:59.000000');
INSERT INTO `tb_user` VALUES ('16', null, '葛志远', '0', '13525068493', '429262199704296896', '21', '173', '55', 'A', 'java工程师', '大专', '郑州', '2', '2021-07-05 20:42:09.000000', '2021-07-30 20:42:13.000000');
INSERT INTO `tb_user` VALUES ('17', null, '张震', '0', '13823246849', '41526519970616259x', '21', '170', '58', 'A', 'java工程师', '大专', '郑州', '2', '2021-07-06 20:43:50.000000', '2021-07-30 20:43:53.000000');
INSERT INTO `tb_user` VALUES ('18', null, '宋凯威', '0', '18206459576', '411222199705311356', '21', '175', '55', 'B', 'java工程师', '本科', '郑州', '2', '2021-07-13 20:45:30.000000', '2021-07-30 20:45:33.000000');
INSERT INTO `tb_user` VALUES ('19', null, '陈阳', '0', '18209459276', '411223199805126256', '21', '170', '55', 'O', 'java工程师', '本科', '郑州', '2', '2021-07-13 20:47:00.000000', '2021-07-30 20:47:03.000000');
INSERT INTO `tb_user` VALUES ('20', null, '蒋理东', '0', '13209659376', '42134319970210623x', '21', '172', '65', 'A', 'java工程师', '大专', '郑州', '2', '2021-07-13 20:48:19.000000', '2021-07-30 20:48:22.000000');
INSERT INTO `tb_user` VALUES ('21', null, '刘中展', '0', '13509657376', '422425199808021254', '21', '170', '55', 'O', 'java工程师', '大专', '郑州', '2', '2021-07-10 20:49:30.000000', '2021-07-30 20:49:33.000000');
