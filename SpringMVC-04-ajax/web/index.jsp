<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/2/14
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

      <script type="text/javascript" src="http://lib.sinaapp.com/js/jquery/3.1.0/jquery-3.1.0.js"></script>
      <script>
        function a(){
          $.post(
                  {
                    url:"${pageContext.request.contextPath}/a1",
                    data:{"name":$("#username").val()},
                    success :function (result){
                      alert(result);
                    }
                  }
          )
        }
      </script>
  </head>
  <body>
 用户名：<input type="text" id="username" onblur="a()">
  </body>
</html>
