<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="table.*,utils.*,java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>简易的java测评系统</title>
    <style>
        body {
            background-color: #f5f5f5;
            padding-left: 100px;
            padding-right: 100px;
        }

        h2 {
            text-align: center;
        }

        .list {

            background-color: darkgray;
        }

        .box {
            border: 1px solid white;
            height: 50px;
        }

        .content {
            line-height: 50px;
            padding-left: 20px;
        }

        .pno {
            margin-right: 50px;
        }

        a {
            text-decoration: none;
            color: black;
        }
    </style>
</head>

<body>
<%
TableIDao ti=DaoFactorys.newInstance("prob");
ArrayList<TableI> tset=ti.QueryAll();
%>
    <h2>简易的程序测评系统</h2>
    <div class="list">
    <%
    Problem prob;
    for(TableI t:tset)
    {
    	prob=(Problem)t;
    	out.println("<a href=\"QG?prob.pno"+prob.getPno()+"\">\r\n" + 
    			"            <div class=\"box\">\r\n" + 
    			"                <div class=\"content\"><span class=\"pno\">P"+prob.getPno()+"</span><span>"+prob.getTitle()+"</span></div>\r\n" + 
    			"            </div>\r\n" + 
    			"        </a>");
    }
    
    %>
        
    </div>
</body>

</html>