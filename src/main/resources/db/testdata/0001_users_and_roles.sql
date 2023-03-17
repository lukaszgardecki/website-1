insert into
    users (email, password)
values
            -- superadmin@example.com / password: hard
    ('superadmin@example.com', '{bcrypt}$2a$10$0ov01uvgr.hLdc/oUHq9Jutf7TKZtf/L6TiiBTOSbmypdxrKeoonu'),
            -- john@example.com / password: johny
    ('john@example.com', '{MD5}{GyLInLoX03MajRVheXYIzg1fsn14SKMEM8TcyyBp//U=}5e5142cb3af6fa042ca66fe29b1b1b43'),
            -- big_lover@example.com / password: pass
    ('big_lover@example.com', '{argon2}$argon2id$v=19$m=16384,t=2,p=1$jQvZNs3K2YQFk3rJcc9R2A$n+KdsDGVUAu7SPnwktvd+K7M4FVOFPCdScSmH4jScAk');

insert into
    user_role (name, description)
values
    ('ADMIN', 'pe�ne uprawnienia'),
    ('USER', 'podstawowe uprawnienia, mo�liwo�� oddawania g�os�w'),
    ('EDITOR', 'podstawowe uprawnienia + mo�liwo�� zarz�dzania tre�ciami');

insert into
    user_roles (user_id, role_id)
values
    (1, 1),
    (2, 2),
    (3, 3);