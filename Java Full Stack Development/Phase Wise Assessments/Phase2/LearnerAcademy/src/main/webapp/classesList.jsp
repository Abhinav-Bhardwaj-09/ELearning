<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Classes</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body >
	<div id="page">
		<jsp:include page="navList.jsp" />
		<div id="wrapper">
			<div id="header">
				<h3>Classes</h3>
			</div>
		</div>
		<div id="container">
			<div id="content">
				<table>
					<tr>
						<th>Section</th>
						<th>Subject</th>
						<th>Teacher</th>
						<th>Time</th>
						<th>Student's List</th>
					</tr>
					<c:forEach var="tempClass" items="${CLASSES_LIST }">
						<tr>
							<c:url var="tempLink" value="HelperServlet">
								<c:param name="command" value="ST_LIST" />
								<c:param name="classId" value="${tempClass.id }" />
								<c:param name="section" value="${tempClass.section }" />
								<c:param name="subject" value="${tempClass.subject }" />
							</c:url>
							<td>${tempClass.section}</td>
							<td>${tempClass.subject}</td>
							<td>${tempClass.teacher}</td>
							<td>${tempClass.time}</td>
							<td><a href="${tempLink }">Show List</a></td>
						</tr>
				</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>