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

insert into city values("TPE", "台北市");
insert into city values("KAO", "高雄市");
insert into city values("TPH", "新北市");
insert into city values("TYH", "桃園市");
insert into city values("HCH", "新竹縣");
insert into city values("MLH", "苗栗縣");
insert into city values("CHH", "彰化縣");
insert into city values("YLH", "雲林縣");
insert into city values("JYH", "嘉義縣");
insert into city values("PTH", "屏東縣");
insert into city values("ILH", "宜蘭縣");
insert into city values("HLH", "花蓮縣");
insert into city values("TTH", "台東縣");
insert into city values("PHH", "澎湖縣");
insert into city values("NTH", "南投縣");
insert into city values("TCC", "台中市");
insert into city values("TNC", "台南市");
insert into city values("JYC", "嘉義市");
insert into city values("KLC", "基隆市");
insert into city values("HCC", "新竹市");

insert into suppliers values("HHT", "穎宏科技","TPE");
insert into suppliers values("CFC", "資豐電腦","TYH");
insert into suppliers values("WCC", "瑋智資訊","HCH");
insert into suppliers values("HFT", "會方科技","TPE");
insert into suppliers values("HSC", "新碩電腦","TCH");
insert into suppliers values("FYC", "富揚資訊","TPH");
insert into suppliers values("HKC", "和康電腦","TPH");
insert into suppliers values("PRC", "百潤電腦","TPE");
insert into suppliers values("NKC", "寧康電腦","TYH");

insert into products values (1,   "HSC", "主機板",         2500);
insert into products values (1,   "HFT", "主機板",         8000);
insert into products values (1,   "HHT", "主機板",         4500);
insert into products values (2,   "HSC", "唯讀式光碟機",   1260);
insert into products values (3,   "HFT", "可燒錄式光碟機", 2400);
insert into products values (4,   "HFT", "中央處理器",     9600);
insert into products values (4,   "HSC", "中央處理器",     4800);
insert into products values (5,   "WCC", "滑鼠",            280);
insert into products values (5,   "HHT", "滑鼠",            250);
insert into products values (5,   "CFC", "滑鼠",            200);
insert into products values (6,   "HHT", "鍵盤",            360);
insert into products values (6,   "CFC", "鍵盤",            480);
insert into products values (7,   "HSC", "17吋螢幕",       6000);
insert into products values (8,   "CFC", "19吋螢幕",       8400);
insert into products values (9,   "CFC", "10M網路卡",       200);
insert into products values (101, "PRC", "100M網路卡",      880);
insert into products values (101, "FYC", "100M網路卡",      680);
insert into products values (102, "FYC", "60G硬式磁碟",    2200);
insert into products values (102, "PRC", "60G硬式磁碟",    4800);
insert into products values (103, "PRC", "3.5吋軟碟機",     200);
insert into products values (104, "PRC", "VGA卡",           580);
insert into products values (105, "PRC", "音效卡",          530);
insert into products values (105, "FYC", "音效卡",          800);
insert into products values (106, "PRC", "電源延長線",      230);
insert into products values (107, "PRC", "防毒軟體",        700);
insert into products values (108, "FYC", "護目鏡",          450);
insert into products values (109, "PRC", "天線",            300);
insert into products values (109, "FYC", "天線",           2000);
insert into products values (110, "PRC", "14吋螢幕",       2360);
insert into products values (110, "CFC", "14吋螢幕",       2440);
insert into products values (110, "FYC", "14吋螢幕",       2280);
insert into products values (110, "HSC", "14吋螢幕",       2600);
insert into products values (110, "HFT", "14吋螢幕",       3080);
insert into products values (111, "FYC", "15吋螢幕",       4990);
insert into products values (112, "FYC", "15吋螢幕",       5490);
insert into products values (113, "FYC", "15吋螢幕",       6850);
insert into products values (114, "PRC", "電腦桌",         1200);
insert into products values (201, "NKC", "報表紙",          380);
insert into products values (201, "CFC", "報表紙",          750);
insert into products values (201, "HKC", "報表紙",          900);
insert into products values (200, "NKC", "數據機",         1740);
insert into products values (202, "HKC", "無線網路卡",     2300);
insert into products values (203, "NKC", "21吋螢幕",       6700);
insert into products values (204, "HKC", "電纜線",          450);
insert into products values (205, "NKC", "40G硬式磁碟",    3120);
insert into products values (205, "CFC", "40G硬式磁碟",    3120);
insert into products values (205, "HSC", "40G硬式磁碟",    3120);
insert into products values (301, "NKC", "點陣式印表機",    970);
insert into products values (301, "HSC", "點陣式印表機",    420);
insert into products values (301, "FYC", "點陣式印表機",   1020);
insert into products values (301, "PRC", "點陣式印表機",    750);
insert into products values (301, "HKC", "點陣式印表機",    870);
insert into products values (301, "CFC", "點陣式印表機",    950);
insert into products values (302, "HSC", "鍵盤轉接頭",       60);
insert into products values (302, "HKC", "鍵盤轉接頭",       50);
insert into products values (303, "PRC", "光碟片",          480);
insert into products values (303, "HKC", "光碟片",          360);
insert into products values (304, "CFC", "20G硬式磁碟",    1700);
insert into products values (304, "HSC", "20G硬式磁碟",    2800);
insert into products values (305, "HSC", "傳真紙",          480);
insert into products values (306, "PRC", "10G硬式磁碟",    1600);
insert into products values (306, "FYC", "10G硬式磁碟",    1900);
insert into products values (307, "PRC", "25G硬式磁碟",    2800);
insert into products values (309, "PRC", "耳機",            400);
insert into products values (309, "FYC", "耳機",            400);
insert into products values (310, "FYC", "音箱",            800);
insert into products values (310, "CFC", "音箱",            840);
insert into products values (311, "FYC", "滑鼠墊",          480);
insert into products values (312, "FYC", "ISDN卡",          960);
insert into products values (312, "HSC", "ISDN卡",          720);
insert into products values (313, "FYC", "UPS",             600);
insert into products values (313, "CFC", "UPS",             600);

insert into dealers values (1001, "李明憲", "貝特電腦", "TPE",
"基隆路2段13號之3", "0229178129");
insert into dealers values (NULL, "李進中", "迅美科技", "TPE",
"復興南路2段83巷12號", "0223588450");
insert into dealers values (NULL, "張江悅", "亞都電腦", "TPE",
"南京東路1段25巷9號", "0229826543");
insert into dealers values (NULL, "張勝明", "志欣資訊", "TPE",
"木新路3段310巷12弄8號之4", "0227816590");
insert into dealers values (NULL, "張鴻文", "傑印電腦", "TPE",
"南京東路4段50號之3", "0227111029");
insert into dealers values (NULL, "林文淵", "進和資訊", "TPE",
"民權東路6段207號", "0229312954");
insert into dealers values (NULL, "林宏明", "皓遠科技", "TPE",
"興隆路2段203巷11號", "0227738793");
insert into dealers values (NULL, "林金勇", "新州電腦", "TPE",
"師大路184號", "0223675806");
insert into dealers values (NULL, "周志發", "意佳科技", "TPE",
"忠孝東路1段85號之12", "0227817894");
insert into dealers values (NULL, "周宏祥", "華興資訊", "TPE",
"長春路172巷8號", "0225422348");
insert into dealers values (NULL, "周聖林", "長佑實業", "TPE",
"莊敬路235巷42號", "0228673214");
insert into dealers values (NULL, "趙正武", "寄異國際", "TPE",
"敦化北路185號5樓", "0229315389");
insert into dealers values (NULL, "錢英仁", "保華工業", "TPE",
"和平東路2段121巷3號", "0229872154");
insert into dealers values (NULL, "孫一鳴", "萬眾資訊", "TPE",
"金華街86號", "0223814024");
insert into dealers values (NULL, "吳榮輝", "建功電腦", "TPE",
"仁愛路2段71號5樓", "0225439875");
insert into dealers values (NULL, "鄭明典", "恆祥科技", "TPE",
"吉林路142之1號6樓", "0227219204");
insert into dealers values (NULL, "王忠偉", "啟先電腦", "TPE",
"杭州南路1段27號", "0228549310");
insert into dealers values (NULL, "秦祖和", "永餘資訊", "TPE",
"長安東路2段81號", "0226549812");
insert into dealers values (NULL, "陳崇剛", "文泰科技", "TPH",
"羅斯福路3段200號12樓", "0225642319");
insert into dealers values (NULL, "陳信德", "天河資訊", "TYH",
"治平路2段97號", "036549812" );
insert into dealers values (NULL, "江仁義", "南陽實業", "ILH",
"富強路2段14巷34號", "033456129" );
insert into dealers values (NULL, "項立明", "松雨資訊", "TPH",
"新莊路2段54號2樓", "0227868567");
insert into dealers values (NULL, "曾嘉文", "怡佳企業", "HCH",
"建功路34號4樓", "033917534" );
insert into dealers values (NULL, "黃孟正", "常毅資訊", "TNC",
"大學路54號3樓", "062732853" );
insert into dealers values (NULL, "邱振民", "文林貿易", "KAO",
"中山路1段87號5樓", "077269876" );
insert into dealers values (NULL, "洪仁中", "明湖科技", "TCC",
"建國北路一段110號", "042876436" );
insert into dealers values (NULL, "飽漢宗", "長甫企業", "CHH",
"南莊路3段189號12樓", "027166697" );

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
"000009","黃怡仁",'M',"1961/10/07",43,"台南市善化區茄拔里100之3號");
insert into employee values(
"000007","陳美美",'F',"1975/02/06",29,"高雄市前鎮區200號");
insert into employee values(
"000012","陳秀惠",'F',"1974/11/20",30,"台北市南京東路一段218號");
insert into employee values(
"000004","黃淑珍",'F',"1973/08/29",31,"台南市麻豆區中正路59號");
insert into employee values(
"000014","黃玉瑛",'F',"1972/12/10",32,"台南市善化區民權路89號");
insert into employee values(
"000010","王曉菁",'F',"1966/10/17",38,"高雄市中正四路112號");
insert into employee values(
"000019","王耿豪",'M',"1971/02/03",33,"台北市大直街102號3樓");
insert into employee values(
"000002","陳美鳳",'F',"1971/05/28",33,"台南市白河區三明路192號");
insert into employee values(
"000015","王淑玲",'F',"1959/10/19",45,"台南市南化區中正路9號");
insert into employee values(
"000013","李英王",'M',"1970/07/26",34,"台南市仁德區勝利路116號");
insert into employee values(
"000020","鄭淑蘭",'F',"1969/09/18",35,"新北市中和區中山路177號");
insert into employee values(
"000017","李玉龍",'M',"1968/01/30",36,"台北市內湖區內湖路二段5號");
insert into employee values(
"000005","王五郎",'M',"1966/11/06",38,"南投縣北港村3號");
insert into employee values(
"000001","張大田",'M',"1972/06/23",32,"台南市中西區中正路18號之2");
insert into employee values(
"000016","高淑敏",'F',"1964/06/16",40,"台北市華陰街10號");
insert into employee values(
"000006","張玉明",'M',"1964/07/25",40,"高雄市前鎮區28之1號");
insert into employee values(
"000003","李王育",'M',"1956/02/28",48,"台南市安南區府前路90巷2號");
insert into employee values(
"000008","李小隆",'M',"1961/09/09",43,"台北市士林區小北街21號");
insert into employee values(
"000011","張玉風",'M',"1957/04/19",47,"高雄市路竹區民權路89號");
insert into employee values(
"000018","廖元瑛",'M',"1973/03/30",31,"台北市天母富貴一路5巷8號");

insert into score values ("812001","張大田",'M',80,90,60);
insert into score values ("812002","陳美鳳",'F',95,80,70);
insert into score values ("812003","李王育",'M',75,70,85);
insert into score values ("812004","黃淑珍",'F',90,74,70);
insert into score values ("812005","王五郎",'M',65,88,67);
insert into score values ("812006","張三明",'M',86,61,74);
insert into score values ("812007","陳美美",'F',84,78,94);
insert into score values ("812008","李小隆",'M',71,60,83);
insert into score values ("812009","黃怡仁",'M',92,65,73);
insert into score values ("812010","王曉菁",'F',88,69,69);

insert into memberA values(
"000009","黃怡仁",'M',"台南市善化區茄拔里100之3號");
insert into memberA values(
"000007","陳美美",'F',"高雄市前鎮區200號");
insert into memberA values(
"000012","陳秀惠",'F',"台北市南京東路一段218號");
insert into memberA values(
"000004","黃淑珍",'F',"台南市麻豆區中正路59號");
insert into memberA values(
"000014","黃玉瑛",'F',"台南市善化區民權路89號");
insert into memberA values(
"000010","王曉菁",'F',"高雄市中正四路112號");
insert into memberB values(
"000004","黃淑珍",'F',"台南市麻豆區中正路59號");
insert into memberB values(
"000014","黃玉瑛",'F',"台南市善化區民權路89號");
insert into memberB values(
"000010","王曉菁",'F',"高雄市中正四路112號");
insert into memberB values(
"000019","張耿豪",'M',"北市大直街102號3樓");
insert into memberB values(
"000002","陳美鳳",'F',"台南市中西區永福路一段192號");
insert into memberB values(
"000015","王淑玲",'F',"台南市南化區中正路9號");
