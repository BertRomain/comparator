INSERT INTO `favorite_db`.`size` (`label`) VALUES ('XS');
INSERT INTO `favorite_db`.`size` (`label`) VALUES ('S');
INSERT INTO `favorite_db`.`size` (`label`) VALUES ('M');
INSERT INTO `favorite_db`.`size` (`label`) VALUES ('L');
INSERT INTO `favorite_db`.`size` (`label`) VALUES ('XL');
INSERT INTO `favorite_db`.`size` (`label`) VALUES ('XXL');
INSERT INTO `favorite_db`.`size` (`label`) VALUES ('34');
INSERT INTO `favorite_db`.`size` (`label`) VALUES ('36');
INSERT INTO `favorite_db`.`size` (`label`) VALUES ('38');
INSERT INTO `favorite_db`.`size` (`label`) VALUES ('40');
INSERT INTO `favorite_db`.`size` (`label`) VALUES ('42');
INSERT INTO `favorite_db`.`size` (`label`) VALUES ('44');
INSERT INTO `favorite_db`.`city` (`id`, `name`, `zip_code`) VALUES ('1', 'Bordeaux', '33000');
INSERT INTO `favorite_db`.`city` (`id`, `name`, `zip_code`) VALUES ('2', 'Avignon', '84000');
INSERT INTO `favorite_db`.`city` (`id`, `name`, `zip_code`) VALUES ('3', 'Lyon', '69000');
INSERT INTO `favorite_db`.`design_type` (`label`) VALUES ('broderie');
INSERT INTO `favorite_db`.`design_type` (`label`) VALUES ('autocollant');
INSERT INTO `favorite_db`.`design_type` (`label`) VALUES ('dessin');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('1', 'descri bleu droite', 'BLEU_DROITE.png');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('2', 'descri bleu gauche', 'BLEU_GAUCHE.png');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('3', 'descri combas detail 1', 'COMBAS_DETAIL1.jpg');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('4', 'descri combas detail 2', 'COMBAS_DETAIL2.jpg');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('5', 'descri combas droite', 'COMBAS_DROITE.jpg');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('6', 'descri combas gauche', 'COMBAS_GAUCHE.jpg');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('7', 'descri vareuse jap detail 1', 'DETAILS_VAREUSE JAP_1.png');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('8', 'descri vareuse jap edtail 2', 'DETAILS_VAREUSE JAP_2.png');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('9', 'descri maryan detail 1', 'MARYAN_DETAILS_1.png');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('10', 'descri maryan detail 2', 'MARYAN_DETAILS_2.png');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('11', 'descri maryan droite', 'MARYAN_DROITE.jpg');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('12', 'descri maryan gauche', 'MARYAN_GAUCHE.jpg');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('13', 'descri sputnik detail 1', 'SPUTNIK_DETAILS_1.png');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('14', 'descri sputnik detail 2', 'SPUTNIK_DETAILS_2.png');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('15', 'descri sputnik droit', 'SPUTNIK_DROITE.jpg');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('16', 'descri sputnik gauche', 'SPUTNIK_GAUCHE.jpg');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('17', 'descri szafran droite', 'SZAFRAN_DROITE.jpg');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('18', 'descri szafran gauche', 'SZAFRAN_GAUCHE.jpg');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('19', 'descri vareuse jap droite', 'VAREUSEJAP_DROITE.png');
INSERT INTO `favorite_db`.`photo` (`id`, `description`, `path`) VALUES ('20', 'descri vareuse jap gauche', 'VAREUSEJAP_GAUCHE.png');
INSERT INTO `favorite_db`.`gender` (`id`, `name`) VALUES ('1', 'femme');
INSERT INTO `favorite_db`.`gender` (`id`, `name`) VALUES ('2', 'homme');
INSERT INTO `favorite_db`.`gender` (`id`, `name`) VALUES ('3', 'autre');
INSERT INTO `favorite_db`.`user_type` (`id`, `name`) VALUES ('1', 'gérant');
INSERT INTO `favorite_db`.`user_type` (`id`, `name`) VALUES ('2', 'administrateur');
INSERT INTO `favorite_db`.`user_type` (`id`, `name`) VALUES ('3', 'client');
INSERT INTO `favorite_db`.`status` (`id`, `name`) VALUES ('1', 'en attente');
INSERT INTO `favorite_db`.`status` (`id`, `name`) VALUES ('2', 'validée');
INSERT INTO `favorite_db`.`status` (`id`, `name`) VALUES ('3', 'envoyée');
INSERT INTO `favorite_db`.`status` (`id`, `name`) VALUES ('4', 'reçue');
INSERT INTO `favorite_db`.`status` (`id`, `name`) VALUES ('5', 'retour-renvoyée');
INSERT INTO `favorite_db`.`status` (`id`, `name`) VALUES ('6', 'retournée');
INSERT INTO `favorite_db`.`pay_mode` (`id`, `name`) VALUES ('1', 'Carte Bleue');
INSERT INTO `favorite_db`.`pay_mode` (`id`, `name`) VALUES ('2', 'Chèque');
INSERT INTO `favorite_db`.`pay_mode` (`id`, `name`) VALUES ('3', 'Virement');
INSERT INTO `favorite_db`.`vat` (`id`, `rate`) VALUES ('1', '0.2');
INSERT INTO `favorite_db`.`vat` (`id`, `rate`) VALUES ('2', '0.15');
INSERT INTO `favorite_db`.`vat` (`id`, `rate`) VALUES ('3', '0.055');
INSERT INTO `favorite_db`.`vat` (`id`, `rate`) VALUES ('4', '0.021');
INSERT INTO `favorite_db`.`vat` (`id`, `rate`) VALUES ('5', '0.0');
INSERT INTO `favorite_db`.`product_type` (`name`) VALUES ('t-shirt');
INSERT INTO `favorite_db`.`product_type` (`name`) VALUES ('chemise');
INSERT INTO `favorite_db`.`product_type` (`name`) VALUES ('veste');
INSERT INTO `favorite_db`.`product_type` (`name`) VALUES ('pull');
INSERT INTO `favorite_db`.`product_type` (`name`) VALUES ('pantalon');
INSERT INTO `favorite_db`.`product_type` (`name`) VALUES ('jean');
INSERT INTO `favorite_db`.`product_type` (`name`) VALUES ('accessoire');
INSERT INTO `favorite_db`.`product` (`id`, `name`, `price`, `quantity`, `ref_creation_date`, `ref_deletion_date`, `reference`, `product_type_name`) VALUES ('1', 'Bleu', '49.99', '14', '2021-01-01', '2021-03-01', 'bleu0001', 'veste');
INSERT INTO `favorite_db`.`product` (`id`, `name`, `price`, `quantity`, `ref_creation_date`, `reference`, `product_type_name`) VALUES ('2', 'Combas', '39.99', '4', '2021-01-01', 'combas0002', 'veste');
INSERT INTO `favorite_db`.`product` (`id`, `name`, `price`, `quantity`, `ref_creation_date`, `reference`, `product_type_name`) VALUES ('3', 'Maryan', '44.99', '15', '2021-02-01', 'maryan0003', 'veste');
INSERT INTO `favorite_db`.`product` (`id`, `name`, `price`, `quantity`, `ref_creation_date`, `reference`, `product_type_name`) VALUES ('4', 'Sputnik', '49.99', '2', '2021-02-01', 'sputnik0004', 'veste');
INSERT INTO `favorite_db`.`product` (`id`, `name`, `price`, `quantity`, `ref_creation_date`, `reference`, `product_type_name`) VALUES ('5', 'Szafran', '89.99', '1', '2021-02-01', 'szafran0005', 'veste');
INSERT INTO `favorite_db`.`product` (`id`, `name`, `price`, `quantity`, `ref_creation_date`, `reference`, `product_type_name`) VALUES ('6', 'Vareuse Jap', '25.99', '30', '2021-02-01', 'vareuse0006', 'chemise');
INSERT INTO `favorite_db`.`location` (`label`) VALUES ('centre avant');
INSERT INTO `favorite_db`.`location` (`label`) VALUES ('centre dos');
INSERT INTO `favorite_db`.`location` (`label`) VALUES ('epaule gauche');
INSERT INTO `favorite_db`.`location` (`label`) VALUES ('epaule droite');
INSERT INTO `favorite_db`.`location` (`label`) VALUES ('poche avant droite');
INSERT INTO `favorite_db`.`location` (`label`) VALUES ('poche avant gauche');
INSERT INTO `favorite_db`.`location` (`label`) VALUES ('poche arriere droite');
INSERT INTO `favorite_db`.`location` (`label`) VALUES ('poche arriere gauche');
INSERT INTO `favorite_db`.`location` (`label`) VALUES ('genou droit');
INSERT INTO `favorite_db`.`location` (`label`) VALUES ('genou gauche');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('1', 'centre avant', 't-shirt');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('2', 'centre dos', 't-shirt');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('3', 'epaule droite', 't-shirt');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('4', 'epaule gauche', 't-shirt');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('5', 'centre avant', 'chemise');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('6', 'centre dos', 'chemise');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('7', 'epaule droite', 'chemise');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('8', 'epaule gauche', 'chemise');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('9', 'centre avant', 'pull');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('10', 'centre dos', 'pull');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('11', 'epaule droite', 'pull');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('12', 'epaule gauche', 'pull');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('13', 'centre avant', 'veste');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('14', 'centre dos', 'veste');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('15', 'centre dos', 'veste');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('16', 'epaule gauche', 'veste');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('17', 'poche avant droite', 'jean');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('18', 'poche avant gauche', 'jean');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('19', 'poche arriere droite', 'jean');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('20', 'poche arriere gauche', 'jean');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('21', 'poche avant droite', 'pantalon');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('22', 'poche avant gauche', 'pantalon');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('23', 'poche arriere droite', 'pantalon');
INSERT INTO `favorite_db`.`product_type_location` (`id`, `location_label`, `product_type_name`) VALUES ('24', 'poche arriere gauche', 'pantalon');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('1', '2', '1', 'XS');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('2', '3', '1', '36');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('3', '3', '1', '38');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('4', '3', '1', '40');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('5', '3', '1', '42');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('6', '3', '1', '44');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('7', '0', '2', '34');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('8', '0', '2', '36');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('9', '2', '2', '38');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('10', '0', '2', '40');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('11', '1', '2', '42');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('12', '1', '2', '44');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('13', '1', '3', 'XS');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('14', '0', '3', 'S');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('15', '0', '3', 'M');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('16', '0', '3', 'L');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('17', '1', '3', 'XL');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('18', '0', '3', 'XXL');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('19', '1', '4', 'XS');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('20', '0', '4', 'S');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('21', '0', '4', 'M');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('22', '0', '4', 'L');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('23', '1', '4', 'XL');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('24', '0', '4', 'XXL');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('25', '1', '5', '34');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('26', '0', '5', '36');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('27', '0', '5', '38');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('28', '0', '5', '40');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('29', '0', '5', '42');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('30', '0', '5', '44');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('31', '5', '6', '34');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('32', '5', '6', '36');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('33', '5', '6', '38');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('34', '5', '6', '40');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('35', '5', '6', '42');
INSERT INTO `favorite_db`.`stock` (`id`, `quantity`, `product_id`, `size_label`) VALUES ('36', '5', '6', '44');
INSERT INTO `favorite_db`.`photos_products` (`product_id`, `photo_id`) VALUES ('9', '2');
INSERT INTO `favorite_db`.`user` (`id`, `email`, `login`, `password`, `subscribing_date`, `gender_id`, `user_type_id`) VALUES ('1', 'gerant@gmail.com', 'gerant', 'gerant', '2021-01-01', '2', '1');
INSERT INTO `favorite_db`.`user` (`id`, `email`, `login`, `password`, `subscribing_date`, `gender_id`, `user_type_id`) VALUES ('2', 'admin@gmail.com', 'admin', 'admin', '2021-01-01', '3', '2');
INSERT INTO `favorite_db`.`user` (`id`, `birth_date`, `email`, `login`, `name`, `password`, `phone_number`, `subscribing_date`, `surname`, `gender_id`, `user_type_id`) VALUES ('3', '1883-08-19', 'coco.chanel@gmail.com', 'coco', 'Chanel', 'coco', '01-02-03-04-05', '2021-02-01', 'Coco', '1', '3');
INSERT INTO `favorite_db`.`user` (`id`, `birth_date`, `email`, `login`, `name`, `password`, `phone_number`, `subscribing_date`, `surname`, `gender_id`, `user_type_id`) VALUES ('4', '1933-09-10', 'karl.lagerfeld@gmail.com', 'karl', 'Lagerfeld', 'karl', '02-03-04-05-06', '2021-02-03', 'Karl', '2', '3');
INSERT INTO `favorite_db`.`user` (`id`, `birth_date`, `email`, `login`, `name`, `password`, `phone_number`, `subscribing_date`, `surname`, `gender_id`, `user_type_id`) VALUES ('5', '1953-04-24', 'jeanpaul.gaultier@gmail.com', 'jeanpaul', 'Gaultier', 'jeanpaul', '03-04-05-06-07', '2021-02-04', 'Jean-Paul', '2', '3');
INSERT INTO `favorite_db`.`user` (`id`, `birth_date`, `email`, `login`, `name`, `password`, `phone_number`, `subscribing_date`, `surname`, `unsubscribing_date`, `gender_id`, `user_type_id`) VALUES ('6', '1905-01-21', 'christian.dior@gmail.com', 'christian', 'Dior', 'christian', '04-05-06-07-08', '2021-01-02', 'Christian', '2021-03-01', '2', '3');