PGDMP         -    	            y            veterinaryhairdresser    13.3    13.3     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    16615    veterinaryhairdresser    DATABASE     u   CREATE DATABASE veterinaryhairdresser WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Argentina.1252';
 %   DROP DATABASE veterinaryhairdresser;
                postgres    false            ?            1259    16657    appointment    TABLE     ?   CREATE TABLE public.appointment (
    id integer NOT NULL,
    date date,
    status_id integer,
    client_id integer,
    cut_type_id integer
);
    DROP TABLE public.appointment;
       public         heap    postgres    false            ?            1259    16652    client    TABLE     ?   CREATE TABLE public.client (
    id integer NOT NULL,
    name character varying(100),
    lastname character varying(100),
    adress character varying(100),
    phone character varying(100)
);
    DROP TABLE public.client;
       public         heap    postgres    false            ?            1259    16622    cut_type    TABLE     ?   CREATE TABLE public.cut_type (
    id integer NOT NULL,
    name character varying(100),
    description character varying(500)
);
    DROP TABLE public.cut_type;
       public         heap    postgres    false            ?            1259    16637    pet    TABLE     ?   CREATE TABLE public.pet (
    id integer NOT NULL,
    pet_type_id integer,
    size_id integer,
    comments character varying(100),
    name character varying(100)
);
    DROP TABLE public.pet;
       public         heap    postgres    false            ?            1259    16632    pet_type    TABLE     [   CREATE TABLE public.pet_type (
    id integer NOT NULL,
    name character varying(100)
);
    DROP TABLE public.pet_type;
       public         heap    postgres    false            ?            1259    16627    size    TABLE        CREATE TABLE public.size (
    id integer NOT NULL,
    name character varying(100),
    description character varying(100)
);
    DROP TABLE public.size;
       public         heap    postgres    false            ?            1259    16617    status    TABLE     ?   CREATE TABLE public.status (
    id integer NOT NULL,
    name character varying(100),
    description character varying(100)
);
    DROP TABLE public.status;
       public         heap    postgres    false            ?          0    16657    appointment 
   TABLE DATA           R   COPY public.appointment (id, date, status_id, client_id, cut_type_id) FROM stdin;
    public          postgres    false    206   ?       ?          0    16652    client 
   TABLE DATA           C   COPY public.client (id, name, lastname, adress, phone) FROM stdin;
    public          postgres    false    205   	        ?          0    16622    cut_type 
   TABLE DATA           9   COPY public.cut_type (id, name, description) FROM stdin;
    public          postgres    false    201   ?        ?          0    16637    pet 
   TABLE DATA           G   COPY public.pet (id, pet_type_id, size_id, comments, name) FROM stdin;
    public          postgres    false    204   
#       ?          0    16632    pet_type 
   TABLE DATA           ,   COPY public.pet_type (id, name) FROM stdin;
    public          postgres    false    203   ?#       ?          0    16627    size 
   TABLE DATA           5   COPY public.size (id, name, description) FROM stdin;
    public          postgres    false    202   ?#       ?          0    16617    status 
   TABLE DATA           7   COPY public.status (id, name, description) FROM stdin;
    public          postgres    false    200   $       D           2606    16656    client client_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.client
    ADD CONSTRAINT client_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.client DROP CONSTRAINT client_pkey;
       public            postgres    false    205            <           2606    16626    cut_type cut_type_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.cut_type
    ADD CONSTRAINT cut_type_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.cut_type DROP CONSTRAINT cut_type_pkey;
       public            postgres    false    201            B           2606    16641    pet pet_pkey 
   CONSTRAINT     J   ALTER TABLE ONLY public.pet
    ADD CONSTRAINT pet_pkey PRIMARY KEY (id);
 6   ALTER TABLE ONLY public.pet DROP CONSTRAINT pet_pkey;
       public            postgres    false    204            @           2606    16636    pet_type pet_type_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.pet_type
    ADD CONSTRAINT pet_type_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.pet_type DROP CONSTRAINT pet_type_pkey;
       public            postgres    false    203            >           2606    16631    size size_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.size
    ADD CONSTRAINT size_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.size DROP CONSTRAINT size_pkey;
       public            postgres    false    202            :           2606    16621    status status_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.status
    ADD CONSTRAINT status_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.status DROP CONSTRAINT status_pkey;
       public            postgres    false    200            F           2606    16661    appointment turn_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.appointment
    ADD CONSTRAINT turn_pkey PRIMARY KEY (id);
 ?   ALTER TABLE ONLY public.appointment DROP CONSTRAINT turn_pkey;
       public            postgres    false    206            J           2606    16667    appointment client_id    FK CONSTRAINT     w   ALTER TABLE ONLY public.appointment
    ADD CONSTRAINT client_id FOREIGN KEY (client_id) REFERENCES public.client(id);
 ?   ALTER TABLE ONLY public.appointment DROP CONSTRAINT client_id;
       public          postgres    false    2884    205    206            K           2606    16672    appointment cut_type_id    FK CONSTRAINT     }   ALTER TABLE ONLY public.appointment
    ADD CONSTRAINT cut_type_id FOREIGN KEY (cut_type_id) REFERENCES public.cut_type(id);
 A   ALTER TABLE ONLY public.appointment DROP CONSTRAINT cut_type_id;
       public          postgres    false    201    206    2876            G           2606    16642    pet pet_type_id    FK CONSTRAINT     u   ALTER TABLE ONLY public.pet
    ADD CONSTRAINT pet_type_id FOREIGN KEY (pet_type_id) REFERENCES public.pet_type(id);
 9   ALTER TABLE ONLY public.pet DROP CONSTRAINT pet_type_id;
       public          postgres    false    2880    204    203            H           2606    16647    pet size_id    FK CONSTRAINT     i   ALTER TABLE ONLY public.pet
    ADD CONSTRAINT size_id FOREIGN KEY (size_id) REFERENCES public.size(id);
 5   ALTER TABLE ONLY public.pet DROP CONSTRAINT size_id;
       public          postgres    false    2878    204    202            I           2606    16662    appointment status_id    FK CONSTRAINT     w   ALTER TABLE ONLY public.appointment
    ADD CONSTRAINT status_id FOREIGN KEY (status_id) REFERENCES public.status(id);
 ?   ALTER TABLE ONLY public.appointment DROP CONSTRAINT status_id;
       public          postgres    false    206    200    2874            ?      x?????? ? ?      ?   r   x?3?t????L???H-J-.????t:?A! 1?(U?3/??$1?S???????????Ԍˈ?#?7?(?383??8??ӱ,5/3%Q!835? ?-,?,?????????Є+F??? ? ?      ?   o  x?}T?n1?u_? ȳI?\ҥY???{&y	??q??E????Xfɳ??A*-y????????*?4U?$U??)???āgvU?r_?wL???????k?&	J???yt3??EM^r??(?8??aKY??Q	??NU?(?[M??]???Er?Sfr??Iw?%???-?B?Z??at?x??d???~?M????IJ??sսv??U? ˯??X??????Y"b???6?.???GWʒ ??k|q???a??D>j??:BG`j?&?C?gJU???????#??W+????yo@竦uվ?..<??9?{$??KB?F???!??c?q?+kK#???????箐-Ŭ?y??ʃ:r=Κ@????g??n>??ti??g?j??.??;J ?ө?????iJ`gyqLҸϐ???ת??͊i??٧?G?\(-?????:ɝ???ħ?'??B?????V?0/d??+?
?@YlxΨB¤N?S??P?L?<??#???f?3?/???&O?w????Üj>??Α??_c67?I?x ?ʖ?}?Ȉ0u????O~j?FyB???,+??N?Q?LmQ???5??t???_e8pl-q2iͺ???a??`?K      ?   h   x?5̱?@?ڞ?O?L@??L???9?$?ѝ<Xf?b@? ????@/á?:?&Eӊm???@??,Ŋw4˺G??b#??f?ؤB??B?;2$??.2nΟ??O??#2      ?      x?3?H-*???2?tO,?1z\\\ B#!      ?   J   x?3?H-,M=?1_??1/371G!%U?$17(?P ??2??MM?L?ê,*?e??^?????MQ:D?+F??? 7)?      ?   ?   x?]?M
B1???)r???7????	m?BMi??ky?w1?Q\M?|??&L??i??1L?0Q??	[aɊ?]J??p I\)?????#??i?Y:?1??????:?z?@??r?T??D؇c???G5Q???~?q?t]?"?# <?F     