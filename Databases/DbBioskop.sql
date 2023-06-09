PGDMP     :    /    	            {            bioskop    14.7    15.1     
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    19198    bioskop    DATABASE     ~   CREATE DATABASE bioskop WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_Indonesia.1252';
    DROP DATABASE bioskop;
                postgres    false                        2615    2200    public    SCHEMA     2   -- *not* creating schema, since initdb creates it
 2   -- *not* dropping schema, since initdb creates it
                postgres    false                       0    0    SCHEMA public    ACL     Q   REVOKE USAGE ON SCHEMA public FROM PUBLIC;
GRANT ALL ON SCHEMA public TO PUBLIC;
                   postgres    false    4            �            1259    19207    films    TABLE     �   CREATE TABLE public.films (
    filmcode integer NOT NULL,
    filmname character varying(120),
    filmtayang character varying(120)
);
    DROP TABLE public.films;
       public         heap    postgres    false    4            �            1259    19206    films_filmcode_seq    SEQUENCE     �   CREATE SEQUENCE public.films_filmcode_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.films_filmcode_seq;
       public          postgres    false    212    4                       0    0    films_filmcode_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.films_filmcode_seq OWNED BY public.films.filmcode;
          public          postgres    false    211            �            1259    19221 	   schedules    TABLE     �   CREATE TABLE public.schedules (
    scheduleid integer NOT NULL,
    tgltayang date,
    jammulai time without time zone,
    jamselesai time without time zone,
    hargatiket character varying(120),
    filmcode integer
);
    DROP TABLE public.schedules;
       public         heap    postgres    false    4            �            1259    19220    schedules_scheduleid_seq    SEQUENCE     �   CREATE SEQUENCE public.schedules_scheduleid_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.schedules_scheduleid_seq;
       public          postgres    false    214    4                       0    0    schedules_scheduleid_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.schedules_scheduleid_seq OWNED BY public.schedules.scheduleid;
          public          postgres    false    213            �            1259    19232    seats    TABLE     e   CREATE TABLE public.seats (
    studioname character(1) NOT NULL,
    nomorkursi integer NOT NULL
);
    DROP TABLE public.seats;
       public         heap    postgres    false    4            �            1259    19200    users    TABLE     �   CREATE TABLE public.users (
    userid integer NOT NULL,
    username character varying(120),
    emailaddress character varying(120),
    password character varying(120)
);
    DROP TABLE public.users;
       public         heap    postgres    false    4            �            1259    19199    users_userid_seq    SEQUENCE     �   CREATE SEQUENCE public.users_userid_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.users_userid_seq;
       public          postgres    false    4    210                       0    0    users_userid_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.users_userid_seq OWNED BY public.users.userid;
          public          postgres    false    209            k           2604    19210    films filmcode    DEFAULT     p   ALTER TABLE ONLY public.films ALTER COLUMN filmcode SET DEFAULT nextval('public.films_filmcode_seq'::regclass);
 =   ALTER TABLE public.films ALTER COLUMN filmcode DROP DEFAULT;
       public          postgres    false    212    211    212            l           2604    19224    schedules scheduleid    DEFAULT     |   ALTER TABLE ONLY public.schedules ALTER COLUMN scheduleid SET DEFAULT nextval('public.schedules_scheduleid_seq'::regclass);
 C   ALTER TABLE public.schedules ALTER COLUMN scheduleid DROP DEFAULT;
       public          postgres    false    213    214    214            j           2604    19203    users userid    DEFAULT     l   ALTER TABLE ONLY public.users ALTER COLUMN userid SET DEFAULT nextval('public.users_userid_seq'::regclass);
 ;   ALTER TABLE public.users ALTER COLUMN userid DROP DEFAULT;
       public          postgres    false    210    209    210                      0    19207    films 
   TABLE DATA           ?   COPY public.films (filmcode, filmname, filmtayang) FROM stdin;
    public          postgres    false    212   �                  0    19221 	   schedules 
   TABLE DATA           f   COPY public.schedules (scheduleid, tgltayang, jammulai, jamselesai, hargatiket, filmcode) FROM stdin;
    public          postgres    false    214   �                  0    19232    seats 
   TABLE DATA           7   COPY public.seats (studioname, nomorkursi) FROM stdin;
    public          postgres    false    215   P!                 0    19200    users 
   TABLE DATA           I   COPY public.users (userid, username, emailaddress, password) FROM stdin;
    public          postgres    false    210   u!                  0    0    films_filmcode_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.films_filmcode_seq', 1, false);
          public          postgres    false    211                       0    0    schedules_scheduleid_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.schedules_scheduleid_seq', 1, false);
          public          postgres    false    213                       0    0    users_userid_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.users_userid_seq', 1, false);
          public          postgres    false    209            p           2606    19212    films films_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.films
    ADD CONSTRAINT films_pkey PRIMARY KEY (filmcode);
 :   ALTER TABLE ONLY public.films DROP CONSTRAINT films_pkey;
       public            postgres    false    212            r           2606    19226    schedules schedules_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.schedules
    ADD CONSTRAINT schedules_pkey PRIMARY KEY (scheduleid);
 B   ALTER TABLE ONLY public.schedules DROP CONSTRAINT schedules_pkey;
       public            postgres    false    214            t           2606    19236    seats seats_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.seats
    ADD CONSTRAINT seats_pkey PRIMARY KEY (studioname, nomorkursi);
 :   ALTER TABLE ONLY public.seats DROP CONSTRAINT seats_pkey;
       public            postgres    false    215    215            n           2606    19205    users users_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (userid);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    210            u           2606    19227    schedules fk_films_schedules    FK CONSTRAINT     �   ALTER TABLE ONLY public.schedules
    ADD CONSTRAINT fk_films_schedules FOREIGN KEY (filmcode) REFERENCES public.films(filmcode);
 F   ALTER TABLE ONLY public.schedules DROP CONSTRAINT fk_films_schedules;
       public          postgres    false    212    3184    214               2   x�340��pUp����NMI�KWI�R\����a�~~�h1z\\\ ��         F   x�]ʱ�0�:�%�?cK�1�"�W�!ѝN�\�uE'Gy�֣���C���x6����?Ǯaf7��            x�s�4�r�4����� 0�         ;   x�3400��K�K鹉�9z�����ũE�\�F��y��E� 5p�B#�=... �9S     