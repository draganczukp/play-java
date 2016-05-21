# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table article (
  id                            bigint auto_increment not null,
  title                         varchar(255),
  content                       varchar(255),
  author_id                     bigint not null,
  views                         bigint,
  constraint pk_article primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  login                         varchar(255),
  password                      varchar(255),
  email                         varchar(255),
  role                          varchar(6),
  join_date                     datetime(6),
  file_path                     varchar(255),
  constraint ck_user_role check (role in ('editor','admin','user')),
  constraint pk_user primary key (id)
);

alter table article add constraint fk_article_author_id foreign key (author_id) references user (id) on delete restrict on update restrict;
create index ix_article_author_id on article (author_id);


# --- !Downs

alter table article drop foreign key fk_article_author_id;
drop index ix_article_author_id on article;

drop table if exists article;

drop table if exists user;

