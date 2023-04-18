/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50740
 Source Host           : localhost:3306
 Source Schema         : plant_treat

 Target Server Type    : MySQL
 Target Server Version : 50740
 File Encoding         : 65001

 Date: 07/04/2023 18:20:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for plant_info
-- ----------------------------
DROP TABLE IF EXISTS `plant_info`;
CREATE TABLE `plant_info`  (
  `plant_id` int(11) NOT NULL COMMENT '植物id',
  `plant_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '植物名称',
  `deleted` bigint(2) NULL DEFAULT NULL COMMENT '删除',
  `created` datetime(6) NULL DEFAULT CURRENT_TIMESTAMP(6),
  `modified` datetime(6) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(6),
  PRIMARY KEY (`plant_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of plant_info
-- ----------------------------
INSERT INTO `plant_info` VALUES (1, '玫瑰', 0, '2023-03-23 01:16:46.132454', '2023-03-23 01:17:10.367876');
INSERT INTO `plant_info` VALUES (2, '桂花', 0, '2023-03-23 01:43:46.242752', NULL);

-- ----------------------------
-- Table structure for plant_status_info
-- ----------------------------
DROP TABLE IF EXISTS `plant_status_info`;
CREATE TABLE `plant_status_info`  (
  `user_id` int(11) NOT NULL COMMENT '用户信息ID',
  `plant_id` int(11) NULL DEFAULT NULL COMMENT '植物类型',
  `plant_growth` bigint(255) NULL DEFAULT NULL COMMENT '植物成长度',
  `plant_water_time` datetime NULL DEFAULT NULL COMMENT '植物浇水时长',
  `plant_fertilize_time` datetime NULL DEFAULT NULL COMMENT '植物施肥时长',
  `deleted` bigint(20) NULL DEFAULT NULL COMMENT '逻辑删除',
  `created` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modified` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of plant_status_info
-- ----------------------------
INSERT INTO `plant_status_info` VALUES (1, 1, 1, '2023-04-01 00:35:16', '2023-04-01 00:35:20', 0, '2023-04-01 00:35:22', NULL);

-- ----------------------------
-- Table structure for question_data
-- ----------------------------
DROP TABLE IF EXISTS `question_data`;
CREATE TABLE `question_data`  (
  `question_id` int(50) NOT NULL COMMENT '问题id,题号',
  `question_main` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '问题主体',
  `question_check_a` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'a选项',
  `question_check_b` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'b选项',
  `question_check_c` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'c选项',
  `question_check_d` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'd选项',
  `question_answer_a` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'a类回答，a,b选项绑定',
  `question_answer_b` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'b类回答，c,d选项绑定',
  `question_model` int(255) NOT NULL COMMENT '问题类型，区别与不同的问卷',
  `deleted` bigint(20) NOT NULL COMMENT '逻辑删除',
  `created` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
  `modified` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`question_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of question_data
-- ----------------------------
INSERT INTO `question_data` VALUES (1, '我亲爱的朋友U，最近你是否因为不顺心的事情而感到闷闷不乐或情绪低沉？', '没有，我过得很快乐', '有一些时候会这样', '大部分时间都会这样', '是的，我最近遇到了很麻烦的事', '快乐是健康的基础。我相信U这样的聪明人都懂得保持快乐的重要性。', '慢慢来，你知道一切总会过去，不必为那些事情感到烦恼。作为U的朋友我衷心希望U能快乐。', 0, 0, NULL, '2023-03-23 01:13:33');
INSERT INTO `question_data` VALUES (2, '我喜欢人类，人类总是诗意而充满智慧，古人们曾过说一日之计在于晨。我最喜欢美丽的朝阳，阳光洒在我的身上时我能感到叶片们都忙碌起来，全身都充满力量。U，你也认为一天中最美好的时刻便是早晨吗？', '嗯，我也很喜欢早晨', '早晨确实很好，但是其他时间也不错', '不讨厌早晨，但是有更喜欢的时间', '不，我并不喜欢早晨', '你也这样认为吗！！太好了，我们果然是有缘分的朋友。', '我理解，这个世界就是由有着不同想法的人组成的。如果所有生物都只喜欢早晨，那夜晚也太过可怜了。', 0, 0, NULL, '2023-03-23 01:13:34');
INSERT INTO `question_data` VALUES (3, '即使作为一颗种子，生活中也充满林林总总的不顺心的事。所以我自认为是一颗孤独的种子。与我们不同，面对不容乐观的事态时人类可以通过眼泪宣泄自己的情绪，这一点总是让我很羡慕。最近U有没有哭过或觉得想哭呢。', '我很坚强，不会随随便便哭泣', '只在某些很少的时间', '经常都想要哭出来', '最近总是遇到自己无法承受的事情，所以用哭来缓解自己', '那么看来我需要向U学习呢，不过有时候眼泪也是非常有用的哦。', '尽管泪水很有用，过多的眼泪就会失去它的意义.', 0, 0, '2023-03-19 15:56:49', '2023-03-23 01:13:34');
INSERT INTO `question_data` VALUES (4, '生物钟是大自然神秘奇妙的创造，尽管我从来搞不懂它。夜间本该万籁俱寂，但我却一点都不想休息，总想趁这会儿偷偷开花。U,你也会这样吗？', '咖啡都不能阻止我的睡意 ', '很少（有时）有睡不着的时候', '经常有失眠的情况', '每天在床上都是辗转难眠', '良好的睡眠能够为生理和心理的健康状况带来好处。U，你的身上真的有很多值得我学习的东西。', '也许你和我一样，脑子里装了太多东西吧。', 0, 0, NULL, '2023-03-23 01:13:35');
INSERT INTO `question_data` VALUES (5, '我实在是羡慕可以享受美食的人类，作为植物我们平时只能讨论什么天气的土好吃...因此我实在想了解你最近的饮食状况如何。U的食量与平常相比变化不大吗？', '不大，我依旧是吃嘛嘛香', '有时候会有不想吃饭的情况', '经常都吃不下饭', '我最近都没有食欲', '太好了。但是U不必分享给我，大多数情况下的土吃起来都是一个味道。', '人类选择了比其他生物更加复杂的头脑，却放弃了很多基本的本能。U一定要好好吃饭哦。', 0, 0, NULL, '2023-03-23 01:13:36');
INSERT INTO `question_data` VALUES (6, '异性！随着年龄增长，人们才渐渐体会到与异性之间的区别。这些微妙的特点真是复杂又迷人，尤其不同性别的人类简直像是两个不同的物种。当你与异性密切接触时，是否能和以往一样感到愉快呢。', '我最近不想和异性接触', '有时候是的', '只比以前少了一些', '我擅长和异性密切接触', '我理解U，我与其他物种相处时也总会感到局促和窘迫，尽管我确实知道没有什么好怕的。', '我不敢设想只有一种性别的社会。两种性别的个体以及他们之间的和谐相处是社会稳定延续的必然条件。', 0, 0, NULL, '2023-03-23 01:13:37');
INSERT INTO `question_data` VALUES (7, '我总是搞不懂为什么人类会追求那些极限骨感的身材，对我来说U的身材就刚刚好。不知道你的体重最近有没有在下降呢。', ' 没有', '稍微瘦了一点点', '瘦得比较多', '瘦了很多', '稳定是最完美的状态。', '不知道U是不是有意为之，在我们植物看来，一段时间内机体状态不稳定是一件可怕的事情。', 0, 0, NULL, '2023-03-23 01:51:35');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `user_id` int(50) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `user_account` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账户',
  `user_password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `user_phone` bigint(50) NULL DEFAULT NULL COMMENT '用户手机号码',
  `user_email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户邮箱',
  `user_level` int(10) NOT NULL COMMENT '用户权限',
  `plant_id` int(10) NULL DEFAULT NULL COMMENT '关联植物id',
  `created` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modified` datetime NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `deleted` int(2) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES (2, 'root', 'root', 'root', NULL, 'root', 0, 1, '2023-03-19 15:35:35', '2023-03-23 01:37:50', 0);
INSERT INTO `user_info` VALUES (20, NULL, 'dkwms', 'dkwms', NULL, 'dkwms', 0, 1, NULL, '2023-03-29 19:42:14', 0);
INSERT INTO `user_info` VALUES (28, '', 'a', 'a', NULL, 'a', 0, NULL, NULL, '2023-04-01 22:57:34', 0);
INSERT INTO `user_info` VALUES (33, NULL, 'f', 'f', NULL, 'f', 0, 1, NULL, '2023-04-01 23:01:59', 0);
INSERT INTO `user_info` VALUES (34, 'lfx', 'lfx123', 'dkwms', NULL, 'fae', 0, 1, NULL, '2023-04-06 01:31:44', 0);
INSERT INTO `user_info` VALUES (35, 'DKwms', 'root01', 'dkwmslfx123', NULL, 'root02', 0, 1, NULL, '2023-04-07 16:15:50', 0);

-- ----------------------------
-- Table structure for user_status_info
-- ----------------------------
DROP TABLE IF EXISTS `user_status_info`;
CREATE TABLE `user_status_info`  (
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `user_mood` bigint(20) NULL DEFAULT NULL COMMENT '用户心情值',
  `user_talk_time` bigint(20) NULL DEFAULT NULL COMMENT '用户交流次数',
  `user_water_time` bigint(20) NULL DEFAULT NULL COMMENT '用户浇水次数',
  `user_fertilize_time` bigint(20) NULL DEFAULT NULL COMMENT '用户施肥次数',
  `user_progress` bigint(20) NULL DEFAULT NULL COMMENT '用于记录用户流程进度',
  `deleted` bigint(20) NULL DEFAULT NULL COMMENT '逻辑删除',
  `created` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
  `modified` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_status_info
-- ----------------------------
INSERT INTO `user_status_info` VALUES (2, -10, 1, 1, 1, 1, 0, '2023-04-01 00:04:34', '2023-04-07 16:34:49');

SET FOREIGN_KEY_CHECKS = 1;
