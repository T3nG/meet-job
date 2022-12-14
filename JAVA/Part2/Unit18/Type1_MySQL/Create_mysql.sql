CREATE DATABASE mydb;

USE mydb;

CREATE TABLE employee (
       num      char(6),
       name     char(8),
       sex      enum('F','M'),
       birth    date,
       age      tinyint,
       address  char(28)
);    

CREATE TABLE score (
       num     char(6),
       name    char(8),
       sex     enum('F','M'),
       chinese tinyint,
       english tinyint,
       math    tinyint,
	   PRIMARY KEY (num)
); 


CREATE TABLE city (
	city_code char (3) NOT NULL ,
	city_name char (10) NOT NULL ,
	PRIMARY KEY (city_code)
);

CREATE TABLE suppliers (
	supp_code char (3) NOT NULL ,
	supp_name char (15) NOT NULL ,
	city_code char (3) NOT NULL ,
	PRIMARY KEY (supp_code)
);

CREATE TABLE products (
	prod_num int NOT NULL ,
	supp_code char (3) NOT NULL ,
	description char (15) NOT NULL ,
	unit_price float NULL ,
	PRIMARY KEY (prod_num, supp_code)
);

CREATE TABLE dealers (
	distr_num int AUTO_INCREMENT NOT NULL ,
	boss_name char (16) NOT NULL ,
	company char (20) NOT NULL ,
	city_code char (3) NOT NULL ,
	address char (30) NOT NULL ,
	phone char (12) NOT NULL ,
	PRIMARY KEY (distr_num),
        FOREIGN KEY(city_code) REFERENCES city(city_code)
);

CREATE TABLE orders (
	order_num int AUTO_INCREMENT NOT NULL ,
	order_date date NOT NULL ,
	distr_num int NOT NULL ,
	paid_date date NULL ,
	paid_ok enum('Y','N'),
	PRIMARY KEY (order_num)
);

CREATE TABLE items (
	order_num int NOT NULL ,
	item_num int NOT NULL ,
	prod_num int NOT NULL ,
	supp_code char (3) NOT NULL ,
	quantity int NOT NULL ,
	subtotal float NOT NULL ,
	PRIMARY KEY (order_num, item_num )
);

CREATE TABLE temp (
       num     char(6),
       name    char(8),
       sex     enum('F','M'),
       birth   date,
       age     tinyint,
       address char(28)
); 

CREATE TABLE memberA (
       num      char(6),
       name     char(8),
       sex      enum('F','M'),
       address  char(28)
);

CREATE TABLE memberB (
       num      char(6),
       name     char(8),
       sex      enum('F','M'),
       address  char(28)
);

insert into city values("TPE", "�x�_��");
insert into city values("KAO", "������");
insert into city values("TPH", "�s�_��");
insert into city values("TYH", "��饫");
insert into city values("HCH", "�s�˿�");
insert into city values("MLH", "�]�߿�");
insert into city values("CHH", "���ƿ�");
insert into city values("YLH", "���L��");
insert into city values("JYH", "�Ÿq��");
insert into city values("PTH", "�̪F��");
insert into city values("ILH", "�y����");
insert into city values("HLH", "�Ὤ��");
insert into city values("TTH", "�x�F��");
insert into city values("PHH", "���");
insert into city values("NTH", "�n�뿤");
insert into city values("TCC", "�x����");
insert into city values("TNC", "�x�n��");
insert into city values("JYC", "�Ÿq��");
insert into city values("KLC", "�򶩥�");
insert into city values("HCC", "�s�˥�");

insert into suppliers values("HHT", "�o�����","TPE");
insert into suppliers values("CFC", "���׹q��","TYH");
insert into suppliers values("WCC", "޳����T","HCH");
insert into suppliers values("HFT", "�|����","TPE");
insert into suppliers values("HSC", "�s�ӹq��","TCH");
insert into suppliers values("FYC", "�I����T","TPH");
insert into suppliers values("HKC", "�M�d�q��","TPH");
insert into suppliers values("PRC", "�ʼ�q��","TPE");
insert into suppliers values("NKC", "��d�q��","TYH");

insert into products values (1,   "HSC", "�D���O",         2500);
insert into products values (1,   "HFT", "�D���O",         8000);
insert into products values (1,   "HHT", "�D���O",         4500);
insert into products values (2,   "HSC", "��Ū�����о�",   1260);
insert into products values (3,   "HFT", "�i�N�������о�", 2400);
insert into products values (4,   "HFT", "�����B�z��",     9600);
insert into products values (4,   "HSC", "�����B�z��",     4800);
insert into products values (5,   "WCC", "�ƹ�",            280);
insert into products values (5,   "HHT", "�ƹ�",            250);
insert into products values (5,   "CFC", "�ƹ�",            200);
insert into products values (6,   "HHT", "��L",            360);
insert into products values (6,   "CFC", "��L",            480);
insert into products values (7,   "HSC", "17�T�ù�",       6000);
insert into products values (8,   "CFC", "19�T�ù�",       8400);
insert into products values (9,   "CFC", "10M�����d",       200);
insert into products values (101, "PRC", "100M�����d",      880);
insert into products values (101, "FYC", "100M�����d",      680);
insert into products values (102, "FYC", "60G�w���Ϻ�",    2200);
insert into products values (102, "PRC", "60G�w���Ϻ�",    4800);
insert into products values (103, "PRC", "3.5�T�n�о�",     200);
insert into products values (104, "PRC", "VGA�d",           580);
insert into products values (105, "PRC", "���ĥd",          530);
insert into products values (105, "FYC", "���ĥd",          800);
insert into products values (106, "PRC", "�q�������u",      230);
insert into products values (107, "PRC", "���r�n��",        700);
insert into products values (108, "FYC", "�@����",          450);
insert into products values (109, "PRC", "�ѽu",            300);
insert into products values (109, "FYC", "�ѽu",           2000);
insert into products values (110, "PRC", "14�T�ù�",       2360);
insert into products values (110, "CFC", "14�T�ù�",       2440);
insert into products values (110, "FYC", "14�T�ù�",       2280);
insert into products values (110, "HSC", "14�T�ù�",       2600);
insert into products values (110, "HFT", "14�T�ù�",       3080);
insert into products values (111, "FYC", "15�T�ù�",       4990);
insert into products values (112, "FYC", "15�T�ù�",       5490);
insert into products values (113, "FYC", "15�T�ù�",       6850);
insert into products values (114, "PRC", "�q����",         1200);
insert into products values (201, "NKC", "�����",          380);
insert into products values (201, "CFC", "�����",          750);
insert into products values (201, "HKC", "�����",          900);
insert into products values (200, "NKC", "�ƾھ�",         1740);
insert into products values (202, "HKC", "�L�u�����d",     2300);
insert into products values (203, "NKC", "21�T�ù�",       6700);
insert into products values (204, "HKC", "�q�l�u",          450);
insert into products values (205, "NKC", "40G�w���Ϻ�",    3120);
insert into products values (205, "CFC", "40G�w���Ϻ�",    3120);
insert into products values (205, "HSC", "40G�w���Ϻ�",    3120);
insert into products values (301, "NKC", "�I�}���L���",    970);
insert into products values (301, "HSC", "�I�}���L���",    420);
insert into products values (301, "FYC", "�I�}���L���",   1020);
insert into products values (301, "PRC", "�I�}���L���",    750);
insert into products values (301, "HKC", "�I�}���L���",    870);
insert into products values (301, "CFC", "�I�}���L���",    950);
insert into products values (302, "HSC", "��L�౵�Y",       60);
insert into products values (302, "HKC", "��L�౵�Y",       50);
insert into products values (303, "PRC", "���Ф�",          480);
insert into products values (303, "HKC", "���Ф�",          360);
insert into products values (304, "CFC", "20G�w���Ϻ�",    1700);
insert into products values (304, "HSC", "20G�w���Ϻ�",    2800);
insert into products values (305, "HSC", "�ǯu��",          480);
insert into products values (306, "PRC", "10G�w���Ϻ�",    1600);
insert into products values (306, "FYC", "10G�w���Ϻ�",    1900);
insert into products values (307, "PRC", "25G�w���Ϻ�",    2800);
insert into products values (309, "PRC", "�վ�",            400);
insert into products values (309, "FYC", "�վ�",            400);
insert into products values (310, "FYC", "���c",            800);
insert into products values (310, "CFC", "���c",            840);
insert into products values (311, "FYC", "�ƹ���",          480);
insert into products values (312, "FYC", "ISDN�d",          960);
insert into products values (312, "HSC", "ISDN�d",          720);
insert into products values (313, "FYC", "UPS",             600);
insert into products values (313, "CFC", "UPS",             600);

insert into dealers values (1001, "������", "���S�q��", "TPE",
"�򶩸�2�q13����3", "0229178129");
insert into dealers values (NULL, "���i��", "�������", "TPE",
"�_���n��2�q83��12��", "0223588450");
insert into dealers values (NULL, "�i����", "�ȳ��q��", "TPE",
"�n�ʪF��1�q25��9��", "0229826543");
insert into dealers values (NULL, "�i�ө�", "�ӪY��T", "TPE",
"��s��3�q310��12��8����4", "0227816590");
insert into dealers values (NULL, "�i�E��", "�ǦL�q��", "TPE",
"�n�ʪF��4�q50����3", "0227111029");
insert into dealers values (NULL, "�L��W", "�i�M��T", "TPE",
"���v�F��6�q207��", "0229312954");
insert into dealers values (NULL, "�L����", "�q�����", "TPE",
"������2�q203��11��", "0227738793");
insert into dealers values (NULL, "�L���i", "�s�{�q��", "TPE",
"�v�j��184��", "0223675806");
insert into dealers values (NULL, "�P�ӵo", "�N�ά��", "TPE",
"�����F��1�q85����12", "0227817894");
insert into dealers values (NULL, "�P����", "�ؿ���T", "TPE",
"���K��172��8��", "0225422348");
insert into dealers values (NULL, "�P�t�L", "������~", "TPE",
"���q��235��42��", "0228673214");
insert into dealers values (NULL, "�����Z", "�H�����", "TPE",
"���ƥ_��185��5��", "0229315389");
insert into dealers values (NULL, "���^��", "�O�ؤu�~", "TPE",
"�M���F��2�q121��3��", "0229872154");
insert into dealers values (NULL, "�]�@��", "�U����T", "TPE",
"���ص�86��", "0223814024");
insert into dealers values (NULL, "�d�a��", "�إ\�q��", "TPE",
"���R��2�q71��5��", "0225439875");
insert into dealers values (NULL, "�G����", "�����", "TPE",
"�N�L��142��1��6��", "0227219204");
insert into dealers values (NULL, "������", "�ҥ��q��", "TPE",
"�C�{�n��1�q27��", "0228549310");
insert into dealers values (NULL, "�����M", "�þl��T", "TPE",
"���w�F��2�q81��", "0226549812");
insert into dealers values (NULL, "���R��", "������", "TPH",
"ù���ָ�3�q200��12��", "0225642319");
insert into dealers values (NULL, "���H�w", "�Ѫe��T", "TYH",
"�v����2�q97��", "036549812" );
insert into dealers values (NULL, "�����q", "�n����~", "ILH",
"�I�j��2�q14��34��", "033456129" );
insert into dealers values (NULL, "���ߩ�", "�Q�B��T", "TPH",
"�s����2�q54��2��", "0227868567");
insert into dealers values (NULL, "���Ť�", "�ɨΥ��~", "HCH",
"�إ\��34��4��", "033917534" );
insert into dealers values (NULL, "���s��", "�`�ݸ�T", "TNC",
"�j�Ǹ�54��3��", "062732853" );
insert into dealers values (NULL, "������", "��L�T��", "KAO",
"���s��1�q87��5��", "077269876" );
insert into dealers values (NULL, "�x����", "������", "TCC",
"�ذ�_���@�q110��", "042876436" );
insert into dealers values (NULL, "���~�v", "���j���~", "CHH",
"�n����3�q189��12��", "027166697" );

insert into orders values (101, "2012/05/20", 1004, "2012/07/22",'Y');
insert into orders values (NULL, "2012/05/21", 1001, "2012/06/03",'Y');
insert into orders values (NULL, "2012/05/22", 1004, "2012/06/14",'Y');
insert into orders values (NULL, "2012/05/22", 1006, NULL,'N'        );
insert into orders values (NULL, "2012/05/24", 1016, "2012/06/21",'Y');
insert into orders values (NULL, "2012/05/30", 1012, NULL,'N'        );
insert into orders values (NULL, "2012/05/31", 1017, NULL,'N'        );
insert into orders values (NULL, "2012/06/07", 1010, "2012/07/21",'Y');
insert into orders values (NULL, "2012/06/14", 1011, "2012/08/21",'N');
insert into orders values (NULL, "2012/06/17", 1015, "2012/08/22",'N');
insert into orders values (NULL, "2012/06/18", 1004, "2012/08/29",'Y');
insert into orders values (NULL, "2012/06/18", 1017, NULL,'N'        );
insert into orders values (NULL, "2012/06/23", 1004, "2012/07/31",'N');
insert into orders values (NULL, "2012/06/25", 1006, "2012/07/10",'N');
insert into orders values (NULL, "2012/06/27", 1010, "2012/08/31",'N');
insert into orders values (NULL, "2012/06/29", 1019, NULL,'N'        );
insert into orders values (NULL, "2012/07/09", 1020, NULL,'N'        );
insert into orders values (NULL, "2012/07/10", 1021, "2012/08/06",'Y');

insert into items values (101, 1, 1,   "HSC", 1,  2500);
insert into items values (102, 1, 4,   "HFT", 1,  9600);
insert into items values (102, 2, 3,   "HFT", 1,  2400);
insert into items values (103, 1, 9,   "CFC", 1,   200);
insert into items values (103, 2, 8,   "CFC", 1,  8400);
insert into items values (103, 3, 5,   "CFC", 5,  1000);
insert into items values (104, 1, 1,   "HSC", 1,  2500);
insert into items values (104, 2, 2,   "HSC", 1,  1260);
insert into items values (104, 3, 3,   "HFT", 1,  2400);
insert into items values (104, 4, 1,   "HFT", 1,  8000);
insert into items values (105, 1, 5,   "WCC", 10, 28000);
insert into items values (105, 2, 5,   "CFC", 10, 19800);
insert into items values (105, 3, 6,   "HHT", 1,   360);
insert into items values (105, 4, 6,   "CFC", 1,    80);
insert into items values (106, 1, 5,   "HHT", 5,  1250);
insert into items values (106, 2, 5,   "WCC", 5,  1400);
insert into items values (106, 3, 5,   "CFC", 5,  1000);
insert into items values (106, 4, 6,   "HHT", 1,   360);
insert into items values (106, 5, 6,   "CFC", 1,   480);
insert into items values (107, 1, 1,   "HSC", 1,  2500);
insert into items values (107, 2, 2,   "HSC", 1,  1260);
insert into items values (107, 3, 3,   "HFT", 1,  2400);
insert into items values (107, 4, 4,   "HSC", 1,  4800);
insert into items values (107, 5, 7,   "HSC", 1,  6000);
insert into items values (108, 1, 8,   "CFC", 1,  8400);
insert into items values (108, 2, 9,   "CFC", 5,  1000);
insert into items values (109, 1, 1,   "HHT", 1,  4500);
insert into items values (110, 1, 6,   "HHT", 1,   360);
insert into items values (110, 2, 6,   "CFC", 1,   480);
insert into items values (111, 1, 5,   "CFC", 5,  1000);
insert into items values (112, 1, 8,   "CFC", 1,  840);
insert into items values (112, 2, 9,   "CFC", 10, 200);
insert into items values (113, 1, 5,   "CFC", 1,  200);
insert into items values (113, 2, 6,   "HHT", 1,  360);
insert into items values (113, 3, 6,   "CFC", 1,  480);
insert into items values (113, 4, 9,   "CFC", 2,  400);
insert into items values (114, 1, 4,   "HFT", 1,  960);
insert into items values (114, 2, 4,   "HSC", 1,  480);
insert into items values (115, 1, 1,   "HHT", 1,  450);
insert into items values (116, 1, 101, "FYC", 2,  136);
insert into items values (116, 2, 109, "PRC", 3,   90);
insert into items values (116, 3, 110, "HFT", 1,  308);
insert into items values (116, 4, 114, "PRC", 1,  120);
insert into items values (117, 1, 201, "NKC", 4,  152);
insert into items values (117, 2, 202, "HKC", 1,  230);
insert into items values (117, 3, 301, "FYC", 2,  204);
insert into items values (118, 1, 307, "PRC", 2,  500);
insert into items values (118, 2, 302, "HKC", 3,   15);
insert into items values (118, 3, 110, "PRC", 1,  236);
insert into items values (118, 4, 5,   "HHT", 4,  100);
insert into items values (118, 5, 304, "HSC", 1,  280);

insert into employee values(
"000009","���ɤ�",'M',"1961/10/07",43,"�x�n�����ưϭX�ި�100��3��");
insert into employee values(
"000007","������",'F',"1975/02/06",29,"�������e���200��");
insert into employee values(
"000012","���q�f",'F',"1974/11/20",30,"�x�_���n�ʪF���@�q218��");
insert into employee values(
"000004","���Q��",'F',"1973/08/29",31,"�x�n���¨��Ϥ�����59��");
insert into employee values(
"000014","���ɷ�",'F',"1972/12/10",32,"�x�n�����ưϥ��v��89��");
insert into employee values(
"000010","�����",'F',"1966/10/17",38,"�����������|��112��");
insert into employee values(
"000019","���ջ�",'M',"1971/02/03",33,"�x�_���j����102��3��");
insert into employee values(
"000002","������",'F',"1971/05/28",33,"�x�n���ժe�ϤT����192��");
insert into employee values(
"000015","���Q��",'F',"1959/10/19",45,"�x�n���n�ưϤ�����9��");
insert into employee values(
"000013","���^��",'M',"1970/07/26",34,"�x�n�����w�ϳӧQ��116��");
insert into employee values(
"000020","�G�Q��",'F',"1969/09/18",35,"�s�_�����M�Ϥ��s��177��");
insert into employee values(
"000017","�����s",'M',"1968/01/30",36,"�x�_������Ϥ�����G�q5��");
insert into employee values(
"000005","������",'M',"1966/11/06",38,"�n�뿤�_���3��");
insert into employee values(
"000001","�i�j��",'M',"1972/06/23",32,"�x�n������Ϥ�����18����2");
insert into employee values(
"000016","���Q��",'F',"1964/06/16",40,"�x�_���س���10��");
insert into employee values(
"000006","�i�ɩ�",'M',"1964/07/25",40,"�������e���28��1��");
insert into employee values(
"000003","�����|",'M',"1956/02/28",48,"�x�n���w�n�ϩ��e��90��2��");
insert into employee values(
"000008","���p��",'M',"1961/09/09",43,"�x�_���h�L�Ϥp�_��21��");
insert into employee values(
"000011","�i�ɭ�",'M',"1957/04/19",47,"���������˰ϥ��v��89��");
insert into employee values(
"000018","������",'M',"1973/03/30",31,"�x�_���ѥ��I�Q�@��5��8��");

insert into score values ("812001","�i�j��",'M',80,90,60);
insert into score values ("812002","������",'F',95,80,70);
insert into score values ("812003","�����|",'M',75,70,85);
insert into score values ("812004","���Q��",'F',90,74,70);
insert into score values ("812005","������",'M',65,88,67);
insert into score values ("812006","�i�T��",'M',86,61,74);
insert into score values ("812007","������",'F',84,78,94);
insert into score values ("812008","���p��",'M',71,60,83);
insert into score values ("812009","���ɤ�",'M',92,65,73);
insert into score values ("812010","�����",'F',88,69,69);

insert into memberA values(
"000009","���ɤ�",'M',"�x�n�����ưϭX�ި�100��3��");
insert into memberA values(
"000007","������",'F',"�������e���200��");
insert into memberA values(
"000012","���q�f",'F',"�x�_���n�ʪF���@�q218��");
insert into memberA values(
"000004","���Q��",'F',"�x�n���¨��Ϥ�����59��");
insert into memberA values(
"000014","���ɷ�",'F',"�x�n�����ưϥ��v��89��");
insert into memberA values(
"000010","�����",'F',"�����������|��112��");
insert into memberB values(
"000004","���Q��",'F',"�x�n���¨��Ϥ�����59��");
insert into memberB values(
"000014","���ɷ�",'F',"�x�n�����ưϥ��v��89��");
insert into memberB values(
"000010","�����",'F',"�����������|��112��");
insert into memberB values(
"000019","�i�ջ�",'M',"�_���j����102��3��");
insert into memberB values(
"000002","������",'F',"�x�n������ϥúָ��@�q192��");
insert into memberB values(
"000015","���Q��",'F',"�x�n���n�ưϤ�����9��");
