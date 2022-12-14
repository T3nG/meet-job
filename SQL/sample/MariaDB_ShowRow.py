#Python 連線資料庫
import pymysql as mariadb

# 建立資料庫連接
con = mariadb.connect(host="localhost", user="root", passwd="1234", 
                      db="mydb", charset="utf8", port=3306)

cur = con.cursor()  # 建立cursor物件
# 執行SQL指令SELECT
cur.execute("select * from employee")

rs = cur.fetchall()   # 取出所有記錄
# 取出查詢結果的每一筆記錄
for row in rs:
    print(row[0], row[1],row[2], row[3],row[4], row[5])
    #print(row)
    
con.close()  # 關閉資料庫連接
