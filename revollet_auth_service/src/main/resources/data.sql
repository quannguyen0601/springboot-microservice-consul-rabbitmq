INSERT INTO privilege (code, name)
VALUES ("DELETE_USER","Delete wallet user"),("CREATE_USER","Create wallet user"),("CREATE_OPERATOR","Create operator user");

INSERT INTO role (code, name)
VALUES ("ADMIN","admin"),("OPERATOR","operator"),("WALLET_USER","wallet user");


INSERT INTO role_privilege (role_code, privilege_code)
VALUES ("ADMIN","CREATE_OPERATOR"),("ADMIN","CREATE_USER"),("ADMIN","DELETE_USER"), ("OPERATOR","CREATE_USER"),("OPERATOR","DELETE_USER");


INSERT INTO user (id, email, password, username, role_code, is_account_non_expired, is_account_non_locked, is_credentials_non_expired, is_enabled)
VALUES (1,"admin@gmail.com","$2a$10$JSV/Ex3SyZ89vFEY8o7i5eoHT.py9KQ8voywml4lO1ugdnPfFEhG.","admin","ADMIN",true,true,true,true),
       (2,"operator@gmail.com","$2a$10$JSV/Ex3SyZ89vFEY8o7i5eoHT.py9KQ8voywml4lO1ugdnPfFEhG.","operator","OPERATOR",true,true,true,true);