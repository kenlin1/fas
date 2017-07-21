INSERT INTO `fas`.`fas_sys_user` (`enabled`, `password`, `username`) VALUES ('', '1', 'user');
INSERT INTO `fas`.`fas_sys_user` (`enabled`, `password`, `username`) VALUES ('', '1', 'admin');
INSERT INTO `fas`.`fas_sys_user` (`enabled`, `password`, `username`) VALUES ('', '1', 'administrator');

INSERT INTO `fas`.`fas_sys_role` (`role_name`, `username`) VALUES ('ROLE_USER', 'user');
INSERT INTO `fas`.`fas_sys_role` (`role_name`, `username`) VALUES ('ROLE_ADMIN', 'admin');
INSERT INTO `fas`.`fas_sys_role` (`role_name`, `username`) VALUES ('ROLE_ADMIN', 'administrator');
INSERT INTO `fas`.`fas_sys_role` (`role_name`, `username`) VALUES ('ROLE_USER', 'admin');

