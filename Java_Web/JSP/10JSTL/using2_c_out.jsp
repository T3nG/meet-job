<!-- ************* using_c_out2.jsp ************* -->
<%@ page contentType="text/html"%>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
    <title>c:out 標籤</title>
  </head>
  <body>
	<c:out value="c_out輸出文字1" escapeXml="false" /><p>
	<c:out value="c_out輸出文字2" escapeXml="true" /><p>
    <c:out value="&lt;輸出文字3&gt;" escapeXml="false" /><p>
    <c:out value="&lt;輸出文字4&gt;" escapeXml="true" /><p>
    <c:out value="<h1>輸出文字5</h1>" escapeXml="false" /><br>   
    <c:out value="<h1>輸出文字6</h1>" escapeXml="true" /><br>	
  </body>
</html>