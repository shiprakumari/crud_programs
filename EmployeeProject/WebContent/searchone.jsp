<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="doupdate">
<table>
<tr>
<th>Id</th>
<th>Name</th>
<th>Deg</th>
<th>Salary</th>
<th>Gender</th>
</tr>
<tr>
<td>${temp.empId}</td>
<td>${temp.empName}</td>
<td>${temp.empDesignation}</td>
<td>${temp.empSalary}</td>
<td>${temp.empGender}</td>
</tr>
<tr>
<td>Employee Id</td>
<td><input type="text" name="eid"/></td>
</tr>
<tr>
<td><input type="submit" value="Update"/></td>
</tr>

</table>
</form>
</body>


</html>