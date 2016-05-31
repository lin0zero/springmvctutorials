<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>hi,mkking</title>
</head>
<body>
	<h2 class="note">Hi,Fruits</h2>
	<c:forEach items="${fruitList}" var="fruit">
		<li>
			<c:out value="${fruit}" />
		</li>
	</c:forEach>
</body>
</html>