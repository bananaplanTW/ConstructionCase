CREATE TABLE `companies` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `account` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `salt` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `accounts` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  `company_id` int(11) unsigned DEFAULT NULL,
  `employee_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `company_id` (`company_id`),
  CONSTRAINT `accounts_ibfk_1` FOREIGN KEY (`company_id`) REFERENCES `companies` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

CREATE TABLE `orientations` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(2) CHARACTER SET latin1 DEFAULT NULL,
  `name` varchar(255) CHARACTER SET big5 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `orientations` (`id`, `code`, `name`)
VALUES
	(1,'A','東面'),
	(2,'AB',NULL),
	(3,'B','西面'),
	(4,'BC',NULL),
	(5,'C','南面'),
	(6,'CD',NULL),
	(7,'D','北面'),
	(8,'AD',NULL);

CREATE TABLE `categories` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `categories` (`id`, `name`)
VALUES
	(1,'濕式貼著飾面材'),
	(2,'石材類'),
	(3,'帷幕牆系統'),
	(4,'外牆附掛物');

CREATE TABLE `methods` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `methods` (`id`, `name`)
VALUES
	(1,'紅外線顯像儀'),
	(2,'近距離目視(潑水,刀插)'),
	(3,'打診'),
	(4,'金屬探測器或內視鏡'),
	(5,'手動油壓式拉拔試驗');