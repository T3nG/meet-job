<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=big5">
<title>Document Title</title>
</head>
<body>
<?php

$pno = $_POST["no"];
$num = $_POST["amount"];
if($pno == null || $num == null)
{
	echo "<A href=queryPrice.html>������</A>";
}	
	
@$link=mysql_connect("localhost","root","1234");
if(! $link)
{
   die("�s�u����!!!");
}

mysql_query("set names 'big5'");
mysql_select_db("StoreDB");

$result=mysql_query("select * from products where prod_num=" . $pno);

while($row=mysql_fetch_array($result))
{
   $total_price = $row[2] * $num;
   echo "<h2>���~�W��:" . $row[1] . "</h2>";
   echo "<h2>�q�ʼƶq:" . $num . "</h2>";
   echo "<h2>�`���B:" . $total_price . "</h2>";
}
mysql_free_result($result);
mysql_close();
?>

</body>
<!-- PHP���g�ʺA�����s�u��Ʈw -->
</html>
