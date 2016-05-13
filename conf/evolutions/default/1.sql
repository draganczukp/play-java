# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

CREATE TABLE `article` (
  `id` bigint(20) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `author_id` bigint(20) NOT NULL,
  `views` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `login` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `role` varchar(6) DEFAULT NULL,
  `join_date` datetime(6) DEFAULT NULL,
  `file_path` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


ALTER TABLE `article`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ix_article_author_id` (`author_id`);

ALTER TABLE `play_evolutions`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `article`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

ALTER TABLE `article`
  ADD CONSTRAINT `fk_article_author_id` FOREIGN KEY (`author_id`) REFERENCES `user` (`id`);

# --- !Downs

alter table article drop foreign key fk_article_author_id;
drop index ix_article_author_id on article;

drop table if exists article;

drop table if exists user;

