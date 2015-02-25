-- Sample DB Schema for JdbcIdGenerator

-- MySQL sample: must use an table engine with transaction support (e.g. InnoDB)
-- table name: use any name you may like
-- column names: must be id_name and id_value
CREATE TABLE ddth_id (
    id_name                     VARCHAR(32)                         NOT NULL,
    id_value                    BIGINT                              NOT NULL DEFAULT 0,
    PRIMARY KEY (id_name)
) ENGINE=InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;


-- PostgreSQL sample:
-- table name: use any name you may like
-- column names: must be id_name and id_value
CREATE TABLE ddth_id (
    id_name                     VARCHAR(32)                         NOT NULL,
    id_value                    BIGINT                              NOT NULL DEFAULT 0,
    PRIMARY KEY (id_name)
);
