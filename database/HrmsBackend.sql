-- This script was generated by a beta version of the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE public.ads
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    position_id integer NOT NULL,
    city_id integer NOT NULL,
    employer_id integer NOT NULL,
    min_salary integer NOT NULL,
    max_salary integer NOT NULL,
    position_amount integer NOT NULL,
    deadline integer NOT NULL,
    status boolean NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.cities
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    city_name character varying(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.employers
(
    user_id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    company_name character varying(50) NOT NULL,
    web_site character varying(30) NOT NULL,
    phone_no character varying(10) NOT NULL,
    id integer NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public.personnel
(
    user_id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    name character varying(30) NOT NULL,
    surname character varying(30) NOT NULL,
    id integer NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public.positions
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    position_name character varying(250) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.unemployeds
(
    user_id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    nationality_id character varying(11) NOT NULL,
    name character varying(50) NOT NULL,
    surname character varying(50) NOT NULL,
    birth_year integer NOT NULL,
    id integer NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public.users
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    email character varying(30) NOT NULL,
    password character varying(15) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.verifications
(
    user_id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    status boolean NOT NULL,
    id integer NOT NULL,
    PRIMARY KEY (user_id)
);

ALTER TABLE public.ads
    ADD FOREIGN KEY (city_id)
    REFERENCES public.cities (id)
    NOT VALID;


ALTER TABLE public.ads
    ADD FOREIGN KEY (employer_id)
    REFERENCES public.employers (user_id)
    NOT VALID;


ALTER TABLE public.ads
    ADD FOREIGN KEY (position_id)
    REFERENCES public.positions (id)
    NOT VALID;


ALTER TABLE public.employers
    ADD FOREIGN KEY (id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.employers
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.personnel
    ADD FOREIGN KEY (id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.personnel
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.unemployeds
    ADD FOREIGN KEY (id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.unemployeds
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.verifications
    ADD FOREIGN KEY (id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.verifications
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;

END;