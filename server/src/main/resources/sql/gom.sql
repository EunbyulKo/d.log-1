
CREATE TABLE `User` (
	`user_id`	varchar(4)	NOT NULL,
	`sex`	varchar(10)	NULL,
	`weight`	int(3)	NULL,
	`height`	int(3)	NULL,
	`birth`	date	NULL,
	`nickname`	varchar(20)	NULL,
	`refresh_token`	varchar(30)	NOT NULL,
	`login_type`	varchar(10)	NOT NULL,
	`uniq_id`	varchar(30)	NOT NULL,
         PRIMARY KEY (user_id)
);

CREATE TABLE `Goal` (
	`goal_id`	varchar(10)	NOT NULL,
	`user_id`	varchar(4)	NOT NULL,
	`title`	VARCHAR(255)	NOT NULL,
	`target_weight`	int(3)	NOT NULL,
	`start_dt`	date	NOT NULL,
	`end_dt`	date	NOT NULL,
	`state`	varchar(10)	NOT NULL,
         PRIMARY KEY (goal_id)
);