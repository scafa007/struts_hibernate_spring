<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title></title>
</head>
<body>
  <s:form action="/j_security_check">
    <s:textfield name="j_username" label="Username" />
    <s:password name="j_password" label="Password" />
    <s:submit label="Login"/>
  </s:form>
</body>
</html>
