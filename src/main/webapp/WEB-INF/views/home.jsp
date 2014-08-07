<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Test Page</title>
</head>
<body>
<h1>
	Test Page 
</h1>
	<div>
		<form name="postUrlForm" method="post" action="<c:url value="/postUrl"/>">
			url:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" size="100" name="url" id="url" value="${url}" />	
			<input type="submit" id="postUrl" value="Post Url">
		</form>
	</div>
	<br/>
	<br/>
	<div>
		Response Status: <input type="text" size="20" name="status" id="status" value="${status}" />
	</div>
	<div>
		<textarea rows="100" cols="250">
			${contents}
		</textarea>
	</div>
</body>
</html>
