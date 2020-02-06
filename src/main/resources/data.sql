INSERT INTO public.author
    (author_id, "name")
VALUES (1, 'Bogdan Leszczorz');
INSERT INTO public.author
    (author_id, "name")
VALUES (2, 'Marcin Pawlenka');
INSERT INTO public.author
    (author_id, "name")
VALUES (3, 'Damian Baran');
INSERT INTO public.author
    (author_id, "name")
VALUES (4, 'Aleksander Kluba');
INSERT INTO public.author
    (author_id, "name")
VALUES (5, 'Małgorzata Wawak');

INSERT INTO public.client
    (client_id, "name")
VALUES (1, 'Politechnika Gdańska');
INSERT INTO public.client
    (client_id, "name")
VALUES (2, 'SM Lazurowa');
INSERT INTO public.client
    (client_id, "name")
VALUES (3, 'Gmina Międzychód');
INSERT INTO public.client
    (client_id, "name")
VALUES (4, 'Art In Energy');
INSERT INTO public.client
    (client_id, "name")
VALUES (5, 'SMLW Energetyk');

INSERT INTO public.magazine
    (magazine_id, "name")
VALUES (1, 'Monitor Rynkowy');
INSERT INTO public.magazine
    (magazine_id, "name")
VALUES (2, 'Forum Biznesu');
INSERT INTO public.magazine
    (magazine_id, "name")
VALUES (3, 'Strefa Gospodarki');
INSERT INTO public.magazine
    (magazine_id, "name")
VALUES (4, 'Panorama Gospodarcza');
INSERT INTO public.magazine
    (magazine_id, "name")
VALUES (5, 'Quality Today');
INSERT INTO public.article
    (article_id, local_date, "size", author_id, client_id, magazine_id)
VALUES (1, '2020-01-30', 0.5, 1, 1, 1);
INSERT INTO public.article
    (article_id, local_date, "size", author_id, client_id, magazine_id)
VALUES (2, '2020-01-31', 0.25, 2, 3, 4);
INSERT INTO public.article
    (article_id, local_date, "size", author_id, client_id, magazine_id)
VALUES (3, '2020-01-31', 1, 4, 5, 2);
INSERT INTO public.article
    (article_id, local_date, "size", author_id, client_id, magazine_id)
VALUES (4, '2020-02-04', 0.75, 3, 3, 5);
INSERT INTO public.article
    (article_id, local_date, "size", author_id, client_id, magazine_id)
VALUES (5, '2020-02-05', 0.5, 2, 5, 3);

