<!-- ************* EL6_Relation.jsp ************* -->
<%@page contentType="text/html" pageEncoding="utf-8"%>

<html>
  <head>
	<title>EL 關係運算</title>
	<style>
	  table {
		font-size:1cm;  
	  }
	</style>
  </head>
  
  <body>
    <center>
    
    <table border="3" width="400px">
      <tr>
        <th width="200px">運算式</th>
        <th width="200px">結果</th>
      </tr>
      <tr>
        <td>123==100</td>
        <td align="center">${123==100}</td>
      </tr>
      <tr>
        <td>123!=100</td>
        <td align="center">${123!=100}</td>
      </tr>
      <tr>
        <td>123>100</td>
        <td align="center">${123>100}</td>
      </tr>
      <tr>
        <td>123<100</td>
        <td align="center">${123<100}</td>        
      </tr>
      <tr>
        <td>123>=100</td>
        <td align="center">${123>=100}</td>
      </tr>
      <tr>
        <td>123<=100</td>
        <td align="center">${123<=100}</td>
      </tr>    
    </table>
    
    </center>	
  </body>
</html>
