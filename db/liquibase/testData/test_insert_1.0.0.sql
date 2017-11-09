-- Это скрипт наката тестовых данных

-- [ all_users ]
INSERT INTO public.all_users(user_id, name, password) VALUES (1, 'Den', 'Den123');
INSERT INTO public.all_users(user_id, name, password) VALUES (2, 'Omar', 'Omar123');
INSERT INTO public.all_users(user_id, name, password) VALUES (3, 'Abraham', 'Abraham123');
INSERT INTO public.all_users(user_id, name, password) VALUES (4, 'Hamilton', 'Hamilton123');
INSERT INTO public.all_users(user_id, name, password) VALUES (5, 'Valarie', 'Valarie123');

-- [ roles ]
-- ROLE_ANONYMOUS : 1
-- ROLE_USER      : 2
-- ROLE_ADMIN     : 3
INSERT INTO public.roles(role_id, role) VALUES (1, 1);
INSERT INTO public.roles(role_id, role) VALUES (2, 2);
INSERT INTO public.roles(role_id, role) VALUES (3, 3);

-- [ all_users_roles ]
INSERT INTO public.all_users_roles(user_id, role_id) VALUES (1, 1);
INSERT INTO public.all_users_roles(user_id, role_id) VALUES (2, 2);
INSERT INTO public.all_users_roles(user_id, role_id) VALUES (3, 3);

-- [ links ]
INSERT INTO public.links(link_id, link, description, link_master) VALUES (1, 'https://youtu.be/7CtJUTJ0wjE?list=PL7HGoJDlGoPz-aOqAOLoT8UOi2FSdw-4R', 'король мортимер',1);
INSERT INTO public.links(link_id, link, description, link_master) VALUES (2, 'https://vk.com/video-57846937_456247043', 'жиза', 2);
INSERT INTO public.links(link_id, link, description, link_master) VALUES (3, 'http://hdgo.cc/video/t/tsl0e90bjebb6b7retuw12hp/352173/', 'друзья', 3);

-- [ lists ]
INSERT INTO public.lists(description, list_master) VALUES ('список фильмецов', 1);

-- [ links_lists ]
INSERT INTO public.links_lists(link_id, list_id) VALUES (1, 1);
INSERT INTO public.links_lists(link_id, list_id) VALUES (2, 1);
INSERT INTO public.links_lists(link_id, list_id) VALUES (3, 1);