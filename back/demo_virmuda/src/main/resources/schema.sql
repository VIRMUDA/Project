USE db_virmuda;

CREATE TABLE IF NOT EXISTS wiki
(
  id INT AUTO_INCREMENT PRIMARY KEY,
  name varchar(50),
  birth varchar(50),
  agency varchar(50),
  group_name varchar(50),
  debut varchar(50),
  fandom varchar(50),
  mbti varchar(10),
  index_value varchar(50) UNIQUE
);

-- delimiter //

-- DROP PROCEDURE IF EXISTS proc_wiki_insert;

-- CREATE PROCEDURE proc_wiki_insert (
--   IN p_name varchar(50),
--   IN p_birth varchar(50),
--   IN p_agency varchar(50),
--   IN p_group_name varchar(50),
--   IN p_debut varchar(50),
--   IN p_fandom varchar(50),
--   IN p_mbti varchar(10),
--   IN p_index_value varchar(50)
-- )

-- BEGIN
--   INSERT INTO wiki (name, birth, agency, group_name, debut, fandom, mbti, index_value)
--   VALUES (p_name, p_birth, p_agency, p_group_name, p_debut, p_fandom, p_mbti, p_index_value);
-- END //

-- delimiter ;
