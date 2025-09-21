<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>WAR Sample</title>
  <style>
    body { font-family: system-ui, Arial, sans-serif; margin: 2rem; }
    a { text-decoration: none; color: #0366d6; }
  </style>
  </head>
<body>
  <h1>Java WAR Sample</h1>
  <p>This is a minimal JSP landing page.</p>
  <ul>
    <li><a href="<%= request.getContextPath() %>/hello">Go to HelloServlet</a></li>
  </ul>
</body>
</html>

