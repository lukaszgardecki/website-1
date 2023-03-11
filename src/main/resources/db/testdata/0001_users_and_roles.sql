insert into
    users (email, password)
values
    ('admin@example.com', '{noop}adminpass'),
    ('user@example.com', '{noop}userpass'),
    ('editor@example.com', '{noop}editorpass');

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