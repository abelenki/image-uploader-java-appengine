<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" import="java.util.List" %>
<%@ page language="java" import="java.util.Collections" %>
<%@ page language="java" import="gaeupload.Image" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JSP Life Cycle Example</title>	
	</head>
	<body>
		<h2>File Upload</h2>
		<form name="filesForm" action="/upload" method="post" enctype="multipart/form-data">
			File:<input type="file" name="file"><br />
			Description:<input type="text" name="desc" /><br />
			<input type="submit" name="Submit" value="Upload Files">
		</form>
			
		<h2>Files Uploaded</h2>
		<%
		
		@SuppressWarnings("unchecked")
		List<Image> images = (List<Image>)request.getAttribute("images");
		
		%>
		
	<% if (images != null) { %>
 	<table>
      <% for (Image image: images) { %>
      <tr>
        <td><%=image.getName() %></td>
        <td>
	        <a href="/image?name=<%=image.getName() %>">
			<img src="/image?name=<%=image.getName() %>" width="70" height="90"/>
			</a>
       	</td>
        <td><%=image.getDesc() %></td>
      </tr>
      <% } //endfor%>
    </table>
	<% } else { %>
	<h3>...No images...</h3>
	<% } //endif %>
	
    </body>
</html>
	