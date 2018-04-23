-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema office
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema office
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `office` DEFAULT CHARACTER SET utf8 ;
USE `office` ;

-- -----------------------------------------------------
-- Table `office`.`lookup_group`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `office`.`lookup_group` (
  `lookup_group_id` INT(11) NOT NULL AUTO_INCREMENT,
  `lookup_group_cd` VARCHAR(30) NOT NULL,
  `lookup_group_desc` VARCHAR(50) NOT NULL,
  `created_by` INT(11) NULL DEFAULT NULL,
  `updated_by` INT(11) NULL DEFAULT NULL,
  `created_date` DATE NULL DEFAULT NULL,
  `updated_date` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`lookup_group_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `office`.`lookup_dtl`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `office`.`lookup_dtl` (
  `lookup_dtl_id` INT(11) NOT NULL AUTO_INCREMENT,
  `lookup_group_id` INT(11) NOT NULL,
  `dtl_cd` VARCHAR(30) NOT NULL,
  `dtl_desc` VARCHAR(50) NOT NULL,
  `dtl_cd1` VARCHAR(30) NULL DEFAULT NULL,
  `dtl_cd2` VARCHAR(30) NULL DEFAULT NULL,
  `parent_id` INT(11) NOT NULL DEFAULT '0',
  `hierarchy_level` INT(11) NULL DEFAULT '0',
  `sequence_no` INT(11) NULL DEFAULT '0',
  `effective_date` DATE NOT NULL,
  `expiry_date` DATE NULL DEFAULT NULL,
  `dtl_cd3` VARCHAR(30) NULL DEFAULT NULL,
  `dtl_cd4` VARCHAR(30) NULL DEFAULT NULL,
  `dtl_cd5` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`lookup_dtl_id`),
  INDEX `idx_lookup_dtl` (`lookup_group_id` ASC),
  CONSTRAINT `fk_lookup_dtl_lookup`
    FOREIGN KEY (`lookup_group_id`)
    REFERENCES `office`.`lookup_group` (`lookup_group_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `office`.`address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `office`.`address` (
  `address_id` INT(11) NOT NULL AUTO_INCREMENT,
  `address_line1` VARCHAR(250) NOT NULL,
  `address_line2` VARCHAR(100) NULL DEFAULT NULL,
  `address_city` VARCHAR(25) NULL DEFAULT NULL,
  `address_state` INT(11) NOT NULL,
  `address_zipcode` VARCHAR(20) NULL DEFAULT NULL,
  `created_by` INT(11) NULL DEFAULT NULL,
  `updated_by` INT(11) NULL DEFAULT NULL,
  `effective_date` DATE NOT NULL,
  `expiry_date` DATE NULL DEFAULT NULL,
  `country` INT(30) NOT NULL,
  `created_date` DATE NULL DEFAULT NULL,
  `updated_date` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`address_id`),
  INDEX `fk_state_lookup` (`address_state` ASC),
  INDEX `fk_country_lookup` (`country` ASC),
  CONSTRAINT `fk_country_lookup`
    FOREIGN KEY (`country`)
    REFERENCES `office`.`lookup_dtl` (`lookup_dtl_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_state_lookup`
    FOREIGN KEY (`address_state`)
    REFERENCES `office`.`lookup_dtl` (`lookup_dtl_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `office`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `office`.`users` (
  `user_id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(75) NOT NULL,
  `first_name` VARCHAR(50) NOT NULL,
  `last_name` VARCHAR(50) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(75) NULL DEFAULT NULL,
  `date_of_birth` DATE NULL DEFAULT NULL,
  `effective_date` DATE NOT NULL,
  `expiry_date` DATE NULL DEFAULT NULL,
  `status_id` INT(11) NOT NULL,
  `created_date` DATE NULL DEFAULT NULL,
  `updated_date` DATE NULL DEFAULT NULL,
  `phone_number` VARCHAR(25) NULL DEFAULT NULL,
  `work_phone` VARCHAR(25) NULL DEFAULT NULL,
  `mobile_number` VARCHAR(25) NULL DEFAULT NULL,
  `activation` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  INDEX `fk_address_status_id` (`status_id` ASC),
  INDEX `fk_activation_id_idx` (`activation` ASC),
  CONSTRAINT `fk_activation_id`
    FOREIGN KEY (`activation`)
    REFERENCES `office`.`lookup_dtl` (`lookup_dtl_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_address_status_id`
    FOREIGN KEY (`status_id`)
    REFERENCES `office`.`lookup_dtl` (`lookup_dtl_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `office`.`attendancedetails`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `office`.`attendancedetails` (
  `Attendance_Details_Id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL,
  `Date_of_Day` DATE NOT NULL,
  `PresentAbsent` BIT(1) NOT NULL DEFAULT b'0',
  `entry_time` DATETIME NULL DEFAULT NULL,
  `exit_time` DATETIME NULL DEFAULT NULL,
  `over_time` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`Attendance_Details_Id`, `user_id`),
  INDEX `index` (`Date_of_Day` ASC, `PresentAbsent` ASC),
  CONSTRAINT `user_attendance`
    FOREIGN KEY (`Attendance_Details_Id`)
    REFERENCES `office`.`users` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `office`.`groups`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `office`.`groups` (
  `group_id` INT(11) NOT NULL AUTO_INCREMENT,
  `group_name` VARCHAR(75) NOT NULL,
  `created_by` INT(11) NULL DEFAULT NULL,
  `updated_by` INT(11) NULL DEFAULT NULL,
  `effective_date` DATE NOT NULL,
  `expiry_date` DATE NULL DEFAULT NULL,
  `created_date` DATE NULL DEFAULT NULL,
  `updated_date` DATE NULL DEFAULT NULL,
  `group_code` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`group_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `office`.`leave`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `office`.`leave` (
  `leave_id` INT(11) NOT NULL AUTO_INCREMENT,
  `month_of_month` VARCHAR(45) NOT NULL,
  `total_leave` INT(11) NOT NULL,
  `taken_leave` INT(11) NOT NULL DEFAULT '0',
  `remaining_leave` INT(11) NOT NULL DEFAULT '0',
  `user_id` INT(11) NOT NULL,
  PRIMARY KEY (`leave_id`, `user_id`),
  INDEX `index` (`month_of_month` ASC),
  INDEX `fk_leave_user_id_idx` (`user_id` ASC),
  CONSTRAINT `fk_leave_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `office`.`users` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `office`.`permission`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `office`.`permission` (
  `permission_id` INT(11) NOT NULL AUTO_INCREMENT,
  `date_time_from` DATETIME NOT NULL,
  `date_time_to` DATETIME NOT NULL,
  `total_hours` INT(11) NOT NULL,
  `reson` TEXT NOT NULL,
  `permission_status` INT(11) NOT NULL,
  `remark` TEXT NOT NULL,
  `user_id` INT(11) NOT NULL,
  PRIMARY KEY (`permission_id`),
  INDEX `fk_user_idx` (`user_id` ASC),
  INDEX `fk_status_idx` (`permission_status` ASC),
  CONSTRAINT `fk_status`
    FOREIGN KEY (`permission_status`)
    REFERENCES `office`.`lookup_dtl` (`lookup_dtl_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `office`.`users` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `office`.`user_additional_info`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `office`.`user_additional_info` (
  `user_additional_info_id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL,
  `gender_id` INT(11) NOT NULL,
  `marital_status_id` INT(11) NOT NULL,
  `created_by` INT(11) NULL DEFAULT NULL,
  `updated_by` INT(11) NULL DEFAULT NULL,
  `created_date` DATETIME NULL DEFAULT NULL,
  `updated_date` DATETIME NULL DEFAULT NULL,
  `address_id` INT(11) NULL DEFAULT NULL,
  `salary` INT(11) NULL DEFAULT NULL,
  `otp_number` INT(11) NULL DEFAULT NULL,
  `otp_datetime` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`user_additional_info_id`),
  INDEX `fk_gender_id` (`gender_id` ASC),
  INDEX `fk_marital_status_id` (`marital_status_id` ASC),
  INDEX `idx_user_addtional_info` (`user_id` ASC),
  INDEX `idx_user_addtional_info_0` (`address_id` ASC),
  CONSTRAINT `fk_gender_id`
    FOREIGN KEY (`gender_id`)
    REFERENCES `office`.`lookup_dtl` (`lookup_dtl_id`),
  CONSTRAINT `fk_marital_status_id`
    FOREIGN KEY (`marital_status_id`)
    REFERENCES `office`.`lookup_dtl` (`lookup_dtl_id`),
  CONSTRAINT `fk_user_addtional_info_address`
    FOREIGN KEY (`address_id`)
    REFERENCES `office`.`address` (`address_id`),
  CONSTRAINT `fk_user_addtional_info_users`
    FOREIGN KEY (`user_id`)
    REFERENCES `office`.`users` (`user_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `office`.`user_device_detail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `office`.`user_device_detail` (
  `user_device_detail_id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL,
  `device_id` VARCHAR(30) NULL DEFAULT NULL,
  `device_token_key` VARCHAR(250) NULL DEFAULT NULL,
  `token_created_date` DATE NULL DEFAULT NULL,
  `platform` VARCHAR(10) NULL DEFAULT NULL,
  `availability` BIT(1) NULL DEFAULT NULL,
  `app_name` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`user_device_detail_id`),
  INDEX `fk_user_device_detail` (`user_id` ASC),
  CONSTRAINT `fk_user_device_detail`
    FOREIGN KEY (`user_id`)
    REFERENCES `office`.`users` (`user_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `office`.`user_groups`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `office`.`user_groups` (
  `user_detail_id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL,
  `group_id` INT(11) NULL DEFAULT NULL,
  `created_by` INT(20) NULL DEFAULT NULL,
  `updated_by` INT(20) NULL DEFAULT NULL,
  `created_date` DATE NULL DEFAULT NULL,
  `updated_date` DATE NULL DEFAULT NULL,
  `effective_date` DATE NULL DEFAULT NULL,
  `expiry_date` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`user_detail_id`),
  INDEX `idx_user_detail_1` (`group_id` ASC),
  INDEX `idx_user_detail` (`user_id` ASC),
  CONSTRAINT `fk_user_detail_groups`
    FOREIGN KEY (`group_id`)
    REFERENCES `office`.`groups` (`group_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_user_detail_users`
    FOREIGN KEY (`user_id`)
    REFERENCES `office`.`users` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
