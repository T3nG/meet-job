<%@ Page Language="VB" %>
<%@ Import Namespace="System.Data" %>
<%@ Import NameSpace="System.Data.OleDb" %>
<%@ Import NameSpace="System.Data.ODBC" %>
<%@ Import NameSpace="System.Data.SqlClient" %>

<html>
<head>
<title>Mysql_ODBC</title>
</head>
<body>
<center>
<h2>��ܬۤ�</h2>
<table border="3" bgcolor="c0c0c0" >

<%
    Dim DBCon As OdbcConnection
    Dim ObjCmd As OdbcCommand
    Dim ObjDataReader As OdbcDataReader
    Dim CString As String
    Dim path As String = "Mypicture/"
    Dim size As String = " width=250 height=250 "
    Dim pname As String
    Dim count As Integer = 0
 ' ODBC
    CString = "DSN=kuo;UID=root;PWD=12345;"
 ' �إ�Connection����
    DBCon = New OdbcConnection(CString)
    DBCon.Open() ' �}�Ҹ�Ʈw�s��
 ' �إ�Command����SQL���O
    ObjCmd = New OdbcCommand("select * from PhotoData", DBCon)
 ' �إ�DataReader����
    ObjDataReader = ObjCmd.ExecuteReader()
 ' ��ܸ�ƪ��O��
  
    Response.Write("<tr>")
    Do While ObjDataReader.Read()
        count = count + 1
        pname = ObjDataReader.Item("my_Photo")
        pname = "<td>" & "<img src=" & path & pname & size & "/></td>"
        Response.Write(pname)
        If count Mod 3 = 0 Then
            Response.Write("</tr><tr>")
        End If
    Loop
    ObjDataReader.Close()
    DBCon.Close()         ' ������Ʈw�s��
%>
</table>
</center>
<!-- VB���g�ʺA�����s�u��Ʈw -->
</body>
</html>